package ru.netology.domain;

import lombok.Data;

@Data
public class ServiceRadio {
    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation;
    private int soundRadio;
    private int switchingNextRadioStation;
    private int switchingPrevRadioStation;
    private int switchingPlusRadioSound;
    private int switchingMinusRadioSound;

    public ServiceRadio(int currentRadioStation) {
        this.maxRadioStation = currentRadioStation - 1;
    }

    public ServiceRadio() {
    }

    //Сервис ручного переключения радиостанций
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            newCurrentRadioStation = minRadioStation; //при попытке ввода радиостанции меньше нуля получаем станцию мин
        }
        if (newCurrentRadioStation > maxRadioStation) {
            newCurrentRadioStation = maxRadioStation; // попытка ввода станции больше макса устанавливает максимальную ст
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    // Сервис переключения радиостанций кнопкой "Вперед"
    public void setSwitchingNextRadioStation() {
        switchingNextRadioStation = currentRadioStation+1;
        if (switchingNextRadioStation == maxRadioStation + 1) {
            switchingNextRadioStation = minRadioStation;
        }

    }
    // Сервис переключения радиостанций кнопкой "Назад"

    public void setSwitchingPrevRadioStation() {
        switchingPrevRadioStation = currentRadioStation - 1;
        if (switchingPrevRadioStation == minRadioStation - 1) {
            switchingPrevRadioStation = maxRadioStation;
        }
    }
    //Сервис ручного переключения уровня громкости радио

    public void setSoundRadio(int newSoundRadio) {
        if (newSoundRadio < 0) {
            newSoundRadio = 0;
        }
        if (newSoundRadio > 100) {
            newSoundRadio = 100;
        }
        this.soundRadio = newSoundRadio;
    }

    //Сервис автоматического увеличения уровня громкости радио
    public void setSwitchingPlusRadioSound() {
        switchingPlusRadioSound = soundRadio+1;
        if (switchingPlusRadioSound == 101) {
            switchingPlusRadioSound = 100;
        }
    }

    //Сервис автоматического уменьшения уровня громкости радио
    public void setSwitchingMinusRadioSound() {
        switchingMinusRadioSound = soundRadio - 1;
        if (switchingMinusRadioSound == -1) {
            switchingMinusRadioSound = 0;
        }
    }

}


