package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.models.BrandEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_entity")
public class ProductEntity {
    @Id
    @Column(name = "bar_code_number")
    private String barCodeNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "consumable")
    boolean consumable;
    @OneToMany(mappedBy = "product")
    private Set<BrandEntity>brand;
}
