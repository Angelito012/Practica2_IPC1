/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;
import javax.swing.JLabel;

/**
 *
 * @author Angel
 */
public class Contador extends Thread{
    
    private int horas = 0;
    private int minutos = 0;
    private int segundos = 0;
    
    JLabel contador;

    public Contador(JLabel cronometro) {
        this.contador = cronometro;
    }
      @Override
  public void run(){
      try{
          while(true){
              if(segundos==60){
                  segundos=0;
                  minutos++;
              
              }
              if(minutos==60){
                  minutos=0;
                  horas++;
              }
              segundos++;
              contador.setText(horas+":"+minutos+":"+segundos);
              Thread.sleep(1000);
          }
      
      }catch(Exception ex){}
  
  }
}
