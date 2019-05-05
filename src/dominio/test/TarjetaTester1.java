package dominio.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

import dominio.Cuenta;
import dominio.Tarjeta;
import junit.framework.TestCase;

public abstract class TarjetaTester1 extends TestCase{

	
	Tarjeta tarjeta;
	Cuenta cuenta;
	
	public TarjetaTester1(String sTestName)
	{
		super(sTestName);
		
	}
	
	
	
	public abstract Tarjeta getTarjetaObtenida();
	public abstract Tarjeta prepararTarjetaEsperada();
	
	
	public void testRetirar1000() throws Exception
	{
		cuenta = new Cuenta("236A", "Perico");
		cuenta.ingresar(1000);
		tarjeta.setCuenta(cuenta);
		tarjeta.retirar(1000);
		Assertions.assertEquals(tarjeta.getSaldo(), 0);
		
	}
	
}
