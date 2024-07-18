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

//abstract class
public abstract class Operasi {
    //atribut class
    protected double bil1, bil2;

    //method
    public double getBil1() { return bil1; }
    public void setBil1(double bil1) { this.bil1 = bil1; }

    public double getBil2() { return bil2; }
    public void setBil2(double bil2) { this.bil2 = bil2; }
    
    //abstract method
    protected abstract double HasilOperasi();
    
}
