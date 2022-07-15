package a0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_15650 {
	
	static StringBuilder sb = new StringBuilder();
	static boolean[] chk;
	static int[] arr;

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		chk = new boolean[N];
		arr = new int[M];
		
		fx(0,N,M,0);
		System.out.println(sb);

	}
	
	static void fx(int i,int N,int M,int step){
		
		if(step==M){
			for(int val:arr){
				sb.append(val).append(" ");
			}sb.append("\n");
			return;
		}
		
		for(int j=i;j<N;j++){
			if(chk[j]==false){
				chk[j]=true;
				arr[step]=j+1;
				fx(j+1,N,M,step+1);
				chk[j]=false;
			}
		}
		
	}

}
