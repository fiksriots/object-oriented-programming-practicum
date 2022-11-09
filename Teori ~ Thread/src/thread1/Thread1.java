/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

/**
 *
 * @author fikri
 */
public class Thread1 {
public static void main (String [] args) 
    {
    Baju baju1 = new Baju("Baju-1");
    Baju baju2 = new Baju("Baju-2");
    baju1.start();
    baju2.start();
    }
}
    
    class Baju extends Thread 
    {
        // konstruktor
        public Baju (String id) 
        {
            super (id);
        }
        // Mendefinisikan sendiri run()
        @Override
        public void run() 
        {
            String nama = getName();
            for (int i=0; i<5; i++) 
            {
                try 
                {
                    sleep(1000); // Tunggu 1 detik
                }
                catch(InterruptedException ie) 
                {
                    System.out.println("Terinterupsi");
                }
                System.out.println("Thread " + nama + ":Posisi" + i );
            }
        }
    }
