package chapter12;

public class Exe6_2 extends Exception {
	private static int[] a=new int[2];  
    public static void main(String[] args){  
        int x=5;  
        while(true){  
            try{  
                a[x]=5;  
                System.out.println("trying...");
                break;  
            }catch(ArrayIndexOutOfBoundsException e){  
                e.printStackTrace(System.out);  
                x--;  
            }finally{  
                System.out.println("no final...");
            }  
        }  
        System.out.println("i'm out!");
    }  
}
