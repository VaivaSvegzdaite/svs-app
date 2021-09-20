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
public class Receiver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    private  String lastName;
    private String address;
    private Long phone;
    private String email;
    @OneToMany(mappedBy = "receiver", cascade = {CascadeType.ALL})
    @JsonIgnore
    private Set<Parcel> parcels = new HashSet<>();

    public Receiver(Long id, String name, String lastName, String address, Long phone, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Receiver(String name, String lastName, String address, Long phone, String email) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", parcels=" + parcels +
                '}';
    }
}
