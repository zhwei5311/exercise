package chapter11;

import java.util.Stack;

public class Exe15 {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		String string = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		for(int i=0;i<string.length();i++) {
			char c = string.charAt(i);
			switch(c) {
			case('+'): {
				stack.push(string.charAt(i+1));
				i++;
				break;
			}
			case('-'): {
				System.out.println("弹出栈顶元素："+stack.pop());
				break;
			}
			default:break;
			}
		}
		System.out.println("最后的情况："+stack);
	}
}
