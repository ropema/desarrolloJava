package com.grupo3.sprint4.clases;

import java.time.LocalDate;

public class Profesional extends Usuario{
	private String titulo;
    private LocalDate fechaIngreso;
    
    public Profesional() {
		super();
	}

	public Profesional(String nombres, String apellidos, LocalDate fechaNacimiento, int run,String titulo,LocalDate fechaIngreso) {
		super(nombres, apellidos, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }
	
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + ", nombres=" + nombres
				+ ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
	}




}
