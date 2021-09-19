package com.vsvegzdaite.app.controller;

import com.vsvegzdaite.app.model.Receiver;
import com.vsvegzdaite.app.service.ReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReceiverController {

    @Autowired
    public ReceiverService receiverService;

    @Autowired
    public ReceiverController(ReceiverService receiverService) {
        this.receiverService = receiverService;
    }

    @RequestMapping(value = "/parcels/receivers", method = RequestMethod.GET)
    public List<Receiver> getReceivers() {
        return receiverService.getReceivers();
    }

    @GetMapping("/parcels/receivers/{id}")
    public Receiver getReceiver(@PathVariable final Long id) {
        return receiverService.getReceiverById(id);
    }

    @RequestMapping(value = "/parcels/addreceiver", method = RequestMethod.POST)
    public void saveReceiver(@RequestBody Receiver receiver) {
        receiverService.saveReceiver(receiver);
    }

    @PutMapping("/parcels/updatereceiver/{id}")
    public void updateReceiver(@PathVariable Long id, @RequestBody Receiver receiver) {
        receiverService.editReceiver(id, receiver);
    }

    @DeleteMapping(path = {"/parcels/receivers/{id}"})
    public void deleteReceiver(@PathVariable final Long id) {
        receiverService.deleteReceiver(id);
    }
}
