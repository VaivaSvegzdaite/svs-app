package com.vsvegzdaite.app.service;

import com.vsvegzdaite.app.model.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SenderServiceTest {

    @Autowired
    private SenderService service;

//    @Test
//    public void testGetSenders() {
//
//        Sender sender = new Sender();
//        sender.setId(1L);
//        sender.setName("senderName");
//        sender.setLastName("senderLastName");
//        sender.setAddress("senderAddress");
//
//        assertTrue(service.getSenders().size() != 0);
//    }

//    @Test
//    public void testCreateUpdateSender() {
//        Sender sender = new Sender(2L, "senderName", "senderLastName", "senderAddress");
//        service.saveSender(sender);
//        assertTrue(service.getSenderById(2l).getName().equals("senderName"));
//
//        Sender updateInfo= new Sender(2L, "updSenderName", "updSenderLastName", "updSenderAddress");
//        service.editSender(2l, updateInfo);
//        assertTrue(service.getSenderById(2L).getName().equals("updSenderName"));
//    }

}
