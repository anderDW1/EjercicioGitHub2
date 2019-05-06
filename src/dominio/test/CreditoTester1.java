package dominio.test;

import java.util.Date;


import org.junit.jupiter.api.Assertions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import dominio.Credito;
import dominio.Cuenta;
/**
 * JUnits para testear la clase Credito
 * @author Xabier
 *
 */
public class CreditoTester1 extends TestCase{

	
	Cuenta cuenta;
	Credito tarjeta;
	
	public CreditoTester1(String sTestName)
	{
		
		super(sTestName);
		
	}
	
	/**
	 * Metodo para inicializar una cuenta y una tarjeta para realizar los JUnit
	 * 
	 */
	public void setUp() throws Exception
	{
		
		cuenta=new Cuenta("0001.0002.12.1234567890","Fulano de tal");
		cuenta.ingresar(1000.0);
		Date hoy=new Date();
		
		long tiempo=Long.parseLong("12096000000");
		Date fecha=new Date(hoy.getTime()+tiempo);//Caduca en 4 años
		tarjeta=new Credito("1234567890123456", "Fulano de Tal", fecha, 1000.0); //1000€ de credito
		tarjeta.setCuenta(cuenta);
		
	}
	
	public void tearDown() throws Exception
	{
		
		
		
	}
	
	/**
	 * Prueba de JUnit para testear el metodo Ingresar de la clase Credito
	 * @throws Exception
	 */

	public void testIngresar500() throws Exception
	{

		tarjeta.ingresar(500);
		Assertions.assertEquals(tarjeta.getSaldo(),500);

		
	}
	
	/**
	 * Prueba de JUnit para testear el metodo Retirar de la clase Credito
	 * @throws Exception
	 */
	public void testRetirar300() throws Exception
	{

		tarjeta.retirar(200);
		Assertions.assertEquals(tarjeta.getCreditoDisponible(),990);
	}
	
	/**
	 * Prueba de JUnit para testear el metodo Liquidar de la clase Credito
	 * @throws Exception
	 */
	public void testLiquidar()
	{
		
		tarjeta.liquidar(5, 2019);
		Assertions.assertEquals(tarjeta.getSaldo(),0);
		
	}
	

	public static void main(String args[])
	{
		
		//junit.swingui.TestRunner.run(CreditoTester1.class);
		 junit.textui.TestRunner.run(CreditoTester1.class);
		
		
	}
	
	

}