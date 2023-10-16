package org.hbrs.se1.ws23.uebung1.factory;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;

public class GermanTranslatorFactory
{
    public static GermanTranslator create()
    {
        return new GermanTranslator();
    }
}
