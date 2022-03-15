package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AfishaItem {
    private int filmId;
    private String filmName;

    public int getFilmId() {
        return filmId;
    }

    public int setFilmId() {
        this.filmId = filmId;
        return 0;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
}
