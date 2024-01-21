package com.springframework.VideoManagment.repository;

import com.springframework.VideoManagment.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
