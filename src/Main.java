import com.sun.org.apache.xml.internal.serialize.EncodingInfo;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("1. Show number of days in a month.");
            System.out.println("2. Solve quadratic equation.");
            System.out.println("3. Zeller Algorithm");
            System.out.println("4. Check sub string");
            System.out.println("5. Calculate a simple operator");
            System.out.println("6. quit");
            Scanner sc0 = new Scanner(System.in);
            switch (choice = sc0.nextInt()){
                case 1:
                    System.out.println("Input a year: ");
                    Scanner sc = new Scanner(System.in);
                    int year = sc.nextInt();
                    System.out.println("Input a month: ");
                    Scanner sc2 = new Scanner(System.in);
                    int month = sc2.nextInt();
                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                        System.out.println("This month has 31 days");

                    } else {
                        if (month == 4 || month == 6 || month == 9 || month == 11) {
                            System.out.println("This month has 30 days");
                        } else {
                            if (month == 2) {
                                if (year % 4 == 0) {
                                    System.out.println("This month has 29 days");
                                } else {
                                    System.out.println("This month has 28 days");
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Input 3 coefficients: ");
                    System.out.print("a: ");
                    Scanner sc3 = new Scanner(System.in);
                    float a = sc3.nextFloat();
                    System.out.print("b: ");
                    Scanner sc4 = new Scanner(System.in);
                    float b = sc4.nextFloat();
                    System.out.print("c: ");
                    Scanner sc5 = new Scanner(System.in);
                    float c = sc5.nextFloat();
                    if( a == 0 ){
                        System.out.println("x = " + b/c);
                    } else {
                        float dental = b*b - 4*a*c;
                        if( dental < 0){
                            System.out.println("this equation has no root");
                        } else if ( dental == 0){
                            System.out.println("This equation has one root x = " + (-b/(2*a)));
                        } else if (dental > 0) {
                            System.out.println(" This equation has two roots x1 = " + ((-b + Math.sqrt(dental))/(2*a) ) + " and x2 = " + (-b - Math.sqrt(dental))/(2*a) );
                        }
                    }
                    break;
                case 3:
                    //int h,q, m, j, k;

                    int h;
                    System.out.println("Enter the day in month: ");
                    Scanner sc7 = new Scanner(System.in);
                    int q = sc7.nextInt();
                    System.out.println("Enter the month: ");
                    System.out.println("(q means the month in year that has value from 3 to 14 that q start from March and January and February mean 13 and 14)");
                    Scanner sc8 = new Scanner(System.in);
                    int m = sc8.nextInt();
                    System.out.println("Enter the century: ");
                    System.out.println("(The century is calculated as this year per 100)");
                    Scanner sc9 = new Scanner(System.in);
                    int j = sc9.nextInt();
                    System.out.println("Enter the numerical order of the year in this century: ");
                    System.out.println("(This order is calculated as this year mod 100)");
                    Scanner sc10 = new Scanner(System.in);
                    int k = sc10.nextInt();
                    h = (q + (26*(m+1))/10 + k + (k/4) + (j/4) + (5*j))% 7;
                    System.out.println("The day of this week is: " + h);
                    System.out.println("(h means the day in week that has value from 0 to 6 equivalent to Sat, Sun, Mon, Tue, Wed, Thu, Fri)");
                    break;
                case 4:
                    Scanner sc11 = new Scanner(System.in);
                    System.out.print("Enter a sentence:\t");
                    String str1 = sc11.nextLine();
                    Scanner sc12 = new Scanner(System.in);
                    System.out.print("Enter a sentence:\t");
                    String str2 = sc12.nextLine();



            }

        }while(choice != 6);
    }
}
