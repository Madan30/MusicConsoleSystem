package com.MusicApp.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoFileDB {

	String excelFilePath = "/home/mrg1813/eclipse-workspace/MusicSystem/UserRegistration.xls";

	public void appendExcelData(Object[] tableData, String sheetName) throws InvalidFormatException {

		try {
			Workbook workbook;
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

			workbook = WorkbookFactory.create(inputStream);

			org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetName);

			int rowCount = sheet.getLastRowNum();

			System.out.println(rowCount);

			System.out.println(((org.apache.poi.ss.usermodel.Sheet) sheet).getPhysicalNumberOfRows());

			Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).createRow(++rowCount);

			int columnCount = -1;
			System.out.println("check if execution is coming in excel method");

			for (Object field : tableData) {
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
			inputStream.close();

			FileOutputStream outputStream = new FileOutputStream(excelFilePath);
			workbook.write(outputStream);
			workbook.close();
			outputStream.close();

		} catch (IOException | EncryptedDocumentException e) {
			System.out.println(e);
		}

	}

	public void readExcelFile(String sheetName) throws EncryptedDocumentException, IOException {
		// String filePath =
		// "/home/mrg1813/eclipse-workspace/MusicSystem/UserRegistration.xls";
		Workbook workbook;
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

		workbook = WorkbookFactory.create(inputStream);

		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetName);

		Iterator<Row> itr = sheet.iterator();
		System.out.println("file read success");

		while (itr.hasNext()) {
			Row row = itr.next();
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch (cell.getCellType()) {
				case NUMERIC:
					System.out.println(cell.getNumericCellValue() + "\n");
					break;

				case STRING:
					System.out.println(cell.getStringCellValue() + "\n");
					break;

				case FORMULA:
					break;
				}
			}

			System.out.println("");

		}

		inputStream.close();

	}
}
