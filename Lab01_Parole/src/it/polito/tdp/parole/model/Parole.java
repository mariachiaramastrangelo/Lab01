package it.polito.tdp.parole.model;


import java.util.*;

public class Parole {
	List<String> elenco;
		
	public Parole() {
		elenco= new LinkedList<String>();
	}
	
	public void addParola(String p) {
		elenco.add(p);
		//TODO
	}
	
	public List<String> getElenco() {
		Collections.sort(elenco, new OrdineAlfabetico());
		return elenco;
	}
	
	public void reset() {
		elenco.clear();
	}
	static class OrdineAlfabetico implements Comparator<String> {
		
		public int compare(String p1, String p2) {
			return (p1.compareTo(p2));
		}
	}
	@Override
	public String toString() {
		return "Parole [elenco=" + elenco + "]";
	}
	
}
