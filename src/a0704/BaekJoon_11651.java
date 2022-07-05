package a0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_11651 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		ArrayList[] arr = new ArrayList[200001];
		for(int i=0;i<N;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(arr[y+100000]==null){
				arr[y+100000]=new ArrayList<Integer>();
				arr[y+100000].add(x);
			}else{
				arr[y+100000].add(x);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<200001;i++){
			if(arr[i]!=null){
				if(arr[i].size()==1){ //동일 x좌표값이 1개일 때
					sb.append(arr[i].get(0)).append(" ").append(i-100000).append("\n");
				}else{ //동일 x 좌표값이 2개이상일 때
					int size=arr[i].size();
					Collections.sort(arr[i]);
					for(int j=0;j<size;j++){
						sb.append(arr[i].get(0)).append(" ").append(i-100000).append("\n");
						arr[i].remove(0);
					}
				}
			}
		}
		System.out.println(sb);
	}

}
