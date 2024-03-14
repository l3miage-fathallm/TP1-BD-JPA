package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.math.BigInteger;
import fr.uga.l3miage.tp1.exo2.models.NetflixUserEntity;

@Entity(name = "netflix_account")
public class NetflixAccountEntity {
@Id
    @Column(name = "id")
    private BigInteger id;
@Column(name = "nb_devices")
    private Integer nbDevices;
@Column(name = "type_account")
    private String typeAccount;
@OneToOne
@JoinColumn(name = "uuid_user", referencedColumnName = "uuid")
    private NetflixUserEntity netflixUserEntity;
}
