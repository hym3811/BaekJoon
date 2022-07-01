package a0630;

import java.io.*;
import java.util.*;

public class BaekJoon_9020_HighSpeed {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(br.readLine());
		int[] a=new int[number];
		for(int i=0;i<number;i++){
			a[i]=Integer.parseInt(br.readLine());
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<a.length;i++){
			boolean[] arr=new boolean[a[i]+1];
			//System.out.println("1) a: "+a[i]+"\n"+Arrays.toString(arr));
			
			for(int j=2;j<Math.sqrt(a[i]);j++){
				
				if(arr[j]==true) //소수가 아니면 다음 반복문으로
					continue;
				
				for(int k=j*j;k<=a[i];k+=j){ //j가 소수면 j관련 숫자들을 소수에서 소거
					arr[k]=true;
				}
				
			}
			
			//System.out.println("2) a: "+a[i]+"\n"+Arrays.toString(arr));

			int prime1=0,prime2=0; // 소수1,소수2
			int check=10000; //소수1-소수2의 |최소값|
			int l=arr.length/2;
			for(int j=2;j<=l;j++){
				
				if(arr[j]==true) // 소수가 아니면 다음으로
					continue;
				else{
					if(arr[a[i]-j]==false){ //두 수가 소수일 때 차 비교
						int ck=j-(a[i]-j);
						if(ck<0){ // 절대값으로 만듬
							ck*=-1;
						}
						if(ck<check){ //기존 check보다 작다면 check,prime1,prime2 변경
							check=ck;
							prime1=j;
							prime2=a[i]-j;
						}
					}
				}
				
			}
			
			sb.append(prime1).append(" ").append(prime2).append("\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb);
		
	}
}