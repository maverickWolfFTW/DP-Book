package carte;

import java.util.ArrayList;

public class Sectiune implements Element {
	
	private String titlu;
	private ArrayList<Element> elemente;
	
	public Sectiune(String titlu, Element[] elemente){
		this.setTitlu(titlu);
		this.elemente = new ArrayList<Element> ();
	}
	
//	public ArrayList<Element> getElement(){
//		return elemente;
//	}
	
	public Element addElement(Element e){
		elemente.add(e);
		return e;
	}
	
	public Element getElement(int index){
		for(Element e : elemente)
				return e;
		return null;
	}
	
	public void removeElement(Element e) {
		elemente.remove(e);
	}
	
	
	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element[] getElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BBox getBoundingBox() {
		// TODO Auto-generated method stub
		return null;
	}

}
