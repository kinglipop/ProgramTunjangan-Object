/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.laithan35.programtunjangan;
import java.util.*;
/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi tentang program tunjangan
 */
public class PBO11K10118904Laithan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                double gaji;
        String status;
        Scanner input = new Scanner(System.in);
        Tunjangan t = new Tunjangan();
        System.out.println("======= Program tunjangan ======");
        System.out.print("Berapa gaji pokok anda perbulan   : Rp. ");
        gaji = input.nextDouble();
        System.out.print("Status anda? (Menikah/Belum)      : " );
        status = input.next();
        t.pengecekanKaryawan(status, gaji);
    }
    
}
