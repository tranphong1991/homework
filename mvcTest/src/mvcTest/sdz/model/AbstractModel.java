package mvcTest.sdz.model;

import java.util.ArrayList;
import mvcTest.sdz.observer.Observable;
import mvcTest.sdz.observer.Observer;

public abstract class AbstractModel {
	protected double result = 0;
	protected String operateur = "", operande = "";
	private ArrayList<Observer> listObserver = new ArrayList<Observer>();
	
	public abstract void reset();
	public abstract void calcul();
	public abstract void getResultat();
	public abstract void setOperateur(String operateur);
	public abstract void setNombre(String nbre);
	
	public void addObserver(Observer obs){
		this.listObserver.add(obs);
	}
	
	//???
	public void notifyObserver(String str){
	    if(str.matches("^0[0-9]+"))
	        str = str.substring(1, str.length());

	      for(Observer obs : listObserver)
	        obs.update(str);
	}
	
	public void removeObserver(){
		listObserver = new ArrayList<Observer>();
	}
	
}
