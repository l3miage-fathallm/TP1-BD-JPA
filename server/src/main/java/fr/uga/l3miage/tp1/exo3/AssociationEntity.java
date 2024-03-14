package fr.uga.l3miage.tp1.exo3;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AssociationEntity {
@Id
    private String name;
@Column(name = "president_name", nullable = false)
    private String presidentName;
@Column(name = "treasurer_name", nullable = false)
    private String treasurerName;
private String secretaryName;
@Enumerated(EnumType.ORDINAL)
    AssociationType associationType;
@ManyToOne FederationEntity federation;
@OneToMany(mappedBy = "association")
    private Set<FederationEntity> federations;

}
