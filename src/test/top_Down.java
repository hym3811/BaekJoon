package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class top_Down {

	static int count = 0;
	static long[] arr;
	static int last = 1;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new long[N+1];
		
		System.out.println(fx(N));
		System.out.println(count);

	}
	
	static long fx(int n){
		
		if(n==0||n==1){
			return 1;
		}else{
		
			for(int i=0;i<=n;i++){
				if(i==0){
					arr[i]=1;
					arr[i+1]=1;
					i+=2;
				}
				System.out.println("i: "+i);
				count++;
				arr[i]=arr[i-1]+arr[i-2];
			}
			System.out.println(Arrays.toString(arr));
		}
		
		return arr[n];
	}
	
}
