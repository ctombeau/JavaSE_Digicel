/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chrisnor.digicel.model;

import java.util.Date;

/**
 *
 * @author lenovo
 */
public non-sealed class Employee implements Personne{
    private double salaire;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private char sexe;
    private String phone;
    
    public void setSalaire(double salaire)
    {
        this.salaire = salaire;
    }
    
    public double getsalaire()
    {
        return this.salaire;
    }
    
    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String getPrenom() {
        return this.prenom;
    }

    @Override
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance=dateNaissance;
    }

    @Override
    public Date getDateNaissance() {
        return this.dateNaissance;
    }

    @Override
    public void setSexe(char Sexe) {
        this.sexe = sexe;
    }

    @Override
    public char getSexe() {
        return this.sexe;
    }

    @Override
    public void setPhone(String phone) {
        this.phone =phone;
    }

    @Override
    public String getPhone() {
        return this.phone;
    }
    
}
