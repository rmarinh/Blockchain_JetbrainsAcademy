import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        String str= sc.next(); //reads string.

        LocalDate date1 = LocalDate.parse(str);
        int year = date1.getDayOfYear();
        int month = date1.getDayOfMonth();
        System.out.println(year + " " + month);
    }
}