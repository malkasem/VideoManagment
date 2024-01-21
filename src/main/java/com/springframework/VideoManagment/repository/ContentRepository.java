package com.springframework.VideoManagment.repository;

import com.springframework.VideoManagment.model.Content;
import org.springframework.data.repository.CrudRepository;

public interface ContentRepository extends CrudRepository<Content, Long> {
}
