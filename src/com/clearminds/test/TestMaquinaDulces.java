package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.maquina.Maquinadulces;

public class TestMaquinaDulces {
	public static void main(String[] args) {
        Maquinadulces maquina = new Maquinadulces();
        maquina.agregarCelda(new Celda("A"));
        maquina.agregarCelda(new Celda("B"));
        maquina.agregarCelda(new Celda("C"));
        maquina.agregarCelda(new Celda("D"));
        maquina.mostrarConfiguracion();
    }
}
