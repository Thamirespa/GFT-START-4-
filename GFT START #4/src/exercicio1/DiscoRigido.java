package exercicio1;

public class DiscoRigido extends Hadware {

	private int capacidade;
	private int velocidade;
	private String tipo;
	
	public DiscoRigido() {
		
	}

	public DiscoRigido(int capacidade, int velocidade, String tipo) {
		this.capacidade = capacidade;
		this.velocidade = velocidade;
		this.tipo = tipo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
