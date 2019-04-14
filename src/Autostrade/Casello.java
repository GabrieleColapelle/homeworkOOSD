/**
 * La classe si occupa dell'uscita del veicolo dall'autostrada
 * calcolando la distanza che il veicolo ha percorso, e comunicando i dati
 * all'autostrada di appartenenza, quest' ultima restituisce il costo finale
 * della tratta.
 * 
 * @package  Autostrade
 * @class    Casello
 * @author   Gabriele Colapelle <gabriele.colapelle@student.univaq.it>
 */

package src.Autostrade;

public class Casello{
    
    private Autostrada appartenenza;  // Autostrada alla quale appartiene il casello
    private String nome;
    private int km;

    /**
     * Costruttore base
     */
    public Casello(Autostrada appartenenza, String nome, int km){
        this.appartenenza = appartenenza;
        this.nome = nome;
        this.km = km;
    }

    /**
     * Calcola i km percorsi dal veicolo e passa le informazioni relative
     * al veicolo all'autostrada che il veicolo sta percorrendo
     */
    public double costoUscita(Casello entrata, Veicolo veicolo){
        int km = this.distanza(entrata);
        return this.appartenenza.pedaggio(km, veicolo);
    }

    /**
     * Calcolo della distanza tra i caselli
     */
    private int distanza(Casello b){
        return Math.abs(this.km - b.getKm()); //valore assoluto
    }

    /**
     * Metodi get e set
     */
    public Autostrada getAppartenenza(){ return this.appartenenza; }
    public void setAppartenenza(Autostrada appartenenza){ this.appartenenza = appartenenza; }

    public String getNome(){ return this.nome; }
    public void setNome(String nome){ this.nome = nome; }

    public int getKm(){ return this.km; }
    public void setKm(int km){ this.km = km; }
}