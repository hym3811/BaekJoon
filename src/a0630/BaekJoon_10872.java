package a0630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class BaekJoon_10872 {
	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Call1 c = new Call1();
		c.rs(Integer.parseInt(br.readLine()));
		
	}
}

class Call1{
	
	int result=1;
	
	public void rs(int n){
		
		if(n>1){
			result=result*n;
			rs(n-1);
		}else{
			System.out.println(result);
		}
	}
	
}
