package com.vsvegzdaite.app.controller;

import com.vsvegzdaite.app.model.Siunta;
import com.vsvegzdaite.app.service.SiuntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SiuntaController {

    @Autowired
    private SiuntaService siuntaService;

    @Autowired
    public SiuntaController(SiuntaService siuntaService) {
        this.siuntaService = siuntaService;
    }

    @RequestMapping(value = "/siuntos", method = RequestMethod.GET)
    public List<Siunta> gautiSiuntas() {
        return siuntaService.gautiSiuntas();
    }

    @GetMapping("/siuntos/{id}")
    public Siunta gautiSiunta(@PathVariable final Long id) {
        return siuntaService.gautiSiunta(id);
    }

    @RequestMapping(value = "/addsiunta", method = RequestMethod.POST)
    public void issaugotiSiunta(@RequestBody Siunta siunta) {
        siuntaService.issaugotiSiunta(siunta);
    }

    @PutMapping("/updatesiunta/{id}")
    public void redaguotiSiunta(@PathVariable Long id, @RequestBody Siunta siunta) {
        siuntaService.redaguotiSiunta(id, siunta);
    }

    @DeleteMapping(path = {"/siuntos/{id}"})
    public void istrintiSiunta(@PathVariable final Long id) {
        siuntaService.istrintiSiunta(id);
    }
}
