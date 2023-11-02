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
public non-sealed class Employee extends Personne{
    private double salaire;
    
    
    public void setSalaire(double salaire)
    {
        this.salaire = salaire;
    }
    
    public double getsalaire()
    {
        return this.salaire;
    }
    
}
