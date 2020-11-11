/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horassistema;

import java.util.Date;

/**
 *
 * @author Celio_pc
 */
public class HorasSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();  //objeto relogio
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString()); //metodo para converter data para string
    }
    
    
}
