package a0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_14888 {
	
	static int[] arr;
	static int[] op = new int[4];
	static ArrayList<Integer> operator = new ArrayList<Integer>();
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<4;i++){
			op[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<4;i++){
			for(int j=0;j<op[i];j++){
				operator.add(i);
			}
		}
		boolean[] chk = new boolean[operator.size()];
		
		fx(1,chk,arr[0]);
		System.out.println(max);
		System.out.println(min);
		
	}
	
	static void fx(int arr_idx,boolean[] chk,int val){
		
		if(arr_idx==arr.length){
			if(val>max){
				max=val;
			}
			if(val<min){
				min=val;
			}
			return;
		}
		
		for(int i=0;i<operator.size();i++){
			if(chk[i]==false){
				switch(operator.get(i)){
				case 0:
					val+=arr[arr_idx];
					break;
				case 1:
					val-=arr[arr_idx];
					break;
				case 2:
					val*=arr[arr_idx];
					break;
				case 3:
					val/=arr[arr_idx];
					break;
				}
				chk[i]=true;
				fx(arr_idx+1,chk,val);
				
				switch(operator.get(i)){
				case 0:
					val-=arr[arr_idx];
					break;
				case 1:
					val+=arr[arr_idx];
					break;
				case 2:
					val/=arr[arr_idx];
					break;
				case 3:
					val*=arr[arr_idx];
					break;
				}
				chk[i]=false;
			}
		}
		
		
	}

}
