package ApachePoi;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataUsingForEachLoop {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Saira\\OneDrive\\Documents\\LoginData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		for (Row r : sheet) {
			for (Cell c : r) {
				System.out.print(c.getStringCellValue() + " ");
			}
			System.out.println();
		}

		
	}


}


