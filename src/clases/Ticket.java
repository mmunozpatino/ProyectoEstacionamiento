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
public class Ticket {
    
    private String fecha;
    private String horaEntrada;
    private String horaSalida;
    private int numero;
    private Ascensor subeEn;
    private Vehiculo perteneceA;
    private Plaza estacionadoEn;
    
    
    public Ticket() {
    }

    public Ticket(String fecha, String horaEntrada, String horaSalida, int numero) {
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.numero = numero;
    }


    
    public Vehiculo getPerteneceA() {
        return perteneceA;
    }

    public void setPerteneceA(Vehiculo perteneceA) {
        this.perteneceA = perteneceA;
    }

    
    public Ascensor getSubeEn() {
        return subeEn;
    }

    public void setSubeEn(Ascensor subeEn) {
        this.subeEn = subeEn;
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Plaza getEstacionadoEn() {
        return estacionadoEn;
    }

    public void setEstacionadoEn(Plaza estacionadoEn) {
        this.estacionadoEn = estacionadoEn;
    }
    
    
    
    
}
