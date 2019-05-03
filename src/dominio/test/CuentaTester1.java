package dominio.test;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.jupiter.api.Assertions;

import dominio.Cuenta;

public class CuentaTester1 extends TestCase{

	Cuenta cuenta;
	
	
	public CuentaTester1(String sTestName)
	{
		
		super(sTestName);
		
		
	}
	
	public void setUp() throws Exception
	{
		
		cuenta= new Cuenta("0001.0002.12.1234567890","Fulano de tal");
		cuenta.ingresar(1000);
		
		
	}
	
	public void tearDown() throws Exception
	{
		
		
	}
	public void testIngresar1000() throws Exception 
	{
		cuenta.ingresar(1000);
		Assertions.assertEquals(cuenta.getSaldo(),2000);
		
	}
	public void testRetirar1000() throws Exception 
	{
		cuenta.retirar(1000);
		Assertions.assertEquals(cuenta.getSaldo(),0);
	}
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
