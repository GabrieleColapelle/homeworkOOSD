/**
 * Classe creata per semplificare il testing del software
 * 
 * @package  Autostrade.Test
 * @class    Q3
 * @author   Gabriele Colapelle <gabriele.colapelle@student.univaq.it>
 */

package src.Autostrade.Test;
import src.Autostrade.Veicolo;

public class Q3 extends Veicolo{
    public Q3(String targa, int anno){
        super(
            "Q3",
            "Audi", 
            targa, 
            1600, 
            80, 
            anno,
            2,
            115, 
            1890, 
            1.592
        );
    }
}