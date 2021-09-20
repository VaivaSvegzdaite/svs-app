package com.vsvegzdaite.app.controller;

import com.vsvegzdaite.app.App;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {App.class, ParcelController.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SenderControllerTest {

    @Autowired
    private SenderController controller;

    @Test
    public void contextLoads() {
        assertNotNull(controller);
    }
}
