package exercicio1;

public class CPU extends Hadware {
	
	private String clock;
	private String Modelo;
	
	public CPU() {
		
	}

	public CPU(String clock, String modelo) {
		this.clock = clock;
		Modelo = modelo;
	}

	public String getClock() {
		return clock;
	}

	public void setClock(String clock) {
		this.clock = clock;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	
}
