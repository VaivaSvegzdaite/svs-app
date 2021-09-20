package com.vsvegzdaite.app.service;

import com.vsvegzdaite.app.model.Receiver;
import com.vsvegzdaite.app.model.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ReceiverServiceTest {

    @Autowired
    private ReceiverService service;

//    @Test
//    public void testGetReceivers() {
//        Receiver receiver = new Receiver();
//        receiver.setId(168L);
//        receiver.setName("receiverName");
//        receiver.setLastName("receiverLastName");
//        receiver.setAddress("receiverAddress");
//        receiver.setPhone(456L);
//        receiver.setEmail("receiver@receiver.com");
//
//        assertTrue(service.getReceivers().size() != 0);
//
//    }
}
