package chapter9;
import chapter8.*;

public class Practice5 implements TestChapter9 {
	public void play() {
		System.out.println("play()");
	}
	public void adjust(){
		System.out.println("adjust()");
	}
	public static void main(String[] args) {
		Practice5 practice5 = new Practice5();
		practice5.play();
		practice5.adjust();
	}
}
