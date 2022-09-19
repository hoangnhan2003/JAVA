package ss17IObinaryFile.TH.copyFile;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
    public static void copyFileUsingJava7File(File source,File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    // copy file using stream
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = Files.newInputStream(source.toPath());
            os = Files.newOutputStream(dest.toPath());
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 10, length);
            }
        } finally {
            if (is != null && os != null){
                is.close();
                os.close();
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.print("Enter destination file:");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
           // copyFileUsingJava7File(sourceFile, destFile);
            copyFileUsingStream(sourceFile, destFile);
            System.out.print("Copy completed");
        } catch (IOException ioe) {
            System.out.print("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
