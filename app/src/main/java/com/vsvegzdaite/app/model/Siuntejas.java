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
public class Siuntejas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String siuntejoVardas;
    private  String siuntejoPavarde;
    private String siuntejoAdresas;
    @OneToMany(mappedBy = "siuntejas", cascade = {CascadeType.ALL})
    @JsonIgnore
    private Set<Siunta> siuntejoSiuntos;

    public Siuntejas(Long id, String siuntejoVardas, String siuntejoPavarde, String siuntejoAdresas) {
        this.id = id;
        this.siuntejoVardas = siuntejoVardas;
        this.siuntejoPavarde = siuntejoPavarde;
        this.siuntejoAdresas = siuntejoAdresas;
    }

    public Siuntejas(String siuntejoVardas, String siuntejoPavarde, String siuntejoAdresas) {
        this.siuntejoVardas = siuntejoVardas;
        this.siuntejoPavarde = siuntejoPavarde;
        this.siuntejoAdresas = siuntejoAdresas;
    }

    @Override
    public String toString() {
        return "Siuntejas{" +
                "id=" + id +
                ", siuntejoVardas='" + siuntejoVardas + '\'' +
                ", siuntejoPavarde='" + siuntejoPavarde + '\'' +
                ", siuntejoAdresas='" + siuntejoAdresas + '\'' +
                '}';
    }
}
