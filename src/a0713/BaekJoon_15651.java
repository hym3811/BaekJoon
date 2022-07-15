package a0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_15651 {
	
	static StringBuilder sb = new StringBuilder();
	static int[] arr;

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		fx(N,M,0);
		System.out.println(sb);

	}

	static void fx(int N,int M,int step){
		if(step==M){
			for(int i=0;i<M;i++){
				sb.append(arr[i]).append(" ");
			}sb.append("\n");
			return;
		}
		for(int i=0;i<N;i++){
			arr[step]=i+1;
			fx(N,M,step+1);
			arr[step]=0;
		}
	}
	
}
