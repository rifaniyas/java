package rifa;

import java.util.Scanner;
public class MatrixAdd {

	public static void main(String[] args) {
		int p,q,m,n,i,j;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number of rows in Matrix A:");
		p=s.nextInt();
		System.out.print("Enter number of column in Matrix A:");
		q=s.nextInt();
		System.out.print("Enter number of rows in Matrix B:");
		m=s.nextInt();
		System.out.print("Enter number of column in Matrix B:");
		n=s.nextInt();
		if (p==m &&q==n) {
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			System.out.println("Enter the element of Matrix A:");
			for(i=0;i<p;i++) {
				for(j=0;j<q;j++)
					a[i][j]=s.nextInt();
			}
			System.out.println("Enter the element of Matrix B:");
			for(i=0;i<m;i++) {			
				for(j=0;j<n;j++)
					b[i][j]=s.nextInt();
			}
			
		
		
		System.out.println("Matrix A :");
		for(i=0;i<p;i++) {
			for(j=0;j<q;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix B :");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("The sum metrix:");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print((a[i][j]+b[i][j])+" ");
			}
			System.out.println();
		}
		
	}
		else {
			System.out.println("These metrices cannot be added..");
		}
}
	
}






















