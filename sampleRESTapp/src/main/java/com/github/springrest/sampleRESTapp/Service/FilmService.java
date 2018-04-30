package com.github.springrest.sampleRESTapp.Service;

import com.github.springrest.sampleRESTapp.Entity.Film;
import com.github.springrest.sampleRESTapp.Repositiory.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public Film getFilmInfo(String id) {
        return filmRepository.getOne(id);
    }

    public void insert(Film film) {
        filmRepository.save(film);
    }
}
