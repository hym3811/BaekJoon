package a0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_10815 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		boolean[] arr = new boolean[20000001];
		
		for(int i=0;i<N;i++){
			int temp = Integer.parseInt(st.nextToken());
			if(!arr[temp+10000000]){
				arr[temp+10000000]=true;
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++){
			int temp=Integer.parseInt(st.nextToken());
			if(arr[temp+10000000]){
				sb.append(1).append(" ");
			}else{
				sb.append(0).append(" ");
			}
		}
		
		System.out.println(sb);

	}

}
