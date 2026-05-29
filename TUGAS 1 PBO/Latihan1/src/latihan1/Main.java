/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;
import java.util.Scanner;
/**
 *
 * @author INDRA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


// CLASS INDUK
class Member {
    String id;
    String nama;
    String alamat;
    String email;

    public Member(String id, String nama, String alamat, String email) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
    }
}

// CLASS DOSEN
class Dosen extends Member {
    public Dosen(String nidn, String nama, String alamat, String email) {
        super(nidn, nama, alamat, email);
    }
}

// CLASS KARYAWAN
class Karyawan extends Member {
    String divisi;

    public Karyawan(String nip, String nama, String alamat, String email, String divisi) {
        super(nip, nama, alamat, email);
        this.divisi = divisi;
    }
}

// CLASS MAHASISWA
class Mahasiswa extends Member {
    String prodi;

    public Mahasiswa(String nim, String nama, String alamat, String email, String prodi) {
        super(nim, nama, alamat, email);
        this.prodi = prodi;
    }
}

// CLASS UTAMA
public class Tugas5 {
    static Scanner input = new Scanner(System.in);

    // METHOD OBJECT DOSEN
    static void tampilDosen(Dosen dsn) {
        System.out.println("\n----------------------------------------");
        System.out.println(dsn.nama + " telah terdaftar sebagai Dosen");
        System.out.println("Passwordnya adalah : " + dsn.id);
        System.out.println("Email telah terkirim ke alamat : " + dsn.email);
        System.out.println("----------------------------------------");
    }

    // METHOD OBJECT KARYAWAN
    static void tampilKaryawan(Karyawan kry) {
        System.out.println("\n----------------------------------------");
        System.out.println(kry.nama + " telah terdaftar sebagai Karyawan");
        System.out.println("Passwordnya adalah : " + kry.id);
        System.out.println("Email telah terkirim ke alamat : " + kry.email);
        System.out.println("----------------------------------------");
    }

    // METHOD OBJECT MAHASISWA
    static void tampilMahasiswa(Mahasiswa mhs) {
        System.out.println("\n----------------------------------------");
        System.out.println(mhs.nama + " telah terdaftar sebagai Mahasiswa");
        System.out.println("Passwordnya adalah : " + mhs.id);
        System.out.println("Email telah terkirim ke alamat : " + mhs.email);
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {

        int pilih;

        do {
            System.out.println("\n==============================");
            System.out.println("   FORM TAMBAH DATA ANGGOTA");
            System.out.println("==============================");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tambah Data Karyawan");
            System.out.println("3. Tambah Data Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:
                    System.out.println("\nForm Tambah Data Dosen");

                    System.out.print("NIDN           : ");
                    String nidn = input.nextLine();

                    System.out.print("Nama Lengkap   : ");
                    String namaDosen = input.nextLine();

                    System.out.print("Alamat         : ");
                    String alamatDosen = input.nextLine();

                    System.out.print("Email          : ");
                    String emailDosen = input.nextLine();

                    Dosen dsn = new Dosen(nidn, namaDosen, alamatDosen, emailDosen);

                    tampilDosen(dsn);
                    break;

                case 2:
                    System.out.println("\nForm Tambah Data Karyawan");

                    System.out.print("NIP            : ");
                    String nip = input.nextLine();

                    System.out.print("Nama Lengkap   : ");
                    String namaKaryawan = input.nextLine();

                    System.out.print("Alamat         : ");
                    String alamatKaryawan = input.nextLine();

                    System.out.print("Email          : ");
                    String emailKaryawan = input.nextLine();

                    System.out.print("Divisi         : ");
                    String divisi = input.nextLine();

                    Karyawan kry = new Karyawan(
                            nip,
                            namaKaryawan,
                            alamatKaryawan,
                            emailKaryawan,
                            divisi
                    );

                    tampilKaryawan(kry);
                    break;

                case 3:
                    System.out.println("\nForm Tambah Data Mahasiswa");

                    System.out.print("NIM            : ");
                    String nim = input.nextLine();

                    System.out.print("Nama Lengkap   : ");
                    String namaMahasiswa = input.nextLine();

                    System.out.print("Alamat         : ");
                    String alamatMahasiswa = input.nextLine();

                    System.out.print("Email          : ");
                    String emailMahasiswa = input.nextLine();

                    System.out.print("Prodi          : ");
                    String prodi = input.nextLine();

                    Mahasiswa mhs = new Mahasiswa(
                            nim,
                            namaMahasiswa,
                            alamatMahasiswa,
                            emailMahasiswa,
                            prodi
                    );

                    tampilMahasiswa(mhs);
                    break;

                case 0:
                    System.out.println("\nProgram selesai...");
                    break;

                default:
                    System.out.println("\nMenu tidak tersedia!");
            }

        } while (pilih != 0);
    }
}
    
}
