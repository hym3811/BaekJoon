package a0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_7568 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		
		int[][] arr = new int[num][2];
		for(int i=0;i<num;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		}
		int[] grade = new int[num];
		Arrays.fill(grade, 1);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				boolean[] chk = new boolean[2];
				chk[0]=arr[i][0]<arr[j][0];
				chk[1]=arr[i][1]<arr[j][1];
				if(chk[0]==true&&chk[1]==true){
					grade[i]++;
				}
			}
			sb.append(grade[i]).append(" ");
		}
		System.out.println(sb);
	}

}
