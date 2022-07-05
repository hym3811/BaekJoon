package a0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon_16020 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		ArrayList<String>[] arr = new ArrayList[50];
		for(int i=0;i<N;i++){
			String str=br.readLine();
			int size=str.length();
			if(arr[size-1]==null){
				arr[size-1]=new ArrayList<String>();
			}
			arr[size-1].add(str);
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<50;i++){
			if(arr[i]!=null){
				if(arr[i].size()==1){
					sb.append(arr[i].get(0)).append("\n");
				}else{
					Collections.sort(arr[i]);
					int size = arr[i].size();
					for(int j=0;j<size;j++){
						String temp=arr[i].get(0);
						sb.append(temp).append("\n");
						arr[i].remove(0);
						while(true){
							if(arr[i].contains(temp)){
								arr[i].remove(0);
								j++;
							}else{
								break;
							}
						}
						
					}
				}
			}
		}
		System.out.println(sb);
	}

}
