package pe.edu.i202223516.DAWI_HILARIO_TRINIDAD_CARLOS.service;

import pe.edu.i202223516.DAWI_HILARIO_TRINIDAD_CARLOS.dto.FilmDetailDto;
import pe.edu.i202223516.DAWI_HILARIO_TRINIDAD_CARLOS.dto.FilmDto;
import pe.edu.i202223516.DAWI_HILARIO_TRINIDAD_CARLOS.dto.FilmRegisterDto;
import pe.edu.i202223516.DAWI_HILARIO_TRINIDAD_CARLOS.dto.FilmUpdateDto;
import pe.edu.i202223516.DAWI_HILARIO_TRINIDAD_CARLOS.entity.Language;

import java.util.List;

public interface MaintenanceService {
    List<FilmDto> getAllFilms();

    FilmDetailDto getFilmById(int id);

    FilmUpdateDto getFilmUpdateById(int id);

    void updateFilm(FilmUpdateDto filmUpdateDto);

    void deleteFilm(int id);

    void registerNewFilm(FilmRegisterDto filmRegisterDto);

    List<Language> getAllLanguages();
}
