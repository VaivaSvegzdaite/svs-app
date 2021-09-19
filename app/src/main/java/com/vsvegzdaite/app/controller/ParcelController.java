package com.vsvegzdaite.app.controller;

import com.vsvegzdaite.app.model.Parcel;
import com.vsvegzdaite.app.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParcelController {

    @Autowired
    private ParcelService parcelService;

    @Autowired
    public ParcelController(ParcelService parcelService) {
        this.parcelService = parcelService;
    }

    @RequestMapping(value = "/parcels", method = RequestMethod.GET)
    public List<Parcel> getParcels() {
        return parcelService.getParcels();
    }

    @GetMapping("/parcels/{id}")
    public Parcel getParcel(@PathVariable final Long id) {
        return parcelService.getParcelById(id);
    }

    @RequestMapping(value = "/addparcel", method = RequestMethod.POST)
    public void saveParcel(@RequestBody Parcel parcel) {
        parcelService.saveParcel(parcel);
    }

    @PutMapping("/updateparcel/{id}")
    public void updateParcel(@PathVariable Long id, @RequestBody Parcel parcel) {
        parcelService.editParcel(id, parcel);
    }

    @DeleteMapping(path = {"/parcels/{id}"})
    public void deleteParcel(@PathVariable final Long id) {
        parcelService.deleteParcel(id);
    }
}
