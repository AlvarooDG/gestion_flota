package interfaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import controladores.ControladorCamiones;
import modelos.Camion;
import modelos.CamionEspecial;
import modelos.CamionLargaDistancia;
import modelos.Chofer;
import modelos.Ruta;

public class Main {
	public static void main(String[] args) {
		ControladorCamiones controlador = new ControladorCamiones();
		mostrarMenuPrincipal(controlador);
		 /*HashSet<String> destinos = controlador.devolverDestinos("123123");
		 ArrayList<String> lista = new ArrayList<>(destinos);
		 for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}*/
		
	}
	
	private static void usarHerencia() {
		//Chofer chofer = new Chofer("Alain", "Valladolid", "DNI");
		
		Camion camion = new Camion("1234");	
		Camion largaDistancia = new CamionLargaDistancia("5247", 200, 50);
		Camion especial = new CamionEspecial("7584", "12/05/2015");
		
		ArrayList<Camion> listadoCamiones = new ArrayList<Camion>();
		listadoCamiones.add(camion);
		listadoCamiones.add(largaDistancia);
		listadoCamiones.add(especial);
		
		 HashMap<String, Camion> mapaCamiones = new HashMap<>();
		 mapaCamiones.put(camion.getMatricula(), camion);
		 mapaCamiones.put(largaDistancia.getMatricula(), largaDistancia);
		 mapaCamiones.put(especial.getMatricula(), especial);
	}

	private static void mostrarMenuPrincipal(ControladorCamiones controlador) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menú:");
		System.out.println("1. Ingresar datos de un camión");
		System.out.println("2. Salir");
		System.out.print("Seleccione una opción: ");
		int opcion = scanner.nextInt();
		scanner.nextLine(); // Consumir el salto de línea después de nextInt()
		switch (opcion) {
		case 1:
			mostrarMenuIngresarDatos(controlador);
			break;
		case 2:
			break;
		default:
			System.out.println("Opción no válida. Por favor, ingrese 1 o 2.");
			break;
		}
		scanner.close();
	}

	private static void mostrarMenuIngresarDatos(ControladorCamiones controlador) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la matrícula del camión:");
		String matricula = scanner.nextLine();
		System.out.println("Ingrese los datos del chofer:");
		System.out.println("Nombre:");
		String nombre = scanner.nextLine();
		System.out.println("DNI:");
		String dni = scanner.nextLine();
		System.out.println("Dirección:");
		String direccion = scanner.nextLine();
		Chofer chofer = new Chofer(nombre, direccion, dni);
		Camion camion = new Camion(matricula, chofer);
		controlador.agregarCamion(camion);
		boolean continuarRuta = true;
		do {
			System.out.println("Desea agregar alguna ruta: Si(1), No(2)?");
			int opcion = scanner.nextInt();
			scanner.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("Origen:");
				String origen = scanner.nextLine();
				System.out.println("Destino:");
				String destino = scanner.nextLine();
				Ruta ruta = new Ruta(origen, destino);
				camion.agregarRuta(ruta);
				break;
			case 2:
				continuarRuta = false;
				break;
			default:
				System.out.println("Opción no válida. Por favor, ingrese 1 o 2.");
				break;
			}
		} while(continuarRuta);
		scanner.close();
	}
}
