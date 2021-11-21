package ru.netology.domain;

public class Radio {
    private int id;
    private int currentStation = 1;
    private int currentVolume = 10;
    private int numberOfStations = 10;
    private int maxVolume = 15;
    private int minVolume = 0;
    private boolean on;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public Radio() {

    }

    public int setCurrentStation(int currentStation) {
        if (currentStation > (numberOfStations - 1)) {
            currentStation = 0;
        }
        if (currentStation > 0) {
            this.currentStation = currentStation;
        }

        this.currentStation = currentStation;
        return currentStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            currentVolume = currentVolume;

        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume;

        }
    }

    public void increaseStation() {

        if (currentStation < (numberOfStations - 1)) {
            this.currentStation = currentStation + 1;
        } else //if (currentStation == (numberOfStations - 1)) {
            currentStation = 0;
            return;

    }


    public void decreaseStation() {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
        } else //if (currentStation == 0) {
            this.currentStation = numberOfStations - 1;

    }
}

