/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Yuli Ariza
 * Serie de Taylor
 * 16/02/2020
 */
public class modelo {
    //Variables
    private double grados; //Grados que ingreso el susuario
    private int repeticiones; //Numero de repeticiones ingresadas por el usuario
    private double termino;  //Donde se guarda el resultado de cada repeticion
    private double fra; //Se dividio la operacion en dos terminos en fra = parte de fraccion
    private double po; // y po = potencia
    private double sum; //sum, es ir sumando el resultado de los terminos
    
    private NumberFormat df = new DecimalFormat("#0.00"); //Para que el resultado solo salga con dos decimales

    //Metodos get y set
    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    
    //Se hace toda la operacion
    public String Taylor() {
        for (int i = 0; i < this.repeticiones; i++) {
            fra = (signo(i)/factorial(2 * i + 1));
            po = potencia(converGraRad(this.grados), (2 * i + 1));
            termino = fra * po;
            sum = sum + termino;
        }
        return df.format(sum);
    }
    
    //Función para calcular el signo de la operación
    public byte signo(int num) { //entra el numero en que vaya la repeticion
        if (num % 2 == 0) {
            return 1; 
        } else {
            return -1;
        }
    }

    //Función para convertir los grados en radianes
    public double converGraRad(double conver_grados) {
        return Math.PI * conver_grados / 180;
    }

    //Función para calcular el factorial de la operacion
    public double factorial(int num) {
        return (num == 0) ? 1 : num * factorial(num - 1);
    }

    //Funcion para calcular una potencia
    public double potencia(double base, double exp) {
        double respuesta = 1,aux;
        if (exp == 0) {
            return 1;
        }

        if (exp > 0) {
            while (exp > 0) {
                respuesta = base * respuesta;
                exp--;
            }
            return respuesta;
        }else{
            exp = exp * -1; 
            while (exp > 0) {
                respuesta = 1/base * respuesta;
                exp--;
            }
        }return respuesta;
    }
    
}
