package samples;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.DayOfWeek.THURSDAY;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.DayOfWeek.WEDNESDAY;

class WeekDaysThatLeftFrom {

    private static LinkedList<DayOfWeek> daysInWeek = new LinkedList<>(Arrays.asList(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY));

    List<DayOfWeek> daysAfter(DayOfWeek dayOfWeek) {
        return daysInWeek.subList(indexOfNextDayAfter(dayOfWeek), daysInWeek.size());
    }

    private int indexOfNextDayAfter(DayOfWeek dayOfWeek) {
        return daysInWeek.indexOf(dayOfWeek) + 1;
    }
}
