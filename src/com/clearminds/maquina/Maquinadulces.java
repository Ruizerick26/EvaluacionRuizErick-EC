package com.clearminds.maquina;
import java.util.ArrayList;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class Maquinadulces {
	private ArrayList <Celda> Celdas = new ArrayList<Celda>();
	private double saldo;
	
	//------------------
	public void agregarCelda(Celda ced) {
		Celdas.add(ced);
	}
	public void mostrarConfiguracion() {
		for(Celda celdaI: Celdas) {
			System.out.println("-----------------");
			System.out.println("Celda " + celdaI.getCodigo());
		}
	}
	public Celda buscarCelda(String codigo) {
		Celda celdaEn = null;
		for(Celda celdaB: Celdas) {
			if(celdaB.getCodigo().equals(codigo)) {
				celdaEn = celdaB;
			}
		}
		return celdaEn;
	}
	public void cargarProducto(Producto pr, String codigoC,int StockI) {
		Celda celdaRecuperada = buscarCelda(codigoC);
		celdaRecuperada.ingresarProducto(pr, StockI);
	}
	public void mostrarProductos() {
		for(Celda celdaP: Celdas) {
			System.out.println("---------------");
			System.out.println("Celda " + celdaP.getCodigo());
			System.out.println("Stock actual " + celdaP.getStock());
			if(celdaP.getProducto() != null) {
			System.out.println("Nombre-P " + celdaP.getProducto().getNombre() );
			System.out.println("Precio " + celdaP.getProducto().getPrecio());
			}
		}
		System.out.println("El saldo de la maquina es: " + saldo);
	}
	public Producto buscarProductoEnCelda(String codigoC) {
		Producto productoE = null;
		for(Celda celdaB: Celdas) {
			if(celdaB.getCodigo().equals(codigoC)) {
				productoE = celdaB.getProducto();
			}
		}
		return productoE;
	}
	public Double consultarPrecio(String codigoC) {
		double precio =0 ;
		for(Celda celdaB: Celdas) {
			if(celdaB.getCodigo().equals(codigoC)){
				if(celdaB.getProducto() != null) {
				precio = celdaB.getProducto().getPrecio();
				}else {
					precio = 0;
				}
			}
		}
		return precio;
	}
	public Celda buscarCeldaProducto(String codigoP) {
		Celda celdaE = null;
		for(Celda celdaB: Celdas) {
			if(celdaB.getProducto() != null) {
				if(celdaB.getProducto().getCodigo().equals(codigoP)) {
					celdaE = celdaB;
				}
			}
		}
		return celdaE;		
	}
	public void incrementarProductos(String codigoP, int aum) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoP);
		celdaEncontrada.setStock(celdaEncontrada.getStock() +aum);
	}
	public void vender(String codigoC) {
		Celda celdaE = buscarCelda(codigoC);
		if(celdaE != null) {
			celdaE.setStock(celdaE.getStock() -1);
			if(celdaE.getProducto() != null) {
				saldo = saldo + celdaE.getProducto().getPrecio();
			}
		}else {
			System.out.println("Celda no encontrada");
		}
		mostrarProductos();
	}
	public double venderConCambio(String codigoC, double ing) {
		double cambio = 0;
		Celda celdaE = buscarCelda(codigoC);
		if(celdaE != null) {
			celdaE.setStock(celdaE.getStock() -1);
			if(celdaE.getProducto() != null) {
				saldo = saldo + ing;
				cambio = ing - celdaE.getProducto().getPrecio();
				saldo = saldo - cambio;
			}
			return cambio;
		}else {
			System.out.println("Celda no encontrada");
			return 0;
		}
	}
	public ArrayList <Producto> buscarMenores(double limite){
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Producto p1 = null;
		for(Celda celdaB:Celdas) {
			if(celdaB.getProducto() != null) {
				if(celdaB.getProducto().getPrecio() < limite) {
					p1 = celdaB.getProducto();
					menores.add(p1);
				}
			}
		}
		return menores;
	}
}
