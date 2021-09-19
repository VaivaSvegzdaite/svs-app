package com.vsvegzdaite.app.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Siunta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE })
    private Siuntejas siuntejas;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE})
    private Gavejas gavejas;
    private String dydis;
    private Double svoris;


    public Siunta(Long id, Siuntejas siuntejas, Gavejas gavejas, String dydis, Double svoris) {
        this.id = id;
        this.siuntejas = siuntejas;
        this.gavejas = gavejas;
        this.dydis = dydis;
        this.svoris = svoris;
    }

    public Siunta(Siuntejas siuntejas, Gavejas gavejas, String dydis, Double svoris) {
        this.siuntejas = siuntejas;
        this.gavejas = gavejas;
        this.dydis = dydis;
        this.svoris = svoris;
    }

    @Override
    public String toString() {
        return "Siunta{" +
                "id=" + id +
                ", siuntejas=" + siuntejas +
                ", gavejas=" + gavejas +
                ", dydis='" + dydis + '\'' +
                ", svoris=" + svoris +
                '}';
    }
}
