package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaItem;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    private AfishaManager manager = new AfishaManager();
    AfishaItem first = new AfishaItem(1, "Bladshot");
    AfishaItem second = new AfishaItem(2, "Vpered");
    AfishaItem third = new AfishaItem(3, "Otel Belgrad");
    AfishaItem fourth = new AfishaItem(4, "Dzhentelmeny");
    AfishaItem fifth = new AfishaItem(5, "Chelovek-Nevidimka");
    AfishaItem sixth = new AfishaItem(6, "Trolli");
    AfishaItem seventh = new AfishaItem(7, "Nomer odin");

    public void setUp() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
    }

    @Test
    public void shouldTestAddOneFilm() {
        manager.addFilm(first);

        assertArrayEquals(new AfishaItem[]{first}, manager.getAllFilms());
    }

    @Test
    public void shouldTestAddOneMoreFilm() {
        manager.addFilm(first);
        AfishaItem[] expected = new AfishaItem[]{first};
        AfishaItem[] actual = manager.getAllFilms();
        assertArrayEquals(new AfishaItem[]{first}, manager.getAllFilms());

        manager.addFilm(second);
        AfishaItem[] expectedAdded = new AfishaItem[]{second, first};
        AfishaItem[] actualAdded = manager.getAllFilms();
        assertArrayEquals(expectedAdded, actualAdded);
    }

    @Test
    public void shouldGetTenFilms() {
        setUp();
        AfishaItem[] expected = new AfishaItem[]{seventh, sixth, fifth, fourth, third, second, first};
        AfishaItem[] actual = manager.getTenFilms();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetFilmsLessThanTen() {
        manager = new AfishaManager(2);
        setUp();
        AfishaItem[] expected = new AfishaItem[]{seventh, sixth};
        AfishaItem[] actual = manager.getTenFilms();
        assertArrayEquals(expected, actual);
    }
}