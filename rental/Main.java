/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rental;

/**
 *
 * @author dzaka
 */
import java.util.*;

public class Main {
    private List<DVD> koleksiDVD;
    private Scanner scanner;

    public Main() {
        koleksiDVD = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void tambahDVD(DVD dvd) {
        koleksiDVD.add(dvd);
    }

    public void tampilkanDVD() {
        if(koleksiDVD.isEmpty()) {
            System.out.println("Tidak ada DVD dalam koleksi.");
            return;
        }

        List<Film> koleksiFilm = new ArrayList<>();
        List<Musik> koleksiMusik = new ArrayList<>();

        for(DVD dvd : koleksiDVD) {
            if(dvd instanceof Film) {
                koleksiFilm.add((Film) dvd);
            } else if (dvd instanceof Musik) {
                koleksiMusik.add((Musik) dvd);
            }
        }

        System.out.println("Daftar DVD Film:");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-25s | %-25s | %-10s | %-5s | %-25s | %-27s| %n", "Judul", "Publisher", "Kategori", "Stok", "Pemeran", "Sutradara");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        for(Film dvd : koleksiFilm) {
            System.out.printf("| %-25s | %-25s | %-10s | %-5d | %-25s | %-27s| %n", dvd.getJudul(), dvd.getPublisher(), dvd.getKategori(), dvd.getStok(), dvd.getPemeran(), dvd.getSutradara());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Daftar DVD Musik:");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-25s | %-25s | %-10s | %-5s | %-20s | %-20s | %-20s  | %n", "Judul", "Publisher", "Kategori", "Stok", "Penyanyi", "Produser", "Top Hits");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        for(Musik dvd : koleksiMusik) {
            System.out.printf("| %-25s | %-25s | %-10s | %-5d | %-20s | %-20s | %-20s  | %n", dvd.getJudul(), dvd.getPublisher(), dvd.getKategori(), dvd.getStok(), dvd.getPenyanyi(), dvd.getProduser(), dvd.getTopHits());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public void inputDVD() {
        System.out.println("Masukkan jumlah item yang ingin anda masukan : ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Masukkan jenis DVD (F untuk Film, M untuk Musik) : ");
            String jenisDVD = scanner.nextLine();

            System.out.println("Masukkan judul DVD : ");
            String judul = scanner.nextLine();

            System.out.println("Masukkan publisher DVD : ");
            String publisher = scanner.nextLine();

            System.out.println("Opsi Kategori : ");
            if(jenisDVD.equalsIgnoreCase("F")) {
                System.out.println("SU = Semua Umur ; D = Dewasa ;  R = Remaja ; A = Anak-anak");
            } else if (jenisDVD.equalsIgnoreCase("M")) {
                System.out.println("C = Classic ; J = Jazz ; P = Pop ; R = Rock ; O = Other");
            }
            System.out.println("Masukkan kode kategori : ");
            char kategori = scanner.nextLine().charAt(0);

            System.out.println("Masukkan jumlah (angka) stok : ");
            int stok = Integer.parseInt(scanner.nextLine());

            if (jenisDVD.equalsIgnoreCase("F")) {
                System.out.println("Masukkan nama pemeran : ");
                String pemeran = scanner.nextLine();

                System.out.println("Masukkan nama sutradara : ");
                String sutradara = scanner.nextLine();

                tambahDVD(new Film(judul, publisher, kategori, stok, pemeran, sutradara));
            } else if (jenisDVD.equalsIgnoreCase("M")) {
                System.out.println("Masukkan nama penyanyi : ");
                String penyanyi = scanner.nextLine();

                System.out.println("Masukkan nama produser : ");
                String produser = scanner.nextLine();

                System.out.println("Masukkan top hits : ");
                String topHits = scanner.nextLine();
                tambahDVD(new Musik(judul, publisher, kategori, stok, penyanyi, produser, topHits));
            }
        }
    }
    public static void main(String[] args) {
        Main rental = new Main();

        rental.inputDVD();
        rental.tampilkanDVD();
    }
}
