package a0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_9663_Map {

	static StringBuilder sb = new StringBuilder();
	static String[][] map;
	static int[] arr;
	static int count=0;
	static int N = 0;
	
	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		map = new String[N][N];
		
		nQueen(0);
		System.out.println(count);
		

	}
	
	static void nQueen(int step){
		if(step==N){
			count++;
			System.out.println("=============== "+count+" ===============");
			System.out.println();
			map();
			return;
		}
		for(int i=0;i<N;i++){
			arr[step] = i;
			if(possible(step)){
				map[i][step]="O";
				nQueen(step+1);
				map[i][step]=null;
			}
		}
	}
	
	static boolean possible(int step){
		
		for(int i=0;i<step;i++){
			if(arr[step]==arr[i]){
				map[i][step]="X";
				return false;
			}else if(Math.abs(arr[step]-arr[i])==Math.abs(step-i)){
				map[i][step]="X";
				return false;
			}
		}
		
		return true;
	}
	
	static void map(){
		
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(map[j][i]==null){
					sb.append("X").append(" ");
				}else{
					sb.append(map[j][i]).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		map = new String[N][N];
		sb = new StringBuilder();
	}
	
}
