package dateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        /*
        * Date and Time in Java
        * The java.time package contains Java 8 Date and Time classes.
        * This package is used to work with date and time.
        * The java.time package contains many classes.
        * The important classes are:
        * - LocalDate.now() - gets the current date in local time zone (YYYY-MM-DD)
        * - // .parse('YYYY-MM-DD') - parses a string to LocalDate
        * - LocalTime.now() - gets the current time in local time zone (HH-MM-SS-NNNNNNNNN)
        * - // .parse('HH-MM-SS-NNNNNNNNN') - parses a string to LocalTime
        * - LocalDateTime.now() - gets the current date and time in local time zone (YYYY-MM-DDTHH-MM-SS-NNNNNNNNN)
        * - // .parse('YYYY-MM-DDTHH-MM-SS-NNNNNNNNN') - parses a string to LocalDateTime
        * - Instant.now() - gets the current date and time in UTC time zone (YYYY-MM-DDTHH-MM-SS-NNNNNNNNN)
        * - // .parse('YYYY-MM-DDTHH-MM-SS-NNNNNNNNN') - parses a string to Instant
        *
        * - // .of() - creates a date or time object with the specified values
        * - LocalDate.of(2018, 7, 5) - creates a LocalDate object with the specified values 2018-07-05 (YYYY-MM-DD)
        *
        * DateTimeFormatter is used to parse and format dates in Java.
        * Usage:
        * - DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        * // /\ ofPattern() is used to format the date to the pattern specified
        * // /\ Docs: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        * - LocalDateTime dateTime = LocalDateTime.parse("2018-07-05 12:35:00", formatter);
        * // /\ This is the date to parse
        * - String formattedDateTime = dateTime.format(formatter);
        * // /\ This is the date formatted
        * */

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Brazilian date format
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // Brazilian date and time format

        LocalDate date = LocalDate.now(); // gets the current date in local time zone (YYYY-MM-DD)
        System.out.println("date " + date.format(formatter1)); // formats the date to the pattern specified
        LocalDate formattedDate = LocalDate.parse("22/05/2023", formatter1);
        // /\ parses a string to LocalDate based on the pattern specified
        System.out.println("formattedDate: " + formattedDate);

        LocalDateTime dateTime = LocalDateTime.now(); // gets the current date and time in local time zone (YYYY-MM-DDTHH-MM-SS-NNNNNNNNN)
        System.out.println("dateTime: " + dateTime.format(formatter2)); // formats the date and time to the pattern specified
        LocalDateTime formattedDateTime = LocalDateTime.parse("22-05-2023 20:28:00", formatter2);
        // /\ parses a string to LocalDateTime based on the pattern specified
        System.out.println("formattedDateTime: " + formattedDateTime);

        LocalDate ofDate = LocalDate.of(2016, 7, 2); // creates a LocalDate object with the specified values 2018-07-05 (YYYY-MM-DD)
        System.out.println("ofDate: " + ofDate.format(formatter1)); // formats the date to the pattern specified

        // Convert a local timezone date to UTC
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);
        /*for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(availableZoneId); // prints all available timezones
        }*/
        ZoneId portugalZoneId = ZoneId.of("Europe/Lisbon");
        System.out.println("portugalZoneId: " + portugalZoneId);

        // Convert a local timezone date to UTC
        LocalDateTime localDateTimeInPortugal = LocalDateTime.now(portugalZoneId);
        System.out.println("localDateTimeInPortugal: " + localDateTimeInPortugal);

        /*
        * .getYear() - gets the year
        * .getMonth() - gets the month
        * .getDayOfMonth() - gets the day of month
        * .getDayOfWeek() - gets the day of week
        * .getDayOfYear() - gets the day of year
        * .getHour() - gets the hour
        * .getMinute() - gets the minute
        * .getSecond() - gets the second
        * .getNano() - gets the nano
        * */

        LocalDateTime localDateTimeG = LocalDateTime.now();
        System.out.println("localDate.getYear(): " + localDateTimeG.getYear());
        System.out.println("localDate.getMonth(): " + localDateTimeG.getMonth());
        // /\ - to get int value use .getMonthValue()
        System.out.println("localDate.getMonthValue: " + localDateTimeG.getMonthValue());
        System.out.println("localDate.getDayOfMonth(): " + localDateTimeG.getDayOfMonth());
        System.out.println("localDate.getDayOfWeek(): " + localDateTimeG.getDayOfWeek());
        System.out.println("localDate.getDayOfYear(): " + localDateTimeG.getDayOfYear());
        System.out.println("localDate.getHour(): " + localDateTimeG.getHour());
        System.out.println("localDate.getMinute(): " + localDateTimeG.getMinute());
        System.out.println("localDate.getSecond(): " + localDateTimeG.getSecond());
        System.out.println("localDate.getNano(): " + localDateTimeG.getNano());


        // Date operations
        /*
        * .plusYears() - adds years
        * .minusYears() - subtracts years
        * .plusMonths() - adds months
        * .minusMonths() - subtracts months
        * .plusDays() - adds days
        * .minusDays() - subtracts days
        * .plusHours() - adds hours
        * .minusHours() - subtracts hours
        * .plusMinutes() - adds minutes
        * .minusMinutes() - subtracts minutes
        * .plusSeconds() - adds seconds
        * .minusSeconds() - subtracts seconds
        * .plusNanos() - adds nanos
        * .minusNanos() - subtracts nanos
        * */

        LocalDateTime localDateTimeH = LocalDateTime.now();
        System.out.println("localDateTimeH: " + localDateTimeH);
        System.out.println("localDateTimeH.plusYears(1): " + localDateTimeH.plusYears(1));
        System.out.println("localDateTimeH.minusYears(1): " + localDateTimeH.minusYears(1));
        System.out.println("localDateTimeH.plusMonths(1): " + localDateTimeH.plusMonths(1));
        System.out.println("localDateTimeH.minusMonths(1): " + localDateTimeH.minusMonths(1));
        System.out.println("localDateTimeH.plusDays(1): " + localDateTimeH.plusDays(1));
        System.out.println("localDateTimeH.minusDays(1): " + localDateTimeH.minusDays(1));
        System.out.println("localDateTimeH.plusHours(1): " + localDateTimeH.plusHours(1));
        System.out.println("localDateTimeH.minusHours(1): " + localDateTimeH.minusHours(1));
        System.out.println("localDateTimeH.plusMinutes(1): " + localDateTimeH.plusMinutes(1));
        System.out.println("localDateTimeH.minusMinutes(1): " + localDateTimeH.minusMinutes(1));
        System.out.println("localDateTimeH.plusSeconds(1): " + localDateTimeH.plusSeconds(1));
        System.out.println("localDateTimeH.minusSeconds(1): " + localDateTimeH.minusSeconds(1));
        System.out.println("localDateTimeH.plusNanos(1): " + localDateTimeH.plusNanos(1));
        System.out.println("localDateTimeH.minusNanos(1): " + localDateTimeH.minusNanos(1));

        /*
        * Duration
        *
        * .between() - gets the duration between two dates
        * .ofDays() - creates a duration of days
        * .ofHours() - creates a duration of hours
        * .ofMinutes() - creates a duration of minutes
        * .ofSeconds() - creates a duration of seconds
        * .ofMillis() - creates a duration of millis
        * .ofNanos() - creates a duration of nanos
        * */

        LocalDateTime localDateTimeI = LocalDateTime.now();
        LocalDateTime localDateTimeJ = LocalDateTime.now().plusDays(1);
        Duration duration = Duration.between(localDateTimeI, localDateTimeJ);
        System.out.println("duration: " + duration);
        System.out.println("duration.toDays(): " + duration.toDays());
        System.out.println("duration.toHours(): " + duration.toHours());
        System.out.println("duration.toMinutes(): " + duration.toMinutes());
        System.out.println("duration.toMillis(): " + duration.toMillis());
        System.out.println("duration.toNanos(): " + duration.toNanos());

        // Note: Duration can only be used with LocalTime and LocalDateTime objects
        // We can convert a foreign time to a local time and then use Duration
        LocalDateTime localDateTimeK = LocalDateTime.now();
        Instant instant = Instant.now();
        // Duration duration1 = Duration.between(localDateTimeK, instant); // throws an exception
        // One way to convert is to use the ZoneId
        Duration duration1 = Duration.between(localDateTimeK, instant.atZone(ZoneId.systemDefault()).toLocalDateTime());
        System.out.println("duration1: " + duration1);
    }
}
