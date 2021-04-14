//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его
// отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
// полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и
// секунд.

package com.epam.test6;

import java.time.*;

public class Time {

    private int hour, minutes, seconds;

    public Time() {

        this (LocalDateTime.now ().getHour (), LocalDateTime.now ().getMinute (), LocalDateTime.now ().getSecond ());
    }

    public String toStringHour() {

        if (hour < 10) {
            return "0" + hour + ":";
        } else {
            return "" + hour + ":";
        }
    }

    public String toStringMinutes() {

        if (minutes < 10) {
            return "0" + minutes + ":";
        } else {
            return "" + minutes + ":";
        }
    }

    public String toStringSeconds() {

        if (seconds < 10) {
            return "0" + seconds;
        } else {
            return "" + seconds;
        }
    }

    public Time(int hour, int minutes, int seconds) {

        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;

        if (this.hour > 23) {
            this.hour = 0;
        }

        if (this.minutes > 60) {
            this.minutes = 0;
        }

        if (this.seconds > 60) {
            this.seconds = 0;
        }
    }
}
