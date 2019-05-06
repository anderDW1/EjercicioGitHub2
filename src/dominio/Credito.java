package dominio;

import java.util.Date;
import java.util.Vector;

/**
 * Clase Credito
 * @author Ander Ezekiel
 *
 */

public class Credito extends Tarjeta{

	protected double mCredito;
	protected Vector mMovimientos;
	
	/**
	 * Contructor para la clase de Credito, iniciliza una tarjeta de credito con un numero, un titular, una fecha de caducidad y el credito de la misma tarjeta
	 * @param numero
	 * @param titular
	 * @param fechaCaducidad
	 * @param credito
	 */
	public Credito(String numero, String titular, Date fechaCaducidad, double credito) {
		super(numero,titular,fechaCaducidad);
		mCredito = credito;
		mMovimientos = new Vector();
	}
	
	/**
	 * Método retirar, retira de la tarjeta la cantidad de dinero que se le pase como parametro
	 * @return devuelve "Credito insuficiente" en caso de no haber un credito suficiente, y en caso de haberlo retira el numero de dinero que se pase como parametro
	 */
	public void retirar(double x) throws Exception {
		
		Movimiento m = new Movimiento();
		m.setConcepto("Retirada en cajero automatico");
		x = (x*0.05<3.0 ? 3: x*0.05); //Añadimos una comision de un 5%, minimo de 3 euros
		m.setImporte(x);
		mMovimientos.addElement(m);
		if(x>getCreditoDisponible())
			throw new Exception("Crédito insuficiente");
	}
	
	
	/**
	 * Método ingresar, ingresa en la tarjeta la cantidad pasada como parametro
	 * @return ingresa el dinero pasado como parametro
	 */
	public void ingresar(double x) throws Exception {
		
		Movimiento m = new Movimiento();
		m.setConcepto("Ingreso en cuenta asociada(cajero automático)");
		m.setImporte(x);
		mMovimientos.addElement(m);
		mCuentaAsociada.ingresar(x);
		
	}
	
	
	/**
	 * Método pagoEnEstablecimiento
	 * @return 
	 */
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		
		Movimiento m = new Movimiento();
		m.setConcepto("Compra a crédito en: "+datos);
		m.setImporte(x);
		mMovimientos.addElement(m);	
	}
	
	
	/**
	 * Método para obtener el saldo de la tarjeta
	 * @return devuelve el saldo 
	 */
	public double getSaldo() {
		double r=0.0;
		for(int i=0; i<this.mMovimientos.size(); i++) {
			Movimiento m = (Movimiento) mMovimientos.elementAt(i);
			r+=m.getImporte();
		}
		return r;
	}

	
	/**
	 * Método para obtener el credito disponible en la tarjeta
	 * @return el credito disponible en la tarjeta
	 */
	public double getCreditoDisponible() {
		return mCredito-getSaldo();
	}
	
	
	/**
	 * Método liquidar, realiza una liquidacion de operacion en la tarjeta de credito dependiendo del mes y año que se pasen como parametro
	 * @param mes
	 * @param anio
	 * @return Devuelve el movimiento realizado
	 */
	public void liquidar(int mes, int anio) {
		
		Movimiento liq = new Movimiento();
		liq.setConcepto("Liquidación de operaciones tarj. crédito, "+(mes+1)+" de "+(anio+1900));
		double r=0.0;
		for(int i=0; i<this.mMovimientos.size(); i++) {
			Movimiento m = (Movimiento) mMovimientos.elementAt(i);
			if(m.getFecha().getMonth()+1 == mes && m.getFecha().getYear()+1900 == anio)
				r+=m.getImporte();
		}
		liq.setImporte(r);
		if(r!=0)
			mCuentaAsociada.addMovimiento(liq);
		
	}

	
	
}
