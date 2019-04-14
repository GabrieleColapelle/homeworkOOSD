/**
 * Esempio di utilizzo del package creato
 * 
 * @author   Gabriele Colapelle <gabriele.colapelle@student.univaq.it>
 */

import java.util.*;
import src.Autostrade.*;
import src.Autostrade.Test.Q3;

public class Main{
    public static void main(String[] args){
        HashMap<String,Double> tariffe = new HashMap<String,Double>();
        ArrayList<Casello> caselli = new ArrayList<Casello>();

        for(String classeVeicolo : Normativa.CLASSI){
            tariffe.put(classeVeicolo, doubleRand(1.414, 3.141));
        }

        Autostrada A25 = new Autostrada("A25", true);

        Casello a = new Casello(A25, "Casello a", 200);
        Casello b = new Casello(A25, "Casello b", 300);
        Casello c = new Casello(A25, "Casello c", 400);
        caselli.add(a);
        caselli.add(b);
        caselli.add(c);

        A25.setCaselli(caselli);
        A25.setTariffe(tariffe);

        Veicolo veicA = new Q3("AB123CD", 2019);
        Veicolo veicB = new Q3("AB345CD", 2019);
        Veicolo veicC = new Q3("AB678CD", 2019);

        veicA.entra(b);
        veicB.entra(a);
        veicA.esce(c);
        veicC.entra(a);
        veicC.esce(c);
        veicB.esce(b);
    }

    public static double doubleRand(double min, double max){
       double range = (max - min) + 1;     
       return (double)(Math.random() * range) + min;
    }
}