/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author INDRA
 */
public class Main {

    private final static int SEPARATE_LINES = 40;

    static {
        menu("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean looping = true;

        Nasabah nasabah = new Nasabah("Indra Maulana", "10125288", "Kabupaten Tasikmalaya");
        Tabungan tabungan = new Tabungan();

        do {
            System.out.print("Pilih Menu : ");
            String input = scanner.next().trim();

            switch (input) {
                case "1":
                    dataTabungan(nasabah, tabungan);
                    break;
                case "2":
                    pengisianTabungan(scanner, tabungan);
                    break;
                case "3":
                    penarikanTabungan(scanner, tabungan);
                    break;
                default:
            }

            looping = (input.equals("4"));
        } while (!looping);

        scanner.close();
    }

    private static void dataTabungan(Nasabah nasabah, Tabungan tabungan) {
        System.out.println(upperCase("data tabungan bank maju mundur"));
        lines();
        System.out.println("");
        System.out.println("Nama Nasabah    : " + nasabah.getNamaNasabah());
        System.out.println("No Rekening     : " + nasabah.getNoRekening());
        System.out.println("Alamat          : " + nasabah.getAlamat());
        System.out.println("Saldo Rekening  : " + tabungan.getSaldo());
        System.out.println("");
    }

    private static void pengisianTabungan(Scanner scanner, Tabungan tabungan) {
        System.out.println(upperCase("menu pengisian tabungan"));
        lines();
        System.out.println("");
        System.out.println("Masukan Jumlah Nominal Uang yang Akan di transfer");

        int nominal = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Jumlah Nominal  = ");

            if (scanner.hasNextInt()) {
                nominal = scanner.nextInt();
                scanner.nextLine();

                valid = true;
            } else {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
            }
        }

        tabungan.setSaldo(tabungan.getSaldo() + nominal);

        clear("Pengisian berhasil!");
    }

    private static void penarikanTabungan(Scanner scanner, Tabungan tabungan) {
        System.out.println(upperCase("menu pengisian tabungan"));
        lines();
        System.out.println("");
        System.out.println("Masukan Jumlah Nominal Uang yang Akan di Tarik");

        int nominal = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Jumlah Nominal  = ");

            if (scanner.hasNextInt()) {
                nominal = scanner.nextInt();
                scanner.nextLine();

                valid = true;
            } else {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
            }

        }

        if (nominal < tabungan.getSaldo()) {
            tabungan.setSaldo(tabungan.getSaldo() - nominal);
            clear("Penarikan berhasil!");
        } else {
            clear("Penarikan gagal!");
        }
    }

    private static String upperCase(String text) {
        return text.toUpperCase();
    }

    private static void lines() {
        for (int i = 0; i <= SEPARATE_LINES; i++) {
            System.out.print("=");
        }
    }

    private static void clear(String message) {
        for (int i = 0; i <= SEPARATE_LINES; i++) {
            System.out.println("");
        }
        menu(message);
    }

    private static void menu(String message) {
        System.out.println(message);
        System.out.println("");
        System.out.println("Aplikasi ATM Bank Maju Mundur");
        lines();
        System.out.println("");
        System.out.println("1) Lihat Data Tabungan");
        System.out.println("2) Pengisian Saldo Tabungan");
        System.out.println("3) Penarikan Saldo Tabungan");
        System.out.println("4) Keluar Aplikasi");
        System.out.println("");
    }
}
