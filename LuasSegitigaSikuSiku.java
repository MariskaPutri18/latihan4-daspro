import java.util.Scanner;

public class LuasSegitigaSikuSiku {
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int alas;
    int tinggi;
    float luas;

    System.out.print("Masukkan alas: ");
    alas = input.nextInt();

    System.out.print("Masukkan tinggi: ");
    tinggi = input.nextInt();

    luas = 0.5f * alas * tinggi;

    System.out.println("luas segitiga siku siku = " + luas + "cm");
    input.close();
    }
}