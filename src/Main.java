import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int math, phy, lit, music, che,avg = 0;
                //literature chemistry
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your grade for calculate average and pass the class");
        System.out.print("Math grade: ");
        math=input.nextInt();

        System.out.print("Physics grade: ");
        phy=input.nextInt();

        System.out.print("Literature grade: ");
        lit=input.nextInt();

        System.out.print("Music grade: ");
        music=input.nextInt();

        System.out.print("Chemistry grade: ");
        che=input.nextInt();

        if((math>=0 && math<=100)&&(phy>=0 &&phy<=100)&&(lit>=0&&lit<=100)&&(music>=0&&music<=100)&&(che>=0&&che<=100))
        {
            avg=(math+phy+lit+music+che)/5;
        }

        if (avg>=55)
        {
            System.out.println("You passed the class with a grade of "+avg);
        }
        else
        {
            System.out.println("You failed. Your average grade: "+avg);
        }

    }
}
