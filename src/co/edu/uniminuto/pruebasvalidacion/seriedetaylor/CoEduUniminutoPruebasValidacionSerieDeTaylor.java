/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.pruebasvalidacion.seriedetaylor;


import Controller.controlador;
import Model.modelo;
import View.vista;

/**
 *
 * @author Yuli Ariza
 * Serie de Taylor
 * 16/02/2020
 */
public class CoEduUniminutoPruebasValidacionSerieDeTaylor {


    //main el cual hace que se inicialicen la vista y modleo, y asi mismo el controlador pueda inciliarzalas y emepzar a ejecutar
    public static void main(String[] args) {
        modelo Model = new modelo(); //Modelo
        vista View = new vista(); //Vsta
        controlador control = new controlador(View, Model); //Controlador
        control.iniciarVista(); //Mostrar vista
        View.setVisible(true); //hacer visible la vista
    }
    
}
