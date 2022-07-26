package a0718;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_1149 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int [][] cost = new int [N][3]; // cost[N][0] = R, cost[N][1] = G, cost[N][2] = B,
		for(int i=0;i<N;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<3;j++){
				cost[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] rs = new int [N][3];
		int r = cost[0][0],g = cost[0][1],b = cost[0][2];
		rs[0][0] = cost[0][0];rs[0][1] = cost[0][1];rs[0][2] = cost[0][2];
		int min = Integer.MAX_VALUE;
		
		for(int i=1;i<N;i++){
			rs[i][0] = Math.min(rs[i-1][1], rs[i-1][2])+cost[i][0];
			rs[i][1] = Math.min(rs[i-1][0], rs[i-1][2])+cost[i][1];
			rs[i][2] = Math.min(rs[i-1][0], rs[i-1][1])+cost[i][2];
			//System.out.println(Arrays.toString(rs[i]));
			int temp = Math.min(rs[i][0], rs[i][1]);
			temp = Math.min(temp, rs[i][2]);
			min=temp;
		}
		
		System.out.println(min);

	}

}
