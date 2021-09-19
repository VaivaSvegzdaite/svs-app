package com.vsvegzdaite.app.service;

import com.vsvegzdaite.app.model.Gavejas;
import com.vsvegzdaite.app.repository.GavejasDAO;
import com.vsvegzdaite.app.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class GavejasService {

    @Autowired
    private GavejasDAO gavejasDao;

    @Transactional
    public List<Gavejas> gautiGavejus() {
        return gavejasDao.findAll();
    }

    @Transactional
    public Gavejas gautiGaveja(Long id) {
        Gavejas gavejas = gavejasDao.findById(id).get();
        return gavejas;
    }

    @Transactional
    public void issaugotiGaveja(Gavejas gavejas) {
        gavejasDao.save(gavejas);
    }

    @Transactional
    public void redaguotiGaveja(Long id, Gavejas data) {
        Gavejas gavejas = gavejasDao.getById(id);
        if (gavejas != null) {
            gavejas.setGavejoVardas(data.getGavejoVardas());
            gavejas.setGavejoPavarde(data.getGavejoPavarde());
            gavejas.setGavejoAdresas(data.getGavejoAdresas());
            gavejas.setGavejoTelefonas(data.getGavejoTelefonas());
            gavejas.setGavejoElPatsas(data.getGavejoElPatsas());
            gavejas.setGavejoSiuntos(data.getGavejoSiuntos());
            gavejasDao.save(gavejas);
        }
    }

    @Transactional
    public void istrintiGaveja(Long id) {
        gavejasDao.deleteById(id);
    }

}
