import java.util.Scanner;

public class Main {
  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);

    float km, miles;

    System.out.println("Enter distance in kilometer: ");
    km = sc.nextFloat();

    miles = km / 1.6f;
    System.out.println("Distance in miles: " + miles);
  }
}
