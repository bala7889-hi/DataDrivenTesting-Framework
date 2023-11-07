package ApachePoi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InsertingData {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet= wb.createSheet("demo");
		XSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("Name");
		row.createCell(1).setCellValue("password");
		row.createCell(2).setCellValue("Authorization");
		row.createCell(3).setCellValue("Rank");
	   
		XSSFRow row1=sheet.createRow(1);
		row1.createCell(0).setCellValue("Prasanna");
		row1.createCell(1).setCellValue("xhbjs");
		row1.createCell(2).setCellValue("Level1");
		row1.createCell(3).setCellValue("first");
		
		XSSFRow row2=sheet.createRow(2);
		row2.createCell(0).setCellValue("Bala");
		row2.createCell(1).setCellValue("wudhiw");
		row2.createCell(2).setCellValue("Level2");
		row2.createCell(3).setCellValue("second");
		
		File f=new File("C:\\Users\\Saira\\OneDrive\\Documents\\LoginData.xlsx");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		
	}
}