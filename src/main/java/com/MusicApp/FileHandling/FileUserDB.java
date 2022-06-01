package com.MusicApp.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.MusicApp.Entities.Customer;

public class FileUserDB {
	
	public void createFile(List<Customer> culist) throws IOException {
		
		String filename = "/home/mrg1813/eclipse-workspace/MusicSystem/User.xls";
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("UserSheet");
		
		int rowCount = 0;
		for(Customer cus: culist) {
			Row row = sheet.createRow(rowCount++);
			writeCustomer(cus, row);
			
		}
		
		FileOutputStream fileOut = new FileOutputStream(filename);
		workbook.write(fileOut);
		fileOut.close();
	}
	
	private void writeCustomer(Customer  cus, Row row) {
		Cell cell = row.createCell(1);
		cell.setCellValue(cus.getcId());
		
		cell = row.createCell(2);
		cell.setCellValue(cus.getFirstName());
		
		cell = row.createCell(3);
		cell.setCellValue(cus.getLastName());
		
		cell = row.createCell(4);
		cell.setCellValue(cus.getAddress());
		
		cell = row.createCell(5);
		cell.setCellValue(cus.getPhoneNum());
		
		cell = row.createCell(6);
		cell.setCellValue(cus.getUserName());
		
		cell = row.createCell(7);
		cell.setCellValue(cus.getPassword());
		
		
	}
	
	public List<Customer> getCustomerList(){
		Customer c = new Customer();
		List<Customer> listCustomer = Arrays.asList(c);
		return listCustomer;
	}

	
}
