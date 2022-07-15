package a0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_2609 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		int sum=0; //최소 공배수
		int p = 0;
		if(n1>n2){
			sum=n1;
			p = n1;
			while(true){
				if(sum%n2==0){
					break;
				}
				sum+=p;
			}
		}else{
			sum=n2;
			p = n2;
			while(true){
				if(sum%n1==0){
					break;
				}
				sum+=p;
			}
		}
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		int i=0; // i=1 구간은 한번만
		while(true){
			i++;
			if(n1%i==0){
				arr1.add(i);
				n1=n1/i;
				i=1;
			}
			if(n1==1){
				break;
			}
		}
		i=0; // i=1 구간은 한번만
		while(true){
			i++;
			if(n2%i==0){
				arr2.add(i);
				n2=n2/i;
				i=1;
			}
			if(n2==1){
				break;
			}
		}
		
		/*System.out.println(arr1);
		System.out.println(arr2);
		System.out.println("-------------");*/
		
		int multi = 1;
		if(arr1.size()<arr2.size()){
			for(i=0;i<arr1.size();i++){
				if(arr2.contains(arr1.get(i))){ //중복되는 약수
					multi*=arr1.get(i);
					arr2.set(arr2.indexOf(arr1.get(i)),0);
					arr1.set(arr1.indexOf(arr1.get(i)),0);

					//System.out.println(arr1);
					//System.out.println(arr2);
				}
			}
		}else{
			for(i=0;i<arr2.size();i++){
				if(arr1.contains(arr2.get(i))){
					multi*=arr2.get(i);
					arr1.set(arr1.indexOf(arr2.get(i)),0);
					arr2.set(arr2.indexOf(arr2.get(i)),0);

					//System.out.println(arr1);
					//System.out.println(arr2);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(multi).append("\n").append(sum);
		System.out.println(sb);
		
	}

}
