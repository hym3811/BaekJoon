package a0628;

import java.io.*;
import java.util.*;

public class BaekJoon_10250 {
	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		ArrayList<String> str=new ArrayList<String>();
		for(int i=0;i<num;i++){
			str.add(br.readLine());
		}
		StringTokenizer st;
		for(int i=0;i<str.size();i++){
			st=new StringTokenizer(str.get(i), " ");
			int h=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			int n=Integer.parseInt(st.nextToken());
			
			int x,y;
			switch(n%h){
			case 0:
				x=n/h;
				y=h;
				break;
				
				default:
					x=n/h+1;
					y=n%h;
					break;
			}
			
			String p;
			if(x<10){
				p=Integer.toString(y)+"0"+Integer.toString(x);
			}else{
				p=Integer.toString(y)+Integer.toString(x);
			}
			System.out.println(p);
			
		}
	}
}
