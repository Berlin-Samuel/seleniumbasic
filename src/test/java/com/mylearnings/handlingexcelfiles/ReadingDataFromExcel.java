package com.mylearnings.handlingexcelfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {
	public static void main(String[] args) {
		try {
			FileInputStream readingFile = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\data.xlsx");
			XSSFWorkbook Workbook = new XSSFWorkbook(readingFile);
			XSSFSheet sheet = Workbook.getSheet("Sheet1");
			// XSSFSheet sheetIndex=WorkBook.getSheetAt(0);
			int totalRows = sheet.getLastRowNum();
			int totalCells = sheet.getRow(0).getLastCellNum();
			System.out.println("No of rows " + totalRows);
			System.out.println("No of cells " + totalCells);
			System.out.println("=====================");
			for (int r = 0; r <= totalRows; r++) {
				XSSFRow currentRow = sheet.getRow(r);
				for (int c = 0; c < totalCells; c++) {
					XSSFCell cell = currentRow.getCell(c);
					System.out.print(cell.toString() + "\t");
				}
				System.out.println();
			}
			Workbook.close();
			readingFile.close();
		} catch (FileNotFoundException exe) {
			exe.getMessage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
