package com.grupo3.sprint4.clases;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Usuario{
	    private String telefono;
	    private String afp;
	    private int sistemaSalud;
	    private String direccion;
	    private String comuna;
	    private ArrayList<Capacitacion> capacitacion;
	    private ArrayList<Accidente> accidente;
	    private ArrayList<VisitaEnTerreno> visitaTerreno;

	    public Cliente(){

	    }

	    public Cliente (String nombres,String apellidos,LocalDate fechaNacimiento,int run,
	    		String telefono,String afp, int sistemaSalud, String direccion, String comuna) {
	    	super(nombres,apellidos,fechaNacimiento,run);
	        this.telefono = telefono;
	        this.afp = afp;
	        this.sistemaSalud = sistemaSalud;
	        this.direccion = direccion;
	        this.comuna = comuna;
	    }

	    public String getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(String telefono) {
	        this.telefono = telefono;
	    }

	    public String getAfp() {
	        return afp;
	    }

	    public void setAfp(String afp) {
	        this.afp = afp;
	    }
	    public int getSistemaSalud() {
	        return sistemaSalud;
	    }

	    public void setSistemaSalud(int sistemaSalud) {
	        this.sistemaSalud = sistemaSalud;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }

	    public String getComuna() {
	        return comuna;
	    }

	    public void setComuna(String comuna) {
	        this.comuna = comuna;
	    }

	    public ArrayList<Capacitacion> getCapacitacion() {
	        return capacitacion;
	    }

	    public void setCapacitacion(ArrayList<Capacitacion> capacitacion) {
	        this.capacitacion = capacitacion;
	    }
	    
	    public ArrayList<Accidente> getAccidente() {
	        return accidente;
	    }

	    public void setAccidente(ArrayList<Accidente> accidente) {
	        this.accidente = accidente;
	    }
	    
	    public ArrayList<VisitaEnTerreno> getvisitaTerreno() {
	        return visitaTerreno;
	    }

	    public void setVisitaTerreno(ArrayList<VisitaEnTerreno> visitaTerreno) {
	        this.visitaTerreno = visitaTerreno;
	    }
	    
	    
	    public String obtenerNombre() {
	        return nombres + " " + apellidos;
	    }

	    public void obtenerSistemaSalud() {
	        if (sistemaSalud == 1) {
	            System.out.println("Sistema de salud: Fonasa");
	        } else if (sistemaSalud == 2) {
	            System.out.println("Sistema de salud: Isapre");
	        }
	    }

	    @Override
	    public void analizarUsuario() {
	        super.analizarUsuario();
	        System.out.println("Dirección: " + direccion);
	        System.out.println("Comuna: " + comuna);
	    }

		@Override
		public String toString() {
			return "Cliente [telefono=" + telefono + ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion="
					+ direccion + ", comuna=" + comuna + ", capacitacion=" + capacitacion + ", accidente=" + accidente
					+ ", visitaTerreno=" + visitaTerreno + ", nombres=" + nombres + ", apellidos=" + apellidos
					+ ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
		}
	    


}
