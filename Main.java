import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String args[])
    {
		System.out.print("Введите возводимое в степень: ");
		Scanner scan1 = new Scanner(System.in);
		int number = scan1.nextInt();
        
		System.out.print("Введите степень числа: ");
		Scanner scan2 = new Scanner(System.in);
		int power = scan2.nextInt();

		System.out.println(Math.pow(number, power));
        double result = Math.pow(number, power);
        File file = new File ("output.txt");
        try
        {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println (result);
            printWriter.close();       
        }
        catch (FileNotFoundException ex)  
    {
        System.out.println(result);
    }
    }
}
