/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;
import vista.Vista;
import Modelo.Modelo;
import Controlador.Controlador;
/**
 *
 * @author JENG-PC
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Modelo modelo = new Modelo();
       Vista vista = new Vista();
       vista.setVisible(true);
       Controlador controlador = new Controlador(modelo,vista);
       controlador.IniciarVista();
       vista.setVisible(true);
       
      
        
    }
    
}
