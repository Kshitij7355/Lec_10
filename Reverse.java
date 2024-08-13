package lec10;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,5,7,9};
		Reverse(arr);

	}
	public static void Reverse(int[]arr) {
		int []other = new int[arr.length];
		int j = arr.length-1;
		for(int i =0;i<arr.length;i++) {
			other[j]=arr[i];
			j--;
		}
		for(int k = 0;k<arr.length;k++) {
			System.out.print(other[k]+" ");
		}
	}

}
