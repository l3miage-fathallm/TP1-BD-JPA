package fr.uga.l3miage.tp1.exo1.models;

import javax.persistence.*;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;
import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import java.time.LocalDate;

@Entity
@Table
public class BikeEntity {
    @Id
    @Column(name = "immatriculation")
    private String immatriculation;
    @Column(name = "capacity")
    private Integer capacity;
    @Column(name= "cylinder_number")
    @Enumerated(EnumType.STRING)
    private CylinderNumber cylinderNumber;
    @Column(name = "automatic")
    private boolean automatic;
    @Column(name = "shifter")
    private boolean shifter;
    @Column(name = "shifter_type")
    @Enumerated(EnumType.ORDINAL)
    private ShifterType shifterType;
    @Column(name = "circulation_date")
    private LocalDate circulationDate;
}
