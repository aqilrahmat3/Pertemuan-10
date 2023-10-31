import java.util.Scanner;

public class BioskopWithScanner05 {

    public  static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int baris, kolom;
       String nama, next;
       String [][] penonton = new String [4][2];

       while (true) {
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Baris: ");
        baris = sc.nextInt();
        System.out.print("Masukkan Kolom: ");
        kolom = sc.nextInt();
        sc.nextLine();

        penonton[baris-1][kolom-1] = nama;

        System.out.print("Input Penonton lainnya? (y/n): ");
        next = sc.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;
        }
       }
    }

}