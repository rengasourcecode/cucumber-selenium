package FbExcelDefn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public  class Gettingusername {
	static String browserurl;
	static String Getusername(String username) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Dinesh\\Desktop\\mail.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(file);

		HSSFSheet sheet= workbook.getSheetAt(0);
		int columncount=sheet.getRow(0).getLastCellNum();
		
		String header[]=new String[columncount];
		
		for(int i=0;i<columncount;i++)
		{
		header[i]=sheet.getRow(0).getCell(i).getStringCellValue();
		//System.out.println(header[i]);
		}
		
		for(int i=0;i<columncount;i++)
		{
			if(header[i].equalsIgnoreCase(username))
			{
				//System.out.println(sheet.getRow(2).getCell(i).getStringCellValue());
				 browserurl=sheet.getRow(1).getCell(i).getStringCellValue();
	        }

	}
		return browserurl;
	
	}}
