package ApachePoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel2 {
       FileInputStream fis;
       XSSFWorkbook wb;
       XSSFSheet sheet;
       XSSFRow row;
       XSSFCell cell;
       String path;
      ReadDataFromExcel2(String path){
    	  this.path=path;
    	  System.out.println(this.path);
    	  
      }
      public int  getrowcount(String shet) throws IOException {
    	  FileInputStream fis=new FileInputStream(path);
    	  XSSFWorkbook wb=new XSSFWorkbook(fis);
    	  XSSFSheet sheet=wb.getSheet(shet);
    	  int rowcount=sheet.getPhysicalNumberOfRows();
    	  return rowcount;
      }
      public int cellcount(String shet, int rownumber) throws IOException {
    	  FileInputStream fis=new FileInputStream(path);
    	  XSSFWorkbook wb=new XSSFWorkbook(fis);
    	  XSSFSheet sheet=wb.getSheet(shet);
    	  XSSFRow row=sheet.getRow(rownumber);
    	  int cellcount=row.getPhysicalNumberOfCells();
    	  return cellcount;
      }
      public String value(String shet, int rownumber,int cellnumber) throws IOException {
    	  FileInputStream fis=new FileInputStream(path);
    	  XSSFWorkbook wb=new XSSFWorkbook(fis);
    	  XSSFSheet sheet=wb.getSheet(shet);
    	  XSSFRow row=sheet.getRow(rownumber);
    	  XSSFCell cell=row.getCell( cellnumber);
    	  String data=cell.getStringCellValue();
    	  return data;
      }
}
