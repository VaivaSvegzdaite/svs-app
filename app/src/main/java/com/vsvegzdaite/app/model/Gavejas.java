package com.vsvegzdaite.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Gavejas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String gavejoVardas;
    private  String gavejoPavarde;
    private String gavejoAdresas;
    private Integer gavejoTelefonas;
    private String gavejoElPatsas;
    @OneToMany(mappedBy = "gavejas", cascade = {CascadeType.ALL})
    @JsonIgnore
    private Set<Siunta> gavejoSiuntos;

    public Gavejas(Long id, String gavejoVardas, String gavejoPavarde, String gavejoAdresas, Integer gavejoTelefonas, String gavejoElPatsas) {
        this.id = id;
        this.gavejoVardas = gavejoVardas;
        this.gavejoPavarde = gavejoPavarde;
        this.gavejoAdresas = gavejoAdresas;
        this.gavejoTelefonas = gavejoTelefonas;
        this.gavejoElPatsas = gavejoElPatsas;
    }

    public Gavejas(String gavejoVardas, String gavejoPavarde, String gavejoAdresas, Integer gavejoTelefonas, String gavejoElPatsas) {
        this.gavejoVardas = gavejoVardas;
        this.gavejoPavarde = gavejoPavarde;
        this.gavejoAdresas = gavejoAdresas;
        this.gavejoTelefonas = gavejoTelefonas;
        this.gavejoElPatsas = gavejoElPatsas;
    }

    @Override
    public String toString() {
        return "Gavejas{" +
                "id=" + id +
                ", gavejoVardas='" + gavejoVardas + '\'' +
                ", gavejoPavarde='" + gavejoPavarde + '\'' +
                ", gavejoAdresas='" + gavejoAdresas + '\'' +
                ", gavejoTelefonas=" + gavejoTelefonas +
                ", gavejoElPatsas='" + gavejoElPatsas + '\'' +
                '}';
    }
}
