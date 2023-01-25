package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumberRadioStationPositive() {
        Radio radio = new Radio(30);

        int expected = 30;
        int actual = radio.getNumberRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRadioStationNegative() {
        Radio radio = new Radio(-25);

        int expected = 1;
        int actual = radio.getNumberRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationWithCurrentNumberInRange() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationWithCurrentNumberBelowRange() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationWithCurrentNumberAboveRange() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWithCurrentNumberWhenLast() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWithCurrentNumberWhenNotLast() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);

        radio.nextRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWithCurrentNumberWhenFirst() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWithCurrentNumberWhenNotFirst() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.prevRadioStation();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationWithChangedNumberInRange() {
        Radio radio = new Radio(20);

        radio.setCurrentRadioStation(15);

        int expected = 15;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationWithChangedNumberBelowRange() {
        Radio radio = new Radio(12);

        radio.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationWithChangedNumberAboveRange() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(25);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWithChangedNumberWhenLast() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(14);

        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWithChangedNumberWhenNotLast() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(10);

        radio.nextRadioStation();

        int expected = 11;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWithChangedNumberWhenFirst() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(0);

        radio.prevRadioStation();

        int expected = 14;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWithChangedNumberWhenNotFirst() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(8);

        radio.prevRadioStation();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeWhenLast() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeWhenNotLast() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeWhenFirst() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeWhenNotFirst() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.decreaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
