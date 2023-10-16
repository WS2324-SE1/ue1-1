package org.hbrs.se1.ws23.uebung1.view;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws23.uebung1.factory.GermanTranslatorFactory;

public class Client {

		/*
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */
		 void display( int aNumber ){
			var german_translator = GermanTranslatorFactory.create();

			System.out.println("Das Ergebnis der Berechnung: " + german_translator.translateNumber(aNumber));

		 }
}





