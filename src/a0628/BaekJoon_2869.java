package a0628;

import java.io.*;
import java.util.*;

public class BaekJoon_2869 {

	public static void main(String[] args) throws IOException {

		StringTokenizer st=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine()," ");
		
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int v=Integer.parseInt(st.nextToken())-a;
		int count;
		if(v%(a-b)==0)
			count=(v/(a-b))+1;
		else
			count=(v/(a-b))+2;
		System.out.println(count);
	}
}
