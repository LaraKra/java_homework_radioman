package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @ParameterizedTest
    @CsvSource(value = {"'CurrentStation equal nine', 9, 9",
            "'CurrentStation more than', 10, 0",
            "'CurrentStation between zero and nine', 4, 4",
            "'CurrentStation equal zero', 0, 0",
            "'CurrentStation less than zero', -1, 0"
    })
    void currentRadio(String testName, int setCurrentStation, int expected) {
        Radio rad = new Radio();
        rad.setCurrentStation(setCurrentStation);

        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'CurrentStation equal nine', 9, 0",
            "'CurrentStation between zero and nine', 3, 4",
            "'CurrentStation equal zero', 0, 1"
    })
    void nextRadioStation(String testName, int setCurrentStation, int expected) {
        Radio rad = new Radio();
        rad.setCurrentStation(setCurrentStation);
        rad.nextRadioStation();

        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'CurrentStation equal nine', 9, 8",
            "'CurrentStation between zero and nine', 6, 5",
            "'CurrentStation equal zero', 0, 9"
    })
    void prevRadioStation(String testName, int setCurrentStation, int expected) {
        Radio rad = new Radio();
        rad.setCurrentStation(setCurrentStation);
        rad.prevRadioStation();

        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'CurrentVolume equal ten', 10, 10",
            "'CurrentVolume more than ten', 11, 10",
            "'CurrentVolume between zero and ten', 4, 4",
            "'CurrentVolume equal zero', 0, 0",
            "'CurrentVolume less than zero', -1, 0"
    })
    void radVolume(String testName, int setCurrentVolume, int expected) {
        Radio rad = new Radio();
        rad.setCurrentVolume(setCurrentVolume);

        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}