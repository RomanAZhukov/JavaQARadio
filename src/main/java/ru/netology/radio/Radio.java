package ru.netology.radio;


public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;


    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int maxStation, int minStation) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
    }

    public Radio() {

    }




    public int getCurrentStation() {

        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMixStation() {
        return minStation;
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