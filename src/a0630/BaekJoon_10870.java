package a0630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BaekJoon_10870 {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		Call2 c = new Call2();
		c.n = Integer.parseInt(br.readLine());
		
		c.rs(2);

	}

}
class Call2{
	
	ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(0,1));
	int n;
	int result;
	
	public void rs(int num){
		
		if(n<=1){
			System.out.println(arr.get(n));
		}else if(num<=n){
			result=arr.get(num-1)+arr.get(num-2);
			arr.add(result);
			rs(num+1);
		}else if(num>n){
			System.out.println(result);
		}
		
	}
	
}