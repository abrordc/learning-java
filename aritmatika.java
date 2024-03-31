import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        double tambah = a + b;
        double kurang = a - b;
        double kali = a * b;
        double bagi = a / b;
        System.out.println("Hasil penjumlahan: " + tambah);
        System.out.println("Hasil pengurangan: " + kurang);
        System.out.println("Hasil perkalian: " + kali);
        System.out.println("Hasil pembagian: " + bagi);

        input.close();
    }
}
