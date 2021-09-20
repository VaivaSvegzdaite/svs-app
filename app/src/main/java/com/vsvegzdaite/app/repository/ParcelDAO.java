package com.vsvegzdaite.app.repository;

import com.vsvegzdaite.app.model.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ParcelDAO extends JpaRepository<Parcel, Long> {

    Optional<Parcel> findBySize(String size);
}
