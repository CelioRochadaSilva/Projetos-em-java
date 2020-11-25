/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostramesdia;

/**
 *
 * @author Celio_pc
 */
public class MostraMesDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String m[] = {"Janeiro ", "Fevereiro ","Março ", "Abril ", "Maio ","Junho ","Julho ", "Agosto ","Setembro ",
            "Outubro ", "Novembro ","Dezembro "};
        int total[] = {31 , 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                for(int c=0; c<m.length; c++){
                    System.out.println("O mês de " + m[c] + "tem "
                   +total[c] + " dias ao todo.");
                    
                }
    }
    
}
