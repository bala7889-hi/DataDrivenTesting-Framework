package ApachePoi;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafromExcel {

	public FileInputStream fis;
	public XSSFWorkbook wo;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String path;
	
	ReadDatafromExcel(String path) {
		this.path = path;
		System.out.println(this.path);
	}
	
	public int getRowCount(String sheetname) throws IOException {
		fis = new FileInputStream(path);
		wo = new XSSFWorkbook(fis);
		sheet = wo.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		return rowcount;
	}

	public int getCellCount(String sheetname, int rownumber) throws IOException {
		fis = new FileInputStream(path);
		wo = new XSSFWorkbook(fis);
		sheet = wo.getSheet(sheetname);
		row = sheet.getRow(rownumber);
		int cellcount = row.getLastCellNum();
		return cellcount;
	}

	public String getCellData(String Sheetname, int rownumber, int cellnumber) throws IOException {
		fis = new FileInputStream(path);
		wo = new XSSFWorkbook(fis);
		sheet = wo.getSheet(Sheetname);
		row= sheet.getRow(rownumber);
		cell= row.getCell(cellnumber); 
		String data=cell.getStringCellValue();
		return data;
	}

}