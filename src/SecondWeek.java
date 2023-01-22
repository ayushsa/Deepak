import java.util.ArrayList;
import java.util.Scanner;

public class SecondWeek
{
    public static void main(String[] args)
    {
        System.out.println("Maa");
        WAPToPrintPrimeTillNumber();
    }

    public static void WAPToPrintPrimeTillNumber()
    {
        int num, i, count=0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = s.nextInt();

        int temp [] = new int[num];

        for (i = 2; i <= num; i++)
        {
            if(num % i == 0)
            {
                temp[i] = i;
            }
        }

        System.out.println("PRIME NUMBER from 2 to " + num + "are" + temp.toString());
    }
}
