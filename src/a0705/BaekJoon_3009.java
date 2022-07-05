package a0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_3009 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] X = new boolean[1001];
		boolean[] Y = new boolean[1001];
		
		for(int i=0;i<3;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(!X[x]){
				X[x]=true;
			}else{
				X[x]=false;
			}
			
			if(!Y[y]){
				Y[y]=true;
			}else{
				Y[y]=false;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<1001;i++){
			if(X[i]){
				sb.append(i+" ");
			}
		}
		for(int i=1;i<1001;i++){
			if(Y[i]){
				sb.append(i+" ");
			}
		}
		System.out.println(sb);
	}

}
