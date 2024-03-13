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
public class Principal {

    public static void main(String[] args) {
        // Instanciar el objeto que será Observado
         UnTicket objObservado = new UnTicket();
        // Instanciar y registrar un Observador
         UnObservador objObservadorSubdepartamento1  = new UnObservador("Subdepartamento1");
         objObservado.agregarObservador(objObservadorSubdepartamento1);
        // Instanciar y registrar otro Observador
         UnObservador objObservadorSubDepartamento2  = new UnObservador("Subdepartamento2");
         objObservado.agregarObservador(objObservadorSubDepartamento2);
        // Instanciar y registrar otro Observador
         UnObservador objObservadorSubDepartamento3 = new UnObservador("SubDepartamento3");
         objObservado.agregarObservador(objObservadorSubDepartamento3);
    }
}