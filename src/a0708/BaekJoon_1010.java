package a0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_1010 {
	
	static int[][] arr = new int[30][30];
	
	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			sb.append(fx(M,N)).append("\n");
		}
		System.out.println(sb);
	}

	static int fx(int n,int m){
		
		if(n==m||m==0){
			return 1;
		}
		if(arr[n][m]!=0){
			return arr[n][m];
		}else{
			return arr[n][m]=fx(n-1,m-1)+fx(n-1,m);
		}
		
	}
	
}
