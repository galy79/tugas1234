/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int hours,minutes,second,totdek;
 System.out.println("Jam = ");
 hours=input.nextInt();
 
 System.out.println("Menit = ");
 minutes = input.nextInt();
 
 System.out.println("Detik = ");
 second = input.nextInt();
 
 totdek=hours*3600+minutes*60+second;
 System.out.println("Total Detik Jam Adalah = " +totdek);
    }
    
}
