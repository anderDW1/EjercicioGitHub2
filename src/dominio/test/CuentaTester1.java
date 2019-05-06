package dominio.test;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.jupiter.api.Assertions;

import dominio.Cuenta;
/**
 * JUnits para testear la clase Cuenta
 * @author Xabier
 *
 */
public class CuentaTester1 extends TestCase{

	Cuenta cuenta;
	
	
	public CuentaTester1(String sTestName)
	{
		
		super(sTestName);
		
		
	}
	
	/**
	 * Metodo para inicializar una cuenta para realizar los JUnit
	 * 
	 */
	
	public void setUp() throws Exception
	{
		
		cuenta= new Cuenta("0001.0002.12.1234567890","Fulano de tal");
		cuenta.ingresar(1000);
		
		
	}
	
	public void tearDown() throws Exception
	{
		
		
	}
	
	/**
	 * Prueba de JUnit para testear el metodo Ingresar de la clase Cuenta
	 * @throws Exception
	 */
	public void testIngresar1000() throws Exception 
	{
		cuenta.ingresar(1000);
		Assertions.assertEquals(cuenta.getSaldo(),2000);
		
	}
	/**
	 * Prueba de JUnit para testear el metodo Retirar de la clase Cuenta
	 * @throws Exception
	 */
	public void testRetirar1000() throws Exception 
	{
		cuenta.retirar(1000);
		Assertions.assertEquals(cuenta.getSaldo(),0);
	}
	/**
	 * Prueba de JUnit para testear el metodo Ingresar y Retirar a la vez de la clase Cuenta
	 * @throws Exception
	 */
	public void testIngresoYRetirada() throws Exception 
	{
		cuenta.ingresar(1000);
		cuenta.retirar(500);
		Assertions.assertEquals(cuenta.getSaldo(),1500);
		
	}
	
	public static void main(String[] args) {
		
		//junit.swingui.TestRunner.run(CuentaTester1.class);
		 junit.textui.TestRunner.run(CuentaTester1.class);
	}
	
	
}
