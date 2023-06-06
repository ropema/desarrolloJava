package com.grupo3.sprint4.clases;

import java.time.LocalDate;

public class Administrativo extends Usuario{
	private String area;
    private String experienciaPrevia;
    
    public Administrativo(){ 
    }
 
	public Administrativo(String nombres, String apellidos, LocalDate fechaNacimiento, int run,String area,String experienciaPrevia) {
		super(nombres, apellidos, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	@Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
    }

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + ", nombres=" + nombres
				+ ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
	}
	

}
