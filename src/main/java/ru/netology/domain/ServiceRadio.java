package ru.netology.domain;

import java.text.StringCharacterIterator;

public class ServiceRadio {
    private int currentRadioStation;
    private int soundRadio;


    //Сервис ручного переключения радиостанций
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

    // Сервис переключения радиостанций кнопками "Вперед"/"Назад"
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

    //Сервис ручного переключения уровня громкости радио

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

    //Сервис автоматического переключения уровня громкости радио кнопками +/-
    public void setSwitchingRadioSound(String switchingRadioSound) {

        if (switchingRadioSound.equals("+")) {
            soundRadio++;
            if (soundRadio == 11) {
                soundRadio = 10;
            }
        }
        if (switchingRadioSound.equals("-")) {
            soundRadio = soundRadio - 1;
            if (soundRadio == -1) {
                soundRadio = 0;
            }
        }

    }

    public int getSwitchingRadioSound() {
        return soundRadio;
    }

}
