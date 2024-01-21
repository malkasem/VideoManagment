package com.springframework.VideoManagment.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "content_type", discriminatorType = DiscriminatorType.STRING)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class Content {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contentId;
    @Column(name = "title")
    private String title;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private Set<Rating> ratings = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "content_genre",
            joinColumns = { @JoinColumn(name = "contentId")},
            inverseJoinColumns = {@JoinColumn(name = "genreId")}
    )
    private Set<Genre> genres = new HashSet<>();

}