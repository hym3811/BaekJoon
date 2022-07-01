package a0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Fail_11729 {
	
	static ArrayList<Integer>[] arr = new ArrayList[3];
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr[0]=new ArrayList<Integer>();
		arr[1]=new ArrayList<Integer>();
		arr[2]=new ArrayList<Integer>();
		int num = Integer.parseInt(br.readLine());
		for(int i=num;i>0;i--){
			arr[0].add(i);
		}
		if(num%2==1){
			f1();
		}else{
			f2();
		}
	}
	
	static void fx(int n){
		
		if(arr[2].size()>0){//arr[2]의 마지막 값이 n일 때
			if((arr[2].get(arr[2].size())-1)==n){
				fx(n);
			}
		}
		
	}
	
	static void f1(){
		arr[2].add(arr[0].get(arr[0].size()-1));
		arr[0].remove(arr[0].size()-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void f2(){
		arr[1].add(arr[0].get(arr[0].size()-1));
		arr[0].remove(arr[0].size()-1);
		System.out.println(Arrays.toString(arr));
	}
	
}