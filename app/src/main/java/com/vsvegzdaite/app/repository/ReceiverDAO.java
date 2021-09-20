package com.vsvegzdaite.app.repository;

import com.vsvegzdaite.app.model.Receiver;
import com.vsvegzdaite.app.model.Sender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReceiverDAO extends JpaRepository<Receiver, Long> {

    Optional<Receiver> findByEmail(String email);
}
