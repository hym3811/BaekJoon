package a0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_5086 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		String s1 = "factor";
		String s2 = "multiple";
		String s3 = "neither";
		StringBuilder sb = new StringBuilder();
		
		while(true){
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0&&B==0)
				break;
			
			if(B%A==0){
				sb.append(s1+"\n");
			}else if(A%B==0){
				sb.append(s2+"\n");
			}else{
				sb.append(s3+"\n");
			}
			
		}
		
		System.out.println(sb);

	}

}
