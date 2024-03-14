package fr.uga.l3miage.tp1.exo3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity(name = "product_entity")
public class ProductEntity {
    @Id
    @Column(name = "bar_code_number")
    private String barCodeNumber;
    private String name;
    boolean consumable;
    @OneToMany(mappedBy = "product")
    private Set<BrandEntity>brand;
}
