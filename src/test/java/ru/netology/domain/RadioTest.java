package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ru.netology.domain.Radio;

public class RadioTest {

    @Test
    public void shouldTurnOnStationOn99() {
        Radio radio = new Radio(100);


        radio.setCurrentStation(99);


        int expected = 99;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnOnStationOn50() {
        Radio radio = new Radio(100);


        radio.setCurrentStation(50);


        int expected = 50;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNotTurnOnStationOverLimit() {
        Radio radio = new Radio(100);


        radio.setCurrentStation(101);


        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnOnStationOnLimitItem() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(100);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStationAfterLimit() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);

        radio.increaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStationBeforeLimit() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(48);

        radio.increaseStation();

        int expected = 49;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStation() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(1);

        radio.increaseStation();

        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseStation() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(48);

        radio.decreaseStation();

        int expected = 47;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseStationOnLimit() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);

        radio.decreaseStation();

        int expected = 49;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseStationBeforeLimit() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(1);

        radio.decreaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldTheVolumeIncreaseFrom99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldTheVolumeIncreaseFrom100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldTheVolumeIncreaseFrom1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolume101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);


        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldTheVolumeDecreaseFrom1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldTheVolumeDecreaseFrom0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldTheVolumeDecreaseFrom100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }




}