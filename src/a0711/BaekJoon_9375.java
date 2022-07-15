package a0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon_9375 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<T;i++){
			int N = Integer.parseInt(br.readLine());
			HashMap<String,Integer> mp = new HashMap<String,Integer>();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int idx=0;
			
			for(int j=0;j<N;j++){
				String s = br.readLine();
				String ctg = s.split(" ")[1];
				if(mp.get(ctg)==null){
					mp.put(ctg, idx);
					arr.add(1);
					idx++;
				}else{
					arr.set(mp.get(ctg), arr.get(mp.get(ctg))+1);
				}
			}
			int result = 1;
			for(int j=0;j<arr.size();j++){
				result*=(arr.get(j)+1);
			}
			sb.append(result-1).append("\n");
		}
		
		System.out.println(sb);

	}

}
