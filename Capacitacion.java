package com.grupo3.sprint4.clases;
import java.time.LocalDate;
import java.time.LocalTime;

public class Capacitacion {
	private final int id;
    private int rut;
    private String dia;
    private LocalTime hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;
    private static int contador;

    private Capacitacion() {
    	this.id = ++Capacitacion.contador;
    }
    
    public Capacitacion(int rut, String dia, LocalTime hora, String lugar, int duracion, int cantidadAsistentes) {
        this();
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getId() {
        return id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }
    
    public void mostrarDetalle() {	
        System.out.println("La capacitación será en " + lugar + " a las " + hora 
        		+ " del día " + dia + ", y durará " + duracion + " minutos");
    }

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
				+ ", duracion=" + duracion + ", cantidadAsistentes=" + cantidadAsistentes + "]";
	}


    
}