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
}