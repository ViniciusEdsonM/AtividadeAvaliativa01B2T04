package fag;

import java.util.Scanner;

import objeto.Bicicleta;
import objeto.ContaBancaria;
import objeto.ContaLuz;
import objeto.Filme;
import objeto.Funcionario;
import objeto.Musica;
import objeto.Pessoa;
import objeto.ProdutoEstoque;
import objeto.Retangulo;
import objeto.Temperatura;

public class Principal {
	public static void main(String[] args) {
		//atividadeUm();
		//atividadeDois();
		//atividadeTres();
		//atividadeQuatro();
		//atividadeCinco();
		//atividadeSeis();
		//atividadeSete();
		//atividadeOito();
		//atividadeNove();
		//atividadeDez();
	}
	
	public static void atividadeUm() {
		ContaBancaria contaUm = new ContaBancaria("Vinicius Edson", 0);
		System.out.println("Saldo R$ " +contaUm.getSaldo());
		contaUm.depositar(1500);
		System.out.println("Saldo R$ " +contaUm.getSaldo());
		contaUm.sacar(700);
		System.out.println("Saldo R$ " +contaUm.getSaldo());
		
	}
	public static void atividadeDois() {
		Filme filmeUm = new Filme("Extraction 2", 5);
		Filme filmeDois = new Filme("Cabras da Peste.", 5);
		
		System.out.println(filmeUm.exibir());
		System.out.println(filmeDois.exibir());
		
	}
	public static void atividadeTres() {
		Funcionario fUm = new Funcionario("João",1512);
		Funcionario fDois = new Funcionario("Vitor",2530);
		
		System.out.println("Funcionario: "+fUm.getNome()+" Salario: "+ fUm.getSalario());
		System.out.println("Funcionario: "+fDois.getNome()+" Salario: "+ fDois.getSalario());
		
		fUm.aumentarSalario(10);
		fDois.aumentarSalario(10);
		System.out.println("Funcionario: "+fUm.getNome()+" Salario: "+ fUm.getSalario());
		System.out.println("Funcionario: "+fDois.getNome()+" Salario: "+ fDois.getSalario());		
		
	}
	public static void atividadeQuatro() {
		Retangulo retanguloUm = new Retangulo(25,25);
		
		System.out.println("Area: "+retanguloUm.area());
		System.out.println("Perimetro: "+retanguloUm.perimetro());
		
	}
	public static void atividadeCinco() {
		Musica musicaUm = new Musica ("Henrique & Juliano- Ele quer ser eu", 205);
		Musica musicaDois = new Musica ("Jorge & Matheus - Calma", 200);
		
		System.out.println("Titulo: "+musicaUm.getTitulo()+ "Duração: "+musicaUm.formatarDuracao());
		System.out.println("Titulo: "+musicaDois.getTitulo()+ "Duração: "+musicaDois.formatarDuracao());
		
	}
	public static void atividadeSeis() {
		Pessoa pessoaUm = new Pessoa ("Vinicius", 80, 1.75);
		System.out.println("Nome: "+pessoaUm.getNome()+" IMC: "+ pessoaUm.calcularIMC() +" Classificação: "+ pessoaUm.classificacaoIMC());
		
	}
	public static void atividadeSete() {
		ContaLuz contaUm = new ContaLuz(175, 0.52);
		
		System.out.println("Valor da Conta de Luz R$ "+ contaUm.calculorValor());
	}
	public static void atividadeOito() {
		Scanner scanner = new Scanner (System.in);
		Bicicleta bikeUm = new Bicicleta(0, 50.50);
		
		System.out.println("Insira a Quantidade de horas? ");
		bikeUm.setHoras(scanner.nextInt());
		
		
		System.out.println("Valor do aluguel R$ "+ bikeUm.calcularValor());
		
	}
	public static void atividadeNove() {
		ProdutoEstoque produtoUm = new ProdutoEstoque("Televisão", 0);
		
		System.out.println("Saldo da "+ produtoUm.getNome()+" é "+ produtoUm.getQuantidade());
		produtoUm.adicionarEstoque(15);
		System.out.println("Saldo da "+ produtoUm.getNome()+" é "+ produtoUm.getQuantidade());
		produtoUm.removerEstoque(7);
		System.out.println("Saldo da "+ produtoUm.getNome()+" é "+ produtoUm.getQuantidade());
		
	}
	public static void atividadeDez() {
		Scanner scanner = new Scanner(System.in);
		Temperatura tempUm = new Temperatura();
		System.out.println("Insira o valor da temperatura:");
		tempUm.setCelsius(scanner.nextDouble());
		System.out.println("A temperatura é "+ tempUm.getCelsius()+"C");
		System.out.println("Convertendo para Fahrenheit:"+ tempUm.paraFahrenhiet()+"F");
		System.out.println("Convertendo para Kelvin:"+ tempUm.paraKelvin()+"K");
		
	}
	
}