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

    // Сервис переключения радиостанций кнопкой "Вперед"
    public void setSwitchingNextRadioStation(String switchingRadioStation) {

        if (switchingRadioStation.equals("next")) {
            currentRadioStation++;
            if (currentRadioStation == 10) {
                currentRadioStation = 0;
            }
        }


    }

    public int getSwitchingNextRadioStation() {
        return currentRadioStation;
    }
    // Сервис переключения радиостанций кнопкой "Назад"

    public void setSwitchingPrevRadioStation(String switchingRadioStation) {

        if (switchingRadioStation.equals("prev")) {
            currentRadioStation = currentRadioStation - 1;
            if (currentRadioStation == -1) {
                currentRadioStation = 9;
            }
        }

    }


    public int getSwitchingPrevRadioStation() {
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

    //Сервис автоматического увеличения уровня громкости радио
    public void setSwitchingPlusRadioSound(String switchingRadioSound) {

        if (switchingRadioSound.equals("+")) {
            soundRadio++;
            if (soundRadio == 11) {
                soundRadio = 10;
            }
        }

    }

    public int getSwitchingPlusRadioSound() {
        return soundRadio;
    }

    //Сервис автоматического уменьшения уровня громкости радио
    public void setSwitchingMinusRadioSound(String switchingRadioSound) {


        if (switchingRadioSound.equals("-")) {
            soundRadio = soundRadio - 1;
            if (soundRadio == -1) {
                soundRadio = 0;
            }
        }
    }

    public int getSwitchingMinusRadioSound() {
        return soundRadio;
    }}


