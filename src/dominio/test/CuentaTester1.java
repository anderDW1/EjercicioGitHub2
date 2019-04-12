package dominio.test;

import junit.framework.TestCase;

public class CuentaTester1 extends TestCase{

	Cuenta cuenta;
	
	
	public CuentaTester1(String sTestName)
	{
		
		super(sTestName);
		
		
	}
	
	public void setUp() throws Exception
	{
		
		cuenta= new Cuenta("0001.0002.12.1234567890","Fulano de tal");
		
		
	}
	
	public void tearDown() throws Exception
	{
		
		
	}
	public void testIngresar1000() 
	{
		
		
	}
	public void testRetirar1000() 
	{
		
		
	}
	public void testIngresoYRetirada() 
	{
		
		
	}
	
	public static void main(String[] args) {
		
		junit.swingi.TestRunner.run(CuentaTester1.class);
	}
	
	
}
