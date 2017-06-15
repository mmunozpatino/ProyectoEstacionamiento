/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import estacionamiento.Estacionamiento;



/**
 *
 * @author Mercedes
 */
public class Ascensor {
    private int numero;
    private int cnt = 0;
    EstadoAscensor esta;

    public Ascensor() {
    }

    
    public Ascensor(int numero) {
        this.numero = numero;
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public EstadoAscensor getEsta() {
        return esta;
    }

    public void setEsta(EstadoAscensor esta) {
        this.esta = esta;
    /*    cnt += 1;
        if (cnt >= 2){
            this.esta = Estacionamiento.getEa1();
            cnt = 0;
        }
    */    
    }
    
    
}
