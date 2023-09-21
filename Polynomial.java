public class Polynomial{
    double[] coefficients;
  
    public Polynomial(){
      coefficients = new double[] {0};
    }

    public Polynomial(double[] array){
      coefficients = array;
    }

    public Polynomial add(Polynomial additive){
      Polynomial new_p = new Polynomial();
      if(additive.coefficients.length>coefficients.length){
	new_p = new Polynomial(additive.coefficients);
	for(int i=0;i<coefficients.length;i++){
      	    new_p.coefficients[i]=new_p.coefficients[i]+coefficients[i];
        } 
      }
      else{
	new_p = new Polynomial(coefficients);
	for(int i=0;i<additive.coefficients.length;i++){
      	    new_p.coefficients[i]=new_p.coefficients[i]+additive.coefficients[i];
        }
      }
	 
      return new_p;
    }

    public double evaluate(double num){
      double result=coefficients[0];
      for(int i=1;i<coefficients.length;i++){
	double x_val=num;
	for(int j=1;j<i;j++){
	  x_val=x_val*num;
	}
	result = result + coefficients[i]*x_val;
      }
	return result;
      }

    public boolean hasRoot(double root){
	double result = evaluate(root);
	return result==0;
    }

}