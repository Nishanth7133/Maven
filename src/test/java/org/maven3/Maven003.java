package org.maven3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Maven003 {
public static void main(String[] args) throws IOException {
	File f = new File(System.getProperty("user.dir")+"\\File\\suman.xlsx");
	FileInputStream fi = new FileInputStream(f);
	FileOutputStream fo = new FileOutputStream(f);
	Workbook book = new XSSFWorkbook(fi);
	
	
	Sheet sheet = book.getSheet("suman");
	//int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	//System.out.println("physicalNumberOfRows: "+ physicalNumberOfRows  );
	
	//Row row = sheet.getRow(15);
	//int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	//System.out.println("physicalNumberOfCells: "+ physicalNumberOfCells);
	//Cell cell = row.getCell(5);
	//System.out.println(cell);
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			//System.out.println(cell);
			int cellType = cell.getCellType();
			//celltype=1 -------> stringcellvalue
			//celltype other that=1 ------> datecellvalue or numericcellvalue
			String value="";
			if (cellType==1) {
				 value = cell.getStringCellValue();
				
				
			}
			else if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
				 value = sdf.format(dateCellValue);
				
				
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long)numericCellValue;
			 value = String.valueOf(l);
			
			}
			System.out.println(value);
		}
		
		
	}
}
}
