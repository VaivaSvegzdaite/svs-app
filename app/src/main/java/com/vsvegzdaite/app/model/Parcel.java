package com.vsvegzdaite.app.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Parcel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE })
    private Sender sender;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE})
    private Receiver receiver;
    private String size;
    private Double weight;

    public Parcel(Long id, Sender sender, Receiver receiver, String size, Double weight) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.size = size;
        this.weight = weight;
    }

    public Parcel(Sender sender, Receiver receiver, String size, Double weight) {
        this.sender = sender;
        this.receiver = receiver;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id=" + id +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
