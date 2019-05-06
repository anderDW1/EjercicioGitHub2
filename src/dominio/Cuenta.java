package dominio;

import java.util.Vector;
/**
 * Clase Cuenta
 * @author Ander Ezekiel
 *
 */
public class Cuenta {

	protected String mNumero;
	protected String mTitular; 
	protected Vector mMovimientos;
	
	/**
	 * Contructor para crear una cuenta
	 * @param numero
	 * @param titular
	 */
	public Cuenta(String numero, String titular) {
	
		mNumero = numero;
		mTitular = titular;
		mMovimientos = new Vector();	
	}
	
	
	/**
	 * Método ingresar, ingresa la cantidad pasada como parametro
	 * @param x
	 * @throws Exception
	 * @return ingresa la cantidad pasada como parametro en la cuenta
	 */
	public void ingresar (double x) throws Exception {
		
		if(x<=0)
			throw new Exception ("No se puede ingresar una cantidad negativa");
		Movimiento m = new Movimiento();
		m.setConcepto("Ingreso en efectivo");
		m.setImporte(x);
		this.mMovimientos.addElement(m);
	}
	
	
	/**
	 * Método retirar, retira la cantidad pasada como parametro
	 * @param x
	 * @throws Exception
	 * @return "No se puede retirar una cantidad negativa" en caso de que la cantidad sea negativa, "Retirada de efectivo" en caso de que se haya retirado con exito y "Saldo insuficiente" en caso de no haber saldo suficiente
	 */
	public void retirar(double x) throws Exception {
		
		if(x<=0)
			throw new Exception ("No se puede retirar una cantidad negativa");
		if(getSaldo()<x)
			throw new Exception("Saldo insuficiente");
		Movimiento m = new Movimiento();
		m.setConcepto("Retirada de efectivo");
		m.setImporte(-x);
		this.mMovimientos.addElement(m);
	}
	
	
	/**
	 * Método ingresar, ingresa la cantidad y el concepto pasado como parametro
	 * @param concepto
	 * @param x
	 * @throws Exception
	 * @return "No se puede retirar una cantidad negativa" en caso de que la cantidad sea negativa, sino realiza el ingreso con el concepto pasado como parametro
	 */
	public void ingresar(String concepto, double x) throws Exception {
		
		if(x<=0)
			throw new Exception ("No se puede ingresar una cantidad negativa");
		Movimiento m = new Movimiento();
		m.setConcepto(concepto);
		m.setImporte(x);
		this.mMovimientos.addElement(m);
	}
	
	/**
	 * Método retirar, retira la cantidad pasada como parametro pero con un concepto
	 * @param concepto
	 * @param x
	 * @throws Exception
	 * @return "No se puede retirar una cantidad negativa" en caso de que la cantidad sea negativa, "Retirada de efectivo" en caso de que se haya retirado con exito, en caso de que ninguna de las dos anteriores se hayan cumplido retira la cantidad recibida con el concepto pasado como parametro
	 */
	public void retirar(String concepto, double x)  throws Exception {
		
		if(x<=0)
			throw new Exception ("No se puede retirar una cantidad negativa");
		if(getSaldo()<x)
			throw new Exception("Saldo insuficiente");
		Movimiento m = new Movimiento();
		m.setConcepto(concepto);
		m.setImporte(-x);
		this.mMovimientos.addElement(m);
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
	 * Método para añadir un movimiento
	 * @param m
	 */
	public void addMovimiento(Movimiento m) {
		
		mMovimientos.addElement(m);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

