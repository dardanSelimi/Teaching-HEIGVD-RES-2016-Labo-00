/*
 -----------------------------------------------------------------------------------
 Laboratoire : RES - labo 00
 Fichier     : IInstrument.java
 Auteur(s)   : Dardan Selimi
 Date        : 26.02.2016

 Remarque(s) : aucune

 Compilateur : jdk 1.8.0_60
 -----------------------------------------------------------------------------------
*/
package ch.heigvd.res.lab00;

/**
 * 
 * interface representing a generic music instrument
 */
public interface IInstrument {
   String play();
   int getSoundVolume();
   String getColor();
}
