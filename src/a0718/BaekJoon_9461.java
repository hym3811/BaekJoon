package a0718;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon_9461 {
	
	static long[] arr = new long[101];

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++){
			int n = Integer.parseInt(br.readLine());
			fx(n);
			sb.append(arr[n]).append("\n");
		}
		System.out.println(sb);
	}
	
	static long fx(int n){
		
		if(n<=3){
			return arr[n] = 1;
		}
		
		if(arr[n]==0){
			arr[n] = fx(n-2) + fx(n-3);
		}
		
		return arr[n];
	}

}
