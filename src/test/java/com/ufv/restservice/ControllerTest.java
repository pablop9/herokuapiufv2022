package com.ufv.restservice;

import com.google.gson.Gson;
import com.ufv.restservice.objetos.Principal;
import com.ufv.restservice.objetos.subclases.Prestamos.Prestamo;
import com.ufv.restservice.objetos.subclases.Usuario;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class ControllerTest {

    Usuario usuario = new Usuario("04", "John Doe", "Desconocido", "666666666", "johndoe@dise.es", "Desconodico");
    Prestamo prestamo = new Prestamo("0005", "02", "PC_03", "20/01/2021", "27/01/2022", "-", "Todo correcto");
    Prestamo prestamo2 = new Prestamo("0001", "01", "PC_01", "20/01/2021", "27/01/2022", "25/01/2021", "Todo correcto");
    MockMvc mvc;


    @Autowired
    private MockMvc mockMvc;

    // Test para get de todo el json
    @Test
    void principales() throws Exception {
        this.mockMvc.perform(get("/todo/0"))
                .andExpect(status().isOk())
                .equals(Principal.class);

    }

    /*
    // Peticiones get a equipos
    @Test
    void equipos() throws Exception {
        this.mockMvc.perform(get("/equipo/0")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        //System.out.println(content);

    }

     */

    /*
    @Test
    void addEquipo() throws Exception {
        Gson gson = new Gson();
        String json = gson.toJson(equipo);
        this.mockMvc.perform(post("/pc")
                        .contentType(MediaType.APPLICATION_JSON)
                        //.accept(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isCreated());
    }
    */
    /*
    @Test
    void delEquipo() throws Exception {
        this.mockMvc.perform(delete("/pc/0"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

     */

    @Test
    void verUsuarios() throws Exception {
        /*
        Usuario usuarioTest = new Usuario("01", "Alonso Sanchez", "Desarrollo", "0998228182", "alonso@dis.es", "UFV");
        MvcResult result  = mockMvc.perform(get("/usuario/0")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
        String content = result.getResponse().getContentAsString();
        Usuario usuarioRespuesta = new Gson().fromJson(content, Usuario.class);
        Assert.assertEquals(usuarioRespuesta.toString(),usuarioTest.toString());

         */

        this.mockMvc.perform(get("/usuario/0")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void addUser() throws Exception {
        Gson gson = new Gson();
        String json = gson.toJson(usuario);
        this.mockMvc.perform(post("/user")
                        .contentType(MediaType.APPLICATION_JSON)
                        //.accept(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isCreated());
    }

    // Peticiones put de usuarios
    @Test
    void actualizar() throws Exception {
        Gson gson = new Gson();
        String json = gson.toJson(usuario);
        this.mockMvc.perform(put("/user/3")
                        .contentType(MediaType.APPLICATION_JSON)
                        //.accept(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk());
    }


    @Test
    void delUsuario() throws Exception {
        this.mockMvc.perform(delete("/user/3"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }


    @Test
    void prestamos() throws Exception {
        this.mockMvc.perform(get("/prestamo/0")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void addPrestamo() throws Exception {
        Gson gson = new Gson();
        String json = gson.toJson(prestamo);
        this.mockMvc.perform(post("/loan")
                        .contentType(MediaType.APPLICATION_JSON)
                        //.accept(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    void actualizarPrestamo() throws Exception {
        Gson gson = new Gson();
        String json = gson.toJson(prestamo2);
        this.mockMvc.perform(put("/loan/0")
                        .contentType(MediaType.APPLICATION_JSON)
                        //.accept(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void delPrestamo() throws Exception {
        this.mockMvc.perform(delete("/loan/2"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }
}