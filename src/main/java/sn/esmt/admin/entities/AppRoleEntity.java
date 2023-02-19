package sn.esmt.admin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "approles")

public class AppRoleEntity {

    @Id//JPA ID est cle primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
    private int id;
    @Column(length = 150,nullable = false)
    private  String name;

    @Enumerated(EnumType.STRING)
    private Genre genre;

}
