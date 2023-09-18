import java.util.Scanner;

public class KelSegitigaSamaSisi{
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int sisi;
    float keliling;

    System.out.print("Masukkan sisi: ");
    sisi = input.nextInt();

    keliling = 3*sisi;

    System.out.println("keliling segitiga siku siku = " + keliling + "cm");
    input.close();
    }
}