package dominio.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

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
		tarjeta=new Credito("1234567890123456", "Fulano de Tal", fecha, 1000.0); //1000€ de credito
		tarjeta.setCuenta(cuenta);

		
	}
	
	public void tearDown() throws Exception
	{
		
		
	}
	
	public void testRetirar1000()
	{
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		junit.swingi.TestRunner.run(CuentaTester1.class);
	}
	
	

}
