package com.vsvegzdaite.app.controller;

import com.vsvegzdaite.app.model.Siuntejas;
import com.vsvegzdaite.app.service.SiuntejasService;
import com.vsvegzdaite.app.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SiuntejasController {

    @Autowired
    private SiuntejasService siuntejasService;

    @Autowired
    public SiuntejasController(SiuntejasService siuntejasService) {
        this.siuntejasService = siuntejasService;
    }

    @RequestMapping(value = "/siuntos/siuntejai", method = RequestMethod.GET)
    public List<Siuntejas> gautiSiuntejus() {
        return siuntejasService.gautiSiuntejus();
    }

    @GetMapping("/siuntos/siuntejai/{id}")
    public Siuntejas gautiSiunteja(@PathVariable final Long id) {
        return siuntejasService.gautiSiunteja(id);
    }

    @RequestMapping(value = "/siuntos/siuntejai/add", method = RequestMethod.POST)
    public void issaugotiSiunteja(@RequestBody Siuntejas siuntejas) {
        siuntejasService.issaugotiSiunteja(siuntejas);
    }

    @PutMapping("/siuntos/siuntejas/update/{id}")
    public void redaguotiSiunteja(@PathVariable Long id, @RequestBody Siuntejas siuntejas) {
        siuntejasService.redaguotiSiunteja(id, siuntejas);
    }

    @DeleteMapping(path = {"/siuntos/siuntejai/{id}"})
    public void istrintiSiunteja(@PathVariable final Long id) {
        siuntejasService.istrintiSiunteja(id);
    }
}
