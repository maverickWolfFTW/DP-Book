package carte;

public class BBox {
	
	private int w;
	private int h;
	
	BBox(int width, int height) {
		this.w = width;
		this.h= height;
	}
	
	public int getWidth() {
		return w;
	}
	
	public int getHeight() {
		return h;
	}
}
