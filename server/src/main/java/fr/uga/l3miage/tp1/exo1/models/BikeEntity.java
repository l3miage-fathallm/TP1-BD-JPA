package fr.uga.l3miage.tp1.exo1.models;

import javax.persistence.*;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;
import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import java.time.LocalDate;

@Entity
@Table
public class BikeEntity {
    @Id
    private String immatriculation;
    private Integer capacity;
    @Column(name= "cylinder_number")
    @Enumerated(EnumType.STRING)
    private CylinderNumber cylinderNumber;
    private boolean automatic;
    private boolean shifter;
    @Column(name = "shifter_type")
    @Enumerated(EnumType.ORDINAL)
    private ShifterType shifterType;
    private LocalDate circulationDate;
}
