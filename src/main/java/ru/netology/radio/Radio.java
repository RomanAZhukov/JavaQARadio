package ru.netology.radio;

public class Radio {
    private int quantity = 10;
    private int currentStation = quantity;
    private int minStation = 0;
    private int maxStation = quantity - 1;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int quantity) {
        this.quantity = quantity;
        this.maxStation = quantity - 1;
    }

    public Radio() {
    }

    public int getCurrentStation() {

        return currentStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {

            return;
        }
        if (newCurrentStation > maxStation) {
            return;

        }
        currentStation = newCurrentStation;
    }


    public void nextStation() {
        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void previousStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {

            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }


}