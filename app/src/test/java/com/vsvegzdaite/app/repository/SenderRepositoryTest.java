package com.vsvegzdaite.app.repository;

import com.vsvegzdaite.app.model.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class SenderRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private SenderDAO senderDAO;


//    @Test
//    public void itShouldSaveFindDeleteSender() {
//
//        Sender sender = new Sender();
//        sender.setId(1000L);
//        sender.setName("senderName");
//        sender.setLastName("senderLastName");
//        sender.setAddress("senderAddress");
//        sender = entityManager.merge(sender);
//        sender = entityManager.persistAndFlush(sender);
//
//        assertTrue(senderDAO.findById(1L).isPresent());
//        senderDAO.deleteById(1L);
//        assertTrue(senderDAO.findById(1L).isEmpty());
//
//    }

}
