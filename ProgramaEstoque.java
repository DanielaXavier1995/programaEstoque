package aplicacao;

import java.util.ArrayList;

/* Faça um programa que insira os seus produtos(mais que 3) para serem
 * passados para um estoque determinado, onde cada produto deve ser
 * inserido de acordo com seus atributos(Nome, dataDeVencimeto, 
 * numeroDeSerie, preco). Ao final, devendo assim ser informados em 
 * forma de relatório ao final da aplicação, com todas as diretrizes 
 * do produto, tanto seus componentes, e para informando o estoque
 * determinado. */

import java.util.Scanner;

public class ProgramaEstoque {

	public static void main(String[] args) {
		
		ArrayList <String> nome = new ArrayList <>();
		ArrayList <String> dataDeVencimento = new ArrayList <>();
		ArrayList <String> numeroDeSerie = new ArrayList <>();
		ArrayList <Integer> quantidade = new ArrayList <>();
		ArrayList <Double> preco = new ArrayList <>();
		
		int opcao = 0;
		String nomeProduto;
		int n;
		int cont = 0;
		int modQuantidades;
		int produto = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos produtos deseja cadastrar? ");
		produto = sc.nextInt();
		
		for (int i = 0; i < produto; i++) {
		
		System.out.println("==== CADASTRO DE PRODUTO ====");
		System.out.print("NOME: ");
		nome.add(sc.next());
		System.out.print("DATA DE VENCIMENTO: ");
		dataDeVencimento.add(sc.next());
		System.out.print("NÚMERO DE SÉRIE: ");
		numeroDeSerie.add(sc.next());
		System.out.print("Preço: R$ ");
		preco.add(sc.nextDouble());
		System.out.print("Quantidade: ");
		quantidade.add(sc.nextInt());
		System.out.println();
		
		}
		
		do {
			
		System.out.println("====== MENU ESTOQUE ======");
		System.out.println("1 - ADICIONAR PRODUTO");
		System.out.println("2 - REMOVER PRODUTO");
		System.out.println("3 - MODIFICAR QUANTIDADES");
	    System.out.print("Digite a opção desejada no Menu: ");
	    n = sc.nextInt();
	    
	    switch (n) {
	    
	    case (1):
	    	System.out.println();
	    	System.out.println("==== CADASTRO DE PRODUTO ====");
		    System.out.print("NOME: ");
		    nome.add(sc.next());
		    System.out.print("DATA DE VENCIMENTO: ");
		    dataDeVencimento.add(sc.next());
		    System.out.print("NÚMERO DE SÉRIE: ");
		    numeroDeSerie.add(sc.next());
		    System.out.print("Preço: R$ ");
		    preco.add(sc.nextDouble());
		    System.out.print("Quantidade: ");
		    quantidade.add(sc.nextInt());
		    System.out.println();
	    	break;
	    
	    case (2):
	    	System.out.print("NOME: ");
            nomeProduto = sc.next();
            for (int i = 0; i < nome.size(); i++) {
   	    		if (nome.get(i).equalsIgnoreCase(nomeProduto)) {
   	    				nome.remove(i);
   	    				dataDeVencimento.remove(i);
   	    				numeroDeSerie.remove(i);
   	    				quantidade.remove(i);
   	    				preco.remove(i);
   	    			} 
   	    		} 
	        break;
	    	
	    case (3):
	    	System.out.print("NOME: ");
	        nomeProduto = sc.next();
	        System.out.println();
	        System.out.println("==== MENU QUANTIDADES ====");
	        System.out.println("1 - ADICIONAR");
	        System.out.println("2 - REMOVER");
	        System.out.print("Digite a opção desejada: ");
	        int quant = sc.nextInt();
	        System.out.println();
	        
	           switch (quant) {
	           
	           case (1):
	        	   System.out.println("======= ADICIONAR PRODUTO =======");
	        	   for (int i = 0; i < nome.size(); i++) {
	   	    		if (nome.get(i).equalsIgnoreCase(nomeProduto)) {
	   	    				System.out.println("Digite a quantidade que deseja adicionar: ");
	   	    				modQuantidades = sc.nextInt();
	   	    				int soma = quantidade.get(i) + modQuantidades;
	   	    				quantidade.remove(i);
	   	    				quantidade.add(i, soma);
	   	    			} 
	   	    		} 
	        	   break;
	           
	           case (2):
	        	   System.out.println("======= REMOVER PRODUTO =======");
        	       for (int i = 0; i < nome.size(); i++) {
   	    		    if (nome.get(i).equalsIgnoreCase(nomeProduto)) {
   	    				System.out.println("Digite a quantidade que deseja remover: ");
   	    				modQuantidades = sc.nextInt();
   	    				int subtracao = quantidade.get(i) - modQuantidades;
   	    				quantidade.remove(i);
   	    				quantidade.add(i, subtracao);
   	    			} 
   	    		} 
	        	   break;
	           
	           default:
	        	   System.out.println("OPÇÃO INVÁLIDA!!!");
	        	   break;
	           }
	    		
	    	break;
	    	
	    default:
	    	System.out.println("OPÇÃO INVÁLIDA!!");
	    	break;
	    }
	    System.out.println("============================================");
	    System.out.print("Deseja seguir no MENU? (1 - SIM OU 2 - NÃO) ");
	    opcao = sc.nextInt();
		} while (opcao == 1);
		
			System.out.println("====== RELATÓRIO DE ESTOQUE ======");
			System.out.println("Produto: " + nome);
			System.out.println("Data de vencimento: " + dataDeVencimento);
			System.out.println("Numero de Serie: " + numeroDeSerie);
			System.out.println("Preço: R$" + preco);
			System.out.println("Quantidade: " + quantidade);
			
		sc.close();
	}
}
