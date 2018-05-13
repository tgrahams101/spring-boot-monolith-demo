package com.example.springbootmonolithdemo.repositories;

import com.example.springbootmonolithdemo.models.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {

}