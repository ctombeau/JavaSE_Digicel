/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.chrisnor.digicel.model;

import java.util.Date;

/**
 *
 * @author lenovo
 */
public sealed interface Personne permits Client, Employee{
//      String NOM="";
//      String PRENOM="";
//      Date DATE_NAISSANCE=null;
//      char SEXE=0;
//      String PHONE="";
      
      void setNom(String nom);
      String getNom();
      
      void setPrenom(String prenom);
      String getPrenom();
      
      void setDateNaissance(Date dateNaissance);
      Date getDateNaissance();
      
      void setSexe(char Sexe);
      char getSexe();
      
      void setPhone(String phone);
      String getPhone();
      
      default String getNomComplet()
      {
          return getNom() + " " + getPrenom();
      }
}
