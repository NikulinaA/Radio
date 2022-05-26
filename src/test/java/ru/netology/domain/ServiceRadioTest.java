package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ServiceRadioTest {

    //Тестирование ручного переключения радиостанции
    @ParameterizedTest
    @CsvFileSource(resources = {"/NoCurrent.csv"})
    public void switchingNoRadioStation(int radioStation, long expected) {

        ServiceRadio service = new ServiceRadio();
        service.setCurrentRadioStation(radioStation);

        long actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тестирование автоматического переключения радиостанции кнопкой "Вперед"
    @ParameterizedTest
    @CsvFileSource(resources = {"/CurrentNextRadioStationTest.csv"})
    public void switchingNextRadioStation(int radioStation, long expected, String switching) {

        ServiceRadio service = new ServiceRadio();
        service.setCurrentRadioStation(radioStation);
        service.setSwitchingNextRadioStation(switching);


        long actual = service.getSwitchingNextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тестирование автоматического переключения радиостанции кнопкой "Назад"
    @ParameterizedTest
    @CsvFileSource(resources = {"/CurrentPrevRadioStationTest.csv"})
    public void switchingPrevRadioStation(int radioStation, long expected, String switching) {

        ServiceRadio service = new ServiceRadio();
        service.setCurrentRadioStation(radioStation);
        service.setSwitchingPrevRadioStation(switching);

        long actual = service.getSwitchingPrevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //Тестирование ручного переключения уровня громкости радио
    @ParameterizedTest
    @CsvFileSource(resources = {"/NocurrentSound.csv"})
    public void noSwitchingSound(int radioSound, long expected) {

        ServiceRadio service = new ServiceRadio();
        service.setSoundRadio(radioSound);

        long actual = service.getSoundRadio();

        Assertions.assertEquals(expected, actual);
    }
// Тестирование автоматического увеличения уровня громкости радио
    @ParameterizedTest
    @CsvFileSource(resources = {"/CurrentPlusSoundTest.csv"})
    public void switchingPlusSound(int radioSound, long expected, String switchSound) {

        ServiceRadio service = new ServiceRadio();
        service.setSoundRadio(radioSound);

        service.setSwitchingPlusRadioSound(switchSound);

        long actual = service.getSwitchingPlusRadioSound();

        Assertions.assertEquals(expected, actual);
    }
// Тестирование автоматического уменьшения уровня громкости радио
    @ParameterizedTest
    @CsvFileSource(resources = {"/CurrentMinusSoundTest.csv"})
    public void switchingMinusSound(int radioSound, long expected, String switchSound) {

        ServiceRadio service = new ServiceRadio();
        service.setSoundRadio(radioSound);

        service.setSwitchingMinusRadioSound(switchSound);

        long actual = service.getSwitchingMinusRadioSound();

        Assertions.assertEquals(expected, actual);
    }
}
