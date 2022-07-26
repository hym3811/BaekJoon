package a0718;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_1932 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][];
		
		for(int i=0;i<N;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int size = st.countTokens();
			arr[i] = new int[i+1];
			for(int j=0;j<size;j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] rs = new int[N][];
		
		for(int i=N-1;i>=0;i--){
			rs[i] = new int[i+1];
			if(i==N-1){
				for(int j=0;j<i+1;j++){
					rs[i][j] = arr[i][j];
				}
				continue;
			}
			
			for(int j=0;j<i+1;j++){
				rs[i][j] = Math.max(rs[i+1][j], rs[i+1][j+1])+arr[i][j];
			}
			
		}
		
		System.out.println(rs[0][0]);
		
	}

}
