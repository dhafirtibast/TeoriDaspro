package Pertemuan_6;
import java.util.Scanner;
public class akses_parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bawa_kartu, registrasi_online;

        System.out.print("Apakah anda membawa kartu? (y/n) : ");
        char jawaban_kartu = sc.next().toLowerCase().charAt(0);
        bawa_kartu = (jawaban_kartu == 'y');

        System.out.print("Apakah anda sudah registrasi online? (y/n) : ");
        char jawaban_regis = sc.next().toLowerCase().charAt(0);
        registrasi_online = (jawaban_regis == 'y');

        if (bawa_kartu || registrasi_online) {
            System.out.println("Anda boleh masuk.");
        }else {
            System.out.println("Akses tidak diberikan.");
        }

    }
    
}