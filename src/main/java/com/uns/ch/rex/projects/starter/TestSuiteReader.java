package com.uns.ch.rex.projects.starter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import com.uns.ch.rex.projects.starter.TestSuite;

public class TestSuiteReader {
	TestSuite testsuite = new TestSuite();
	String filePath = testsuite.getTestrailPath();
	File file = new File(filePath);
    BufferedReader bufferedReader = null; 
	
    public TestSuiteReader() {
    	loadBuffer();
    }
    
    
    //Der Pfad zur Textdatei 
    //String filePath =  testsuite.getTestrailName();
 
    public void loadBuffer() {
    	try { 
            //Der BufferedReader erwartet einen FileReader.  
            //Diesen kann man im Konstruktoraufruf erzeugen. 
            bufferedReader = new BufferedReader(new FileReader(file)); 
          String line; 
          //null wird bei EOF oder Fehler zurueckgegeben 
          while (null != (line = bufferedReader.readLine())) { 
            //Zeile auf der Konsole ausgeben 
            System.out.println(line); 
            //Hier kann Ihr Code stehen ... 
          } 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } finally { 
          if (null != bufferedReader) { 
            try { 
              bufferedReader.close(); 
            } catch (IOException e) { 
                e.printStackTrace(); 
            } 
          } 
        }
    }
    
    public static void main(String[] args) {
    	new TestSuiteReader();
    }
    
    
}

