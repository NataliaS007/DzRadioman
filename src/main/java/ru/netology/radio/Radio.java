package ru.netology.radio;

public class Radio {

    private int numberRadioStations = 10;
    private int currentRadioStation;
    private int currentVolume;

    public Radio(int numberRadioStations) {
        if (numberRadioStations > 0) {
            this.numberRadioStations = numberRadioStations;
        } else {
            this.numberRadioStations = 1;
        }
    }

    public Radio() {
    }

    public int getNumberRadioStations() {
        return numberRadioStations;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0 || newCurrentRadioStation > numberRadioStations - 1) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation == numberRadioStations - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = numberRadioStations - 1;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
