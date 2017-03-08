package br.edu.impacta.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class AgendaApp {
 
	private static Scanner entrada = new Scanner(System.in);
	private static List<Contato> contatos = new ArrayList<>();
	public static void main(String []args){
		 
		boolean sair =false;
		while(!sair){
			int opcao = apresentarMenuPrincipal();
			switch(opcao){
			case 1 : inserirContato();break;
			case 2 : buscarContato();break;
			case 3 : sair = true;break;
			default: out.println("ERRO: Opção inválida");
			}// switch
			
		} // while
		out.println();
		out.println("\n Fim do programa");
		
	} // main
	
				/* MEEEEEEEEETODOS */ 
	
	private static void buscarContato() {
		// TODO Auto-generated method stub
		out.println("BUSCA CONTATOS");
		
		String nome = lerNome();
		List<Contato> resultado = new ArrayList<>();
		for(Contato c:contatos){
			if(nome.equals(c.getNome()))
				resultado.add(c);
			
			}// for
		if(resultado.size() == 0)
			out.println("Não há contato com este nome");
		else
			out.println("Resultado de busca:");
		for(Contato c: resultado){
			out.println(c);
			
		}
		
	}// buscarContato

	private static void inserirContato() {
		// TODO Auto-generated method stub
		out.println(" Inserção de contato");
		String nome = lerNome();
		String telefone = lerTelefone();
		Contato c = new Contato (nome, telefone);
		
		if(contatos.contains(c)){
			out.println("Contato ja cadastrado");
		}else{
			contatos.add(c);
			out.println("Contato Salvo");
		}
	}

	private static String lerTelefone() {
		// TODO Auto-generated method stub
		boolean valido  = false;
		String telefone = "";
		while(!valido){
			out.print("telefone: ");
			telefone = entrada.nextLine();
			
			if(telefone.length()==0 || telefone.length()>200) 
				out.println("ERRO: NOME Invalido");
			else valido = true;
			
				}// while
		return telefone;
	}

	private static String lerNome() {
		// TODO Auto-generated method stub
		boolean valido = false;
		String nome = "";
		while(!valido){
			out.print("Nome: ");
			nome = entrada.nextLine();
			
			if(nome.length()==0 || nome.length()>200) 
				out.println("ERRO: NOME Invalido");
			else valido = true;
			
				}// while
		return nome;
		
	} // lerNome
		
		
	

	private static int apresentarMenuPrincipal() {
		// TODO Auto-generated method stub
		boolean inteiro = false;
		int opcao = 0;
		while(!inteiro){
			out.println("\n AGENDA TELEFONICA");
			out.println("(1) Inserir");
			out.println("(2) Buscar");
			out.println("(3) Sair");
			out.print("Escolha um opção");
			
			String s = entrada.nextLine();
			
			try{
				opcao = Integer.parseInt(s);
				inteiro  = true;
			}catch(Exception e){
				out.println("ERRO: opção deve ser um valor inteiro");
			} // catch
			
		}  //while
		
		return 0;
	}
	
} // class
