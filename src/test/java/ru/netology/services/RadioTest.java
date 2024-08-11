package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void getCurrentStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.previous();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.next();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setPrevious() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.previous();
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnToMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(65);
        int expected = 65;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(85);
        radio.increaseVolume();
        int expected = 86;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(90);
        radio.reduceVolume();
        int expected = 89;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void notSetBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}