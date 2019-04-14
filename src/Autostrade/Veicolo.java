/**
 * Questa classe e' il veicolo generalizzato, implementa VeicoloAutostradale
 * ed e' la classe che tutti i veicoli che possono viaggiare in un'autostrada dovranno estendere.
 * In base alle specifiche si e' predisposta anche la base per future modifiche
 * come le emissioni e il rumore, che sono oggetto di normative che entreranno in vigore in futuro.
 * 
 * Ogni veicolo, come nel sistema in uso, quando entra nell'autostrada
 * "prende il biglietto" ovvero salva il casello di entrata e quando esce
 * gli viene comunicato il prezzo dal casello di uscita e paga il costo
 * della tratta
 * 
 * @package  Autostrade
 * @class    Veicolo
 * @author   Gabriele Colapelle <gabriele.colapelle@student.univaq.it>
 */

package src.Autostrade;

public abstract class Veicolo implements VeicoloAutostradale{
    private Casello entrata;
    private String modello;
    private String marca;
    private String targa;
    private int cilindrata;     // In cc
    private int rumore;         // In decibel
    private int anno;
    private int assi;
    private double emissioni;   // In g di CO2 per Km
    private double peso;        // In chilogrammi
    private double altezza;     // In metri rispetto al primo asse

    public Veicolo(String modello, String marca, String targa, int cilindrata, int rumore, int anno, int assi, double emissioni, double peso, double altezza){
        this.modello = modello;
        this.marca = marca;
        this.targa = targa;
        this.cilindrata = cilindrata;
        this.rumore = rumore;
        this.anno = anno;
        this.assi = assi;
        this.emissioni = emissioni;
        this.peso = peso;
        this.altezza = altezza;
    }

    /**
     * Implementazione del metodo entra di VeicoloAutostradale
     */
    public void entra(Casello entrata){
        this.entrata = entrata;
    }

    /**
     * Implementazione del metodo esce di VeicoloAutostradale
     */
    public void esce(Casello uscita){
        this.paga(uscita.costoUscita(this.entrata, this));
    }

    /**
     * Implementazione del metodo paga di VeicoloAutostradale
     
     */
    public void paga(double prezzo){
        System.out.println("Il veicolo "+this.targa+" paga :"+prezzo+ "euro");
    }

    /**
     * Metodi get e set
     */
    public String getModello(){ return this.modello; }
    public void setModello(String modello){ this.modello = modello; }

    public String getMarca(){ return this.marca; }
    public void setMarca(String marca){ this.marca = marca; }

    public String getTarga(){ return this.targa; }
    public void setTarga(String targa){ this.targa = targa; }

    public int getCilindrata(){ return this.cilindrata; }
    public void setCilindrata(int cilindrata){ this.cilindrata = cilindrata; }

    public int getRumore(){ return this.rumore; }
    public void setRumore(int rumore){ this.rumore = rumore; }

    public int getAnno(){ return this.anno; }
    public void setAnno(int anno){ this.anno = anno; }

    public int getAssi(){ return this.assi; }
    public void setAssi(int assi){ this.assi = assi; }

    public double getEmissioni(){ return this.emissioni; }
    public void setEmissioni(double emissioni){ this.emissioni = emissioni; }

    public double getPeso(){ return this.peso; }
    public void setPeso(double peso){ this.peso = peso; }

    public double getAltezza(){ return this.altezza; }
    public void setAltezza(double altezza){ this.altezza = altezza; }
}