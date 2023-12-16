package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.Maquinadulces;

public class TestConsultarPrecio {
	public static void main(String[] args) {
		Maquinadulces maquina=new Maquinadulces();
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
		
		Producto producto=new Producto("KE34","Papitas",2.54);
		maquina.cargarProducto(producto, "B1", 4);
		
		System.out.println("Precio en B1:"+maquina.consultarPrecio("B1"));	
	}
}
