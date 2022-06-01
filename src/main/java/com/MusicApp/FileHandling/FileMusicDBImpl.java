package com.MusicApp.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileMusicDBImpl implements FileMusicDB {

	private static HSSFWorkbook wb = new HSSFWorkbook();
	private String filename = "/home/mrg1813/eclipse-workspace/MusicSystem/MusicDBFile.xls";

	@Override
	public void createWorkBook() throws FileNotFoundException, IOException {

		FileOutputStream fileOut = new FileOutputStream(filename);
		wb.write(fileOut);
		wb.close();
		fileOut.close();

		// System.out.println("Workbook created");
	}

	@Override
	public void writeExcel(Object[] musicDBList, String sheetName) throws IOException {

		FileInputStream fis = new FileInputStream("/home/mrg1813/eclipse-workspace/MusicSystem/MusicDBFile.xls");
		wb = (HSSFWorkbook) WorkbookFactory.create(fis);

		HSSFSheet sheet = wb.getSheet(sheetName);

		int rowCount = sheet.getLastRowNum();

		System.out.println(rowCount);

		System.out.println(((org.apache.poi.ss.usermodel.Sheet) sheet).getPhysicalNumberOfRows());

		Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).createRow(++rowCount);

		int columnCount = -1;
		System.out.println("check if execution is coming in excel method");

		for (Object field : musicDBList) {
			Cell cell = row.createCell(++columnCount);
			if (field instanceof String) {
				cell.setCellValue((String) field);
			} else if (field instanceof Integer) {
				cell.setCellValue((Integer) field);
			} else if (field instanceof Long) {
				cell.setCellValue((Long) field);
			} else if (field instanceof Boolean) {
				cell.setCellValue((Boolean) field);
			}
		}
		
		fis.close();
		
		createWorkBook();

	}

	@Override
	public void readExcel(String sheetName) throws FileNotFoundException {
		String excelFilePath = "/home/mrg1813/eclipse-workspace/MusicSystem/UserRegistration.xls";
		FileInputStream fis = new FileInputStream(new File(excelFilePath));

	}

}
