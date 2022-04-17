
package Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Modelo;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import vista.Vista;

public class Controlador implements ActionListener {
    
    private Vista vis;
    private Modelo mod;
   
    public Controlador(Modelo mod,Vista vis) {
        this.vis = vis;
        this.mod = mod;
        vis.btnConvertir.addActionListener(this);  
        vis.btnLimpiar.addActionListener(this);
        vis.btnSalir.addActionListener(this);
    }   
    
    
    
    public void IniciarVista(){
        vis.setTitle("Conversion de Peso a Dolar 2022");
        vis.setSize(500, 200);
        vis.lblValorDolar.setText("Valor del dolar hoy: "+ZonedDateTime.now().format(DateTimeFormatter.ISO_DATE) + " es:  "+String.valueOf(mod.getVLR_DOLAR()));
        vis.setLocationRelativeTo(null);
        vis.btnLimpiar.setText("Limpiar");
        vis.btnLimpiar.setMnemonic('l');
        vis.btnSalir.setText("Salir");
        vis.btnSalir.setMnemonic('s');//alt + e en este caso es el atajopara el teclado del boton salir
        //vis.setLocation(100,100);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {       
        if(e.getSource()==vis.btnConvertir){
       mod.setPesos(Float.parseFloat(vis.txtPesosValor.getText()));
       mod.conversion();
       vis.txtDolaresValor.setText(String.valueOf(mod.getResultado()));
        }else{
            if(e.getSource()==vis.btnLimpiar){
                  vis.txtDolaresValor.setText("");
                  vis.txtPesosValor.setText(""); 
            }else{
                if(e.getSource()==vis.btnSalir){
                    vis.dispose();
                }
            }
        }
    }
    
   
  
    
    
    
   
}
