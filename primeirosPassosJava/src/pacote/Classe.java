/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.util.Locale;

/**
 *
 * @author Henrique
 */
public class Classe {
    
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        String nome = "Maria";
        double renda = 4000.0;
        int idade = 31;
        
        System.out.println("Olá Mundo!");
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);
        
        //separador ',' para padrão americano'.'
        Locale.setDefault(Locale.US);
        
        System.out.printf("%.4f\n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS\n", x);
        
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
    }
}
