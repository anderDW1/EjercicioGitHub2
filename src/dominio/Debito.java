package dominio;

public class Debito {

	public Debito(String numero, String titular, Date fechaCaducidad) {
		super(numero, titular, fechaCaducidad);
	}
	
	
	public void retirar(double x) throws Exception{
		this.mCuentaAsocida.retirar("Retirada en cajero autom�tica", x);
	}
	
	
	public void ingresar(double x) throws Exception{
		this.mCuentaAsociada.retirar("Ingreso en cajero automatico", x);
	}
	
	
	public void pagoEnEstablecimiento(String datos, double x) throws Exception{
		this.mCuentaAsociada.retirar("Compra en: "+datos,x);
	}
	
	
	public double getSaldo() {
		return mCuentaAsociada.getSaldo();
	}
	
	
}