package com.icehrm_automation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelWrite {
	public static void main(String[] args)  {
		String filepath ="C:\\Users\\kaila\\Desktop\\Book1.xlsx";
		String extension = filepath.substring(filepath.indexOf(".")+1);
		try {
			FileInputStream inputstream = new FileInputStream(filepath);
			XSSFWorkbook workbook;
			workbook =new XSSFWorkbook(inputstream);
			Sheet sheet = workbook.getSheet("test");
			Cell cell = sheet.createRow(0).createCell(0);
			cell.setCellValue("Id");
			FileOutputStream outputstream = new FileOutputStream(filepath);
			workbook.write(outputstream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	System.out.println("Succesfully");
	}

}
