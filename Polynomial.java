public class Polynomial{
    double[] coefficients;
    int[] exponents;
  
    public Polynomial(){
      coefficients = new double[] {0};
    }

    public Polynomial(double[] coefficients, int[] exponents){
      this.coefficients = coefficients;
      this.exponents = exponents;
    }

    public Polynomial(File filePath){
	/* change the negative sign to +- -> split between plus sign -> split with x
	*/
	
    }

    public Polynomial add(Polynomial additive){
      int max_e = Math.max(this.exponents[exponents.length-1], additive.exponents[additive.exponents.length-1]);
      double[] new_c = new doube[max_e+1];
      int[] new_e = new int[max_e+1];

      for(int i=0;i<max_e+1;i++){
	
      }

      return new_p;
    }

    public double evaluate(double num){
      double result=0;
      for(int i=0;i<coefficients.length;i++){
	double x_val=num;
	if(exponents[i]==0){
	    x_val = 1;
	}
	else{
	    for(int j=1;j<exponents[i];j++){
	        x_val=x_val*num;
	    }
	}
	result = result + coefficients[i]*x_val;
      }
	return result;
      }

    public boolean hasRoot(double root){
	double result = evaluate(root);
	return result==0;
    }

    public Polynomial multiply(Polynomial mutiple){
	/* normal multiplication
	*/
    }

    public saveToFile(String fileName){
	
    }
}
