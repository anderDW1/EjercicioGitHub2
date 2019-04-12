package dominio.test;

import dominio.Tarjeta;
import junit.framework.TestCase;

public abstract class TarjetaTester1 extends TestCase{

	
	
	public TarjetaTester1(String sTestName)
	{
		super(sTestName);
		
	}
	
	
	
	public abstract Tarjeta getTarjetaObtenida();
	public abstract Tarjeta prepararTarjetaEsperada();
	
	
	public void testRetirar1000()
	{
		
		
		
	}
	
}


