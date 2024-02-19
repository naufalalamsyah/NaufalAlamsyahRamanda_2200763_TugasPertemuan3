/* @author Naufal Alamsyah R
 */
package bilanganbulatnegatif;
import java.util.Scanner;
public class Bilanganbulatnegatif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tiga bilangan bulat negatif:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Penjumlahan
        int sum = num1 + num2 + num3;
        System.out.println("Hasil penjumlahan: " + sum);

        // Pengurangan
        int difference = num1 - num2 - num3;
        System.out.println("Hasil pengurangan: " + difference);

        // Perkalian
        int product = num1 * num2 * num3;
        System.out.println("Hasil perkalian: " + product);

        // Pembagian
        // Pastikan pembagi tidak nol untuk menghindari exception
        if (num2 != 0 && num3 != 0) {
            double division = (double) num1 / num2 / num3;
            System.out.println("Hasil pembagian: " + division);
        } else {
            System.out.println("Pembagian tidak dapat dilakukan karena salah satu bilangan adalah nol.");
        }

        scanner.close();
    }
}