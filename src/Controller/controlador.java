/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.modelo;
import View.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Yuli Ariza
 * Serie de Taylor
 * 16/02/2020
 */
public class controlador implements ActionListener{
    
    private vista vis; //clase vista del paquete View
    private modelo model; //clase modelo del paquete Model
   

    //Metodo que hace que el controlador inicialice la vista y el modelo
    public controlador(vista vis, modelo model) {
        
        this.vis = vis;
        this.model = model;

        //Boton para calcular
        this.vis.btn_calcular.addActionListener(this);
    }
    

    //Si da clic en el boton debe ejecutar el metodo correspondiente
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vis.btn_calcular) {
            metodoResultado();
        }
    }
    
    //Inicializar la vista 
    public void iniciarVista() {
        vis.setTitle("SERIE DE TAYLOR ");
        vis.setLocationRelativeTo(null);
        vis.jtf_grados.setText("" + model.getGrados());
        vis.jtf_repeticiones.setText("" + model.getRepeticiones());
    }
    
    //Enviar los datos al modelo para que haga las debidas operaciones
    private void metodoResultado() {
        model.setGrados(Double.parseDouble(vis.jtf_grados.getText())); //se le pasa un parametro de la vista
        model.setRepeticiones(Integer.parseInt(vis.jtf_repeticiones.getText()));
        vis.jtf_resultado.setText("" + model.Taylor());
    }
    
}
