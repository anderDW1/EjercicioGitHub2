package dominio;

import java.util.Date;

public abstract class Tarjeta {

	
	protected String nNumero, mTitular;
	protected Date mFechaDeCaducidad;
	
	
	/**
	 * Comment here
	 * @param args
	 */
	
	
	
	
	protected Cuenta mCuentaAsociada;
	
	public Tarjeta(String numero, String titular, Date fechaCaducidad)
	{
		nNumero=numero;
		mTitular=titular;
		mFechaDeCaducidad=fechaCaducidad;
	
	}
	
	public void setCuenta(Cuenta c)
	{
		
		mCuentaAsociada=c;
		
		
	}
	
	
	public abstract void retirar(double x) throws Exception;
	public abstract void ingresar(double x) throws Exception;
	public abstract void pagoEnEstablecimiento(String datos, double x) throws Exception;
	public abstract double getSaldo();
	

}
