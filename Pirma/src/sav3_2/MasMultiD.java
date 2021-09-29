package sav3_2;

public class MasMultiD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [][] m2d=new int [3][3];
		int m2d [][]= { {5,3,7}, {1,3,5,8,3,6}, {7,5,6,4}, {2,5,6} };
//		int z=0;
//				
////		for (int i=0; i<3;i++) {
////			for (int y=0; y<3;y++) {
////				m2d[i][y]=z++; //seip kad betkoki sk imestu
////			}
////		}
//		
//		m2d[2][1]=99;
//		m2d[2]=m2d[0].clone();
//		m2d[0][0]=0;
		
////		for (int i=0; i<3;i++) {
//		for (int i=0; i<m2d.length;i++) {
////			for (int y=0; y<3;y++) {
//			for (int y=0; y<m2d[i].length;y++) {
//				System.out.print(m2d[i][y]+" ");
//			}
//			System.out.println();
//		} 
		
		for (int m1[] :m2d) {
			for (int s: m1) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}

}
