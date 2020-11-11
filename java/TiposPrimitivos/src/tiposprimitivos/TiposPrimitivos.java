/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Celio_pc
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite seu nome");     
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine(); /// digitar nome
        System.out.println("Digite sua nota: com virgula entre os numeros"); 
        float nota = teclado.nextFloat(); // digitar nota
        PrintStream format = System.out.format("A sua nota de %s é %.2f \n", nome ,  nota); // System.out.format("A nota de %s é %.2f \n", nome ,  nota); 
       if(nota>= 7){
           System.out.println("Parabens você foi aprovado com nota : "+ nota);
       }
    else{
            System.out.println("Estude mais. Tenha um bom dia");
    
}
    
}
