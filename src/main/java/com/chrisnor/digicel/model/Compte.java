/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chrisnor.digicel.model;

/**
 *
 * @author lenovo
 */
public class Compte {
    
    private StatusCompte statusCompte;
    private String numeroCompte;
    private double montant;
    
    public Compte(){}
    
    public Compte(StatusCompte sCompte, String numero, double montant)
    {
        this.statusCompte = sCompte;
        this.numeroCompte = numero;
        this.montant = montant;
    }
    
    public StatusCompte getStatusCompte()
    {
        return this.statusCompte;
    }
    
    public void setStatusCompte(final StatusCompte sCompte)
    {
        this.statusCompte = sCompte;
    }
    
    public String getNumeroCompte()
    {
        return this.numeroCompte;
    }
    
    public void setNumeroCompte(String numero)
    {
        this.numeroCompte = numero;
    }
    
    public double getMontant()
    {
        return this.montant;
    }
     public void setMontant(double montant)
     {
         this.montant = montant;
     }
     
   
    @Override
     public String toString()
     {
         return String.format( "Le Compte de numero %s a un montant %.3f ",this.numeroCompte,this.montant);
     }
}
