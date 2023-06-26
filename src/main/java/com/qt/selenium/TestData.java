package com.qt.selenium;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData {

	private static Map<Integer, String> key = new HashMap<Integer, String>();
	private static Map<Integer, String> value = new HashMap<Integer, String>();
	private static Map<String, String> dataComb = new HashMap<String, String>();

	static FileInputStream file;

	public static void readTestData(String testCaseID) {
		try {
			file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\ExcelTestData.xlsx");
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("TestData");
			for (Row row : sh) {
				Cell cellnum = row.getCell(row.getFirstCellNum());
				String firstCell=cellnum.getStringCellValue();
				if (firstCell.equals("TestCaseID")) {
					for (Cell cell : row) {
						key.put(cell.getColumnIndex(), cell.getStringCellValue());
					}
				} else if (firstCell.equals(testCaseID)) {
					for (Cell cell : row) {
						value.put(cell.getColumnIndex(), cell.getStringCellValue());
					}
				}

			}
			for (Integer s : value.keySet()) {
				dataComb.put(key.get(s), value.get(s));
			}
		} catch (Exception e) {
			System.out.println("Unable to load the data " + e.getMessage());
		}

	}
	
	public static String getData(String key) {
		return dataComb.get(key);
	}

}
