package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void RadioCreationWithParameter() {
        // Тестирование создания радио с параметром
        Radio radio = new Radio(20);
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(19, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void RadioCreationWithoutParameter() {
        // Тестирование создания радио без параметров
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void GetCurrentStation() {
        // получить текущую станцию
        Radio radio = new Radio(20);
        radio.setCurrentStation(25);
        int expected = (0);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void СhangesTheStation() {
        // переключает станцию
        Radio radio = new Radio(15);
        radio.setCurrentStation(8);
        int expected = (8);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchesAtValuesGreaterMax() {
        // переключает при значения больше 9
        Radio radio = new Radio(20);
        radio.setCurrentStation(13);
        int expected = (13);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setDirectlyBellowMin() {
        // установить непосредственно ниже минимального значения
        Radio radio = new Radio(20);
        radio.setCurrentStation(-1);
        int expected = (19);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void NextStation() {
        // переключает на минимальное при нажатие Next при максимальном значении
        Radio radio = new Radio(30);
        radio.nextStation();
        int expected = (1);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void previousStation() {
        // уменьшает текущую станцию на минимальное значение
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);
        int expected = (0);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void GetCurrentVolume() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(55);
        int expected = (55);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TurnUpTheVolume() {
        Radio radio = new Radio(99);
        radio.setCurrentVolume(100);
        int expected = (100);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TurnDownTheVolume() {
        Radio radio = new Radio(66);
        radio.setCurrentVolume(65);
        int expected = (65);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void lessThanMinValue() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(0);
        int expected = (0);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio(50);
        radio.increaseVolume();
        int expected = (1);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}