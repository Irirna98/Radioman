package ru.netology.radioman;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadiomanTest {
    @Test
    public void testChangeStationNext() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeStationNextEnd() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeStationPrev() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeStationPrevEnd() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeSoundUp() {
        Radioman radio = new Radioman();
        radio.setCurrentSound(2);
        radio.changeVolumeUp();
        int expected = 3;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeSoundUpEnd() {
        Radioman radio = new Radioman();
        radio.setCurrentSound(10);
        radio.changeVolumeUp();
        int expected = 10;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeSoundLow() {
        Radioman radio = new Radioman();
        radio.setCurrentSound(8);
        radio.changeVolumeLow();
        int expected = 7;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeSoundEnd() {
        Radioman radio = new Radioman();
        radio.setCurrentSound(0);
        radio.changeVolumeLow();
        int expected = 0;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationNumber() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(3);

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationNumberTen() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationNumberNegative() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentSound() {
        Radioman radio = new Radioman();
        radio.setCurrentSound(4);

        int expected = 4;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentSoundHigh() {
        Radioman radio = new Radioman();
        radio.setCurrentSound(11);

        int expected = 0;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentSoundNegative() {
        Radioman radio = new Radioman();
        radio.setCurrentSound(-1);

        int expected = 0;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }
}
