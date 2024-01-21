package com.springframework.VideoManagment.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name = "userName")
    private String userName;
    @Column(name = "email")
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Rating> ratings = new HashSet<>();


}
