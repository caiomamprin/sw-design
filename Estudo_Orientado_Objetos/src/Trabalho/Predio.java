package Trabalho;

public class Predio {
	private int numero;
	private String pintura;
	private int andares;
	
	public Predio(int numero, String pintura, int andares) {
		this.numero = numero;
		this.pintura = pintura;
		this.andares = andares;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPintura() {
		return pintura;
	}

	public void setPintura(String pintura) {
		this.pintura = pintura;
	}

	public int getAndares() {
		return andares;
	}

	public void setAndares(int andares) {
		this.andares = andares;
	}

	
}
