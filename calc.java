package calc;

public class calc implements ICalculator {
	
public int add (int x,int y) {
	return (x+y);
}

public float divide(int x, int y)throws RuntimeException{
if(y==0) {
	throw new RuntimeException("Error! can't divide by zero");
}
return ((float)x/(float)y);
}
}