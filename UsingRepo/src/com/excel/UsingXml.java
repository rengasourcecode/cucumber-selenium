package com.excel;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class UsingXml {

	public static void main(String[] args) throws DocumentException
	{
		File InputFile= new File("configproperties/config.xml");
		SAXReader reader= new SAXReader();
		Document doc=reader.read(InputFile);
		String username=doc.selectSingleNode("//Freecrm/username").getText();
		System.out.println(username);
		
	

	}

}
