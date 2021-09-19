package com.vsvegzdaite.app.service;

import com.vsvegzdaite.app.model.Receiver;
import com.vsvegzdaite.app.repository.ReceiverDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ReceiverService {

    @Autowired
    public ReceiverDAO receiverDAO;

    @Transactional
    public List<Receiver> getReceivers() {
        return receiverDAO.findAll();
    }

    @Transactional
    public Receiver getReceiverById(Long id) {
        Receiver receiver = receiverDAO.findById(id).get();
        return receiver;
    }

    @Transactional
    public void saveReceiver(Receiver receiver) {
        receiverDAO.save(receiver);
    }

    @Transactional
    public void editReceiver(Long id, Receiver data) {
        Receiver receiver = receiverDAO.getById(id);
        if (receiver != null) {
            receiver.setName(data.getName());
            receiver.setLastName(data.getLastName());
            receiver.setAddress(data.getAddress());
            receiver.setPhone(data.getPhone());
            receiver.setEmail(data.getEmail());
            receiver.setParcels(data.getParcels());
            receiverDAO.save(receiver);
        }
    }

    @Transactional
    public void deleteReceiver(Long id) {
        receiverDAO.deleteById(id);
    }


}
