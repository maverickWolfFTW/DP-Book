package carte;

import java.util.ArrayList;
import java.util.Collection;

public class Carte {
	
	private String titlu;
	private Autor[] autori;
	private Collection<Element> elemente;
	
	public Carte(String titlu, Autor[] autori, Element[] elemente){
		this.titlu = titlu;
		this.autori = autori;
		this.elemente = new ArrayList<Element> ();
	}
	
	public Carte(String titlu, Autor[] autori) {
		this.titlu = titlu;
		this.autori = autori;
	}

	public Autor[] getAutor(){
		return autori;
	}
	
	public void setAutor(){
		this.autori = autori;
	}

}
