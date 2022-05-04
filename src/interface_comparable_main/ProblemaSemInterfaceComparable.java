package interface_comparable_main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProblemaSemInterfaceComparable {
	/*
	 * Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por
	 * linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-los
	 * ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
	 * 
	 * Maria Brown
	 * Alex Green
	 * Bob Grey
	 * Anna White
	 * Alex Black
	 * Eduardo Rose
	 * Willian Red
	 * Marta Blue
	 * Alex Brown
	 */
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		String diretorio   = "C:\\temp\\in.txt"; 
		
		try (BufferedReader br = new BufferedReader(new FileReader(diretorio))){
			
			String nome = br.readLine();
			while(nome != null){
				lista.add(nome);
				nome = br.readLine();
			}
			Collections.sort(lista);
			for(String s : lista) {
				System.out.println(s);
			}
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
