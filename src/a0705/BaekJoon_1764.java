package a0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon_1764 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String,Character> m = new HashMap<String,Character>();
		for(int i=0;i<N;i++){
			m.put(br.readLine(), '1');
		}
		
		int count=0;
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0;i<M;i++){
			String temp = br.readLine();
			if(m.get(temp)!=null){
				count++;
				arr.add(temp);
			}
		}
		Collections.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(String s : arr)
			sb.append(s+"\n");
		
		System.out.println(count);
		System.out.println(sb);
	}

}
