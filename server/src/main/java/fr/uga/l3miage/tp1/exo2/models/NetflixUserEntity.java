package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import fr.uga.l3miage.tp1.exo2.enums.*;
import java.time.LocalDate;

@Entity(name = "netflix_user")
public class NetflixUserEntity {
@Id
@Column(name = "id")
private long id;
@Column(name = "uuid")
private String uuid;
@Column(name = "last_name")
private String lastName;
@Column(name = "first_name")
private String firstName;
@Column(name = "sex")
@Enumerated(EnumType.STRING)
private sex sex;
@Column(name = "birth_date")
private LocalDate birthDate;
@OneToOne(mappedBy = "NetflixUserEntity")
    private NetflixAccountEntity netflixAccountEntity;
}
