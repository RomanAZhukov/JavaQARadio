package ru.netology.radio;

public class Radio {
    private int currentStation;


    private int currentVolume;


    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {

            return;
        }
        if (newCurrentStation > 9) {
            return;

        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation >= 9) {
            setCurrentStation(0);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void previousStation() {
        if (currentStation <= 0) {
            setCurrentStation(9);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {

            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}