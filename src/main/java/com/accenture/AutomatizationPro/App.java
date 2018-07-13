package com.accenture.AutomatizationPro;

import java.io.IOException;
import java.util.ArrayList;


public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException{
    	
        String Email = "ngutierrezg96@gmail.com";
        String Password = "veracruz2016";
        String EmailFB = "ngg96@hotmail.com";
        String PasswordFB = "veracruz2016";
        String dataPath = "C:\\Users\\nicolas.a.gutierrez\\Desktop\\Folders\\Empleados.xlsx";
        String Asunto = "";
        String Informacion = "";
        
        ExcelData Excel = new ExcelData();
        AutoEmail AutoEmail = new AutoEmail();
        
        ArrayList<Employee> Employees = Excel.getData(dataPath);
        
        
        AutoEmail.Login(Email, Password);
        
//        Asunto = "Informacion importante para "+Employees.get(1).getName();
//    	Informacion = "Señor "+Employees.get(1).getName()+" le informamos que se encuentra trabajando en la empresa "+Employees.get(1).getCompany();
//        AutoEmail.SendEmail(Employees.get(1).getEmail(),Asunto,Informacion);
//        
////        //Reto 2
//        
        for(int i=1;i<Employees.size()-1;i++) {
        
        Asunto = "Informacion importante para "+Employees.get(i).getName();
    	Informacion = "Señor "+Employees.get(i).getName()+" le informamos que se encuentra trabajando en la empresa "+Employees.get(i).getCompany();
        AutoEmail.SendEmail(Employees.get(i).getEmail(),Asunto,Informacion);
        Thread.sleep(5000);
        
        }
    }
}