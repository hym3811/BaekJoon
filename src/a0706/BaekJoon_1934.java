package a0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1934 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++){
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int temp=0;
			if(A>B){
				while(true){
					temp+= A;
					
					if(temp%B==0){
						break;
					}
				}
			}else{
				while(true){
					temp+= B;
					
					if(temp%A==0){
						break;
					}
				}
			}
			
			sb.append(temp).append("\n");
			
		}
		
		System.out.println(sb);

	}

}
