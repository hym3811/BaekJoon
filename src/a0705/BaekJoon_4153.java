package a0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BaekJoon_4153 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			ArrayList<Integer> arr = new ArrayList<Integer>();
			
			for(int i=0;i<3;i++){
				arr.add(Integer.parseInt(st.nextToken()));
			}
			
			Collections.sort(arr);
			if(arr.get(0)==0){
				break;
			}
			
			if(Math.pow(arr.get(0), 2)+Math.pow(arr.get(1), 2)==Math.pow(arr.get(2), 2)){
				sb.append("right\n");
			}else{
				sb.append("wrong\n");
			}
			
		}
		System.out.println(sb);
	}

}
