package Trabalho;

public class Apartamento {
	private int andar;
	private int numero;
	private double aluguel;
	private Morador rendaMorador;
	private Morador;
	
	public int Apartamento(int andar, int numero, double aluguel) {
		this.andar = andar;
		this.numero = numero;
		this.aluguel = aluguel;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getAluguel() {
		return aluguel;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}
	
	public double getRenda() {
		double rendaMedia = 0;
		for (int i = 0; i <= 100; i++) {
			rendaMedia = rendaMedia + getRenda();
		}
		
		return rendaMedia;
	}
	
}
