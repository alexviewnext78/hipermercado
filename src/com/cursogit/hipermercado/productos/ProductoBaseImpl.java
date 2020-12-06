package com.cursogit.hipermercado.productos;

import java.util.List;

import com.cursogit.hipermercado.productos.IProductoBase;

public class ProductoBaseImpl implements IProductoBase {
	
	private String codigo;
	private String nombre;
	private Float precio;
	
	
	
	
	
	public ProductoBaseImpl(String codigo) {
		super();
		this.codigo = codigo;
	}


	

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public Float getPrecio() {
		return precio;
	}



	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();		
		strBuffer.append("              == = = ===== ").append(codigo).append(" \n");
		strBuffer.append("                             NOMBRE DEL PRODUCTO:   ").append(nombre).append(" \n");
		strBuffer.append("                             PRECIO DEL PRODUCTO:   ").append(precio.toString()).append(" \n");				
		return strBuffer.toString();
	}





	@Override
	public String getTextProductoToPrint() {
		return this.toString();
	}
	
	
	
	

}

package com.cursogit.hipermercado.productos;

import java.util.List;

import com.cursogit.hipermercado.productos.IProductoBase;

public class ProductoBaseImpl implements IProductoBase {
	
	private String codigo;
	private String nombre;
	private Float precio;
	private Integer peso;
	private Long iva;
	
	
	
	
	
	public ProductoBaseImpl(String codigo) {
		super();
		this.codigo = codigo;
	}


	

	
	public Integer getPeso() {
		return peso;
	}





	public void setPeso(Integer peso) {
		this.peso = peso;
	}





	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void setIva(Long iva) {
		this.iva = iva;
	}



	public Float getPrecio() {
		return precio;
	}



	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();		
		strBuffer.append("              == = = ===== ").append(codigo).append(" \n");
		strBuffer.append("                             NOMBRE    ").append(nombre).append(" \n");
		strBuffer.append("                             PRECIO    ").append(precio).append(" � \n");				
		return strBuffer.toString();
	}





	@Override
	public String getTextProductoToPrint() {
		return this.toString();
	}
	
	
	@Override
	public Long getIva() {
		return iva;
	}
	

}

