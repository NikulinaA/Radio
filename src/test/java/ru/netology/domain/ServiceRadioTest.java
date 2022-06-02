package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ServiceRadioTest {

    //Тестирование ручного переключения радиостанции с установкой количества станций
    @ParameterizedTest
    @CsvFileSource(resources = {"/NoCurrent.csv"})
    public void switchingCountRadioStation(int radioStation,int countRadioStation, int expected) {

        ServiceRadio service = new ServiceRadio(countRadioStation);
        service.setCurrentRadioStation(radioStation);

        long actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    //Тестирование ручного переключения радиостанции
    @ParameterizedTest
    @CsvFileSource(resources = {"/NoCountNoCurrent.csv"})
    public void switchingNoCountRadioStation(int radioStation,int expected) {

        ServiceRadio service = new ServiceRadio();
        service.setCurrentRadioStation(radioStation);

        long actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тестирование автоматического переключения радиостанции кнопкой "Вперед" с установкой количества станций
    @ParameterizedTest
    @CsvFileSource(resources = {"/CurrentNextRadioStationTest.csv"})
    public void switchingNextRadioStationCount(int radioStation, int expected,int countRadioStation) {

        ServiceRadio service = new ServiceRadio(countRadioStation);
        service.setCurrentRadioStation(radioStation);

        service.setSwitchingNextRadioStation();


        long actual = service.getSwitchingNextRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    // Тестирование автоматического переключения радиостанции кнопкой "Вперед"
    @ParameterizedTest
    @CsvFileSource(resources = {"/CurrentNextRadioStationTestNoCount.csv"})
    public void switchingNextRadioStationNoCount(int radioStation, int expected) {

        ServiceRadio service = new ServiceRadio();
        service.setCurrentRadioStation(radioStation);

        service.setSwitchingNextRadioStation();


        long actual = service.getSwitchingNextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тестирование автоматического переключения радиостанции кнопкой "Назад" с установкой количества станций
    @ParameterizedTest
    @CsvFileSource(resources = {"/CurrentPrevRadioStationTest.csv"})
    public void switchingPrevRadioStationCount(int radioStation, int expected,int countRadioStation) {

        ServiceRadio service = new ServiceRadio(countRadioStation);
        service.setCurrentRadioStation(radioStation);
        service.setSwitchingPrevRadioStation();

        long actual = service.getSwitchingPrevRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    // Тестирование автоматического переключения радиостанции кнопкой "Назад"
    @ParameterizedTest
    @CsvFileSource(resources = {"/CurrentPrevRadioStationTestNoCount.csv"})
    public void switchingPrevRadioStationNoCount(int radioStation, int expected) {

        ServiceRadio service = new ServiceRadio();
        service.setCurrentRadioStation(radioStation);
        service.setSwitchingPrevRadioStation();

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
    public void switchingPlusSound(int radioSound, int expected) {

        ServiceRadio service = new ServiceRadio();
        service.setSoundRadio(radioSound);

        service.setSwitchingPlusRadioSound();

        long actual = service.getSwitchingPlusRadioSound();

        Assertions.assertEquals(expected, actual);
    }
// Тестирование автоматического уменьшения уровня громкости радио
    @ParameterizedTest
    @CsvFileSource(resources = {"/CurrentMinusSoundTest.csv"})
    public void switchingMinusSound(int radioSound, int expected) {

        ServiceRadio service = new ServiceRadio();
        service.setSoundRadio(radioSound);

        service.setSwitchingMinusRadioSound();

        long actual = service.getSwitchingMinusRadioSound();

        Assertions.assertEquals(expected, actual);
    }
}
