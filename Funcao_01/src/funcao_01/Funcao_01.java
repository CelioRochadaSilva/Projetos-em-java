/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao_01;

/**
 *
 * @author Celio_pc
 */
public class Funcao_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // novo objeto f que tem os metodos 
        Fatorial f = new Fatorial(); 
        f.setValor(5);
       // formula
        System.out.print(f.getString());
        // calculamdo fatorial do numero informado
        System.out.println(f.getFatorial());
    }
    
}
