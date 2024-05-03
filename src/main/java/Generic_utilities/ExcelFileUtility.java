package Generic_utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String readDataFromExcel(String SheetName,int rowNum,int CellNum)throws Throwable{
		FileInputStream fisp=new FileInputStream("");
		Workbook wb=WorkbookFactory.create(fisp);
		return wb.getSheet(SheetName).getRow(rowNum).getCell(CellNum).getStringCellValue();
	}
}
