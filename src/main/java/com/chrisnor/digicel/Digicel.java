/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.chrisnor.digicel;

import com.chrisnor.digicel.model.Client;
import com.chrisnor.digicel.model.Compte;
import com.chrisnor.digicel.model.Employee;
import com.chrisnor.digicel.model.Personne;
import com.chrisnor.digicel.model.StatusCompte;
import com.chrisnor.digicel.service.EmployeeService;

/**
 *
 * @author lenovo
 */
public class Digicel {

    public static void main(String[] args) {
        System.out.println("*************************** DIGICEL *******************************\n");
        
        EmployeeService emp = new EmployeeService();
        
        emp.AddEmployee(new Employee());
        
        
        
    }
}
