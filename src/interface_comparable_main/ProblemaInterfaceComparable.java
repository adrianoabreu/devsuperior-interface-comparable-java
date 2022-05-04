package interface_comparable_main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interface_comparable_entidades.Funcionario;

public class ProblemaInterfaceComparable {
	/*
	 * Faça um programa para ler um arquivo contendo funcionários (nome e salário) no
	 * formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar
	 * o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
	 *
	 * Maria Brown,4300.00
	 * Alex Green,3100.00
	 * Bob Grey,3100.00
	 * Anna White,3500.00
	 * Alex Black,2450.00
	 * Eduardo Rose,4390.00
	 * Willian Red,2900.00
	 * Marta Blue,6100.00
	 * Alex Brown,5000.00
	 *
	 */
	public static void main(String[] args) {
		
		List<Funcionario> lista = new ArrayList<>();
		String diretorio   = "C:\\temp\\in3.txt"; 
		
		try (BufferedReader br = new BufferedReader(new FileReader(diretorio))){
			
			String funcionarioCsv = br.readLine();
			while(funcionarioCsv != null){
				String[] campos = funcionarioCsv.split(",");
				lista.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
				funcionarioCsv = br.readLine();
			}
			Collections.sort(lista);
			for(Funcionario f : lista) {
				System.out.println(f.getNome() + ", " + f.getSalario());
			}
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
