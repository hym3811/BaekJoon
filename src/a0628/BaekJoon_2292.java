package a0628;

import java.io.*;

public class BaekJoon_2292 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b=1;
		int c=2;
		
		if(a==1)
			System.out.println("1");
		else{
			while(c<=a){
				c+=(6*b);
				b++;
			}
			System.out.println(b);
		}
		
	}
}
