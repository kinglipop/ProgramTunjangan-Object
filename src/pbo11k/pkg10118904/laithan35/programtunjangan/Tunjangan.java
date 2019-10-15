/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.laithan35.programtunjangan;

/**
 *
 * @author Firman Alfinas
 */
public class Tunjangan {
    private double gajiPokok;
    private String status;
    private boolean statusMenikah;
    private double totalGaji;
    private double tunjangan;
    
    private void cekStatus(String parStatus) {
        if(parStatus.toUpperCase().equals("MENIKAH"))
            statusMenikah = true;
        else  
            statusMenikah = false;
    }
    private void hasilTunjangan(boolean parStatus,double parGajiPokok) {
        if(parStatus) {
            tunjangan = parGajiPokok * 0.35;
            totalGaji = parGajiPokok + tunjangan;
        } else {
            tunjangan = 0;
            totalGaji = parGajiPokok + tunjangan;
        }
        System.out.println("");
        System.out.println("====== Hasil perhitungan gaji anda ======");
        System.out.println("Gaji pokok\t\t: Rp. "+gajiPokok);
        System.out.println("Tunjangan\t\t: Rp. "+tunjangan);
        System.out.println("Total gaji\t\t: Rp. "+totalGaji);
        System.out.println("(Developed by : Firman Alfinas)");
    }
    
    public void pengecekanKaryawan(String parStatus, double parGajiPokok) {
        gajiPokok = parGajiPokok;
        status = parStatus;
        cekStatus(status);
        hasilTunjangan(statusMenikah, gajiPokok);
        
    }
    
}
