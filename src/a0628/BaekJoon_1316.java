package a0628;

import java.io.*;
import java.util.*;

public class BaekJoon_1316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num=Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++){
			sb.append(br.readLine()).append(" ");
		}
		StringTokenizer st=new StringTokenizer(sb.toString()," ");
		Boolean[] chk=new Boolean[st.countTokens()];
		Arrays.fill(chk,true);
		for(int i=0;i<chk.length;i++){
			String str=st.nextToken();
			ArrayList<Character> ch=new ArrayList<Character>();
			
			for(int j=0;j<str.length();j++){
				char c = str.charAt(j);
				if(ch.contains(c)){
					if(ch.get(ch.size()-1)!=c){
						chk[i]=false;
						break;
					}
				}
				ch.add(c);
			}
		}
		int count=0;
		for(int i=0;i<chk.length;i++){
			if(chk[i]==true){
				count++;
			}
		}
		System.out.println(count);
	}
}