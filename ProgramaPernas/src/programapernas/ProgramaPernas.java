/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Celio_pc
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in); // pegando dado pelo teclado.
        System.out.print("Quantas pernas ?");
        int perna = tec.nextInt();
       String tipo;
        System.out.print("Isso é um(a):");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipde";
                break;
            case 3:
                tipo = "tripe";
                break;
            case 4:
                tipo = "Quaduplede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
            }
        System.out.println(tipo);
      }
}
   

