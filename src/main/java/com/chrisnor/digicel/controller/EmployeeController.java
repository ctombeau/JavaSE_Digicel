/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chrisnor.digicel.controller;

import com.chrisnor.digicel.model.Employee;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class EmployeeController {
     
     public String AjouterEmployee()
     {
         Employee emp = new Employee();
         
         System.out.println("Entrez votre nom: ");
         Scanner scNom = new Scanner(System.in);
         emp.setNom(scNom.nextLine());
         
         System.out.println("Entrez votre prenom: ");
         Scanner scPrenom = new Scanner(System.in);
         emp.setPrenom(scPrenom.nextLine());
         
         System.out.println("Entrez votre dateNaissance: ");
         Scanner scDateString = new Scanner(System.in);
         LocalDate scDateNaiss = LocalDate.parse(scDateString.nextLine());
         emp.setDateNaissance(scDateNaiss);
         
         System.out.println("Entrez votre Sexe: ");
         Scanner scSexe = new Scanner(System.in);
         emp.setSexe(scSexe.nextLine().charAt(0));
         
         System.out.println("Entrez votre telephone: ");
         Scanner scPhone = new Scanner(System.in);
         emp.setPhone(scNom.nextLine());
         
         System.out.println("Entrez Le salaire de l'employee: ");
         Scanner scSal = new Scanner(System.in);
         emp.setSalaire(scNom.nextDouble());
         
         return null;
     }
}
