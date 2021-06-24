/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComposicionCompu;
import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import ico.fes.componentes.Computadora;



        

/**
 *
 * @author Fernando
 */
public class ComposicionCompu {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Computadora c1= new Computadora("Apple", "MacBook Air", new CPU("INTEL", "Core i 5", 1), 
                    new Teclado("Logitech","g 915 TKL",96, 8), new Mouse("Logitech","G203", "Alambrico"),
                    new Monitor("Samsung","LC24F390FHLXZX",24));
        
        System.out.println(c1.toString());
    }       
}
