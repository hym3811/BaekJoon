package a0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_10814 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList[] arr = new ArrayList[201];
		for(int i=0;i<N;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int age=Integer.parseInt(st.nextToken());
			if(arr[age]==null){
				arr[age]=new ArrayList<String>();
			}
			arr[age].add(st.nextToken());
		}
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<201;i++){
			if(arr[i]!=null){
				if(arr[i].size()==1){
					sb.append(i).append(" "+arr[i].get(0)+"\n");
				}else{
					for(int j=0;j<arr[i].size();j++){
						sb.append(i).append(" "+arr[i].get(j)+"\n");
					}
				}
			}
		}
		System.out.println(sb);
	}

}
