package reusableComponents;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {
	
	
	public static void main(String[] args) {
	}
	
	public static Object[][] getDetails(String sheet) throws IOException {
		
		//Initialising file path
		FileInputStream logIn = new FileInputStream("C:\\Users\\NITIN\\Desktop\\mindtree java sdet\\comprehensive assessment\\LogIn.xlsx");
		//accessing the excel sheet
		XSSFWorkbook LogInBook = new XSSFWorkbook(logIn);
		//accessing the particular sheet in the excel
//		sheet = "cGifts";
		XSSFSheet Details = LogInBook.getSheet("cGifts");
		int rowCount = Details.getLastRowNum();
		XSSFRow row = Details.getRow(0);
		int colCount = row.getLastCellNum();
		System.out.println(rowCount + " " + colCount);
		
		//initializing the data in an object and passing the same to the data provider
		Object[][] data = new Object[rowCount+1][colCount];
		for(int i = 0; i < rowCount+1 ;i++) {
			for(int j = 0; j < colCount; j++) {
				data[i][j] = Details.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
		
	}
	
}
