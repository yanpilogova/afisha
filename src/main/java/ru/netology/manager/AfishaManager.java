package ru.netology.manager;


import ru.netology.domain.AfishaItem;

public class AfishaManager {
    public AfishaItem[] items = new AfishaItem[0];
    private int numberOfFilms = 10;

    public AfishaManager(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public AfishaManager() {

    }

    public void addFilm(AfishaItem item) {
        int length = items.length + 1;
        AfishaItem[] tmp = new AfishaItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public AfishaItem[] getAllFilms() {
        AfishaItem[] result = new AfishaItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public AfishaItem[] getTenFilms() {
        int number = this.numberOfFilms;
        if (number > items.length)
            number = items.length;
        AfishaItem[] result = new AfishaItem[number];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}


