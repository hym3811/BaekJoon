package a0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_11051 {
	
	static int[][] arr;

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][K+1];
		
		System.out.println(fx(N,K));

	}
	
	static int fx(int n,int k){
		if(arr[n][k]>0){
			return arr[n][k];
		}
		if(n==k||k==0){
			return arr[n][k]=1;
		}
		return arr[n][k]=(fx(n-1,k-1)+fx(n-1,k))%10007;
	}

}
