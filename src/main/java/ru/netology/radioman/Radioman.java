package ru.netology.radioman;
public class Radioman {
    public int currentStation;
    public int currentSound;
    private int maxStation;

    public  Radioman() {
        maxStation = 9;
    }
    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
            return;
        }
        currentStation = maxStation;
    }
    public void changeVolumeUp() {
        if (currentSound < 10) {
            currentSound++;
        } else {
            currentSound = 10;
        }

    }

    public void changeVolumeLow() {
        if (currentSound != 0) {
            currentSound--;
        } else {
            currentSound = 0;
        }

    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentSound() {
        return currentSound;
    }
    public void setCurrentSound(int currentSound) {
        if (currentSound < 0) {
            return;
        }
        if (currentSound > 10) {
            return;
        }
        this.currentSound = currentSound;
    }
}
