package a0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Wrong_2477 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		int[] x = new int[2];
		x[0]=Integer.MAX_VALUE;x[1]=Integer.MIN_VALUE;
		int[] y = new int[2];
		y[0]=Integer.MAX_VALUE;y[1]=Integer.MIN_VALUE;
		
		for(int i=0;i<6;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int point;
			if(Integer.parseInt(st.nextToken())<3){
				point = Integer.parseInt(st.nextToken());
				
				if(point<x[0]){
					x[0]=point;
				}
				if(point>x[1]){
					x[1]=point;
				}
				
			}else{
				point = Integer.parseInt(st.nextToken());
				
				if(point<y[0]){
					y[0]=point;
				}
				if(point>y[1]){
					y[1]=point;
				}
				
			}
		}
		
		int result = K*((x[1]*y[1])-x[0]*y[0]);
		System.out.println(result);

	}

}
