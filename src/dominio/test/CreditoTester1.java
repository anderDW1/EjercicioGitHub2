package dominio.test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class CreditoTester1 extends TestCase{

	
	Cuenta cuenta;
	Credito tarjeta;
	
	public CreditoTester1()
	{
		
		super(STestName);
		
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
	
	public void testIngresar500()
	{
		
		
		
	}
	public void testRetirar300()
	{
		
		
		
	}
	
	
	public void testLiquidar()
	{
		
		
		
		
	}
	
	public static void main(String args[])
	{
		
		junit.swingui.TestRunner.run(CreditoTester1.class);
		
		
		
	}
	
	

}
