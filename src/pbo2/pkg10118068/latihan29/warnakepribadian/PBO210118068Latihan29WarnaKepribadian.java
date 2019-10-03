/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan29.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Program menentukan kepribadian seseorang bersarkan warna
 * favorit. Disini kita belajar cara pewarnaan pada java app console
 */
public class PBO210118068Latihan29WarnaKepribadian {
    // ANSI Colors
    public static final String RESET = "\u001B[0m";
    public static final String WHITE = "\u001B[37m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    // ANSI Backgrounds
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_MAGENTA = "\u001B[45m";
    
    public static String nama, warna;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(RED + "YUK "+ GREEN +"CEK "+ YELLOW +"KEPRIBADIANMU "
                + CYAN +"DARI "+ MAGENTA +"WARNA "+ BLUE +"FAVORITMU\n");
        
        System.out.println(BG_RED + WHITE + "\tMERAH\t\t");
        System.out.println(BG_GREEN + "\tHIJAU\t\t");
        System.out.println(BG_YELLOW + "\tKUNING\t\t");
        System.out.println(BG_BLUE + "\tBIRU\t\t");
        System.out.println(BG_MAGENTA + "\tUNGU\t\t");
        
        System.out.print(RESET + "\nPILIH WARNA FAVORITMU : ");
        warna = scanner.next().toUpperCase();
        
        System.out.print("NAMA KAMU : ");
        nama = scanner.next();
        
        System.out.println(RESET + "\n===HASIL TEST KEPRIBADIAN "+nama+"===");
        
        switch(warna) {
            case "MERAH": printHasil(0); break;
            case "HIJAU": printHasil(1); break;
            case "KUNING": printHasil(2); break;
            case "BIRU": printHasil(3); break;
            case "UNGU": printHasil(4); break;
            default: System.out.println("Oops.. Belum teridentifikasi");
        }
    }
    
    /**
     * Menampilkan hasil
     * 
     * @param idx integer
     */
    public static void printHasil(int idx) {
        System.out.println("Warna Favoritmu adalah " 
                + getWarna("color", warna) + warna + RESET);
        System.out.println(data(idx));
    }
    
    /**
     * mengambil warna
     * 
     * @param type
     * @param warna
     * @return 
     */
    public static String getWarna(String type, String warna) {
        String result = "";
        
        switch(warna) {
            case "MERAH": result = type.equals("bg") ? BG_RED : RED; break;
            case "HIJAU": result = type.equals("bg") ? BG_GREEN : GREEN; break;
            case "KUNING": result = type.equals("bg") ? BG_YELLOW : YELLOW; break;
            case "BIRU": result = type.equals("bg") ? BG_BLUE : BLUE; break;
            case "UNGU": result = type.equals("bg") ? BG_MAGENTA : MAGENTA; break;
        }
        
        return result;
    }
    
    /**
     * Data warna kepribadian
     * 
     * @param idx integer
     * @return string
     */
    public static String data(int idx) {
        String[] kepribadian = new String[5];
        
        // merah
        kepribadian[0] = "1. Periang,\n2. Pemberani,\n3. Berani mengambil"
                + " resiko dalam setiap langkah,\n4. Menyukai tantangan,"
                + "\n5. Kurang sabar,\n6. Dapat menahan marah namun jika"
                + " sudah tahap puncak toleransi kemarahannya akan sulit "
                + "dikontrol,\n7. Memiliki energi kehangatan dan cinta.";
        
        // hijau
        kepribadian[1] = "1. Romantis,\n2. Menyukai hal yang berbau alami dan"
                + " keindahan,\n3. Teguh pada prinsip,\n4. Menginginkan"
                + " kesempuranaan,\n5. Mudah cemburu,\n6. Mudah merasa iri,"
                + "\n7. Menjunjung tinggi suatu nilai toleransi"
                + " dan kepercayaan.";
        
        // kuning
        kepribadian[2] = "1. Optimis,\n2. Suka bergaul,\n3. Periang,\n4. Senang"
                + " menolong,\n5. Lincah dan aktif,\n6. Tidak suka meremehkan"
                + " kekurangan orang lain,\n7. Loyal,\n8. Hangat,\n9."
                + " Meskipun karakternya optimis dan idealis, seringkali goyah"
                + " dan tidak stabil,\n10. Cenderung Penakut.";
        
        // biru
        kepribadian[3] = "1. Menyenangkan,\n2. Bijaksana,\n3. Pembawaan diri tenang"
                + " saat menghadapi masalah,\n4. Dinamis,\n5. Senang berbagi,"
                + "\n6. Bersahabat,\n7. Tidak terlalu suka menjadi sorotan"
                + " banyak orang,\n8. Menyembunyikan perasaan karena"
                + " karakternya yang cenderung mencari jalan damai.";
        
        // ungu
        kepribadian[4] = "1. Optimis,\n2. Tidak pernah ragu,\n3. Menurutnya"
                + " pasangan yang ideal adalah yang memiliki mental yang"
                + " kuat,\n4. Memiliki ambisi yang besar,\n5. Memiliki"
                + " empati yang besar,\n6. Memiliki sisi misterius sebab"
                + " seringkali menutupi perasaannya,\n7. Terkadang bersikap"
                + " keras kepala dan angkuh.";
        
        
        return kepribadian[idx];
    }
    
}
