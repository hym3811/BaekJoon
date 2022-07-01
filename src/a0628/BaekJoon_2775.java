package a0628;

import java.io.*;

public class BaekJoon_2775 {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<num;i++){
			int k=Integer.parseInt(br.readLine());
			int n=Integer.parseInt(br.readLine());
			int[][] arr=new int[k+1][n];
			for(int j=0;j<=k;j++){
				arr[j][0]=1;
			}
			for(int j=0;j<n;j++){
				arr[0][j]=j+1;
			}
			for(int j=1;j<=k;j++){
				for(int l=1;l<n;l++){
					arr[j][l]=arr[j-1][l]+arr[j][l-1];
				}
			}
			sb.append(Integer.toString(arr[k][n-1])).append("\n");
		}
		System.out.println(sb);
	}
}