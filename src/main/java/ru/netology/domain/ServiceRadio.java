package ru.netology.domain;

public class ServiceRadio {
    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation;
    private int soundRadio;

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

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    // Сервис переключения радиостанций кнопкой "Вперед"
    public void setSwitchingNextRadioStation() {
        ;

        currentRadioStation++;
        if (currentRadioStation == maxRadioStation + 1) {
            currentRadioStation = minRadioStation;

        }


    }

    public int getSwitchingNextRadioStation() {
        return currentRadioStation;
    }
    // Сервис переключения радиостанций кнопкой "Назад"

    public void setSwitchingPrevRadioStation() {


        currentRadioStation = currentRadioStation - 1;
        if (currentRadioStation == minRadioStation - 1) {
            currentRadioStation = maxRadioStation;

        }

    }


    public int getSwitchingPrevRadioStation() {
        return currentRadioStation;
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

    public int getSoundRadio() {
        return soundRadio;
    }

    //Сервис автоматического увеличения уровня громкости радио
    public void setSwitchingPlusRadioSound() {


        soundRadio++;
        if (soundRadio == 101) {
            soundRadio = 100;
        }
    }

    public int getSwitchingPlusRadioSound() {
        return soundRadio;
    }

    //Сервис автоматического уменьшения уровня громкости радио
    public void setSwitchingMinusRadioSound() {


        soundRadio = soundRadio - 1;
        if (soundRadio == -1) {
            soundRadio = 0;
        }
    }

    public int getSwitchingMinusRadioSound() {
        return soundRadio;
    }
}


