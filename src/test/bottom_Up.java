package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bottom_Up {

	static long[] arr;
	static int count=0;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new long[N];
		
		System.out.println(fx(N));
		System.out.println(count);

	}

	static long fx(int n){
		
		if(n<=1){
			return 1;
		}
		if(arr[n-1]!=0){
			return arr[n-1];
		}else{
			arr[n-1]=fx(n-1)+fx(n-2);
			count++;
		}
		
		return arr[n-1];
	}
	
}
