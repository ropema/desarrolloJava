package com.grupo3.sprint4.clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class VisitaEnTerreno {
	private final int id;
	private int rut;
	private LocalDate dia;
	private LocalTime hora;
	private String lugar;
	private String comentarios;
	private ArrayList<Revision> revision;
	private static int contador;

	private VisitaEnTerreno() {
		this.id = ++VisitaEnTerreno.contador;
	}

	public VisitaEnTerreno( int rut, LocalDate dia, LocalTime hora, String lugar, String comentarios) {
		this();
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
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

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
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

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public ArrayList<Revision> getRevision() {
		return revision;
	}

	public void setRevision(ArrayList<Revision> revision) {
		this.revision = revision;
	}
	
	@Override
	public String toString() {
		return "VisitaEnTerreno [id=" + id + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
				+ ", comentarios=" + comentarios + "]";
	}
}
