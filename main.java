// coded by https://github.com/Gebsoo-Dev
// You can't type numbers like 1.5 but 1,5 is good

import java.util.Scanner;

public class main {
    public static void main(String [] args) {
        Scanner scanner1= new Scanner(System.in);
        System.out.println("OPTIONS: \n 1. Sec to min \n 2. Sec to hour \n 3. Min to sec \n 4. Min to hours \n 5. Hours to sec \n 6. Hours to min");
        int answer1 = scanner1.nextInt();
        if (answer1 == 1) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Type sec amount: ");
            float answer2 = scanner2.nextFloat();
            System.out.println(answer2 /60);
        } else if (answer1 ==2) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Type sec amount: ");
            float answer3 = scanner3.nextFloat();
            System.out.println(answer3 / 3600);
        } else if (answer1 == 3) {
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Type min amount: ");
            float answer4 = scanner4.nextFloat();
            System.out.println(answer4 * 60);
        } else if (answer1 == 4) {
            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Type min amount");
            float answer5 = scanner5.nextFloat();
            System.out.println(answer5 / 60);
        } else if (answer1 == 5) {
            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Type hours amount");
            float answer6 = scanner5.nextFloat();
            System.out.println(answer6 * 3600);
        } else if (answer1 == 6) {
            Scanner scanner6 = new Scanner(System.in);
            System.out.println("Type hours amount");
            float answer7 = scanner6.nextFloat();
            System.out.println(answer7 * 60);
        }
    }
}