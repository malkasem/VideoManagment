package com.springframework.VideoManagment.service;

import java.util.Optional;
import java.util.Set;

public interface BaseService<T, ID>{

   Optional<T> findById(ID id);

    Set<T> findAll();


   T save(T object);


    Set<T> saveAll(Set<T> objects);

    void delete(T object);


    void deleteById(ID id);


    void deleteAll(Set<T> objects);
}
