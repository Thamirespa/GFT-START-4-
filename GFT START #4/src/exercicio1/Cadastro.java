package exercicio1;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CPU cpu1 = new CPU();
		Memoria memoria1 = new Memoria();
		DiscoRigido discoRigido1 = new DiscoRigido();
		
		System.out.println("Digite as informações dos produtos!!!");
		System.out.println();
		System.out.println("Digite as informações da CPU!!!");
		
		String id = sc.next();
		String descricao = sc.next();
		double valor = sc.nextDouble();
		String fabricante = sc.next();
		
		
		String clock = sc.next();
		String Modelo = sc.next();
		
		
		int frequencia = sc.nextInt();
		int capacidade = sc.nextInt();
		String tipo = sc.next(); 
		
		System.out.println("Digite as informações dos produtos!!!");
		System.out.println();
		System.out.println("Digite as informações da CPU!!!");
		
		cpu1.setId(id);
		cpu1.setDescricao(descricao);
		cpu1.setValor(valor);
		cpu1.setFabricante(fabricante);
		cpu1.setClock(clock);
		cpu1.setModelo(Modelo);
		
		System.out.println("Digite as informações da memoria!!!");
		
		memoria1.setId(id);
		memoria1.setDescricao(descricao);
		memoria1.setValor(valor);
		memoria1.setFabricante(fabricante);
		memoria1.setFrequencia(frequencia);
		memoria1.setCapacidade(capacidade);
		memoria1.setTipo(tipo);
		
		System.out.println("Digite as informações do Disco Rigido!!!");
		
		discoRigido1.setId(id);
		discoRigido1.setDescricao(descricao);
		discoRigido1.setValor(valor);
		discoRigido1.setFabricante(fabricante);
		discoRigido1.setCapacidade(capacidade);
		discoRigido1.setVelocidade(capacidade);
		discoRigido1.setTipo(tipo);
		
		
		
		System.out.println("ID: " + cpu1.getId());
		System.out.println("Descrição: " + cpu1.getDescricao());
		System.out.println("Valor: R$" + cpu1.getValor());
		System.out.println("Fabricante:" + cpu1.getFabricante());
		System.out.println("Clok" + cpu1.getClock());
		System.out.println("Modelo:" + cpu1.getModelo());
		
		
		System.out.println("ID: " + memoria1.getId());
		System.out.println("Descrição: " +  memoria1.getDescricao());
		System.out.println("Valor: R$" +  memoria1.getValor());
		System.out.println("Fabricante:" +  memoria1.getFabricante());
		System.out.println("Frequencia" +  memoria1.getFrequencia());
		System.out.println("Capacidade:" +  memoria1.getCapacidade());
		System.out.println("Tipo:" +  memoria1.getTipo());
		
		
		System.out.println("ID: " + discoRigido1.getId());
		System.out.println("Descrição: " +  discoRigido1.getDescricao());
		System.out.println("Valor: R$" +  discoRigido1.getValor());
		System.out.println("Fabricante:" +  discoRigido1.getFabricante());
		System.out.println("Velocidade" +  discoRigido1.getVelocidade());
		System.out.println("Capacidade:" +  discoRigido1.getCapacidade());
		System.out.println("Tipo:" +  discoRigido1.getTipo());
		
		
	}

}
