package ex1;

public class School implements CompurerAverage{

	@Override
	public double average(double[] x) {
		// TODO Auto-generated method stub
		double aver=0;
		for(int i=0;i<x.length;i++){
			aver+=x[i];
		}
		aver=(aver/x.length);
		return aver;
	}

}
