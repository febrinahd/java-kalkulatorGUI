/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator_Sederhana;

/**
 *
 * @author bella
 */
public class Pembagian extends Operasi {
    //properti
    protected double hasilBagi;
    
    //constructor
    Pembagian(){
        setBil1(bil1);
        setBil2(bil2);
        bil1 = 0;
        bil2 = 0;
    }
    
    //method class
    protected void hitPembagian(){
        hasilBagi = (bil1/bil2);
    }
    
    //method turunan
    @Override
    protected double HasilOperasi() {
        return this.hasilBagi;
    }      
}
