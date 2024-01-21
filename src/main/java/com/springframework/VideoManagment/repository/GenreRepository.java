package com.springframework.VideoManagment.repository;

import com.springframework.VideoManagment.model.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {
}
