package com.vsvegzdaite.app.service;

import com.vsvegzdaite.app.model.Siuntejas;
import com.vsvegzdaite.app.repository.SiuntejasDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SiuntejasService {

    @Autowired
    private SiuntejasDAO siuntejasDAO;

    @Transactional
    public List<Siuntejas> gautiSiuntejus() {
        return siuntejasDAO.findAll();
    }

    @Transactional
    public Siuntejas gautiSiunteja(Long id) {
        Siuntejas siuntejas = siuntejasDAO.findById(id).get();
        return siuntejas;
    }

    @Transactional
    public void issaugotiSiunteja(Siuntejas siuntejas) {
        siuntejasDAO.save(siuntejas);
    }

    @Transactional
    public void redaguotiSiunteja(Long id, Siuntejas data) {
        Siuntejas siuntejas = siuntejasDAO.getById(id);
        if (siuntejas != null) {
            siuntejas.setSiuntejoVardas(data.getSiuntejoVardas());
            siuntejas.setSiuntejoPavarde(data.getSiuntejoPavarde());
            siuntejas.setSiuntejoAdresas(data.getSiuntejoAdresas());
            siuntejas.setSiuntejoSiuntos(data.getSiuntejoSiuntos());
            siuntejasDAO.save(siuntejas);
        }
    }

    @Transactional
    public void istrintiSiunteja(Long id) {
        siuntejasDAO.deleteById(id);
    }


}
