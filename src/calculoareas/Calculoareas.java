/*
CREAR UN PROGRAMA QUE PREGUNTE PARA QUE FIGURA GEOMÉTRICA QUIERO CALCULAR EL AREA.
LAS OPCIONES SERÍAN CIRCULO O CUADRILATERO
    - SI ES CIRCULO TENDREMOS EN CUENTA QUE EL AREA DE UN CIRCULO ES IGUAL A PI*r2
    - SI ES CUADRILATERO TENDREMOS QUE PREGUNTAR SI QUEREMOS CALCULAR EL AREA DE UN CUADRADO O UN RECTÁNCULO
            - SI ES CUADRADO TENDRÉ QUE PEDIR 1 DATO Y CALCULO EL AREA
            - SI ES RECTÁNGULO TENDRÉ QUE PEDIR 2 DATOS Y CALCULO EL AREA
    - SERÁ NECESARIO CONTROLAR QUE NINGUNO DE LOS DATOS INTRODUCIDOS POR TECLADO SEA MENOR O IGUAL A CERO
*/
/*Primera versión del ejercicio de cálculo de áreas para probar Git+GitHub+NetBeans*/
package calculoareas;

import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Calculoareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String error = "HA SUPERADO EL NÚMERO MÁXIMO DE INTENTOS PERMITIDOS, LA APLICACIÓN PROCEDE A CERRARSE.";
        String bienvenida = "BIENVENIDO A LA APLICACIÓN DE CÁLCULO DE ÁREA. SI DESEA CALCULAR EL ÁREA DE UN CÍRCULO PULSE EL NÚMERO 1, SI DESEA CALCULAR EL ÁREA DE UN CUADRILÁTERO PULSE EL NÚMERO 2.";
        String selcirc = "HA SELECCIONADO EL CÁLCULO DE ÁREA DE UN CÍRCULO. POR FAVOR, INTRODUZCA EL VALOR DEL RADIO DE SU CÍRCULO EN METROS: ";
        String selcuad = "HA SELECCIONADO EL CÁLCULO DE ÁREA DE UN CUADRILÁTERO. SI DESEA CALCULAR EL ÁREA DE UN CUADRADO PULSE EL NÚMERO 1, SI DESEA CALCULAR EL ÁREA DE UN RECTÁNGULO PULSE EL NÚMERO 2: ";
        String cuadrado = "POR FAVOR, INTRODUZCA EL VALOR DEL LADO DE SU CUADRADO EN METROS: ";
        String ladorect = "POR FAVOR, INTRODUZCA EL VALOR DEL LADO DE SU RECTÁNGULO EN METROS: ";
        String baserect = "POR FAVOR, INTRODUZCA EL VALOR DE LA BASE DE SU RECTÁNGULO EN METROS: ";
        String unidad = " METRO";
        int forma = 0;
        int tcuadro = 0;
        int i;
        final double PI = 3.14159265359;
        double radio;
        double area;
        double lado;
        double base = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        for (i = 0; i < 3; i++){
            System.out.println(bienvenida);
            forma = teclado.nextInt();
            if (forma == 1 || forma == 2){
                i = 3;
            }
        }
        
        if (i == 3) {
            System.out.println (error);
        }
        
        if (forma == 1){
            System.out.println(selcirc);
            radio = teclado.nextDouble();
            if (radio <= 0){
                for (i = 0; i < 2; i++) {
                    System.out.println(selcirc);
                    radio = teclado.nextDouble();
                }
                if (i == 2 && radio <= 0) {
                        System.out.println (error);
                }
            }
            if (radio > 0){
                area = PI * radio * radio;
                System.out.println("EL ÁREA DE UN CÍRCULO DE RADIO " + radio + unidad + "/S ES DE " +area+ unidad + " CUADRADOS");
            }  
        }
        
        if (forma == 2){
            if (tcuadro != 1 || tcuadro != 2){
                for (i = 0; i < 3; i++){
                    System.out.println(selcuad);
                    tcuadro = teclado.nextInt();
                    if (tcuadro == 1 || tcuadro == 2){
                        i = 4;
                    }
                    if (i == 3){
                        System.out.println (error);
                    }
                }   
            }
            if (tcuadro == 1){
                System.out.println(cuadrado);
                lado = teclado.nextDouble();
                if (lado <= 0){
                    for (i = 0; i < 2; i++) {
                        System.out.println(cuadrado);
                        lado = teclado.nextDouble();
                    }
                    if (i == 2 && lado <= 0) {
                            System.out.println (error);
                    }
                }
                if (lado > 0){
                    area = lado * lado;
                    System.out.println("EL ÁREA DE UN CUADRADO DE LADO " + lado + unidad + "/S ES DE " + area + unidad + " CUADRADOS");
                }
            }
            if (tcuadro == 2){
                System.out.println("HA SELECCIONADO EL CÁLCULO DE ÁREA DE UN RECTÁNGULO. " + ladorect);
                lado = teclado.nextDouble();
                if (lado <= 0){
                    for (i = 0; i < 2; i++) {
                        System.out.println(ladorect);
                        lado = teclado.nextDouble();
                    }
                    if (i == 2 && lado <= 0) {
                        System.out.println (error);
                    }
                }
                if (lado > 0){
                    System.out.println(baserect);
                    base = teclado.nextDouble();
                    if (base <= 0){
                        for (i = 0; i < 2; i++) {
                            System.out.println(baserect);
                            base = teclado.nextDouble();
                        }
                        if (i == 2 && base <= 0) {
                            System.out.println (error);
                        }   
                    }
                }
                area = lado * base;
                System.out.println("EL ÁREA DE UN RECTÁNGULO DE LADO " + lado + unidad + "/S Y BASE " + base + unidad + "/S ES DE " +area+ unidad + "/S CUADRADOS");
                }
            if (tcuadro != 1 && tcuadro != 2) {
                System.out.println (error);
            }
        }
    }
}