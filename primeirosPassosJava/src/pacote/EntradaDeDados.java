/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class EntradaDeDados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x, j;
        int y;
        double z;
        char k;
      
        //sc.netLine para retirar o bufer de memoria
        x = sc.next();
        sc.nextLine();
        y = sc.nextInt();
        sc.nextLine();
        z = sc.nextDouble();
        sc.nextLine();
        
        //Para pegar o primeiro caractere
        k = sc.next().charAt(0);
        sc.nextLine();
        //Só irá efetuar a entrada quando pessionado enter
        j = sc.nextLine();

        System.out.println("Você digitou " + x);
        System.out.println("Você digitou " + y);
        System.out.println("Você digitou " + z);
        System.out.println("Você digitou " + k);
        System.out.println("Você digitou " + j);
        sc.close();
    }
}
