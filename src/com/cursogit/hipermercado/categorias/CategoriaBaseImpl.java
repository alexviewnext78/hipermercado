package com.cursogit.hipermercado.categorias;

import java.util.List;

import com.cursogit.hipermercado.productos.IProductoBase;

public class CategoriaBaseImpl implements ICategoriaBase {
	
	private String nombre;
	private List<IProductoBase> productos;
	private Boolean esTemporal;
	
	
	public CategoriaBaseImpl(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public List<IProductoBase> getProductos() {
		return this.productos;
	}
	
	@Override
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("        \n");		
		strBuffer.append("        == = =  CATEGORIA  ").append(nombre).append("= = = = = = = = = = = = = = = =  \n");
		strBuffer.append("        -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - \n");
		if (productos==null || productos.size()==0) {
			strBuffer.append("              == = =  SIN PRODUCTOS  = = =  \n");
		} else {
			strBuffer.append("              == = =  PRODUCTOS: \n");
			for (IProductoBase iProductoBase : productos) {
				strBuffer.append(iProductoBase.getTextProductoToPrint());
			}
		}
		strBuffer.append("        == = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =  \n");
		return strBuffer.toString();
	}

	public void setProductos(List<IProductoBase> productos) {
		this.productos = productos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEsTemporal() {
		return esTemporal;
	}

	public void setEsTemporal(Boolean esTemporal) {
		this.esTemporal = esTemporal;
	}

	

	@Override
	public String getTextCategoriaToPrint() {
		return this.toString();
	}
	
	
	

}
