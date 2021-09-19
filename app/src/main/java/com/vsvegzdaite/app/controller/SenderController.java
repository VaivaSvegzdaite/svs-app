package com.vsvegzdaite.app.controller;

import com.vsvegzdaite.app.model.Sender;
import com.vsvegzdaite.app.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SenderController {

    @Autowired
    private SenderService senderService;

    @Autowired
    public SenderController(SenderService senderService) {
        this.senderService = senderService;
    }

    @RequestMapping(value = "/parcels/senders", method = RequestMethod.GET)
    public List<Sender> getSenders() {
        return senderService.getSenders();
    }

    @GetMapping("/parcels/senders/{id}")
    public Sender getSender(@PathVariable final Long id) {
        return senderService.getSenderById(id);
    }

    @RequestMapping(value = "/parcels/addsender", method = RequestMethod.POST)
    public void saveSender(@RequestBody Sender sender) {
        senderService.saveSender(sender);
    }

    @PutMapping("/parcels/updatesender/{id}")
    public void updateSender(@PathVariable Long id, @RequestBody Sender sender) {
        senderService.editSender(id, sender);
    }

    @DeleteMapping(path = {"/parcels/senders/{id}"})
    public void deleteSender(@PathVariable final Long id) {
        senderService.deleteSender(id);
    }
}
