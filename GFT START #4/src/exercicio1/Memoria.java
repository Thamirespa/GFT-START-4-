package exercicio1;

public class Memoria extends Hadware {
	
	private int frequencia;
	private int capacidade;
	private String tipo;
	
	
	public Memoria() {
		
	}


	public Memoria(int frequencia, int capacidade, String tipo) {
		this.frequencia = frequencia;
		this.capacidade = capacidade;
		this.tipo = tipo;
	}


	public int getFrequencia() {
		return frequencia;
	}


	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}


	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
