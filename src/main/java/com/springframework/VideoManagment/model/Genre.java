package com.springframework.VideoManagment.model;



import jakarta.persistence.*;
import lombok.*;


import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@Table(name = "genre")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Genre {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genreId;
    @Column(name = "genreType")
    private String genreType;


    @ManyToMany(mappedBy = "genres")
    private Set<Content> contents = new HashSet<>();

}
