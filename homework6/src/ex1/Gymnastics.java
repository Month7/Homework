package ex1;

public class Gymnastics implements CompurerAverage{

	@Override
	public double average(double[] x) {
		// TODO Auto-generated method stub
		int count=x.length;
		double aver=0;
		double temp=0;
		for(int i=0;i<count;i++){
			for(int j=i;j<count;j++){
				if(x[i]<x[j]){
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		for(int i=1;i<count-1;i++){
			aver+=x[i];
		}
		if(count>2){
			aver=(aver/count-2);
		}
		else{
			aver=0;
		}
		return aver;
	}
	
}
