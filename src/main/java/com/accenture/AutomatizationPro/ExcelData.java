package com.accenture.AutomatizationPro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	
	public ExcelData() {
		
	}
	
	public ArrayList<Employee> getData(String dataPath) throws IOException {
		
		ArrayList<Employee> Employees = new ArrayList<>();
		
		FileInputStream file = new FileInputStream(new File(dataPath));
		XSSFWorkbook workbook = new XSSFWorkbook(file); //Se define ruta, file y pagina de la que se desea extraer la informacion
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowIterator = sheet.iterator(); //Se define la iteracion de las filas
		Row row;
		
		while (rowIterator.hasNext()){
			
			row = (Row) rowIterator.next();
			Employee Employee = new Employee();
			Iterator<Cell> cellIterator = row.cellIterator(); //Se define la iteracion de las celdas
			Cell celda;
			
			int i = 0;
			
			while (cellIterator.hasNext()){
				
				celda = (Cell) cellIterator.next(); //Desplazamiento por celdas
				
				if(i==0)
					Employee.setName(celda.getStringCellValue()); 
				if(i==1)
					Employee.setCompany(celda.getStringCellValue()); 
				if(i==2)
					Employee.setEmail(celda.getStringCellValue()); 
//				if(i==3)
//					Employee.setSalary(celda.getNumericCellValue());
				
//				System.out.println(i);
				i++;
			}
			
			Employees.add(Employee);
				
		}
		//System.out.println("AllData Size en funcion excel= "+AllData.size());
		return Employees;
	}
}