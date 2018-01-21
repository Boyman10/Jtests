package com.ocr.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * Class to test exceptions of type FileNotFound
 * @author hackme
 *
 */
public class Test {
    public static void main(String[] args) {

    	//http://tutorials.jenkov.com/java-exception-handling/try-with-resources.html - TODO
    	
//    	 E/S en Java -> echange de données entre différentes sources (ex : fichier ou mémoire ou programme - Stream ou Flux)

    	//Création de OBJET File et non du fichier :
        File f = new File("test.txt");
        
        //You need to declare in and out outside try {...} because you need to close these resources in the finally {...} block.
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
		try {

//			par le biais des objets FileInputStream et FileOutputStream que nous allons pouvoir lire et écrire
			fis = new FileInputStream(f);
			
			
				// Surround input Stream with IO Exception in case of trouble reading the stream :
				try {
					ois = new ObjectInputStream( fis );
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					
					try {
						ois.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			try {
				if(fis != null)
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}  catch ( FileNotFoundException e ) {
			System.err.println( "Fichier pas existant !" );
		}
		
		System.out.println("We continue");
    }
}
