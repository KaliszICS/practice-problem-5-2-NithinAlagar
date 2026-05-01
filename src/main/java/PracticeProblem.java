/**

        * File: Lesson 5.2 - arrays searching, copying, appending

        * Author: Nithin.A

        * Date Created: may 1, 2026

        * Date Last Modified: may 1, 2026

        */
public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int findValue(int num, int[] arr){
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == num){
				return i;
			}
		}
		return -1;
	}

	public static int findThirdValue(String var, String[] arr){
		int idx = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i].equals(var)){
				idx += 1 ;
			}
			if (idx==3){
				return i;
			}
		}
		return -1;
	}

	public static double[] append(double num, double[] arr){
		double[] arr1 = new double[arr.length + 1];
		for (int i = 0; i < arr.length; i++){
			arr1[i] = arr[i];
		}
		arr1[arr.length] = num;
		return arr1;
	}


}
