/**
 * Classe che si occupa del mantenimento dei caselli e che comunica con la
 * classe pedaggio per avere il prezzo basato sulla classe del veicolo e
 * sulle tariffe interne all'autostrada 
 * 
 * @package  Autostrade
 * @class    Autostrada
 * @author   Gabriele Colapelle <gabriele.colapellestudent.univaq.it> 252262
 */

package src.Autostrade;

import java.util.*;

public class Autostrada{
    private String nome;
    private boolean tipologia;              // Variabile che memorizza se l'autostrada è di montagna (TRUE) o di pianura(FALSE) 
    private ArrayList<Casello> caselli;     // ArrayList di tutti i caselli presenti su una autostrada.
    private HashMap<String,Double> tariffe; // Composta da classe del veicolo e maggiorazione per relativa classe.
    

      /** Costruttore base */
    public Autostrada(String nome, boolean tipologia){
        this.nome = nome;
        this.tipologia = tipologia;
        this.tariffe = new HashMap<String,Double>();
        this.caselli = new ArrayList<Casello>();
    }

    /**costruttore completo */
    public Autostrada(String nome, HashMap<String,Double> tariffe, ArrayList<Casello> caselli, boolean tipologia){
        this.nome = nome;
        this.tariffe = tariffe;
        this.caselli = caselli;
        this.tipologia = tipologia;
    }
    
    /**
     * Metodo che comunica con la classe pedaggio trasmettendo i km percorsi, 
     * la classe del veicolo e l'oggetto veicolo in modo che Pedaggio possa 
     * avere le informazioni per calcolare eventuali maggiorazioni .
     */
    public double pedaggio(int km, Veicolo veicolo){    
        String classe = Normativa.getClasseVeicolo(veicolo);
        double tariffa = this.tariffe.get(classe);
        return Pedaggio.calcola(veicolo, tariffa, km, tipologia);
    }

    /**
     * Metodi get e set
     */
    public String getNome(){ return this.nome; }
    public void setNome(String nome){ this.nome = nome; }

    public HashMap<String,Double> getTariffe(){ return this.tariffe; }
    public void setTariffe(HashMap<String,Double> tariffe){ this.tariffe = tariffe; }

    public ArrayList<Casello> getCaselli(){ return this.caselli; }
    public void setCaselli(ArrayList<Casello> caselli){ this.caselli = caselli; }

    public boolean getTipologia(){ return this.tipologia; }
    public void setTipologia(boolean tipologia){ this.tipologia = tipologia; }
}