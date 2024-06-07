/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diseñodesoftware;

/**
 *
 * @author jorge
 */
public class Notificacion {

    private NotificarPadre tipoNotificacion;
    
    public Notificacion (NotificarPadre tipoNotificacion){
        this.tipoNotificacion=tipoNotificacion;
    }
    
    
    public void notificar(Pago pago) {
        tipoNotificacion.notificar(pago);
    }
}
