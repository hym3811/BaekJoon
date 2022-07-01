package a0629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_10757 {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		String str1=st.nextToken(),str2=st.nextToken();
		
		int diff=str1.length()-str2.length();
		int size=0;
		if(diff>0){
			String p="";
			for(int i=0;i<diff;i++){
				p+="0";
			}
			str2=p+str2;
			size=str1.length();
		}else if(diff<0){
			diff*=-1;
			String p="";
			for(int i=0;i<diff;i++){
				p+="0";
			}
			str1=p+str1;
			size=str2.length();
		}else{
			size=str1.length();
		}
		
		ArrayList<Integer> num1=new ArrayList<Integer>();
		ArrayList<Integer> num2=new ArrayList<Integer>();
		ArrayList<Integer> num3=new ArrayList<Integer>();
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		for(int i=0;i<size;i++){
			num1.add(Character.getNumericValue(str1.charAt(i)));
			num2.add(Character.getNumericValue(str2.charAt(i)));
			num3.add(0);
			result.add(0);
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=size-1;i>=0;i--){
			int chk=num1.get(i)+num2.get(i)+num3.get(i);
			if(i>0){
				num3.set(i-1, chk/10);
				result.set(i, chk%10);
			}else{
				result.set(i, chk);
			}
		}
		for(int i=0;i<result.size();i++){
			sb.append(result.get(i));
		}System.out.println(sb);
	}

}
