package upg3;
import java.util.Scanner;
import java.lang.Math;

public class Upg3 {
	public static double[] converter(String[] a) {
		double out[] = new double[a.length];
		for(int i = 0;i<a.length;i++) 
			 out[i] = Double.parseDouble(a[i]);
			
		return out;
		
	}
	
	public static double DistanceCalc(double[] a, double[] b) {
		double d = Math.sqrt((b[0]-a[0])*(b[0]-a[0])+(b[1]-a[1])*(b[1]-a[1])+(b[2]-a[2])*(b[2]-a[2]));
	
		return d;
			
	}
	public static double SumList(double[] a) {
		double sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		double roundsum = Math.pow(10,3);
		return Math.round(sum*roundsum)/roundsum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String antal1 = myObj.nextLine();
		int antal = Integer.parseInt(antal1);
		double list[][];
		list = new double[antal][3];
		
		for(int i = 0;i<antal;i++) {
			String num = myObj.nextLine();
			String list1[] = num.split(" ");
			double swaplist[] = converter(list1);
			
			list[i] = swaplist;
			
		}
	double dlista[];
	dlista = new double[antal-1];
	for(int i = 0;i<antal-1;i++) {
		double d = DistanceCalc(list[i],list[i+1]);
		dlista[i] = d;
		
	
	}
	double ans = SumList(dlista);
	System.out.printf("%.2f %n",ans);
		
	}

}
