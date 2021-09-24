// You can experiment here, it won’t be checked

import java.time.LocalDate;
import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    // put your code here

    Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
    String str= sc.nextLine(); //reads string.

    LocalDate date1 = LocalDate.parse(str);
    System.out.println(date1.plusDays(15));

  }
}
