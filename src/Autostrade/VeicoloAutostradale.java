/**
 * Interfaccia che permette ad un veicolo di comunicare
 * con la rete autostradale
 * 
 * @package  Autostrade
 * @class    VeicoloAutostradale
 * @author   Gabriele Colapelle <gabriele.colapelle@student.univaq.it>
 */

 package src.Autostrade;

public interface VeicoloAutostradale{
    
    /**
     * Questo metodo deve salvare il casello in cui il veicolo
     * entra nell'autostrada.
     */
    public void entra(Casello A);

    /**
     * Questo metodo deve avviare la procedura di pagamento della
     * tratta quando il veicolo esce al casello B.
    */
    public void esce(Casello B);
    
    /**
     * Questo metodo rappresenta il pagamento della tratta
     * effettuato dal veicolo dopo l'uscita.
     */
    public void paga(double prezzo);
}