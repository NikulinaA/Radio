package ru.netology.domain;

import java.text.StringCharacterIterator;

public class ServiceRadio {
    private int currentRadioStation;
    private int soundRadio;

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

   public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setSwitchingRadioStation(String switchingRadioStation) {

        if (switchingRadioStation.equals("next")) {
            currentRadioStation++;
            if (currentRadioStation == 10) {
                currentRadioStation = 0;
            }
        }
        if (switchingRadioStation.equals("prev")) {
            currentRadioStation = currentRadioStation - 1;
            if (currentRadioStation == -1) {
                currentRadioStation = 9;
            }
        }

    }

    public int getSwitchingRadioStation() {
        return currentRadioStation;
    }



    public void setSoundRadio(int newSoundRadio) {
        if (newSoundRadio < 0) {
            return;
        }
        if (newSoundRadio > 10) {
            return;
        }
        this.soundRadio = newSoundRadio;
    }

    public int getSoundRadio() {
        return soundRadio;
    }


    public void setSwitchingRadioSound(String switchingRadioSound) {

        if (switchingRadioSound.equals("+")) {
            soundRadio++;
            if (soundRadio == 11) {
                soundRadio = 0;
            }
        }
        if (switchingRadioSound.equals("-")) {
            soundRadio = soundRadio - 1;
            if (soundRadio == -1) {
                soundRadio = 10;
            }
        }

    }

    public int getSwitchingRadioSound() {
        return soundRadio;
    }
    public void setNoSoundRadio(int newSoundRadio) {
        if (newSoundRadio < 0) {
            return;
        }
        if (newSoundRadio > 10) {
            return;
        }
        this.soundRadio = newSoundRadio;
    }
    public void setNoCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }
}
