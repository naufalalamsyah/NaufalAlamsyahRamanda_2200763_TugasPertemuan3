/* @author Naufal Alamsyah R
 */
package gacoan;
import java.util.Scanner;

public class Gacoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang Anda: ");
        int uang = scanner.nextInt(); // Mengambil input jumlah uang dari pengguna

        System.out.print("Apakah pasangan Anda sedang tidak ada kelas kuliah? (true/false): ");
        boolean tidakAdaKelasKuliah = scanner.nextBoolean(); // Mengambil input kondisi pasangan

        // Evaluasi kondisi untuk membeli migacoan
        if (uang > 10000 && tidakAdaKelasKuliah) {
            System.out.println("Anda bisa membeli mie gacoan dengan pasangan Anda!");
        } else {
            System.out.println("Maaf, Anda tidak bisa membeli mie gacoan saat ini.");
        }
        
        scanner.close(); // Menutup scanner untuk mencegah memory leak
    }
}