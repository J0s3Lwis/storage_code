package FigurasGeometricas;

import daw.com.*;

public class Rectangulo {

	private int color;
	private Punto centro;
	private double base;
	private double altura;
	
	public Rectangulo() {
		this.color = 0;
		this.base = 0.0;
		this.altura = 0.0;
		this.centro = new Punto();
	}	
	
	public Rectangulo(int color, Punto centro, double base, double altura) {
		this.color = color;
		this.centro = centro;
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(Rectangulo r) {
		this.color = r.color;
		this.base = r.base;
		this.altura = r.altura;
		this.centro = new Punto(r.centro);
	}


	public void mostrarDatos() {
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Base del rectángulo: " + this.base + "\n" +
								"Altura del rectángulo: " + this.altura+ "\n" +
								"Color del rectángulo: "+ String.valueOf(color) + "\n");
		centro.mostrarDatos();
	}
	
	/*
	 * Código duplicado
	 * Control de errores
	 * No usa métodos, los redefine
	 * No se ha leído la documentación de Teclado
	 * 
	 * Crear funciones para evitar código duplicado
	 * Modificar leerDatos() para cumplir especificaciones
	 * Usar los métodos adecuados para cada tipo
	 * Buscar un método para realizar conversiones seguras
	 */
	
	public double validarDouble(String msn) {
		
		double valor = 0.0;
		
		do {
			
			Pantalla.escribirString(msn);
			String entrada = Teclado.leerString();
				
			try {
				valor = Double.parseDouble(entrada);
			} catch (NumberFormatException e) {
				System.out.println("Dato ingresado incorrecto!");
				valor = -1;
			}
			
		} while (valor < 0.0);
		
		return valor;
	}
	
	public int validarInt(String msn) {
		
		int valor = 0;
		
		do {
			
			Pantalla.escribirString(msn);
			String entrada = Teclado.leerString();
				
			try {
				valor = Integer.parseInt(entrada);
			} catch (NumberFormatException e) {
				System.out.println("Dato ingresado incorrecto! - Intentelo nuevamente");
				valor = -1;
			}
			
		} while (valor < 0.0);
		
		return valor;
	}
	
	
	
	public void cambiarDatos() {
		
		this.altura = validarDouble("Indica el nuevo valor de la altura: ");
		this.base = validarDouble("Indica el nuevo valor de la base: ");
		this.color = validarInt("Indica el nuevo valor del color: ");
		centro.setX(validarInt("Indica el nuevo valor de la X del punto : "));
		centro.setY(validarInt("Indica el nuevo valor de la Y del punto : "));
		
		//Double.isNaN(Double.valueOf(alturaNueva));
	}
	
	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(int color) {
		this.color = color;
	}

	/**
	 * @return the centro
	 */
	public Punto getCentro() {
		return centro;
	}

	/**
	 * @param centro the centro to set
	 */
	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
