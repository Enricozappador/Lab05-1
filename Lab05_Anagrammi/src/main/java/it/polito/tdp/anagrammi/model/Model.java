package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private List<String> soluzione; 
	
	public List<String> Anagrammi(String parola){
		soluzione = new ArrayList<String>();
		parola = parola.toLowerCase(); 
		
		List<Character> rimanenti = new ArrayList<>();
		for(int i = 0; i<parola.length(); i++) {
			rimanenti.add(parola.charAt(i));
			
		}
		
		CreazioneAnagrammi("",0,rimanenti);
		
		
		return this.soluzione; 
	}
	
	public void CreazioneAnagrammi(String parola, int livello, List<Character>lettererimaste){
			
			
			//fine ciclo infinito 
			if(lettererimaste.size()==0) {
				this.soluzione.add(parola); 
			}
			
			else {
				for(Character c : lettererimaste) {
					String tentativo = parola+c; 
					
					List<Character> rimasti = new ArrayList<>(lettererimaste);
					rimasti.remove(c); 
					CreazioneAnagrammi(tentativo, livello+1, rimasti); 
				}
			}
			
			
		
		
		
	}

}
