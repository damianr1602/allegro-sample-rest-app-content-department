package com.github.springrest.sampleRESTapp.Controller;


import com.github.springrest.sampleRESTapp.Entity.Film;
import com.github.springrest.sampleRESTapp.Service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class FilmController {
    @Autowired
    private FilmService filmService;

    @RequestMapping(value = "films", method = RequestMethod.GET)
    public List<Film> getFilms() {
        return filmService.getAllFilms();
    }

    @RequestMapping(value = "films/film{id}", method = RequestMethod.GET)
    public Film getFilm(String id) {
        return filmService.getFilmInfo(id);
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public void addFilm(@RequestBody Film film) {
        filmService.insert(film);
    }


}
