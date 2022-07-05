package a0705;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_10816 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] count = new int[20000001];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<N;i++){
			count[Integer.parseInt(st.nextToken())+10000000]++;
		}
		
		int M = Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++){
			sb.append(count[Integer.parseInt(st.nextToken())+10000000]).append(" ");
		}
		System.out.println(sb);
	}

}
