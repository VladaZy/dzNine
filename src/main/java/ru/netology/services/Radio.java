package ru.netology.services;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int currentVolume;


    public Radio(int size) {
        maxStation = minStation + size - 1;

    }

    public Radio() {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            newCurrentStation = minStation;
        }
        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }
        currentStation = newCurrentStation;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int getMinStation() {
        return minStation;

    }

    public int getMaxStation() {
        return maxStation;
    }

    public void nextStation() {
        int target = currentStation + 1;
        setCurrentStation(target);
    }

    public void increaseVolume() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }
}