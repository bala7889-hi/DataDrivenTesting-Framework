package ApachePoi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InsertingDataUsingForloop {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("demo");
		XSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("Name");
		row.createCell(1).setCellValue("Passowrd");
		row.createCell(2).setCellValue("Authorization");
		row.createCell(3).setCellValue("Rank");
		
		String[][] rowdata= {{"Prasanna","hvjd","Level1","1"},{"Bala","wdwd","Level2","76"},
				{"butter","vjbi","Level3","6"},{"curd","tser","Level4","21"}};
		/***for each row there will be four cells, 
		so everytime one row gets increased we have to loop through four cells so i loop is for rows and j loop is for cells
		rowdata.length is 4 coz we have sets in the above array ,
		that means we have to increment our rows as per our sets in rowdata array
		we have taken i=1 coz we already mentioned row 0 above, so it creates rows 1 ,2,3 and 4
		we are taking j=0 coz cell starts from 0 
		rowdata[i-1].length is used (i-1 is used coz i is starting from 1 but we have to start from 0)
		it means that we are taking the each set one by one
		row1.createcell(j) , as i said j represents cells and starts from 0
		rowdata[i-1][j]--> it means we are retrieving the values from the set for current row and current cell
		 * 
		 */
		for(int i=1;i<=rowdata.length;i++) { //i representing rows
			XSSFRow row1=sheet.createRow(i);
			for(int j=0;j<rowdata[i-1].length;j++){ // j representing columns , or cells
				row1.createCell(j).setCellValue(rowdata[i-1][j]);
			}
		}
		 File f = new File("C:\\Users\\Saira\\OneDrive\\Documents\\LoginData.xlsx");
	      FileOutputStream fos = new FileOutputStream(f);
	        wb.write(fos);
	}
}