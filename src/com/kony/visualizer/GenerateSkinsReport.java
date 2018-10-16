package com.kony.visualizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class Theme implements Comparable<Theme>{
	String kuid;
	String filename;
	
	public Theme(String kuid,String filename){
		this.kuid=kuid;this.filename=filename;
	}

	@Override
	public int compareTo(Theme arg0) {
		// TODO Auto-generated method stub
		return this.kuid.compareTo(arg0.kuid);
	}
}
public class GenerateSkinsReport {
	static PriorityQueue<Theme> al=new PriorityQueue<Theme>();
	static String basePath="D:\\bitBucketWspace\\VynmaicMobile\\themes\\defaultTheme";

	public static void printData()
	{
		while(!al.isEmpty())
			{
			Theme temp=al.poll();
			System.out.println(temp.filename+"-------->"+temp.kuid);
			}
	}
	public static void addKUID(String filename) throws FileNotFoundException, IOException, ParseException
	{
		JSONParser parser = new JSONParser();
		String path=basePath+"\\"+filename;
		 Object obj = parser.parse(new FileReader(path));
         JSONObject jsonObject = (JSONObject) obj;
         String kuid = (String) jsonObject.get("kuid");
         al.add(new Theme(kuid, filename.replace(".json","")));
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		File folder = new File(basePath);
		File[] listOfFiles = folder.listFiles();
          System.out.println("len:"+listOfFiles.length);
          
		    for (int i = 0; i < listOfFiles.length; i++) 
		    {
		      if (listOfFiles[i].isFile()) 
		      {
		    	 addKUID(listOfFiles[i].getName());
		    }
		    }
		    System.out.println(al.size());
		    printData();
	}
}
