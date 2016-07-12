/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;
import java.math.*;

/**
 *
 * @author Jenny
 */
public class logica implements Radio{
     
    public double emisora;
    public int btn; /*btn numero para guardar la emisora*/
    public boolean estado;
    public boolean frecuencia;
    double [] am;
    double [] fm;

    public logica() {
        this.emisora = emisora;
        btn = 1;
        this.estado = estado;
        this.frecuencia = frecuencia;
        am = new double[12];
        fm = new double[12];
    }
   
    /**************************************************************/
    
    /**
        Metodo de encendido
        @param estado, define el estado de apagado/encendido
        True -> encendido
        False -> apagado
     */
    public void setEncendido(boolean estado){
        if (estado == true){
            estado = false;
        }
        
        else {
            estado = true;
        }
    }

    /**
        Metodo de cambio de frecuencia
        @param frecuencia, define el estado de AM/FM
        True -> FM
        False -> AM
     */

    public void setFrecuencia(boolean frecuencia){
       this.frecuencia = frecuencia;
        /*if (frecuencia == true){
            frecuencia = false;
        }
        
        else {
            frecuencia = true;
        }*/
    }
    

    /**
        Metodo de emisora
        @param emisora, define la emisora que se esta "escuchando"
     */

    public void setEmisora(double emisora){
        this.emisora = emisora;
    }

    /**
        Metodo de guardar emisora en un boton
        @param btn, contiene el ID del boton
     */

    public void saveEmisora(int btn, double emisora){
        btn=btn-1;
        if (frecuencia == true){
            fm[btn] = emisora;
            JOptionPane.showMessageDialog(null, "Emisora"+emisora+"fue guardada con exito en btn"+btn+1, ":D FM",
                    JOptionPane.INFORMATION_MESSAGE);
        } 
        if (frecuencia == false){
            am[btn]=emisora;
            JOptionPane.showMessageDialog(null, "Emisora"+emisora+"fue guardada con exito en btn"+btn+1, ":D AM",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    /**
        Metodo de seleccionar emisora
        @param btn, contiene el ID del boton
     */

    public double selectEmisora(int btn){
        if ((btn <= 12)&&(btn>=1)){
            btn = btn - 1;
            if (frecuencia == true){
                emisora = fm[btn];
                
                if (fm[btn] == 0.0){
                JOptionPane.showMessageDialog(null, "Este btn esta vacio, porfavor guardar emisora", ":D",
                    JOptionPane.INFORMATION_MESSAGE);
                emisora = 87.9;
                return emisora;
                }
                
            }
            if (frecuencia == false){
                emisora = am[btn];
                
                if (am[btn] == 0.0){
         
                JOptionPane.showMessageDialog(null, "Este btn esta vacio, porfavor guardar emisora", ":D",
                    JOptionPane.INFORMATION_MESSAGE);
                emisora = 530;
                return emisora;
                }

            }
            
        }
        
        
        return emisora;
    }

    /**
        Metodo para obtener el estado actual de la radio
        @ return Estado de la radio
        True -> Encendido
        False -> Apagado
     */
        
    public boolean getEncendido(){
        return estado;
    }

    /**
        Metodo para obtener la frecuencia actual
        @return frecuencia actual
        True -> FM
        False -> AM
     */

    public boolean getFrecuencia(){
        return frecuencia;
    }

    /**
        Metodo para obtener la emisora
        @return emisora que se esta "escuchando"
     */
    
    public double getEmisora(){
        if (frecuencia == true){
            if (emisora >= 87.9 && emisora<108){
                emisora = emisora + 0.2;
                emisora = emisora * 100; 
                emisora = Math.round(emisora); 
                emisora = emisora/100; 
                return emisora;
            }
            /*if(emisora >= 108){
                emisora = 87.9;
            }*/
        } 
        if (frecuencia == false){
            if (emisora >= 530 && emisora<1610){
                emisora = emisora + 10;
                emisora = emisora * 100; 
                emisora = Math.round(emisora); 
                emisora = emisora/100; 
                return emisora;
            }
            if(emisora >= 1610){
                emisora = 530;
            }
        } 
        return emisora;
    } 

    public double[] getAm() {
        return am;
    }

    public void setAm(double[] am) {
        this.am = am;
    }

    public double[] getFm() {
        return fm;
    }

    public void setFm(double[] fm) {
        this.fm = fm;
    }
    

}
