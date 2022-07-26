package a0718;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon_1904 {
	
	static int[] arr;

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		
		System.out.println(fx(N));

	}

	static int fx(int n){
		
		if(n==0||n==1){
			return 1;
		}
		
		if(arr[n]==0){
			arr[n] = fx(n-1) + fx(n-2);
		}
		
		return arr[n]%15746;
		
	}
	
}
