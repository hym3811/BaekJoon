package a0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BaekJoon_2750 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<number;i++){
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		StringBuilder sb = new StringBuilder();
		while(arr.size()!=0){
			int min = 1000;
			for(int i=0;i<arr.size();i++){
				if(arr.get(i)<min)
					min=arr.get(i);
			}
			sb.append(min).append("\n");
			arr.remove(arr.indexOf(min));
		}
		sb.setLength(sb.length()-1);
		System.out.println(sb);
	}

}
