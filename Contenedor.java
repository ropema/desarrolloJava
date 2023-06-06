package com.grupo3.sprint4.clases;

import java.util.ArrayList;

public class Contenedor {

	private ArrayList<Asesoria> asesorias;
	private ArrayList<Capacitacion> capacitaciones;

	public Contenedor() {
		
		
	}
	public Contenedor(ArrayList<Asesoria> asesorias,ArrayList<Capacitacion> capacitaciones) {
		this.asesorias = asesorias;
		this.capacitaciones = capacitaciones;
	}
	
	public ArrayList<Asesoria> getAsesorias() {
		return asesorias;
	}


	public void setAsesorias(ArrayList<Asesoria> asesorias) {
		this.asesorias = asesorias;
	}


	public ArrayList<Capacitacion> getCapacitaciones() {
		return capacitaciones;
	}


	public void setCapacitaciones(ArrayList<Capacitacion> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}

	public void almacenarCliente(Asesoria cliente) {
		asesorias.add(cliente);
		
	}

	public void almacenarProfesional(Asesoria profesional) {
		asesorias.add(profesional);
	}

	public void almacenarAdministrativo(Asesoria administrativo) {
		asesorias.add(administrativo);
	}

	public void almacenarCapacitacion(Capacitacion capacitacion) {
		capacitaciones.add(capacitacion);
	}

	public void eliminarUsuario(int run) {
		for (Asesoria asesoria : asesorias) {
			if (asesoria instanceof Usuario && ((Usuario) asesoria).getRun() == run) {
				asesorias.remove(asesoria);
				break;
			}
		}
	}

	public void listarUsuarios() {
		for (Asesoria asesoria : asesorias) {
			if (asesoria instanceof Usuario) {
				asesoria.analizarUsuario();
			}
		}
	}

	public void listarUsuariosPorTipo(String tipo) {
		for (Asesoria asesoria : asesorias) {
			if (asesoria.getClass().getSimpleName().equals(tipo)) {
				System.out.println(asesoria);
			}
		}
		
	}

	public void listarCapacitaciones() {
		for (Capacitacion capacitacion : capacitaciones) {
			System.out.println(capacitacion);
		}
	}

}
