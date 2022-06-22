package com.ufv.restservice;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ufv.restservice.objetos.Principal;
import com.ufv.restservice.objetos.subclases.Equipos.Equipo;
import com.ufv.restservice.objetos.subclases.Prestamos.Prestamo;
import com.ufv.restservice.objetos.subclases.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@RestController //con restController no es necesario hacer una conversión manual a json
public class Controller {

    //private final AtomicLong counter = new AtomicLong();
    public Principal principales = new Principal(); //Declaración del objeto de tipo Principal
    public ArrayList<Usuario> user = new ArrayList<Usuario>();
    public ArrayList<Equipo> pc = new ArrayList<Equipo>();
    public ArrayList<Prestamo> loan = new ArrayList<Prestamo>();
    public String path = "JSON2.json";

    /*
    FUNCIÓN ENCARGADA DE LEER EL JSON
     */

    public Principal Leer() {
        try {
            Reader reader; //Inicialización de la variable que almacenará el contenido del JSON
            reader = Files.newBufferedReader(Paths.get(path)); //Lectra del JSON
            Principal principal = new Gson().fromJson(reader, Principal.class);//El primer atributo es lo que lees, el segundo el formato que usarás
            reader.close(); //Se cierra el lector
            principales = principal; //Se iguala el objeto principal al objeto leido
        } catch (IOException e) {
            e.printStackTrace();
            principales = null;
        }
        return principales;  //Se devuelve el objeto serializado
    }

    @GetMapping("/todo/0") //Se asegura de que las peticiones realizadas a /usuario se asignen al método Principañl()
    public Principal principales() throws IOException {

        principales = Leer();
        return principales;

    }


    /*
     *******************************************************
     *
     * PETICIONES GET, POST Y DELETE DEL OBJETO EQUIPO
     *
     *******************************************************
     */
    @GetMapping("/equipo/{id}") //Se asegura de que las peticiones realizadas a /equipo se asignen al siguiente método
    public Equipo equipos(@PathVariable("id")int id ) throws IOException {

        principales = Leer();
        return principales.getEquipo().get(id); //Muestra el objeto indicado en el path

    }

    /* Post de equipos no necesario
    @PostMapping(path = "/pc",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ArrayList<Equipo>> addEquipo(@RequestBody Equipo newEquipo) throws IOException {

        principales = Leer();
        pc.clear();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for (int i = 0; i<principales.getEquipo().size(); i++){
            pc.add(principales.getEquipo().get(i));
        }

        pc.add(newEquipo);
        principales.setEquipo(pc);
        Writer writer = Files.newBufferedWriter(Paths.get(path));
        gson.toJson(principales, writer);
        writer.close();

        return new ResponseEntity<>(this.pc, HttpStatus.CREATED);

    }
     */

    /* Delete de equipos no necesario
    @DeleteMapping("/pc/{id}")
    public ResponseEntity<ArrayList<Equipo>> delEquipo(@PathVariable int id) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        principales = Leer();
        pc.clear();
        pc = principales.getEquipo();
        pc.remove(id);
        principales.setEquipo(pc);
        Writer writer = Files.newBufferedWriter(Paths.get(path));
        gson.toJson(principales, writer);
        writer.close();

        return new ResponseEntity<>(this.pc, HttpStatus.OK);

    }
    */

    /*
    *******************************************************
    *
    * PETICIONES GET, POST Y DELETE DEL OBJETO USUARIO
    *
    *******************************************************
     */
    @GetMapping("/usuario/{id}") //Se asegura de que las peticiones realizadas a /usuario se asignen al siguiente método
    public Usuario verUsuarios(@PathVariable("id")int id ) throws IOException {

        principales = Leer();
        return principales.getUsuario().get(id);

    }
    @PostMapping(path = "/user",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ArrayList<Usuario>> addUser(@RequestBody Usuario newUsuario) throws IOException {
        // Lee la base de datos
        principales = Leer();
        //Limpia la variable auxiliar
        user.clear();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //Se almacenan todos los valores contenidos en la base de datos del tipo Usuario en
        //el objeto auxiliar
        for (int i = 0; i<principales.getUsuario().size(); i++){
            user.add(principales.getUsuario().get(i));
        }
        //Se añade el nuevo elemento al final del arraylist
        user.add(newUsuario);
        //Se guarda la nueva lista de usuarios en el objeto principal
        principales.setUsuario(user);
        Writer writer = Files.newBufferedWriter(Paths.get(path));
        //Se escribe de nuevo el JSON con los valores actualizados
        gson.toJson(principales, writer);
        writer.close();

        return new ResponseEntity<>(this.user, HttpStatus.CREATED);

    }

    @PutMapping("/user/{id}")
    public void actualizar(@PathVariable("id") int id, @RequestBody Usuario editUsuario) throws IOException {
        // Lee la base de datos
        principales = Leer();
        //Limpia la variable auxiliar
        user.clear();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        for (int i = 0; i<principales.getUsuario().size(); i++){
            user.add(principales.getUsuario().get(i));
        }
        user.remove(id);
        user.add(editUsuario);
        principales.setUsuario(user);
        Writer writer = Files.newBufferedWriter(Paths.get(path));
        //Se escribe de nuevo el JSON con los valores actualizados
        gson.toJson(principales, writer);
        writer.close();

        //return new ResponseEntity<>(this.user, HttpStatus.CREATED);

    }
    @DeleteMapping("/user/{id}")
    public ResponseEntity<ArrayList<Usuario>> delUsuario(@PathVariable int id) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //Lectura de los datos almacenados
        principales = Leer();
        //Borrado de los valores almacenados en la variable auxiliar
        user.clear();
        //Almacenaje de la lista de usuarios en el objeto auxiliar
        user = principales.getUsuario();
        //Eliminación del objeto indicado
        user.remove(id);
        //Guardado de la nueva base de datos
        principales.setUsuario(user);
        Writer writer = Files.newBufferedWriter(Paths.get(path));
        gson.toJson(principales, writer);
        writer.close();

        return new ResponseEntity<>(this.user, HttpStatus.OK);

    }


    /*
     *******************************************************
     *
     * PETICIONES GET, POST Y DELETE DEL OBJETO PRESTAMO
     *
     *******************************************************
     */
    @GetMapping("/prestamo/{id}") //Se asegura de que las peticiones realizadas a /prestamo se asignen al siguiente método
    public Prestamo prestamos(@PathVariable("id")int id ) throws IOException {

        principales = Leer();
        return principales.getPrestamo().get(id);

    }
    @PostMapping(path = "/loan",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ArrayList<Prestamo>> addPrestamo(@RequestBody Prestamo newPrestamo) throws IOException {
        principales = Leer();
        loan.clear();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for (int i = 0; i<principales.getPrestamo().size(); i++){
            loan.add(principales.getPrestamo().get(i));
        }

        loan.add(newPrestamo);
        principales.setPrestamo(loan);
        Writer writer = Files.newBufferedWriter(Paths.get(path));
        gson.toJson(principales, writer);
        writer.close();

        return new ResponseEntity<>(this.loan, HttpStatus.CREATED);

    }
    @DeleteMapping("/loan/{id}")
    public ResponseEntity<ArrayList<Prestamo>> delPrestamo(@PathVariable int id) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        principales = Leer();
        loan.clear();
        loan = principales.getPrestamo();
        loan.remove(id);
        principales.setPrestamo(loan);
        Writer writer = Files.newBufferedWriter(Paths.get(path));
        gson.toJson(principales, writer);
        writer.close();


        return new ResponseEntity<>(this.loan, HttpStatus.OK);

    }

    @PutMapping("/loan/{id}")
    public void actualizarPrestamo(@PathVariable("id") int id, @RequestBody Prestamo editPrestamo) throws IOException {
        // Lee la base de datos
        principales = Leer();
        //Limpia la variable auxiliar
        loan.clear();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        for (int i = 0; i<principales.getPrestamo().size(); i++){
            loan.add(principales.getPrestamo().get(i));
        }
        loan.remove(id);
        loan.add(editPrestamo);
        principales.setPrestamo(loan);
        Writer writer = Files.newBufferedWriter(Paths.get(path));
        //Se escribe de nuevo el JSON con los valores actualizados
        gson.toJson(principales, writer);
        writer.close();

        //return new ResponseEntity<>(this.user, HttpStatus.CREATED);

    }

}
