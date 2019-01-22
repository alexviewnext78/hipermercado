<<<<<<< HEAD
package com.cursogit.hipermercado.productos;

import java.util.List;

import com.cursogit.hipermercado.productos.IProductoBase;

public class ProductoBaseImpl implements IProductoBase {
	
	private String codigo;
	private String nombre;
	private String precio;
	private String stock;
	
	public void setStock(String stock) {
		this.stock=stock;
	}
	
	public String getStock() {
		return stock;
	}
	
	
	
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



	public String getPrecio() {
		return precio;
	}



	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();		
		strBuffer.append("              == = = ===== ").append(codigo).append(" \n");
		strBuffer.append("                             NOMBRE    ").append(nombre).append(" \n");
		strBuffer.append("                             PRECIO    ").append(precio).append(" \n");				
		return strBuffer.toString();
	}





	@Override
	public String getTextProductoToPrint() {
		return this.toString();
	}
	
	
	
	

}
=======
package com.cursogit.hipermercado.productos;

import java.util.List;

import com.cursogit.hipermercado.productos.IProductoBase;

public class ProductoBaseImpl implements IProductoBase {
	
	private String codigo;
	private String nombre;
	private long precio;
	
	
	
	
	
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



	public long getPrecio() {
		return precio;
	}



	public void setPrecio(long precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();		
		strBuffer.append("              == = = ===== ").append(codigo).append(" \n");
		strBuffer.append("                             NOMBRE    ").append(nombre).append(" \n");
		strBuffer.append("                             PRECIO    ").append(precio).append(" € \n");				
		return strBuffer.toString();
	}





	@Override
	public String getTextProductoToPrint() {
		return this.toString();
	}
	
	
	
	

}
>>>>>>> refs/remotes/origin/develop
