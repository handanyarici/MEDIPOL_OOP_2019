package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

	public static void writeFile(String str, File file){
		try{
			if(!file.exists()){
				file.createNewFile();
			}
	        FileWriter fileWriter = new FileWriter(file, false);
	        BufferedWriter bWriter = new BufferedWriter(fileWriter);
	        bWriter.write(str);
	        bWriter.close();
        }catch(Exception e){
        	System.out.println("Dosyaya yazma islemi sirasinda hata alindi.");
        	e.printStackTrace();
        }
	}

	public static String readFile(File file){
		String line="";
		String dosyaIcerigi = "";
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fileReader);
			while ((line = bReader.readLine()) != null) {
			    dosyaIcerigi += line;
			}
			 bReader.close();

		} catch (Exception e) {
			System.out.println("Dosyaya okuma islemi sirasinda hata alindi.");
        	e.printStackTrace();
		}
		return dosyaIcerigi;

	}

}
