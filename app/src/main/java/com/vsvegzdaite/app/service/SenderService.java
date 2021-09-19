package com.vsvegzdaite.app.service;

import com.vsvegzdaite.app.model.Sender;
import com.vsvegzdaite.app.repository.SenderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SenderService {

    @Autowired
    private SenderDAO senderDAO;

    @Transactional
    public List<Sender> getSenders() {
        return senderDAO.findAll();
    }

    @Transactional
    public Sender getSenderById(Long id) {
        Sender sender = senderDAO.findById(id).get();
        return sender;
    }

    @Transactional
    public void saveSender(Sender sender) {
        senderDAO.save(sender);
    }

    @Transactional
    public void editSender(Long id, Sender data) {
        Sender sender = senderDAO.getById(id);
        if (sender != null) {
            sender.setName(data.getName());
            sender.setLastName(data.getLastName());
            sender.setAddress(data.getAddress());
            sender.setParcels(data.getParcels());
            senderDAO.save(sender);
        }
    }

    @Transactional
    public void deleteSender(Long id) {
        senderDAO.deleteById(id);
    }

}
