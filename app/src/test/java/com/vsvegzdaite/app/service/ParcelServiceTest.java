package com.vsvegzdaite.app.service;

import com.vsvegzdaite.app.model.Parcel;
import com.vsvegzdaite.app.model.Receiver;
import com.vsvegzdaite.app.model.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ParcelServiceTest {

    @Autowired
    private ParcelService service;

//    @Test
//    public void testGetParcels() {
//
//        Parcel parcel = new Parcel();
//        parcel.setId(1L);
//        parcel.setSender(new Sender(1L, "senderName", "senderLastName", "senderAddress"));
//        parcel.setReceiver(new Receiver(1L, "receiverName", "receiverLastName", "receiverAddress", 123L, "receiver@receiver.com"));
//        parcel.setSize("L");
//        parcel.setWeight(2.2);
//
//        assertTrue(service.getParcels().size() != 0);
//    }

//    @Test
//    public void testGetParcel() {
//        Parcel parcel = new Parcel();
//        parcel.setId(1L);
//        parcel.setSender(new Sender(1L, "senderName", "senderLastName", "senderAddress"));
//        parcel.setReceiver(new Receiver(1L, "receiverName", "receiverLastName", "receiverAddress", 123L, "receiver@receiver.com"));
//        parcel.setSize("L");
//        parcel.setWeight(2.2);
//        service.getParcelById(1l);
//        assertNotEquals(parcel, Optional.empty());
//        assertEquals(parcel.getId(), parcel);
//    }

}