package Lec10;

import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nob=s.nextInt();
		int nos=s.nextInt();
		int[]arr=new int[nob];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(MaxPages(arr,nos));

	}
	public static int MaxPages(int[]arr,int nos) {
		int lo=0;
		int hi=0;
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			hi+=arr[i];
		}
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(IsitPossible(arr, nos,mid)==true) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}
	public static boolean IsitPossible(int[] arr, int nos, int mid) {
		int readpage=0;
		int std=1;
		for (int i = 0; i < arr.length; i++) {
			if(readpage+arr[i]<=mid) {
				readpage+=arr[i];
			}
			else {
				std++;
				readpage=arr[i];
				
			}
			if(std>nos) {
				return false;
			}
		}
		return true;
	}

}
