import jdk.jshell.execution.Util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        String str= sc.next(); //reads string.
        //String str2= sc.next(); //reads string.
        LocalDateTime time1 = LocalDateTime.parse(str);
        time1.plus(11, ChronoUnit.HOURS);
        //LocalTime time2 = LocalTime.parse(str2);

        System.out.println(time1.plus(11, ChronoUnit.HOURS).toLocalDate());

    }
}
