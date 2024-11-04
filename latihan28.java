package pertemuan5;
import java.util.Scanner;

public class latihan28 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat: ");
        String kalimatAwal = scanner.nextLine();

        System.out.print("Ganti Kata: ");
        String kataAsli = scanner.nextLine();

        System.out.print("Menjadi Kata: ");
        String kataBaru = scanner.nextLine();

        String kalimatBaru = kalimatAwal.replaceAll(kataAsli, kataBaru);

        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal: " + kalimatAwal);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }
}

