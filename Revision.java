package com.grupo3.sprint4.clases;

public class Revision {
	private final int idRevision;
	private int idVisita;
	private String nombre;
	private String detalle;
	private int estado;
	private static int contador;

	
	private Revision() {
		this.idRevision = ++Revision.contador;
	}


	public Revision( int idVisita, String nombre, String detalle, int estado) {
		this();
		this.idVisita = idVisita;
		this.nombre = nombre;
		this.detalle = detalle;
		this.estado = estado;
	}


	public int getIdVisita() {
		return idVisita;
	}


	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	public int getIdRevision() {
		return idRevision;
	}


	public static int getContador() {
		return contador;
	}


	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", nombre=" + nombre + ", detalle="
				+ detalle + ", estado=" + estado + "]";
	}

	
}
