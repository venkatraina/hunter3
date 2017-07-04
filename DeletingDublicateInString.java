package guvi;

import java.util.Scanner;

public class DeletingDublicateInString {

	public static void main(String[] args) {
		String s;
		Scanner in=new Scanner(System.in);System.out.print("Enter the String: ");
		s=in.next();
		char[] c=new char[s.length()];
		for(int i=0;i<s.length();i++){
			c[i]=s.charAt(i);
		}
		for(int i=c.length-1;i>=1;i--){
			for(int j=0;j<i;j++){
				if(c[i]==c[j]){
					c[i]='\0';
				
				}
			}
		}String str=String.valueOf(c);
		str=str.replace("\0","");
		System.out.print("String after deleting dublicate words: ");
		System.out.println(str);
		in.close();

	}

}
