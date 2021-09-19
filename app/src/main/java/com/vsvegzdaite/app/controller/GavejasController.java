package com.vsvegzdaite.app.controller;

import com.vsvegzdaite.app.model.Gavejas;
import com.vsvegzdaite.app.service.GavejasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GavejasController {

    @Autowired
    private GavejasService gavejasService;

    @Autowired
    public GavejasController(GavejasService gavejasService) {
        this.gavejasService = gavejasService;
    }

    @RequestMapping(value = "/siuntos/gavejai", method = RequestMethod.GET)
    public List<Gavejas> gautiGavejus() {
        return gavejasService.gautiGavejus();
    }

    @GetMapping("/siuntos/gavejai/{id}")
    public Gavejas gautiGaveja(@PathVariable final Long id) {
        return gavejasService.gautiGaveja(id);
    }

    @RequestMapping(value = "/siuntos/gavejai/add", method = RequestMethod.POST)
    public void issaugotiGaveja(@RequestBody Gavejas gavejas) {
        gavejasService.issaugotiGaveja(gavejas);
    }

    @PutMapping("/siuntos/gavejai/update/{id}")
    public void redaguotiGaveja(@PathVariable Long id, @RequestBody Gavejas gavejas) {
        gavejasService.redaguotiGaveja(id, gavejas);
    }

    @DeleteMapping(path = {"/siuntos/gavejai/{id}"})
    public void istrintiGaveja(@PathVariable final Long id) {
        gavejasService.istrintiGaveja(id);
    }

}
