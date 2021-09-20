package com.vsvegzdaite.app.repository;

import com.vsvegzdaite.app.model.Parcel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class ParcelRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ParcelDAO parcelDAO;

    @Test
    public void testFindAllParcels() {
        Parcel p = new Parcel();
        p = entityManager.persist(p);
        List<Parcel> parcels = parcelDAO.findAll();
        assert(parcels).contains(p);
    }

    @Test
    public void testFindParcelById() {
        Parcel p = new Parcel();
        p = entityManager.persist(p);
        Optional<Parcel> parcel = parcelDAO.findById(p.getId());
        assertNotEquals(parcel, Optional.empty());
        assertEquals(parcel.get(), p);
    }

    @Test
    public void testDeleteById() {
        Parcel p = new Parcel();
        p = entityManager.persist(p);
        parcelDAO.deleteById(p.getId());
        Parcel parcel = entityManager.find(Parcel.class, p.getId());
        assertNull(parcel);
    }

    @Test
    public void testSaveParcel() {
        Parcel p = new Parcel();
        p = parcelDAO.save(p);
        p = entityManager.persistAndFlush(p);
        assertNotNull(p);
    }
}
