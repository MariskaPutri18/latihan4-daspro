import java.util.Scanner;

public class LuasLingkaran {
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int Pi;
    int r;
    float luas;

    System.out.print("Masukkan jari-jari: ");
    r = input.nextInt();

    luas = 3.14f * r * r;

    System.out.println("luas lingkaran = " + luas + "cm");
    input.close();
    }
}