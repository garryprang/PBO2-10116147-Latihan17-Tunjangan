/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10116147.latihan17.tunjangan;

import java.util.Scanner;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menghitung tunjangan.
 */

public class PBO210116147Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String status;
        double gajipokok;
        double tunjangan;
        double totalgaji;
        String status1 = "Menikah";
        String status2 = "Belum";
        
        
        System.out.println("========== PROGRAM TUNJANGAN ==========");
        System.out.print("Berapa gaji pokok anda perbulan?\t: Rp");
        Scanner scanner = new Scanner (System.in);
        gajipokok = scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        Scanner scanner2 = new Scanner (System.in);
        status = scanner2.nextLine();
        
        System.out.println();
        
        System.out.println("========== HASIL PERHITUNGAN ==========");
        if (status.equals(status1)) {
            tunjangan = gajipokok * 0.35;
        }
            else {
            tunjangan = 0;
        }
        totalgaji = gajipokok + tunjangan;
        System.out.println("Gaji pokok   \t: Rp" + gajipokok);
        System.out.println("Tunjangan    \t: Rp" + tunjangan);
        System.out.println("Total gaji   \t: Rp" + totalgaji);
        System.out.println("");
        System.out.println("Developed by Garry Prang");
    }
    
}