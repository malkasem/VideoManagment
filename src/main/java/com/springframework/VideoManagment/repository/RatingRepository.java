package com.springframework.VideoManagment.repository;

import com.springframework.VideoManagment.model.Rating;
import org.springframework.data.repository.CrudRepository;

public interface RatingRepository extends CrudRepository<Rating, Long> {
}
