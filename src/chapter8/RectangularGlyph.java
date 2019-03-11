package chapter8;

public class RectangularGlyph extends Glyph {
	private int length = 1;
	public RectangularGlyph(int length) {
		this.length = length;
		System.out.println("RectangularGlyph.RectangularGlyph(),length = " + length);
	}
	public void draw() {
		System.out.println("RectangularGlyph.draw(),length = " + length);
	}
}
