package com.vsvegzdaite.app.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
