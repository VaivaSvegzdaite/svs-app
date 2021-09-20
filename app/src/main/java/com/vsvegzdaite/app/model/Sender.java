package com.vsvegzdaite.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Sender {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    private  String lastName;
    private String address;
    @OneToMany(mappedBy = "sender", cascade = {CascadeType.ALL})
    @JsonIgnore
    private Set<Parcel> parcels = new HashSet<>();

    public Sender(Long id, String name, String lastName, String address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public Sender(String name, String lastName, String address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Sender{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", parcels=" + parcels +
                '}';
    }
}
