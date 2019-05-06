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
	 * M�todo que devuelve el importe del movimiento
	 * @return el importe del movimiento
	 */
	public double getImporte() {
		return mImporte;
	}

	
	/**
	 * M�todo que devuelve el concepto del importe
	 * @return el concepto del movimiento
	 */
	public String getConcepto() {
		return mConcepto;
	}

	/**
	 * M�todo que establece el concepto del importe
	 * @param newMConcepto
	 */
	public void setConcepto(String newMConcepto) {
		this.mConcepto = newMConcepto;
	}

	/**
	 * M�todo que devuelve la fecha
	 * @return devuelve la fecha
	 */
	public Date getFecha() {
		return mFecha;
	}

	/**
	 * M�todo que establece una fecha nueva
	 * @param newMFecha
	 */
	public void setFecha(Date newMFecha) {
		this.mFecha = newMFecha;
	}

	/**
	 * M�todo que establece un importe
	 * @param newMImporte
	 */
	public void setImporte(double newMImporte) {
		this.mImporte = newMImporte;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
