package a0630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
	
	public static ArrayList<ArrayList<Integer>>arr=new ArrayList<ArrayList<Integer>>();
	
	public static ArrayList<Integer> bd1=new ArrayList<Integer>();
	public static ArrayList<Integer> bd2=new ArrayList<Integer>();
	public static ArrayList<Integer> bd3=new ArrayList<Integer>();
	
	static int N;
	
	static int count=0;
	
	static boolean chk;
	
	static int num1,num2,num3;
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int ct=2;
		for(int i=1;i<N;i++){
			ct*=2;
		}sb.append(ct-1).append("\n");
		
		bd1.add(N+1);
		bd2.add(N+1);
		bd3.add(N+1);
		
		for(int i=N;i>=1;i--){
			bd1.add(i);
		}
		
		arr.add(bd1);
		arr.add(bd2);
		arr.add(bd3);
		System.out.println(arr);
		
		if(N%2==1)
			chk=true;
		else
			chk=false;
		
		if(chk){
			play(1,0,2);
		}else{
			play(1,0,1);
		}
		
	}
	
	static void play(int n,int a,int b){
		
		if(count==0){
			count++;
			arr.get(b).add(arr.get(a).get(arr.get(a).size()-1));
			arr.get(a).remove(arr.get(a).size()-1);
			sb.append(arr.get(b).get(arr.get(b).size()-1)).append(" ").append(b+1).append("\n");
			
		}else if(arr.get(2).size()!=N+1){
			System.out.println("체크");
		}else{
			
		}
		
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}