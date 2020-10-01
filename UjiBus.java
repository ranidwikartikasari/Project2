/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11_1;

/**
 *
 * @author lenovo
 */
public class UjiBus {

    public static void main(String[] args) { // fungsi unutk menjalankan program
        Bus busMini = new Bus(); // membuat object baru
        
        busMini.penumpang = 5; // memanggil variable
        busMini.maxPenumpang = 15;
        
        busMini.cetak(); // memanggil fungsi cetak
        
        busMini.penumpang = busMini.penumpang + 5; // memanggil variable
        busMini.cetak(); // memanggil fungsi cetak
        
        busMini.penumpang = busMini.penumpang -2; // memanggil variable
        busMini.cetak(); // memanggil fungsi cetak
        
        busMini.penumpang = busMini.penumpang + 8; // memanggil variable
        busMini.cetak(); // memanggil fungsi cetak
    }
    
}
