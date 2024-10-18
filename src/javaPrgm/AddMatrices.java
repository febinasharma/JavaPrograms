package javaPrgm;

public class AddMatrices {

	public static void main(String[] args) {
//		int a[][]= {{1,2,2},{3,4,1},{2,1,5}};
//		int b[][]= {{6,2,1},{3,5,7},{0,1,0}};
//		
//		int c[][]=new int[3][3];
//		
//		
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//			c[i][j]=0;      
//			for(int k=0;k<3;k++)      
//			{     
//				c[i][j]+=a[i][k]*b[k][j];
//			}
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
int d[][]= {{1,2,2},{3,4,1}};
int e[][]= {{6,2},{3,5},{0,1}};
int f[][]=new int[d.length][e[0].length];
		
for(int i=0;i<d.length;i++)
{
	for(int j=0;j<e[0].length;j++)
	{
		for(int k=0;k<d[0].length;k++)      
		{  
		f[i][j]+=d[i][k]*e[k][j];
		}
		System.out.print(f[i][j]+" ");
	}
	System.out.println();
}
		

		
	}

}
