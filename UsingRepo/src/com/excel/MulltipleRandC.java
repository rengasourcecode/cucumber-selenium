package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MulltipleRandC {

	public static void main(String[] args) throws IOException
	
	{
		FileInputStream Efile = new FileInputStream("C:\\Users\\Dinesh\\Desktop\\RandC.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(Efile);
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		int columncount=sheet.getRow(0).getLastCellNum();
		
		String header[]=new String[columncount];
		
		for(int i=0;i<columncount;i++)
		{
		header[i]=sheet.getRow(0).getCell(i).getStringCellValue();
		System.out.println(header[i]);
		}
		
		int rowcount=sheet.getLastRowNum()+ 1;
		System.out.println(rowcount);
		
		String namelabel[]= new String[rowcount];
		
		for(int i=0;i<rowcount;i++)
		{
			namelabel[i]=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(namelabel[i]);
		}
		
		for(int i=0;i<rowcount;i++)
		{
			if(namelabel[i].equalsIgnoreCase("ammu"))
			{
				for(int k=0;k<columncount;k++)
				if(header[k].equalsIgnoreCase("sex"))
				{
					System.out.println(sheet.getRow(i).getCell(k).getStringCellValue());
				}
			}
		
		}
		
		

	}

}
