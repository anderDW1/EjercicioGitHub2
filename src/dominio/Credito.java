package dominio;

import java.util.Date;
import java.util.Vector;

public class Credito extends Tarjeta{

	protected double mCredito;
	protected Vector mMovimientos;
	
	public Credito(String numero, String titular, Date fechaCaducidad, double credito) {
		super(numero, titular, fechaCaducidad);
		mCredito = credito;
		mMovimientos = new Vector();
	}
	
	public void retirar(double x) throws Exception {
		
		Movimiento m = new Movimiento();
		m.setConcepto("Retirada en cajero automatico");
		x = (x*0.05<3.0 ? 3: x*0.05); //A�adimos una comision de un 5%, minimo de 3 euros
		m.setImporte(x);
		mMovimientos.addElement(m);
		if(x>getCreditoDisponible())
			throw new Exception("Cr�dito insuficiente");
	}
	
	public void ingresar(double x) throws Exception {
		
		Movimiento m = new Movimiento();
		m.setConcepto("Ingreso en cuenta asociada(cajero autom�tico)");
		m.setImporte(x);
		mMovimientos.addElement(m);
		mCuentaAsociada.ingresar(x);
	}
	
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		
		Movimiento m = new Movimiento();
		m.setConcepto("Compra a cr�dito en: "+datos);
		m.setImporte(x);
		mMovimientos.addElement(m);	
	}
	
	
	public double getSaldo() {
		double r=0.0;
		for(int i=0; i<this.mMovimientos.size(); i++) {
			Movimiento m = (Movimiento) mMovimientos.elementAt(i);
			r+=m.getImporte();
		}
		return r;
	}

	
	public double getCreditoDisponible() {
		return mCredito-getSaldo();
	}
	
	
	public void liquidar(int mes, int anio) {
		
		Movimiento liq = new Movimiento();
		liq.setConcepto("Liquidaci�n de operaciones tarj. cr�dito, "+(mes+1)+" de "+(anio+1900));
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
