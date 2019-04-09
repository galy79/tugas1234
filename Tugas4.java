/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner keyboard = new Scanner (System.in);
String name,addres;
int age;
System.out.println("nama = "); name = keyboard.next();
System.out.println("alamat = "); addres = keyboard.next();
System.out.println("umur = "); age = keyboard.nextByte();
System.out.println("saudara = " +name);
System.out.println("alamat = " +addres);
System.out.println("berumur = " +age+  "tahun");
    }
    
}
