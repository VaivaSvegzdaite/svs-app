package com.vsvegzdaite.app.service;

import com.vsvegzdaite.app.model.Parcel;
import com.vsvegzdaite.app.repository.ParcelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParcelService {

    @Autowired
    private ParcelDAO parcelDAO;

    @Transactional
    public List<Parcel> getParcels() {
        return parcelDAO.findAll();
    }

    @Transactional
    public Parcel getParcelById(Long id) {
        Parcel parcel = parcelDAO.findById(id).get();
        return parcel;
    }

    @Transactional
    public void saveParcel(Parcel parcel) {
        parcelDAO.save(parcel);
    }

    @Transactional
    public void editParcel(Long id, Parcel data) {
        Parcel parcel = parcelDAO.getById(id);
        if (parcel != null) {
            parcel.setSender(data.getSender());
            parcel.setReceiver(data.getReceiver());
            parcel.setSize(data.getSize());
            parcel.setWeight(data.getWeight());
            parcelDAO.save(parcel);
        }
    }

    @Transactional
    public void deleteParcel(Long id) {
        parcelDAO.deleteById(id);
    }

}
