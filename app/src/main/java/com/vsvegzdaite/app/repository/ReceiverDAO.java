package com.vsvegzdaite.app.repository;

import com.vsvegzdaite.app.model.Receiver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiverDAO extends JpaRepository<Receiver, Long> {
}
