 import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== CREATE CHARACTER GAME ANDA =====");

        System.out.print("Masukan Nama Character Anda : ");
        String nama = input.nextLine();

        System.out.println("\nPilih JOB Character ANDA:");
        System.out.println("1. KNIGHT");
        System.out.println("2. ARCHER");
        System.out.println("3. WIZARD");

        System.out.print("PILIH JOB [1/2/3] :");
        int pilih = input.nextInt();

        Job job = null;

        
        if (pilih == 1) {
            job = new Knight();
        } else if (pilih == 2) {
            job = new Archer();
        } else if (pilih == 3) {
            job = new Wizard();
        } else {
            System.out.println("Salah pilih!");
            return;
        }

        Character hero = new Character(nama, job);
        hero.tampilStatus();
    }
}