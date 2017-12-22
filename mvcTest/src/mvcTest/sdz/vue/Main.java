package mvcTest.sdz.vue;
import mvcTest.sdz.controler.*;
import mvcTest.sdz.model.*;
import mvcTest.sdz.vue.Calculette;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciation de notre mod�le
	    AbstractModel calc = new Calculator();
	    //Cr�ation du contr�leur
	    AbstractControler controler = new CalculetteControler(calc);
	    //Cr�ation de notre fen�tre avec le contr�leur en param�tre
	    Calculette calculette = new Calculette(controler);
	    //Ajout de la fen�tre comme observer de notre mod�le
	    calc.addObserver(calculette);
	}

}
