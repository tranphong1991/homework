package mvcTest.sdz.controler;
import java.util.ArrayList;
import mvcTest.sdz.model.AbstractModel;


public abstract class AbstractControler {
	protected AbstractModel calc;
	protected String operateur = "", nbre ="";
	protected ArrayList<String> listOperateur = new ArrayList<String>();
	
	public AbstractControler(AbstractModel cal){
		this.calc = cal;
		
		this.listOperateur.add("+");
		this.listOperateur.add("-");
		this.listOperateur.add("*");
		this.listOperateur.add("/");
		this.listOperateur.add("=");
		
	}
	
	public void setOperateur(String ope){
		this.operateur = ope;
		control();
	}
	
	public void setNombre(String nombre){
		this.nbre = nombre;
		control();
	}
	
	public void reset(){
		this.calc.reset();
	}
	
	abstract void control();
	
}
