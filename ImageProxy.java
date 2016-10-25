package carte;

public class ImageProxy implements Element {

	private BBox bBox;
	private Imagine imagine = null;
	private String fileName;
	
	
	public ImageProxy(String fileName, BBox bBox) {
		this.bBox = bBox;
		this.fileName = fileName;
	}
	
	private Imagine loadImage() {
		Imagine img = new Imagine(fileName);
		//if(img.is)
		return img;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element addElement(Element e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeElement(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element getElement(int index) {
		// TODO Auto-generated method stub
		return null;
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

	public void displayImage() {
		// TODO Auto-generated method stub
		
	}

}
