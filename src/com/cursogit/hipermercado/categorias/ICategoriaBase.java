package com.cursogit.hipermercado.categorias;

import java.util.List;

import com.cursogit.hipermercado.productos.IProductoBase;

public interface ICategoriaBase {
	
	public List<IProductoBase> getProductos();
	
	public String getTextCategoriaToPrint();

<<<<<<< HEAD
	public Boolean esTemporal=true;
=======
	public Boolean esTemporal;
>>>>>>> refs/remotes/origin/develop

}
