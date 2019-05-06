package dominio;

import java.util.Date;
/**
 * Clase Movimiento
 * @author Ander Ezekiel
 */


public class Movimiento {

	protected String mConcepto;
	protected Date mFecha;
	protected double mImporte;
	
	/**
	 * Constructor para la clase Movimiento
	 */
	public Movimiento() {
		mFecha = new Date();
	}
	
	
	/**
	 * Método que devuelve el importe del movimiento
	 * @return el importe del movimiento
	 */
	public double getImporte() {
		return mImporte;
	}

	
	/**
	 * Método que devuelve el concepto del importe
	 * @return el concepto del movimiento
	 */
	public String getConcepto() {
		return mConcepto;
	}

	/**
	 * Método que establece el concepto del importe
	 * @param newMConcepto
	 */
	public void setConcepto(String newMConcepto) {
		this.mConcepto = newMConcepto;
	}

	/**
	 * Método que devuelve la fecha
	 * @return devuelve la fecha
	 */
	public Date getFecha() {
		return mFecha;
	}

	/**
	 * Método que establece una fecha nueva
	 * @param newMFecha
	 */
	public void setFecha(Date newMFecha) {
		this.mFecha = newMFecha;
	}

	/**
	 * Método que establece un importe
	 * @param newMImporte
	 */
	public void setImporte(double newMImporte) {
		this.mImporte = newMImporte;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
