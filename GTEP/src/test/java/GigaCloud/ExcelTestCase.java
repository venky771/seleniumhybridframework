package GigaCloud;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTestCase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fs = new FileInputStream("C:\\Softwares\\data.xls");
		
		HSSFWorkbook wb = new HSSFWorkbook(fs);
	
		HSSFSheet st = wb.getSheet("Sheet1");
		
		HSSFRow row = st.getRow(1);
	    
		HSSFCell col = row.getCell(1);
		
		String value = col.getStringCellValue();
		
	    System.out.println(value);
	}

	
}
