package fr.uga.l3miage.tp1.exo3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.security.PrivateKey;

@Entity(name = "brand_miage")
public class BrandEntity {
    @Id
    @Column(name = "company_name")
    private String companyName;
    private String siretNumber;
    private String type;
    @ManyToOne
    private ProductEntity product;
}