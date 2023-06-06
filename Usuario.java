package com.grupo3.sprint4.clases;

import java.time.LocalDate;
import java.time.Period;

class Usuario implements Asesoria {
    protected String nombres;
    protected String apellidos;
    protected LocalDate fechaNacimiento;
    protected int run;

    public Usuario() {
    }

    public Usuario(String nombres,String apellidos, LocalDate fechaNacimiento, int run) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public String getNombre() {
		return nombres;
	}

	public void setNombre(String nombre) {
		this.nombres = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

    public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String mostrarEdad() {
    	Period edad = Period.between(fechaNacimiento, LocalDate.now());
    	return "El usuario tiene "+ edad.getYears() + " años";
    }
	
	@Override
	public void analizarUsuario() {
        System.out.println("Nombre: " + nombres);
        System.out.println("Apellido: " + apellidos);
        System.out.println("RUN: " + run);
    }

	@Override
	public String toString() {
		return "Usuario [nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", run=" + run + "]";
	}


}


