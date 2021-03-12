/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
public class studikasus {
  public static void main(String[] args){
      /* contoh pemakaian if tiga kasus : wujud air */
      /* kamus*/
      int T;
      
      /* Program */
     System.out.println("Contoh IF tiga kasus");
     System.out.print("Suhu (der.C)=");
     
     //scanner untuk masukkan suhu
     Scanner scanner = new Scanner(System.in);
     T = scanner.nextInt(); //masukkan suhu air dengan tipe int
     
     // proses pengecekkan dengan if
     if (T < 0){
         System.out.println("wujud air beku" + T);
     } else if ((0<= T)&& (T<= 100)){
         System.out.println("wujud air cair" + T);
     } else if (T>100){
         System.out.println("wujud air uap /gas" + T);
     }
  }  
}
