/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Celio_pc
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1ª nota");
        float n1 = teclado.nextFloat();
        System.out.println("Digite sua 2ª nota");
        float n2= teclado.nextFloat();
        float m = (n1 + n2)/2;
            // condicional composto
        if (m==7){
            System.out.println("Parabens você foi aprovado");
        }if (m>=9){
            System.out.println("Excelente Você foi aprovado com mdedia :" + m);
        }else{
            System.out.println("Estudade mais sua Anta foi reprovado com media "+ m);
        }
    }
    
}
