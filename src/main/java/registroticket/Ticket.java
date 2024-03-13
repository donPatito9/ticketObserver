/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroticket;
/**
 *
 * @author Robinson
 */
import java.util.ArrayList;
 public abstract class Ticket {
    private ArrayList<IObservador> observadores = new ArrayList<IObservador>();
    
    public Ticket() {
    }
    
     public void agregarObservador(IObservador o){
        observadores.add(o);
         notificarObservadores();
    }
     
     public void eliminarObservador(IObservador o) {
        observadores.remove(o);
    }
   
     public void notificarObservadores() {
        // Enviar la notificación a cada observador 
         for (IObservador obj : observadores) {
             obj.observadoActualizado();
        }
    }
}
