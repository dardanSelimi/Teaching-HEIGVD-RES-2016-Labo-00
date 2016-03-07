/*
 -----------------------------------------------------------------------------------
 Laboratoire : RES - labo 00
 Fichier     : Orchestra.java
 Auteur(s)   : Dardan Selimi
 Date        : 07.03.2016

 Remarque(s) : aucune

 Compilateur : jdk 1.8.0_60
 -----------------------------------------------------------------------------------
*/
package ch.heigvd.res.lab00;
import java.util.ArrayList;
import java.util.List;


public class Orchestra{

	private ArrayList<IInstrument> instruments = new ArrayList<IInstrument>(); 
	public Orchestra(){}
        
	public void addInstrument(IInstrument ins){
		instruments.add(ins);
	}
        public int getNumberOfInstruments(){
           return instruments.size();
        }
        public List<String> makeMusic(){
           List<String> sounds = new ArrayList<String>();
           for(int i = 0; i < instruments.size(); i++){
              sounds.add(instruments.get(i).play());
           }
           return sounds;
        }
       
}