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
public class Sender {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    private  String lastName;
    private String address;
    @OneToMany(mappedBy = "sender", cascade = {CascadeType.ALL})
    @JsonIgnore
    private Set<Parcel> parcels;

    public Sender(Long id, String name, String lastName, String address, Set<Parcel> parcels) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.parcels = parcels;
    }

    public Sender(String name, String lastName, String address, Set<Parcel> parcels) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.parcels = parcels;
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
