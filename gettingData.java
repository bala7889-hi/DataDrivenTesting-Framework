package ApachePoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class gettingData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileInputStream fis=new FileInputStream("C:\\Users\\Saira\\OneDrive\\Documents\\LoginData.xlsx");
       XSSFWorkbook wb=new XSSFWorkbook(fis);
       XSSFSheet sheet=wb.getSheet("demo");
       System.out.println(sheet.getRow(3).getCell(0).getStringCellValue());
       System.out.println(sheet.getRow(4).getCell(3).getStringCellValue());
       System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
       System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
	} 

}