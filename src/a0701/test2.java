package a0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class test2 {

	static ArrayList<Integer> a = new ArrayList<Integer>();
	static ArrayList<Integer> b = new ArrayList<Integer>();
	static ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>(Arrays.asList(a,b));
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<2;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int ea = st.countTokens();
			for(int j=0;j<ea;j++){
				arr.get(i).add(Integer.parseInt(st.nextToken()));
			}
		}
		
		turn(arr);
		
	}

	static void turn(ArrayList<ArrayList<Integer>> arr){
		
		if(arr.get(1).size()==0){
			Collections.sort(arr.get(0));
			System.out.println(arr.get(0));
		}else{
			arr.get(0).add(arr.get(1).get(0));
			arr.get(1).remove(0);
			turn(arr);
		}
		
	}
	
}
