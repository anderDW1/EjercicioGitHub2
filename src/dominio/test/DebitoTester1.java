package dominio.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import dominio.Cuenta;
import dominio.Debito;
import java.util.Date;

class DebitoTester1  extends TestCase{

	Debito debito;
	Cuenta cuenta;
	
	public DebitoTester1(String sTestName)
	{
		
		super(sTestName);
		
	}
	public void setUp() throws Exception
	{
		cuenta=new Cuenta("0001.0002.12.1234567890","Fulano de tal");
		cuenta.ingresar(1000.0);
		Date hoy=new Date();
		long tiempo=Long.parseLong("12096000000");
		Date fecha=new Date(hoy.getTime()+tiempo);//Caduca en 4 años
		tarjeta=new Debito("1234567890123456", "Fulano de Tal", fecha, 1000.0); 
		tarjeta.setCuenta(cuenta);

		
	}
	
	public void tearDown() throws Exception
	{
		
		
	}
	
	public void testRetirar1000()
	{
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		junit.swingui.TestRunner.run(CuentaTester1.class);
	}
	
	

}
