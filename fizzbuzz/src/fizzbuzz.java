import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        int i=0;
        for (i= 1; i<= 15; i++)
        if(i % 3 == 0 && i % 5 == 0)
        {
            System.out.println("fizz,buzz");
        }
        else if (i % 3 == 0)
        {
            System.out.println("fizz");
        }
        else if (i%5==0)
        {
            System.out.println("buzz");
        }
        else
        {
            System.out.println(i);
        }

    }
    }
