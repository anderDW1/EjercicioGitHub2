package dominio;

import java.util.Date;

/**
 * Clase Tarjeta
 * @author Ander Ezekiel
 *
 */

public abstract class Tarjeta {

	
	protected String nNumero, mTitular;
	protected Date mFechaDeCaducidad;
	
	protected Cuenta mCuentaAsociada;
	
	/**
	 * Constructor de la clase Tarjeta
	 * @param numero
	 * @param titular
	 * @param fechaCaducidad
	 */
	public Tarjeta(String numero, String titular, Date fechaCaducidad)
	{
		nNumero=numero;
		mTitular=titular;
		mFechaDeCaducidad=fechaCaducidad;
	
	}
	
	
	/**
	 * Método que establece una cuenta con la cuenta que se pasa como parametro
	 * @param c
	 */
	public void setCuenta(Cuenta c)
	{
		mCuentaAsociada=c;	
	}
	
	
	public abstract void retirar(double x) throws Exception;
	public abstract void ingresar(double x) throws Exception;
	public abstract void pagoEnEstablecimiento(String datos, double x) throws Exception;
	public abstract double getSaldo();
	

}
