package a0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_2580 {
	
	static StringBuilder sb = new StringBuilder();
	static int size;
	static int[] count = new int[3];
	static boolean[][] check = new boolean[3][9];
	static int[][] map = new int[9][9];
	static ArrayList<String> arr = new ArrayList<String>();
	
	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i=0;i<9;i++){ //i=y
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<9;j++){ //j=x
				map[i][j]=Integer.parseInt(st.nextToken());
				if(map[i][j]==0){
					arr.add(i+" "+j);
				}
			}
		}size = arr.size();
		/*ps(1);
		ps(12);*/
		quest(0);
	}

	static void quest(int idx){
		if(idx==size){
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					sb.append(map[i][j]).append(" ");
				}sb.append("\n");
			}System.out.println(sb);
			System.exit(0);
			return;
		}
		else{
			StringTokenizer st = new StringTokenizer(arr.get(idx)," ");
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			ArrayList<Integer> ar = ps(idx);
			//System.out.println("idx: "+idx+" / ar: "+ar);
			if(ar.size()==0){
				return;
			}
			for(int i=0;i<ar.size();i++){
				map[y][x]=ar.get(i);
				quest(idx+1);
				map[y][x]=0;
			}
		}
		return;
	}
	
	static ArrayList<Integer> ps(int idx){
		StringTokenizer st = new StringTokenizer(arr.get(idx)," ");
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<9;i++){
			if(map[y][i]!=0){
				check[0][map[y][i]-1]=true; //가로 탐색
				count[0]++;
			}
			if(map[i][x]!=0){
				check[1][map[i][x]-1]=true; //세로 탐색
				count[1]++;
			}
		}
		for(int i=3*(y/3);i<3*(y/3+1);i++){ //3x3 탐색
			for(int j=3*(x/3);j<3*(x/3+1);j++){
				if(map[i][j]!=0){
					check[2][map[i][j]-1]=true;
					count[2]++;
				}
			}
		}
		
		/*System.out.println(Arrays.toString(check[0]));
		System.out.println(Arrays.toString(check[1]));
		System.out.println(Arrays.toString(check[2]));*/
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<9;i++){
			if(check[0][i]==false&&check[1][i]==false&&check[2][i]==false){
				list.add(i+1);
			}
		}//System.out.println(list);
		
		count = new int[3];
		check = new boolean[3][9];
		return list;
	}
	
}
