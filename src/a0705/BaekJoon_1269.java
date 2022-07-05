package a0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1269 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		boolean[] n = new boolean[100000001];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++){
			n[Integer.parseInt(st.nextToken())]=true;
		}
		
		st = new StringTokenizer(br.readLine()," ");
		int count=N;
		for(int i=0;i<M;i++){
			int temp=Integer.parseInt(st.nextToken());
			if(n[temp]){
				count--;
			}else{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
