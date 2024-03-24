package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;

@Entity
@Table(name = "brand_miage")
public class BrandEntity {
    @Id
    @Column(name = "company_name")
    private String companyName;
    @Column(name="siret_number")
    private String siretNumber;
    @Column(name="type")
    @Enumerated(EnumType.STRING)
    private BrandType type;
    @ManyToOne
    private ProductEntity product;
}