package com.springframework.VideoManagment.model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@DiscriminatorValue("movie")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Movie extends Content{

    private int duration;
}
