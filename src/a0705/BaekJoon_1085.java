package a0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1085 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[][] arr = new int [2][2];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<2;i++){
			if(arr[0][i]<arr[1][i]-arr[0][i]){
				if(arr[0][i]<min){
					min=arr[0][i];
				}
			}else{
				if(arr[1][i]-arr[0][i]<min){
					min=arr[1][i]-arr[0][i];
				}
			}
		}
		System.out.println(min);
	}

}
