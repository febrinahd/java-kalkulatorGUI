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
public class Perkalian extends Operasi {
    //properti
    protected double hasilKali;
    
    //constructor
    Perkalian(){
        setBil1(bil1);
        setBil2(bil2);
    }
    
    //method class
    protected void hitPerkalian(){
        this.hasilKali = (bil1 * bil2);
    }
    
    //method turunan
    @Override
    protected double HasilOperasi() {
        return this.hasilKali;
    }      
}
