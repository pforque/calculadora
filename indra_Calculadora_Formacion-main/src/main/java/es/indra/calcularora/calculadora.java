/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.indra.calcularora;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author aocarballo
 */
public class calculadora {
        JFrame frame = new JFrame();
        JPanel jPanel1 = new JPanel();
        JButton jButtonSumar = new JButton();
        JButton jButtonRestar = new JButton();
        JButton jButtonMultiplicar = new JButton();
        JButton jButtonDividir = new JButton();
        JTextField jTextField1 = new JTextField();
        JTextField jTextField2 = new JTextField();
        JTextField jTextFieldResultado = new JTextField();
        JLabel jLabelResultado = new JLabel();
        
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Declaramos variables
        double resultado=0.0;
        int operacion=0;
        double numero1;
        double numero2;
        //Indicamos que repita siempre que no le demos a salir
        while (operacion!=5){
            //imprimimos las opciones disponibles
            System.out.println("Operaciones:");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            //Leemos por teclado la operacion a realizar
            System.out.println("Indica el número de operación a realizar");
            operacion = Integer.parseInt(scanner.nextLine());
            if(operacion==5){
            System.out.println("Saliendo");
            }
            //Si no indicamos que queremos salir
            /*
            if(operacion!=5){
                System.out.println("Indica el primer número");
                numero1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Indica el segundo número");
                numero2 = Double.parseDouble(scanner.nextLine());
                
                if(operacion==1){
                        resultado = sumar(numero1,numero2);
                         System.out.println("La suma de "+numero1+" y de "+numero2+" es "+resultado);
                }else if(operacion==2){
                    resultado = restar(numero1,numero2);
                         System.out.println("La resta de "+numero1+" y de "+numero2+" es "+resultado);
                }else if(operacion==3){
                    resultado = multiplicar(numero1,numero2);
                         System.out.println("La multiplicación de "+numero1+" y de "+numero2+" es "+resultado);
                }else if(operacion==4){
                    resultado = dividir(numero1,numero2);
                         System.out.println("La división de "+numero1+" y de "+numero2+" es "+resultado);
                }else if(operacion>5 || operacion<0){
                    System.out.println("Indique una operación válida");
                }
            }
            */
        }
    }
     /**
     * Metodo para sumar
     * @param numero1
     * @param numero2
     * @return
     */
     public double sumar(double numero1,double numero2){
            return numero1+numero2;
        }
      /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
     public double restar(double numero1,double numero2){
            return numero1-numero2;
        }
      /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
     public double multiplicar(double numero1,double numero2){
            return numero1*numero2;
        }
      /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
     public double dividir(double numero1,double numero2){
            return numero1/numero2;
        }
}
