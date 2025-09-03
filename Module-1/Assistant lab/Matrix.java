//Write a program to perform matrix addition and subtraction using 2D arrays.
import java.util.*;
class Matrix{
public static void main(String []args){
int[][] arr1={
{1,1,3},{1,7,9},{9,6,7}
};

int[][] arr2={
{3,8,4},{1,3,9},{7,1,8}
};

addition(arr1,arr2);
subtract(arr1,arr2);
}

public static void addition(int[][] arr1,int[][] arr2){
int[][] ans=new int[3][3];
for(int i=0;i<arr1.length;i++){
	for(int j=0;j<arr1[i].length;j++){
	ans[i][j]=arr1[i][j]+arr2[i][j];
	}
}
System.out.println("Addition of matrix : "+Arrays.deepToString(ans));
}

public static void subtract(int[][] arr1,int[][] arr2){
int[][] ans=new int[3][3];
for(int i=0;i<arr1.length;i++){
	for(int j=0;j<arr1[i].length;j++){
	ans[i][j]=arr1[i][j]-arr2[i][j];
	}
}
System.out.println("subtraction of matrix : "+Arrays.deepToString(ans));
}
}