package mvcTest.sdz.model;
import mvcTest.sdz.observer.*;


public class Calculator extends AbstractModel{
	
	public void reset(){
		this.result = 0;
		this.operande = "0";
		this.operateur = "";
	};
	
	public void calcul(){
		if (this.operateur.equals("")){
			this.result = Double.parseDouble(this.operande);
		}
		else {
			if (this.operateur.equals("+")){
				this.result += Double.parseDouble(this.operande);
			}
			if (this.operateur.equals("-")){
				this.result -= Double.parseDouble(this.operande);
			}
			if (this.operateur.equals("*")){
				this.result *= Double.parseDouble(this.operande);
			}
			if (this.operateur.equals("/")){
				try{
					this.result /= Double.parseDouble(this.operande);
				}catch(ArithmeticException e){
					this.result = 0;
				}
			}
		}
		this.operande = "";
		notifyObserver(String.valueOf(this.result));
	};
	
	public void getResultat(){
		calcul();
	};
	
	public void setOperateur(String ope){
		calcul();
		
		this.operateur = ope;
		if (!ope.equals("=")){
			this.operande = "";
		}
	};
	
	public void setNombre(String result){
		this.operande += result;
		
		notifyObserver(this.operande);
	};
}
