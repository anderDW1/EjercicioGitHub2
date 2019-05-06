package dominio;

import java.util.Date;

public class Debito extends Tarjeta{
/**
 * Constructor de la clase debito, inicializa una tajeta de debito con un numero un titular y una fecha de caducidad
 * @param numero
 * @param titular
 * @param fechaCaducidad
 */
	public Debito(String numero, String titular, Date fechaCaducidad) {
		super(numero, titular, fechaCaducidad);
	}
	
	/**
	 * Metodo retirar que recibe una cantidad a retirar y muestra un mensaje con la cantidad retirada
	 * @param x es el operador 
	 */
	public void retirar(double x) throws Exception{
		this.mCuentaAsociada.retirar("Retirada en cajero automática", x);
	}
	
	/**
	 * Metodo ingresar que recibe una cantidad a ingresar y muestra un mensaje con la cantidad ingresada
	 * 
	 */
	public void ingresar(double x) throws Exception{
		this.mCuentaAsociada.ingresar("Ingreso en cajero automatico", x);
	}
	
	/**
	 * Metodo pagoEnEstablecimiento que recibe el nombre de la tienda 
	 * y una cantidad a retirar y muestra un mensaje con la tienda y la cantidad retirada
	 * 
	 */
	public void pagoEnEstablecimiento(String datos, double x) throws Exception{
		this.mCuentaAsociada.retirar("Compra en: "+datos,x);
	}
	
	/**
	 * Metodo getSaldo que devuelve el saldo disponible
	 * 
	 */
	public double getSaldo() {
		return mCuentaAsociada.getSaldo();
	}
	
	
}
