package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class multiplerowsandcolumn {

	public static void main(String[] args) throws IOException {

		FileInputStream file2= new FileInputStream("C:\\Users\\Dinesh\\Desktop\\multiplerandc.xlsx");
		
		XSSFWorkbook wbook2= new XSSFWorkbook(file2);
		
		XSSFSheet sheet=wbook2.getSheetAt(0);
		
		int columncount=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of Columns in sheet is :  " + columncount);
		
		
		int rowcount= sheet.getLastRowNum()+1;
		System.out.println("Number of Rows in sheet is :  " + rowcount);
		
		System.out.println("COLUMN DATAS");

		String[] header= new String[columncount];
		for(int i=0;i<columncount;i++)
		{
			header[i]=sheet.getRow(0).getCell(i).getStringCellValue();
		}
		
		for(int i=0;i<columncount;i++)
		{
			System.out.println(header[i]);
		}
		System.out.println("" );
		
		

		System.out.println("ROW DATAS");
		
		String[] names= new String[rowcount];
		for(int i=1;i<rowcount;i++)
		{
			names[i]=sheet.getRow(i).getCell(0).getStringCellValue();
		}
		for(int i=1;i<rowcount;i++)
		{
			System.out.println(names[i]);
		}
	
		for(int i=1;i<rowcount;i++)
		{
			if(names[i].equalsIgnoreCase("ammu"))
			{
				for (int j=1;j<columncount;j++)
				{
					if(header[j].equalsIgnoreCase("username"))
					{
						String ans=sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.println("The Username of Ammu is :  "+ans);
					}
				}
			}
		}
		
	}

}
