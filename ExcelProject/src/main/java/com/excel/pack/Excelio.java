package com.excel.pack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelio {

	public static void main(String[] args) {

		try {
			File fileObj = new File("C:\\Users\\LAPTOP\\Desktop\\datas.xlsx");

			FileInputStream fis = new FileInputStream(fileObj);
			XSSFWorkbook WB = new XSSFWorkbook(fis);
			XSSFSheet SH = WB.getSheetAt(0);
			Iterator<Row> itr = SH.iterator();
			while (itr.hasNext()) {
				Row ro = itr.next();
				Iterator<Cell> citr = ro.cellIterator();
				while (citr.hasNext()) {
					Cell cl = citr.next();
					String value = cl.getStringCellValue();
					BufferedWriter writer = new BufferedWriter(
							new FileWriter("E:\\SpringBoot\\ExcelProject\\src\\main\\resources\\static\\output.txt"));
					writer.write(value);
					writer.close();
				}
				System.out.println("");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
