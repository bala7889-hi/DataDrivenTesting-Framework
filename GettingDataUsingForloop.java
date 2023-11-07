package ApachePoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingDataUsingForloop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
           FileInputStream fis=new FileInputStream("C:\\Users\\Saira\\OneDrive\\Documents\\LoginData.xlsx");
           XSSFWorkbook wb=new XSSFWorkbook(fis);
           XSSFSheet sheet=wb.getSheetAt(0);
          int rowcount=sheet.getPhysicalNumberOfRows();
          for(int i=0;i<rowcount;i++) {
        	  XSSFRow row=sheet.getRow(i);
        	  int cellcount=row.getPhysicalNumberOfCells();
        	  for(int j=0;j<cellcount;j++) {
        		  System.out.print(" "+ row.getCell(j).getStringCellValue());
        	  }
        	  System.out.println();
          }
	}

}
