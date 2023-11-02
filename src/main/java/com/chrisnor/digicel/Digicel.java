/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.chrisnor.digicel;

import com.chrisnor.digicel.model.Compte;
import com.chrisnor.digicel.model.StatusCompte;

/**
 *
 * @author lenovo
 */
public class Digicel {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Compte c = new Compte(StatusCompte.FULLCOMPTE,"38051274",5000);
        
        System.out.println(c);
    }
}
