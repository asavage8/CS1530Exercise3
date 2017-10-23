import java.io.*;
import java.util.*;

public class Ex {
	public static void main(String[] args) throws IOException {
		int value =0;
			if(args.length !=1){
				System.out.println("Only one argument accepted");
				System.exit(1);
			}
			try{
				value = Integer.parseInt(args[0]);
			}catch(Exception e){
				System.out.println("Not an integer");
				System.exit(1);
			}
		
	
		System.out.println("Tri("+value+")= "+Tri(value)); 
		System.out.println("Lazy("+value+")= "+Lazy(value));
	}
	public static int Tri(int n){
		int sum =0;
		for(int i= n; i >0 ;i --){
			sum = sum+ i;
		}
		return sum;
	}
	
	public static int Lazy(int n){
		return ((n*n)+n+2)/2;
	}
}	
