/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao_01;

/**
 *
 * @author Celio_pc
 */
public class TesteFuncao_01 {

    /**
     * @param args the command line arguments
     */
    // criação procedimento
  // static void soma(int a , int b){
 // função que retorna valor
    // exemplo boa proatica de programação
    static int soma(int a , int b){    
        int s = a + b ;
        return s;
        //System.out.println("A soma: " + s);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando app");
        // vai soma para ser exibo no procedimento soma acima
       //soma (5 , 2);
       int sm = soma(5 , 2);
        System.out.println("A soma vale" + sm);
    }
    
}
