package com.springframework.VideoManagment.model;



import jakarta.persistence.*;
import lombok.*;


@Entity(name = "ratings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Rating {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ratingId;
    private int rating;


    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;


    @ManyToOne
    @JoinColumn(name = "contentId")
    private Content content;

}