package com.vsvegzdaite.app.repository;

import com.vsvegzdaite.app.model.Sender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenderDAO extends JpaRepository<Sender, Long> {
}
