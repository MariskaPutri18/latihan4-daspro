import java.util.Scanner;

public class LuasSegitigaSamaSisi{
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    double sisi;
    double luas;

    System.out.print("Masukkan sisi: ");
    sisi = input.nextDouble();

    luas = (sisi * sisi * Math.sqrt(3)) / 4.0;

    System.out.println("luas segitiga sama sisi = " + luas + "cm^2");
    input.close();
    }
}