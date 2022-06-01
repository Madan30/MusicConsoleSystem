package com.MusicApp.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.MusicApp.Entities.Customer;

public class UserDBFile {
	// private Customer c = new Customer();
	// private UserRegistrationUtls reg = new UserRegistrationUtls();
	private List<Customer> customerList = new ArrayList<Customer>();

	public void createExcelFile(Customer c) throws IOException {
		String filename = "/home/mrg1813/eclipse-workspace/MusicSystem/Registration.xls";

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("CustomerSheet");

		HSSFRow rowHead = sheet.createRow((short) 0);
		rowHead.createCell(0).setCellValue("C_ID");
		rowHead.createCell(1).setCellValue("First_Name");
		rowHead.createCell(2).setCellValue("Last_Name");
		rowHead.createCell(3).setCellValue("Address");
		rowHead.createCell(4).setCellValue("Phone Number");
		rowHead.createCell(5).setCellValue("UserName");
		rowHead.createCell(6).setCellValue("Password");

		HSSFRow row = sheet.createRow((short) 1);
		row.createCell(0).setCellValue(c.getcId());
		row.createCell(1).setCellValue(c.getFirstName());
		row.createCell(2).setCellValue(c.getLastName());
		row.createCell(3).setCellValue(c.getAddress());
		row.createCell(4).setCellValue(c.getPhoneNum());
		row.createCell(5).setCellValue(c.getUserName());
		row.createCell(6).setCellValue(c.getPassword());

		// customerList.add(cu);

		FileOutputStream fileOut = new FileOutputStream(filename);
		workbook.write(fileOut);
		fileOut.close();

	}

	/*
	 * public void writeExcelFile(List<UserRegistrationUtls> regList, String
	 * excelFilePath) throws FileNotFoundException, IOException {
	 * 
	 * HSSFWorkbook workbook = new HSSFWorkbook(); HSSFSheet sheet =
	 * workbook.createSheet();
	 * 
	 * int rowCount = 0; for (UserRegistrationUtls rest : regList) { Row row =
	 * sheet.createRow(++rowCount); writeCustomer(c, row); }
	 * 
	 * try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
	 * workbook.write(outputStream); }
	 * 
	 * }
	 * 
	 * private void writeCustomer(Customer cus, Row row) { Cell cell =
	 * row.createCell(1); cell.setCellValue(cus.getcId());
	 * 
	 * cell = row.createCell(2); cell.setCellValue(cus.getFirstName());
	 * 
	 * cell = row.createCell(3); cell.setCellValue(cus.getLastName());
	 * 
	 * cell = row.createCell(4); cell.setCellValue(cus.getAddress());
	 * 
	 * cell = row.createCell(5); cell.setCellValue(cus.getPhoneNum());
	 * 
	 * cell = row.createCell(6); cell.setCellValue(cus.getUserName());
	 * 
	 * cell = row.createCell(7); cell.setCellValue(cus.getPassword()); }
	 */

}
