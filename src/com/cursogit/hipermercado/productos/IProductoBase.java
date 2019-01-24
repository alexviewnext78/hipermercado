package com.cursogit.hipermercado.productos;

import java.util.List;

public interface IProductoBase {
	
	int IVA = 12;
	
	public String getCodigo();
	
	public String getTextProductoToPrint();
	
}
