package com.vsvegzdaite.app.repository;

import com.vsvegzdaite.app.model.Parcel;
import com.vsvegzdaite.app.model.Receiver;
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

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ParcelRepositoryTest {

    @Autowired
    private ParcelDAO parcelDAO;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveParcel() {
        Parcel parcel = new Parcel(
                1l,
                new Sender(),
                new Receiver(),
                "M",
                2.2
        );
       parcelDAO.save(parcel);

       Assertions.assertThat(parcel.getId()).isGreaterThan(0);
    }

//    @Test
//    @Order(2)
//    public void getParcelTest() {
//
//        Parcel parcel = parcelDAO.findById(1L).orElseGet(null);
//
//        Assertions.assertThat(parcel.getId()).isEqualTo(1L);
//
//    }

    @Test
    @Order(3)
    public void getListOfParcelsTest() {

        List<Parcel> parcels = parcelDAO.findAll();

        Assertions.assertThat(parcels.size()).isGreaterThan(0);

    }

//    @Test
//    @Order(4)
//    @Rollback(value = false)
//    public void updateParcelTest() {
//
//        Parcel parcel = parcelDAO.findById(1L).orElseGet(null);
//
//        parcel.setSize("S");
//
//        Parcel parcelUpdated = parcelDAO.save(parcel);
//
//        Assertions.assertThat(parcel.getSize()).isEqualTo("S");
//
//    }

//    @Test
//    @Order(5)
//    @Rollback(value = false)
//    public void deleteParcelTest() {
//
//        Parcel parcel = parcelDAO.findById(1L).isPresent() ?
//                parcelDAO.findById(1L).get() : null;
//
//        parcelDAO.delete(parcel);
//
//        Parcel parcel1 = null;
//
//        Optional<Parcel> optionalParcel = parcelDAO.findBySize("S");
//
//        if (optionalParcel.isPresent()) {
//            parcel1 = optionalParcel.get();
//        }
//
//        Assertions.assertThat(parcel1).isNull();
//    }


}
