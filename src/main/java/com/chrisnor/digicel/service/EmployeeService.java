/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chrisnor.digicel.service;

import com.chrisnor.digicel.model.Employee;
import com.chrisnor.digicel.repository.EmployeeRepository;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *
 * @author lenovo
 */
public class EmployeeService implements EmployeeRepository{
    String str = "on ecrit sur les murs";
    Path path = Paths.get("C:/DigicelDB/Employee.txt");
    @Override
    public Employee AddEmployee(Employee e) {
       try( BufferedWriter br = Files.newBufferedWriter(path))
       {
          br.write(str);
       }
       catch(IOException ex)
       {
           
       }
      
     return null;
   }
    
   
}