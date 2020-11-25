/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciovetor03;

import java.util.Arrays;

/**
 *
 * @author Celio_pc
 */
public class ExercicioVetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[]={2.75, 3.75, 9, -4.5};
       // vai colcar ordem crescente nos numeros para ser Exibida
        Arrays.sort(v);
        for(double valor : v){
            System.out.print( valor + ",");
            
        }
    }
    
}
