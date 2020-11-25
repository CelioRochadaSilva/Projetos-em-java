/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Celio_pc
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n ,s=0;
        String resp; 
        Scanner teclado = new Scanner(System.in);
        
        // estrutura de repetiçao
        do{
            System.out.println("Digite um número ");
           n = teclado.nextInt();
           s+= n; // é igual a s = s + n
            System.out.println("Quer continuar [s/n] ?");
            resp = teclado.next(); 
        }while(resp.equals("s"));
        System.out.println("A soma de todos os valores é "+ s);
    }
    
}
