package a0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon_1620 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<Integer,String> m1 = new HashMap<Integer,String>(N+1);
		Map<String,Integer> m2 = new HashMap<String,Integer>(N+1);
		
		for(int i=0;i<N;i++){
			int no=i;
			m1.put(i, br.readLine());
			m2.put(m1.get(i), i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++){
			String temp = br.readLine();
			if(Character.isDigit(temp.charAt(0))){
				sb.append(m1.get(Integer.parseInt(temp)-1)).append("\n");
			}else{
				sb.append(m2.get(temp)+1).append("\n");
			}
		}
		System.out.println(sb);
	}

}
