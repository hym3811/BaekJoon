package a0629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BaekJoon_9020 {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int num=Integer.parseInt(br.readLine());
		int[] arr=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<arr.length;i++){
			int n=arr[i];
			
			//--------------1~n까지의 소수 리스트 만들기-----------
			boolean[] chk=new boolean[n+1];
			chk[0]=true;chk[1]=true;
			
			for(int j=2;j<Math.sqrt(n);j++){
				
				if(chk[j]==true)
					continue;
				
				for(int k=j*j;k<chk.length;k+=j){
					chk[k]=true;
				}
				
			}
			
			ArrayList<Integer> li=new ArrayList<Integer>();
			for(int j=0;j<chk.length;j++){
				if(chk[j]==false){
					li.add(j);
				}
			}
			//System.out.println("i: "+i);
			//System.out.println(li);
			//----------------소수중에 차가 가장 적은것-----------------
			int prime1=10000,prime2=4;
			for(int j=0;j<li.size();j++){
				int diff=prime1-prime2; //diff의 절대값이 작은 것이 prime1,2를 찾는 기준
				if(diff<0){
					diff=diff*-1;
				}
				if(li.contains(n-li.get(j))){
					int check=li.get(j)-(n-li.get(j));
					if(check<0){
						check=check*-1;
					}
					if(check<diff){
						prime1=li.get(j);
						prime2=n-li.get(j);
						//System.out.println("prime1: "+prime1+"/ prime2: "+prime2);
					}
				}
			}
			//System.out.println("-------------------------------");
			sb.append(prime1).append(" ").append(prime2).append("\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb);

	}

}
