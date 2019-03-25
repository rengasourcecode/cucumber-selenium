package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class UsingPdf {

	public static void main(String[] args) throws IOException {
		
		
		//FileInputStream file = new FileInputStream("configproperties/SQL1 .pdf");
		FileInputStream file = new FileInputStream("C:\\Users\\Dinesh\\Desktop\\Gmail - Acceptance of Manuscript AB168-Reg.pdf");

		PDFParser parser = new PDFParser(file);
		
		parser.parse();
		COSDocument cosDoc = parser.getDocument();
		PDFTextStripper pdfStripper = new PDFTextStripper();
		
		pdfStripper.setStartPage(1);
		pdfStripper.setEndPage(1);
		
		PDDocument pdDoc = new PDDocument(cosDoc);
		String parsedText  = pdfStripper.getText(pdDoc);
		
		System.out.println(parsedText);
	}

}
