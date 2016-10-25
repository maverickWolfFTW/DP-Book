package carte;

public interface Element {
	
	public void print();
	public Element addElement(Element e) throws Exception;
	public void removeElement(Element e) throws Exception;
	public Element getElement(int index) throws Exception;
	public Element[] getElement() throws Exception;
	
	BBox getBoundingBox();
	
	
}
