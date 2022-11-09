/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4prakti;

/**
 *
 * @author fikri
 */
public class Kura extends Animal
{
    int kecepatan;
    int hasil;

    @Override
    public void input(int kecepatan){
        this.kecepatan = kecepatan;
    }
    @Override
    public void hasil(){
        hasil = 10 /this.kecepatan;
        System.out.println("Waktu tempuh Kura-Kura : "+hasil+" detik");
    }

}
