package com.grupo3.sprint4.principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.grupo3.sprint4.clases.Administrativo;
import com.grupo3.sprint4.clases.Asesoria;
import com.grupo3.sprint4.clases.Capacitacion;
import com.grupo3.sprint4.clases.Cliente;
import com.grupo3.sprint4.clases.Contenedor;
import com.grupo3.sprint4.clases.Profesional;

public class Principal {
	public static Scanner entrada = new Scanner(System.in);
	public static ArrayList<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
	public static ArrayList<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();
	public static Contenedor contenedor = new Contenedor(listaAsesoria,listaCapacitacion);
	
	
	public static void main(String[] args) {
		boolean salida = false;
		int tarea=0;
				
		while(!salida) {
			menu();
			System.out.println("Escribe el número de la tarea a realizar");
			tarea= entrada.nextInt();
			
	        switch(tarea){
	        case 1:
	        	almacenarCliente();
	            break;
	        case 2:
	        	almacenarProfesional();
	            break;
	         case 3:
	        	 almacenarAdministrativo();
	            break;
	         case 4:
	        	 almacenarCapacitacion();
	             break;
	         case 5:
	        	 eliminarUsuario();
	             break;
	         case 6:
	        	 listarUsuarios();
	             break;
	         case 7:
	        	 listarUsuariosPorTipo();
	             break;
	         case 8:
	        	 listarCapacitaciones();
	             break;
	         case 9:
	        	 salida=true;
	        	 System.out.println("El sistema ha finalizado");
	        	 break;
	         default:
	            System.out.println("Numero ingresado no valido");
	        }
		}
		entrada.close();
	}
	
	
	public static void menu() {
        System.out.println("1: Almacenar cliente");
        System.out.println("2: Almacenar profesional");
        System.out.println("3: Almacenar administrativo");
        System.out.println("4: Almacenar capacitación");
        System.out.println("5: Eliminar usuario");
        System.out.println("6: Listar usuarios");
        System.out.println("7: Listar usuarios");
        System.out.println("8: Listar capacitaciones");
        System.out.println("9: Salir");
	}
	
	public static void almacenarCliente() {
		System.out.println("Has seleccionado la opcion 1");
		

        int run;
        do {
            System.out.print("Ingrese Rut del Cliente, sin puntos ni guion: ");
            run = entrada.nextInt();
        } while (run > 0 && run < 99999999);

        entrada.nextLine(); // Limpiar el buffer de entrada

        String nombres;
        do {
            System.out.print("Ingrese Nombres del Cliente (min. 5 caracteres, max. 30): ");
            nombres = entrada.nextLine();
        } while (nombres.length() < 5 || nombres.length() > 30);

        String apellidos;
        do {
            System.out.print("Ingrese Apellidos del Cliente (min. 5 caracteres, max. 30): ");
            apellidos = entrada.nextLine();
        } while (apellidos.length() < 5 || apellidos.length() > 30);

        LocalDate fechaNacimiento;
        do {
            System.out.print("Ingrese fecha de nacimiento del usuario (DD/MM/AAAA): ");
            String fechaString = entrada.next();
            entrada.nextLine(); // Limpiar el buffer de entrada

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            fechaNacimiento = LocalDate.parse(fechaString, formatter);
        } while (fechaNacimiento == null);

        System.out.print("Ingrese teléfono del Cliente: ");
        String telefono = entrada.nextLine();

        String afp;
        do {
            System.out.print("Ingrese AFP del Cliente (min. 4 caracteres, max. 30): ");
            afp = entrada.nextLine();
        } while (afp.length() < 4 || afp.length() > 30);

        int sistemaSalud;
        do {
            System.out.print("Ingrese Sistema de salud (1: Fonasa, 2: Isapre): ");
            sistemaSalud = entrada.nextInt();
        } while (sistemaSalud != 1 && sistemaSalud != 2);

        entrada.nextLine(); // Limpiar el buffer de entrada

        String direccion;
        do {
            System.out.print("Ingrese dirección del Cliente (max. 70 caracteres): ");
            direccion = entrada.nextLine();
        } while (direccion.length() > 70);

        String comuna;
        do {
            System.out.print("Ingrese comuna del Cliente (max. 50 caracteres): ");
            comuna = entrada.nextLine();
        } while (comuna.length() > 50);
        
        
		Cliente cliente = new Cliente(nombres,apellidos,fechaNacimiento,run,telefono,afp,sistemaSalud,direccion,comuna);
    	contenedor.almacenarCliente(cliente);
    	contenedor.listarUsuarios();
		
	}
	
	public static void almacenarProfesional() {
		System.out.println("Has seleccionado la opcion 2");
		
		int run;
        do {
            System.out.print("Ingrese Rut del Profesional, sin puntos ni guion: ");
            run = entrada.nextInt();
        } while (run > 0 && run < 99999999);

        entrada.nextLine(); // Limpiar el buffer de entrada

        String nombres;
        do {
            System.out.print("Ingrese Nombres del Profesional (min. 5 caracteres, max. 30): ");
            nombres = entrada.nextLine();
        } while (nombres.length() < 5 || nombres.length() > 30);

        String apellidos;
        do {
            System.out.print("Ingrese Apellidos del Profesional (min. 5 caracteres, max. 30): ");
            apellidos = entrada.nextLine();
        } while (apellidos.length() < 5 || apellidos.length() > 30);

        LocalDate fechaNacimiento;
        do {
            System.out.print("Ingrese fecha de nacimiento del Profesional (DD/MM/AAAA): ");
            String fechaString = entrada.next();
            entrada.nextLine(); // Limpiar el buffer de entrada

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            fechaNacimiento = LocalDate.parse(fechaString, formatter);
        } while (fechaNacimiento == null);
		
        String titulo;
        do {
            System.out.print("Ingrese Titulo del Profesional: ");
            titulo = entrada.nextLine();
            if (titulo.length() < 10 || titulo.length() > 50) {
                System.out.println("El título debe tener entre 10 y 50 caracteres.");
            }
        } while (titulo.length() < 10 || titulo.length() > 50);
		
		
        LocalDate diaIngreso;
        do {
            System.out.print("Ingrese fecha de Ingreso (DD/MM/AAAA): ");
            String fechaString = entrada.next();
            entrada.nextLine(); // Limpiar el buffer de entrada
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            diaIngreso = LocalDate.parse(fechaString, formatter);
        } while (diaIngreso == null);
        
		
		Profesional profesional = new Profesional(nombres,apellidos,fechaNacimiento,run,titulo,diaIngreso);
		contenedor.almacenarProfesional(profesional);
		contenedor.listarUsuarios();
		
	}
	
	public static void almacenarAdministrativo() {
		System.out.println("Has seleccionado la opcion 3");
		
		
		int run;
        do {
            System.out.print("Ingrese Rut del Administrativo, sin puntos ni guion: ");
            run = entrada.nextInt();
        } while (run > 0 && run < 99999999);

        entrada.nextLine(); // Limpiar el buffer de entrada

        String nombres;
        do {
            System.out.print("Ingrese Nombres del Administrativo (min. 5 caracteres, max. 30): ");
            nombres = entrada.nextLine();
        } while (nombres.length() < 5 || nombres.length() > 30);

        String apellidos;
        do {
            System.out.print("Ingrese Apellidos del Administrativo (min. 5 caracteres, max. 30): ");
            apellidos = entrada.nextLine();
        } while (apellidos.length() < 5 || apellidos.length() > 30);

        LocalDate fechaNacimiento;
        do {
            System.out.print("Ingrese fecha de nacimiento del Administrativo (DD/MM/AAAA): ");
            String fechaString = entrada.next();
            entrada.nextLine(); // Limpiar el buffer de entrada

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            fechaNacimiento = LocalDate.parse(fechaString, formatter);
        } while (fechaNacimiento == null);
		
        String area;
        do {
        	System.out.print("Ingrese Area del Administrativo: ");
    		area = entrada.nextLine();
        } while (area.length() < 5 || area.length() > 20);

        String experienciaPrevia;
        do {
			System.out.print("Ingrese Experiencia previa: ");
			experienciaPrevia = entrada.nextLine();
        } while (experienciaPrevia.length() > 100);
		
		Administrativo administrativo = new Administrativo(nombres,apellidos,fechaNacimiento,run,area,experienciaPrevia);
		contenedor.almacenarAdministrativo(administrativo);
		contenedor.listarUsuarios();
	}

	public static void almacenarCapacitacion() {
		
		System.out.println("Has seleccionado la opcion 4");
		
		int run;
	    do {
	        System.out.print("Ingrese RUT, sin puntos ni guion: ");
	        run = entrada.nextInt();
	        if (run <= 0 || run > 99999999) {
	            System.out.println("El RUT debe ser un número mayor a cero y menor o igual a 99999999.");
	        }
	    } while (run <= 0 || run > 99999999);
		
	    String diaCapacitacion;
	    boolean diaValido;
	    do {
	        System.out.print("Ingrese día de la semana (lunes a domingo): ");
	        diaCapacitacion = entrada.next();
	        diaCapacitacion = diaCapacitacion.toLowerCase();
	        
	        diaValido = diaCapacitacion.equalsIgnoreCase("lunes") || diaCapacitacion.equalsIgnoreCase("martes")
	                || diaCapacitacion.equalsIgnoreCase("miercoles") || diaCapacitacion.equalsIgnoreCase("jueves")
	                || diaCapacitacion.equalsIgnoreCase("viernes") || diaCapacitacion.equalsIgnoreCase("sabado")
	                || diaCapacitacion.equalsIgnoreCase("domingo");
	        if (!diaValido) {
	            System.out.println("El día ingresado no es válido. Intente nuevamente.");
	        }
	    } while (!diaValido);
		
	    LocalTime horaCapacitacion = null;
	    boolean horaValida;
	    do {
	        System.out.print("Ingrese hora de la capacitación (HH:MM): ");
	        String horaString = entrada.next();
	        String[] partes = horaString.split(":");
	        String hora = partes[0];
	        String minuto = partes[1];
	        horaValida = true;
	        try {
	            int horaInt = Integer.parseInt(hora);
	            int minutoInt = Integer.parseInt(minuto);
	            if (horaInt < 0 || horaInt > 23 || minutoInt < 0 || minutoInt > 59) {
	                System.out.println("La hora ingresada no es válida. Intente nuevamente.");
	                horaValida = false;
	            } else {
	                horaCapacitacion = LocalTime.of(horaInt, minutoInt, 0);
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Formato de hora incorrecto. Intente nuevamente.");
	            horaValida = false;
	        }
	    } while (!horaValida);
	    
	    String lugar;
	    do {
	        System.out.print("Ingrese lugar de la capacitación: ");
	        lugar = entrada.nextLine();
	        if (lugar.length() < 10 || lugar.length() > 50) {
	            System.out.println("El lugar debe tener entre 10 y 50 caracteres.");
	        }
	    } while (lugar.length() < 10 || lugar.length() > 50);
	    
		int duracion;
		do {
		System.out.print("Ingrese duracion en horas de la Capacitacion: ");
		duracion = entrada.nextInt();
		}while(duracion>70);
		
	    int cantidadAsistentes;
	    do {
	        System.out.print("Ingrese cantidad de asistentes a la capacitación: ");
	        cantidadAsistentes = entrada.nextInt();
	        if (cantidadAsistentes <= 0 || cantidadAsistentes >= 1000) {
	            System.out.println("La cantidad de asistentes debe ser un número mayor a cero y menor a 1000.");
	        }
	    } while (cantidadAsistentes <= 0 || cantidadAsistentes >= 1000);
	    
		
		Capacitacion capacitacion = new Capacitacion(run,diaCapacitacion,horaCapacitacion,lugar,duracion,cantidadAsistentes);
		contenedor.almacenarCapacitacion(capacitacion);
		
	}
	
	public static void eliminarUsuario() {
		System.out.println("Has seleccionado la opcion 5");
		System.out.print("Ingrese Rut del Cliente, sin puntos ni guion a Eliminar: ");
		int run = entrada.nextInt();
		contenedor.eliminarUsuario(run);
	}
	
	public static void listarUsuarios() {
		System.out.println("Has seleccionado la opcion 6");
		contenedor.listarUsuarios();
	}
	
	public static void listarUsuariosPorTipo() {
		System.out.println("Has seleccionado la opcion 7");
		System.out.print("Ingrese Tipo de Usuario a Listar: Cliente, Profesional o Administrativo.: ");
		String tipoUsuario = entrada.nextLine();
		contenedor.listarUsuariosPorTipo(tipoUsuario);
		
	}
	
	public static void listarCapacitaciones() {
		System.out.println("Has seleccionado la opcion 8");
		contenedor.listarCapacitaciones();
	}
}
