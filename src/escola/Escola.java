/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escola;

/**
 *
 * @author 040069
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Aluno a1= new Aluno("Joca");
        
        a1.faltou();
        a1.faltou();
        
        a1.prova1(6);
        a1.prova2(8);
        
        a1.resultado();
    }
    
}
