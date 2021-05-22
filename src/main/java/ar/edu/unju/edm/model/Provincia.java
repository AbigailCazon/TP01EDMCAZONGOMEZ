package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Provincia {
	private int codigo;
	private String nombre;
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
