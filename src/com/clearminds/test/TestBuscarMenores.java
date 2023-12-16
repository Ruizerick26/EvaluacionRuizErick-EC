package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.Maquinadulces;

public class TestBuscarMenores {
	public static void main(String[] args) {
		Maquinadulces maquina = new Maquinadulces();
		maquina.agregarCelda(new Celda("A"));
		maquina.agregarCelda(new Celda("B"));
		maquina.agregarCelda(new Celda("C"));
		maquina.agregarCelda(new Celda("D"));
		maquina.agregarCelda(new Celda("E"));
		maquina.agregarCelda(new Celda("F"));
		
		Producto p1 = new Producto("AS1","Caramelos",0.25);
		Producto p2 = new Producto("AS2","Papas",0.55);
		Producto p3 = new Producto("AS3","Galletas",0.35);
		Producto p4 = new Producto("AS4","Chicles",0.15);
		Producto p5 = new Producto("AS5","Doritos",0.65);
		Producto p6 = new Producto("AS6","Chocolate",0.40);
		
		maquina.cargarProducto(p1, "A", 3);
		maquina.cargarProducto(p2, "B", 3);
		maquina.cargarProducto(p3, "C", 3);
		maquina.cargarProducto(p4, "D", 3);
		maquina.cargarProducto(p5, "E", 3);
		maquina.cargarProducto(p6, "F", 3);
		
		ArrayList<Producto> lista = maquina.buscarMenores(0.5);
		System.out.println("Productos menores:"+ lista.size());
		for(Producto listas: lista) {
			System.out.println("Nombre: "+listas.getNombre() + "Precio: " + listas.getPrecio());
		}
		
		
	}
	
}
