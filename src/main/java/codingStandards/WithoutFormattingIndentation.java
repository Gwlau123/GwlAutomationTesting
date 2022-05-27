package codingStandards;

import java.util.Scanner;

/**
 * Example of code without proper indentation & formatting
 * */
public class WithoutFormattingIndentation {

public void calcBonus() {
double percent = 0.5;double bonus = 5000;
System.out.println("Please enter no of years");
int year = new Scanner(System.in).nextInt();
System.out.println("Please enter salary");
int salary = new Scanner(System.in).nextInt();
double a = percent * salary;
if (year > 5) {a = a + bonus;}
System.out.println("Net bonus amount" + a);
}

public static void main(String[] args) {
WithoutFormattingIndentation id= new WithoutFormattingIndentation();
id.calcBonus();
}
}