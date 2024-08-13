package Lec10;

import java.util.Arrays;
import java.util.Scanner;

public class Aggrow_Cow {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nos =s.nextInt();
		int noc=s.nextInt();
		int[]stall=new int[nos];
		for (int i = 0; i < stall.length; i++) {
			stall[i]=s.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(MinDistance(stall,noc));
	}
	public static int MinDistance(int[]stall,int noc) {
		int lo=stall[0];
		int ans=0;
		int hi=stall[stall.length-1];
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(IsitPossible(stall,noc,mid)==true) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}
	public static boolean IsitPossible(int[] stall, int noc, int mid) {
           int pos=stall[0];
           int cowcn=1;
           for (int i = 1; i < stall.length; i++) {
			if(stall[i]-pos>=mid) {
				cowcn++;
				pos=stall[i];
			}
			if(cowcn==noc) {
				return true;
			}
		}
         return false;  
	}

}
