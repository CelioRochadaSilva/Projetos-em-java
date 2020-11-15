/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contprincipal;

/**
 *
 * @author Celio_pc
 */
public class ContPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // estrutura de repetição com while
        int cc = 0; // while: ler enquanto a condição for verdadeira
        while (cc<4){ // vai repetir 04 veze frase cambalhota
            cc++; // inclemento a cada repetição soma +1
            System.out.println("Cambalhota " + (cc));
        }
    }
    
}
