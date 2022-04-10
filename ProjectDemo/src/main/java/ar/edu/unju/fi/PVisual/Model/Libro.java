package ar.edu.unju.fi.PVisual.Model;

public class Libro {
	private String nombre;
	private String Portada;
	private String autor;
	
	//contructor
	public Libro() {
		super();
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPortada() {
		return Portada;
	}
	public void setPortada(String portada) {
		Portada = portada;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

}
