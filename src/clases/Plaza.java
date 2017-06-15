/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Mercedes
 */
public class Plaza {
    private int numero;
    private EstadoPlaza esta;

    public Plaza() {
    }
    
    public Plaza(int numero) {
        this.numero = numero;
    }
    
    
    public EstadoPlaza getEsta() {
        return esta;
    }

    public void setEsta(EstadoPlaza esta) {
        this.esta = esta;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
