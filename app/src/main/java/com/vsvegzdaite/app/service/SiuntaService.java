package com.vsvegzdaite.app.service;

import com.vsvegzdaite.app.model.Gavejas;
import com.vsvegzdaite.app.model.Siunta;
import com.vsvegzdaite.app.model.Siuntejas;
import com.vsvegzdaite.app.repository.SiuntaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SiuntaService {

    @Autowired
    private SiuntaDAO siuntaDAO;

    @Transactional
    public List<Siunta> gautiSiuntas() {
        return siuntaDAO.findAll();
    }

    @Transactional
    public Siunta gautiSiunta(Long id) {
        Siunta siunta = siuntaDAO.findById(id).get();
        return siunta;
    }

    @Transactional
    public void issaugotiSiunta(Siunta siunta) {
        siuntaDAO.save(siunta);
    }

    @Transactional
    public void redaguotiSiunta(Long id, Siunta data) {
        Siunta siunta = siuntaDAO.getById(id);
        if (siunta != null) {
            siunta.setSiuntejas(data.getSiuntejas());
            siunta.setGavejas(data.getGavejas());
            siunta.setDydis(data.getDydis());
            siunta.setSvoris(data.getSvoris());
            siuntaDAO.save(siunta);
        }
    }

    @Transactional
    public void istrintiSiunta(Long id) {
        siuntaDAO.deleteById(id);
    }

}
