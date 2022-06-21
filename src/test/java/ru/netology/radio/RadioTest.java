package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldChangeStation() {

        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
   public void shouldSetStationUnderMinStation() {
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
   public void shouldSetStationOverMaxStation() {
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        radio.setCurrentStation(6);
        radio.nextStation();
        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
   public void shouldOverMaxStation1() {
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverMaxStation2() {
        radio.setCurrentStation(10);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
   public void shouldPrevStation() {
        radio.setCurrentStation(4);
        radio.previousStation();
        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
   public void shouldBelowMinStation1() {
        radio.setCurrentStation(0);
        radio.previousStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowMinStation2() {
        radio.setCurrentStation(-1);
        radio.previousStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeVolume() {

        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverMaxVolume1() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverMaxVolume2() {
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowMinVolume1() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
   public void shouldBelowMinVolume2() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}