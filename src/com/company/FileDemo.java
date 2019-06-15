package com.company;

import java.io.File;

public class FileDemo {

    private static String ROOT = "C:";
    private static char   FS = File.separatorChar;
    private static String SPACE = " ";
    static {
        String osName = System.getProperty("os.name");
        if(!osName.startsWith("Win"))
            throw new RuntimeException("Il programma è eseguibile solo su Windows");
    }
    public static void main(String[] args) {
        String folder = "myDir";
        String fileName = "myFile.txt";
        System.out.println("File separator:"+FS);
        File winFile = new File(ROOT + FS + folder + FS + fileName );
        System.out.println("Costruzione file path:");
        System.out.println(winFile);
    }


}