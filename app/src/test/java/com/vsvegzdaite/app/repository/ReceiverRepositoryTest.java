package com.vsvegzdaite.app.repository;

import com.vsvegzdaite.app.model.Receiver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class ReceiverRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ReceiverDAO receiverDAO;

//    @Test
//    public void itShouldSaveFindDeleteReceiver() {
//
//        Receiver receiver = new Receiver();
//        receiver.setId(100L);
//        receiver.setName("receiverName");
//        receiver.setLastName("receiverLastName");
//        receiver.setAddress("receiverAddress");
//        receiver.setPhone(456L);
//        receiver.setEmail("receiver@receiver.com");
//        receiver = entityManager.merge(receiver);
//        receiver = entityManager.persistAndFlush(receiver);
//
//        assertTrue(receiverDAO.findById(1L).isPresent());
//        receiverDAO.deleteById(1L);
//        assertTrue(receiverDAO.findById(1L).isEmpty());
//
//    }
}
