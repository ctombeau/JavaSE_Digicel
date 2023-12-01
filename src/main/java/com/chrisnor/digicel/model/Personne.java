/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chrisnor.digicel.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author lenovo
 */
public sealed class Personne permits Client,Employee{
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private char sexe;
    private String phone;
    
    public Personne(){}
    
    public Personne(String nom, String prenom, LocalDate dateNaissance, char sexe, String phone)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.phone = phone;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    public String getNom() {
        return this.nom;
    }

    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    public String getPrenom() {
        return this.prenom;
    }

   
    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance=dateNaissance;
    }

    
    public LocalDate getDateNaissance() {
        return this.dateNaissance;
    }

   
    public void setSexe(char Sexe) {
        this.sexe = sexe;
    }

    
    public char getSexe() {
        return this.sexe;
    }

    
    public void setPhone(String phone) {
        this.phone =phone;
    }

    
    public String getPhone() {
        return this.phone;
    }
}
