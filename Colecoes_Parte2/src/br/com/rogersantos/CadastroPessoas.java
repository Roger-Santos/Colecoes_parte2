package br.com.rogersantos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CadastroPessoas {
	static String[] vetorNomes = {"Matheus - M","Isabela - F","Lucas - M","Beatriz - F","Gustavo - M","Mariana - F","Pedro - M","Camila - F","Rafael - M","Adriana - F","João - M","Larissa - F","Daniel - M","Letícia - F","Thiago - M","Juliana - F","Felipe - M","Gabriela - F","André - M","Bruna - F"};
	static Map<Integer, String> lista;
	
	public static void main(String[] args) {
		lista = new HashMap<Integer, String>();
		insereDadosVetor();
		imprimeCadastros("M");
		imprimeCadastros("F");	
	}
	
	public static void insereDadosVetor() {
		for (String nome : vetorNomes) {
            lista.put(lista.size() + 1, nome);
        }
	}
	
	public static void imprimeCadastros(String letra) {
		List<String> selecao = new ArrayList<String>();
		for (String value : lista.values()) {
			String[] words = value.split(" - ");
			
			if(letra.equals(words[1])) {
				selecao.add(words[0]);
			}
        }		
		System.out.println(selecao);	
	}	
	
}