package com.vsvegzdaite.app.repository;

import com.vsvegzdaite.app.model.Receiver;
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
public class ReceiverRepositoryTest {

    @Autowired
    private ReceiverDAO receiverDAO;

//    @Test
//    @Order(1)
//    @Rollback(value = false)
//    public void saveReceiver() {
//        Receiver receiver = new Receiver(
//                1l,
//                "receiverName",
//                "receiverLastName",
//                "receiverAddress", 2345L, "receiver@receiver.com");
//        receiverDAO.save(receiver);
//        Assertions.assertThat(receiver.getId()).isGreaterThan(0);
//    }

    @Test
    @Order(2)
    public void getReceiverTest() {

        Receiver receiver = receiverDAO.findById(1L).orElseGet(null);

        Assertions.assertThat(receiver.getId()).isEqualTo(1L);

    }

    @Test
    @Order(3)
    public void getListOfReceiversTest() {

        List<Receiver> receivers = receiverDAO.findAll();

        Assertions.assertThat(receivers.size()).isGreaterThan(0);

    }

    @Test
    @Order(4)
    @Rollback(value = false)
    public void updateReceiverTest() {

        Receiver receiver = receiverDAO.findById(1L).orElseGet(null);

        receiver.setEmail("updReceiver@receiver.com");

        Receiver receiverUpdated = receiverDAO.save(receiver);

        Assertions.assertThat(receiver.getEmail()).isEqualTo("updReceiver@receiver.com");

    }

//    @Test
//    @Order(5)
//    @Rollback(value = false)
//    public void deleteReceiverTest() {
//
//        Receiver receiver = receiverDAO.findById(1L).get();
//
//        receiverDAO.delete(receiver);
//
//        Receiver receiver1 = null;
//
//        Optional<Receiver> optionalReceiver = receiverDAO.findByEmail("updReceiver@receiver.com");
//
//        if (optionalReceiver.isPresent()) {
//            receiver1 = optionalReceiver.get();
//        }
//
//        Assertions.assertThat(receiver1).isNull();
//    }

}
