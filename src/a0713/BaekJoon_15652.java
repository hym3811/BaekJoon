package a0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_15652 {
	
	static StringBuilder sb = new StringBuilder();
	static int[] arr;

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		
		fx(N,M,0,1);
		System.out.println(sb);

	}

	static void fx(int N,int M,int step,int i){
		if(step==M){
			for(int j=0;j<M;j++){
				sb.append(arr[j]).append(" ");
			}sb.append("\n");
			return;
		}
		for(int j=i;j<=N;j++){
			arr[step]=j;
			fx(N,M,step+1,j);
		}
	}
	
}
