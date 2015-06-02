package akou.open;

import java.util.Random;

/**
 * Created by Corentin on 29/05/2015.
 */
public class FactBook {
    public String[] mFacts = {
            "'Adversity causes some men to break; others to break records.' - William Arthur Ward",
            "'bdversity causes some men to break; others to break records.' - William Arthur Ward",
            "'cdversity causes some men to break; others to break records.' - William Arthur Ward",
            "'ddversity causes some men to break; others to break records.' - William Arthur Ward",
            "'edversity causes some men to break; others to break records.' - William Arthur Ward",

            };

    public String getFact() {

        // The button was clicked, so update the fast with a new one
        String fact = "";
        // Select a random fact
        Random randomGenerator = new Random(); //Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];
        return fact;
    }
}

