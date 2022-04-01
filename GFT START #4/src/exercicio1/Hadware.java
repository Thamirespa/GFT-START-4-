package exercicio1;

public class Hadware {

	private String id;
	private String descricao;
	private double valor;
	private String fabricante; 
	
	public Hadware() {
		
	}

	public Hadware(String id, String descricao, double valor, String fabricante) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.fabricante = fabricante;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	
	
	public String getDetailsHadware() {
		return "Hadware [id=" + id + ", descricao=" + descricao + ", valor=" + valor + ", fabricante=" + fabricante
				+ "]";
	}
	
	
	
	
}
