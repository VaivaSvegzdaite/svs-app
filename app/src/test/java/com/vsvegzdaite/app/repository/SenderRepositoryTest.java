package com.vsvegzdaite.app.repository;

import com.vsvegzdaite.app.model.Sender;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SenderRepositoryTest {

    @Autowired
    private SenderDAO senderDAO;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveSender() {
        Sender sender = new Sender(
                1L, "senderName",
                "senderLastName",
                "senderAddress");
        senderDAO.save(sender);
        Assertions.assertThat(sender.getId()).isGreaterThan(0);
    }

//    @Test
//    @Order(2)
//    public void getSenderTest() {
//
//        Sender sender = senderDAO.findById(1L).orElseGet(null);
//
//        Assertions.assertThat(sender.getId()).isEqualTo(1L);
//
//    }

    @Test
    @Order(3)
    public void getListOfSendersTest() {

        List<Sender> senders = senderDAO.findAll();

        Assertions.assertThat(senders.size()).isGreaterThan(0);

    }

//    @Test
//    @Order(4)
//    @Rollback(value = false)
//    public void updateSenderTest() {
//
//        Sender sender = senderDAO.findById(1L).get();
//
//        sender.setLastName("updatedSenderLastName");
//
//        Sender senderUpdated = senderDAO.save(sender);
//
//        Assertions.assertThat(senderUpdated.getLastName()).isEqualTo("updatedSenderLastName");
//
//    }

//    @Test
//    @Order(5)
//    @Rollback(value = false)
//    public void deleteSenderTest() {
//
//        Sender sender = senderDAO.findById(1L).orElse(null);
//
//        senderDAO.delete(sender);
//
//        Sender sender1 = null;
//
//        Optional<Sender> optionalSender = senderDAO.findByLastName("updatedSenderLastName");
//
//        if (optionalSender.isPresent()) {
//            sender1 = optionalSender.get();
//        }
//
//        Assertions.assertThat(sender1).isNull();
//    }

}
