/*
 -----------------------------------------------------------------------------------
 Laboratoire : RES - labo 00
 Fichier     : Flute.java
 Auteur(s)   : Dardan Selimi
 Date        : 26.02.2016

 Remarque(s) : aucune

 Compilateur : jdk 1.8.0_60
 -----------------------------------------------------------------------------------
*/
package ch.heigvd.res.lab00;

/**
 * 
 * interface representing a flute
 */
public class Flute implements IInstrument {

   private final int soundVolume = 5;
   private final String color = "vermillon";

   @Override
   public String play() {
      return "bububu"; // pourquoi pas
   }

   @Override
   public int getSoundVolume() {
      return soundVolume;
   }

   @Override

   public String getColor() {
      return color;
   }
}
