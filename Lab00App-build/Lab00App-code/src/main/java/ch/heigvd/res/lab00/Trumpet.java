/*
 -----------------------------------------------------------------------------------
 Laboratoire : RES - labo 00
 Fichier     : Trumpet.java
 Auteur(s)   : Dardan Selimi
 Date        : 26.02.2016

 Remarque(s) : aucune

 Compilateur : jdk 1.8.0_60
 -----------------------------------------------------------------------------------
*/
package ch.heigvd.res.lab00;

/**
 *
 * Classe Trumpet representing the trumpet instrument
 */
public class Trumpet implements IInstrument {

   private final int soundVolume = 10;
   private final String color = "golden";

   @Override
   public String play() {
      return "pouet";
   }

   @Override
   public int getSoundVolume() {
      return soundVolume;
   }

   public String getColor() {
      return color;
   }
}
