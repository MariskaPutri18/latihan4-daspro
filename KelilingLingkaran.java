import java.util.Scanner;

public class KelilingLingkaran {
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int Pi;
    int r;
    float keliling;

    System.out.print("Masukkan jari-jari: ");
    r = input.nextInt();

    keliling = 2 * 3.14f * r;

    System.out.println("keliling lingkaran = " + keliling + "cm");
    input.close();
    }
}