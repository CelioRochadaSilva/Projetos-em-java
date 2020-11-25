/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorbuscabinaria;

import java.util.Arrays;

/**
 *
 * @author Celio_pc
 */
public class VetorBuscaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int vet[] ={3,7,1,9, 4,2};
        for (int v:vet){
            System.out.print(v + " , ");
         }
        System.out.print(".");
        
        // vai localizar a pozição do valor do numero no vetor
        int p = Arrays.binarySearch(vet , 1);
        System.out.print("Encontrei o valor na posição " +p + "\n");
    }
    
}
