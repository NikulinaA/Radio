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
    // Тестирование автоматического переключения радиостанции
    @ParameterizedTest
    @CsvFileSource(resources = {"/CurrentRadioStationTest.csv"})
    public void switchingRadioStation(int radioStation, long expected, String switching) {

        ServiceRadio service = new ServiceRadio();
        service.setCurrentRadioStation(radioStation);

        // Прямое указание станции проходит в тестах при указании "null" на переключение. Пустое поле не сработало(((
        service.setSwitchingRadioStation(switching);

        long actual = service.getSwitchingRadioStation();

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
    @ParameterizedTest
    @CsvFileSource(resources = {"/CurrentSoundTest.csv"})
    public void switchingSound(int radioSound, long expected, String switchSound) {

        ServiceRadio service = new ServiceRadio();
        service.setSoundRadio(radioSound);

        service.setSwitchingRadioSound(switchSound);

        long actual = service.getSwitchingRadioSound();

        Assertions.assertEquals(expected, actual);
    }

}
