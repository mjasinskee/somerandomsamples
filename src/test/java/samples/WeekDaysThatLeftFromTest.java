package samples;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.util.List;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.DayOfWeek.THURSDAY;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.DayOfWeek.WEDNESDAY;
import static org.assertj.core.api.Assertions.assertThat;

class WeekDaysThatLeftFromTest {

    @Test
    public void shouldReturnAllWeekDaysThatAreAfterMonday() {
        //given
        WeekDaysThatLeftFrom weekDaysThatLeftFrom = new WeekDaysThatLeftFrom();

        //when
        List<DayOfWeek> daysThatLeftAfter = weekDaysThatLeftFrom.daysAfter(MONDAY);

        //then
        assertThat(daysThatLeftAfter).containsExactly(TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY);
    }

    @Test
    public void shouldReturnAllWeekDaysThatAreAfterSaturday() {
        //given
        WeekDaysThatLeftFrom weekDaysThatLeftFrom = new WeekDaysThatLeftFrom();

        //when
        List<DayOfWeek> daysThatLeftAfter = weekDaysThatLeftFrom.daysAfter(SATURDAY);

        //then
        assertThat(daysThatLeftAfter).containsExactly(SUNDAY);
    }

    @Test
    public void shouldReturnEmptyListWhenAskedAboutDaysAfterSunday() {
        //given
        WeekDaysThatLeftFrom weekDaysThatLeftFrom = new WeekDaysThatLeftFrom();

        //when
        List<DayOfWeek> daysThatLeftAfter = weekDaysThatLeftFrom.daysAfter(SUNDAY);

        //then
        assertThat(daysThatLeftAfter).isEmpty();
    }
}
