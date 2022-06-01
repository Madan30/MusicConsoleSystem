package com.MusicApp.FileHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileMusicDB {
	
	public abstract void createWorkBook() throws FileNotFoundException, IOException;
	public abstract void writeExcel(Object [] musicDBList, String sheetName) throws IOException;
	public abstract void readExcel(String sheetName) throws FileNotFoundException;
	
	

}
