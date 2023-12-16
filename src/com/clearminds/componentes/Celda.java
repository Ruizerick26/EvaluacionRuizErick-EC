package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int Stock;
	private String codigo;
	
	//------------------
	public Celda(String codigo) {
		this.codigo = codigo;
	}
	//-----------------

	public Producto getProducto() {
		return producto;
	}
	public int getStock() {
		return Stock;
	}
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setStock(int Stock) {
		this.Stock = Stock;
	}
	//-------------------
	public void ingresarProducto(Producto pr, int Stock) {
		this.producto = pr;
		this.Stock = Stock;
	}
	
	
}
