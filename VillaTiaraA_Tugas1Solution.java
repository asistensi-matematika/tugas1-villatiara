/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villatiaraa_tugas1.solution;
import java.util.Scanner;
/**
 *
 * @author sunarto
 */
public class VillaTiaraA_Tugas1Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nilai a, b, c");
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        if (a==0)
        {System.out.println("Nilai a tidak boleh = 0");
        }
        if (a!=0)
        {System.out.println("Sebuah Polinomial " + a+"x^2"+b+"x+"+c + " memiliki: ");}
        
        int D = (b*b)-(4*a*c);
        System.out.println("1. Diskriminan                  : " +D);
        
        double x1;
        double x2;
        x1 = ((-b+Math.sqrt(D))/(2*a));
        x2 = ((-b-Math.sqrt(D))/(2*a));
        System.out.println("2. Akar-akar dari polinomial    : " + x1 + " dan " + x2);
        
        int stasionerx;
        int stasionery;
        stasionerx = (-b)/(2*a);
        stasionery = (-b)/(4*a);
        System.out.println("3. Toitik Stasioner             : (" + stasionerx+ "," + stasionery + ")");
        
        if (a>0)
        {System.out.println("4. Kecekungan kurva             : Atas");
    }
        else
        {System.out.println("4. Kecekungan kurva            : Bawah");}
        
        System.out.println("5. Nilai minimum lokal          : " + stasionery);
    }
}
