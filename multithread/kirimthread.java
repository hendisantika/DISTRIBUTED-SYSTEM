/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.io.IOException;

/**
 *
 * @author vectorr
 */
public class kirimthread extends Thread{
    public void run()
    {
        System.out.println("Angka ganjil sebanyak 10");
        int tampung = 0;
        int bilangan;
        for (bilangan = 1 ; bilangan <= 20; bilangan++)
        {
//            System.out.println(bilangan);
            if (bilangan % 2 == 1)
            {
                System.out.println(bilangan);
              
            }
        }
    }
    
    public static void main(String[] args) {
        Thread aa = new kirimthread();
        aa.start();
    }
}
