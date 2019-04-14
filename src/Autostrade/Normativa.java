/**
 * Classe che si occupa della normativa corrente infatti
 * contiente tutti quelle costanti, che in base alla normativa
 * vigente, possono cambiare rendendo il sistema indipendente 
 * dalle variazioni delle normative, che come sappiamo possono cambiare frequentemente.
 * 
 * @package  Autostrade
 * @class    Normativa
 * @author   Gabriele Colapelle <gabriele.colapelle@student.univaq.it>
 */

package src.Autostrade;

public class Normativa{
    public static final int IVA = 22;
    public static final String CLASSI[] = {"A", "B", "3", "4", "5"};
    
    /**
     * Da implementare per la normativa del 2021 e del 2026
     */
    public static double differenziazione(Veicolo veicolo){ return 0; }
     
    /**
     * Metodo che calcola la classe del veicolo.
     */
    public static String getClasseVeicolo(Veicolo veicolo){
        if( veicolo.getAssi() <=2 ) return "A";
        if( veicolo.getAssi() == 2 && veicolo.getAltezza() <= 1.30) return "A";
        if( veicolo.getAssi() == 2 && veicolo.getAltezza() > 1.30) return "B";
        if( veicolo.getAssi() == 3 ) return "3";
        if( veicolo.getAssi() == 4 ) return "4";
        
        return "5";
    }
        
}
