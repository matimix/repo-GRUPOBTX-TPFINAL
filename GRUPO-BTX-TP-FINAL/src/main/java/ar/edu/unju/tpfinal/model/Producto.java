package ar.edu.unju.tpfinal.model;

import org.springframework.stereotype.Component;

@Component
public class Producto {
	private int codigo;
	private String nombre;
	private String linea;
	private String escala;
	private String vendedor;
	private String descripcion;
	private Number cantidadStock;
	private double precio;
	
	public Producto() {
		//constructor por defecto 
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}

	/**
	 * @param linea the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}

	/**
	 * @return the escala
	 */
	public String getEscala() {
		return escala;
	}

	/**
	 * @param escala the escala to set
	 */
	public void setEscala(String escala) {
		this.escala = escala;
	}

	/**
	 * @return the vendedor
	 */
	public String getVendedor() {
		return vendedor;
	}

	/**
	 * @param vendedor the vendedor to set
	 */
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the cantidadStock
	 */
	public Number getCantidadStock() {
		return cantidadStock;
	}

	/**
	 * @param cantidadStock the cantidadStock to set
	 */
	public void setCantidadStock(Number cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", linea=" + linea + ", escala=" + escala
				+ ", vendedor=" + vendedor + ", descripcion=" + descripcion + ", cantidadStock=" + cantidadStock
				+ ", precio=" + precio + "]";
	}


	


}
