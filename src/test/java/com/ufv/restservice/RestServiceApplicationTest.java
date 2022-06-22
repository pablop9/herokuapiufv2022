package com.ufv.restservice;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RestServiceApplicationTest {

    @Autowired
    private Controller controller;

    @Test
    public void contextLoads() throws Exception{
        Assert.assertNotNull(controller);
    }

}