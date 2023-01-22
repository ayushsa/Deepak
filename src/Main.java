import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.print("Hello world!");
//        System.out.println("Maa");
//
//        int x = 30;
//        int y = 20;
//        int z = x+y;
//
//        System.out.println(x+y);
//        System.out.println(y-z);
//        try {
//            System.out.println(x/0);
//        } catch (Exception e) {
//            System.out.println("error");
//        }
//
//        System.out.println(y/z);
//        System.out.println(x*z);
//        System.out.println(z/y);
//
//        printTable();
        prime();
    }


    public static void printTable()
    {
        for (int i = 1; i <= 10 ; i++)
        {
            System.out.println(" TABLE: 2 *" + i + " = " + 2*i);
        }

        int eng_marks = 82;
        int physics = 94;

        int marks = 80;

        if (eng_marks >= 90 || physics >= 90)
        {
            System.out.println("Bike Milege");
        }
        else
        {
            System.out.println("Padai Karo");
        }


    }

    public static void prime()
    {
        int num, i, count=0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = s.nextInt();

        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }

        if(count==0)
            System.out.println("It is a Prime Number.");
        else
            System.out.println("It is not a Prime Number.");
    }

}