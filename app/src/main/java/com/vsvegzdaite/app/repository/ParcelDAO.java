package com.vsvegzdaite.app.repository;

import com.vsvegzdaite.app.model.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelDAO extends JpaRepository<Parcel, Long> {
}
