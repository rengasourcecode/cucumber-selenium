package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SingleRandC {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dinesh\\Desktop\\singlerandc.xlsx");
		
		XSSFWorkbook wbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet=wbook.getSheetAt(0);
		
		int columncount=sheet.getRow(0).getLastCellNum();
		
		System.out.println(columncount);
		
		String header[]= new String[columncount];
		for(int i=0;i<columncount;i++)
		{
			header[i]=sheet.getRow(0).getCell(i).getStringCellValue();
		}
		
		for(int i=0;i<columncount;i++)
		{
			if(header[i].equalsIgnoreCase("username"))
			{
				String uname=sheet.getRow(1).getCell(i).getStringCellValue();
				System.out.println("The username is  " + uname);
			}
		}
		
		for(int i=0;i<columncount;i++)
		{
			if(header[i].equalsIgnoreCase("password"))
			{
				String pword=sheet.getRow(1).getCell(i).getStringCellValue();
				System.out.println("The password is  " + pword);
			}
		}
		

		
	}

}
