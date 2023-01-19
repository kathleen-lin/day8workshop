package day8revision;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class App2 {
    
    public static void main(String[] args) throws IOException {
        String dirPath  = "./data";
        String fileName = "data.txt";

        File newdir = new File(dirPath);
        boolean isDirCreated = newdir.mkdir();

        if (isDirCreated){
            System.out.println("New directory " + dirPath + " is created");
        } else {
            System.out.println("New directory " + dirPath + " already exist");

        }
        
        File newFile = new File(dirPath + "/" + fileName);
        boolean isFileCreated = newFile.createNewFile();

        if (isFileCreated){
            System.out.println("New file " + fileName + " is created");

        } else {
            System.out.println("New directory " + fileName + " already exist");

        }
    
        File fileList[] = newdir.listFiles();
        for (File f: fileList){
            System.out.println("File " + f.getPath() + ":" + f.getCanonicalPath() + "\n");
        }

        FileOutputStream fos = new FileOutputStream(newFile, true);

        String[] toWrite = {"Testing", "1", "2", "3"};

        for (int i = 0; i< toWrite.length; i++){
            fos.write(toWrite[i].getBytes());
            fos.write("\n".getBytes());
            fos.flush();
        }

        fos.close();
    
    }
}
