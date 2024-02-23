/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadawrms;

/**
 *
 * @author Ra7x
 * @author koalagordokbron
 */
public class PracticaDawRMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        miniCalculadoreEjemplo calculadora = new miniCalculadoreEjemplo();
        
        double resultadoRaizCuadrada = calculadora.raizCuadrada(25);
        System.out.println(resultadoRaizCuadrada);
        
        double valorAbsoluto = calculadora.valorAbsoluto(3.14);
        System.out.println(valorAbsoluto);
        
        System.out.println("Este es un sout para modificar el proyecto. Pablo Morcillo Cuenca");
    }
    
}
