package com.vsvegzdaite.app.repository;

import com.vsvegzdaite.app.model.Sender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SenderDAO extends JpaRepository<Sender, Long> {

    Optional<Sender> findByLastName(String lastName);
}
