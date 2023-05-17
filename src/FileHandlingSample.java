import java.io.*;

public class FileHandlingSample

{
    public static void main(String[] args)
    {
        System.out.println("*******Folder Creation********");

        File f1 = new File("//Users//muthu//JAVA");
       boolean folder = f1.exists();
        System.out.println(folder);
        f1.mkdirs();
        System.out.println(folder);

        System.out.println("*******SubFolder Creation********");

        File f2 = new File("//Users//muthu//JAVA//Data Structure");
        boolean subfolder = f2.exists();
        System.out.println(subfolder);
        f2.mkdirs();
        System.out.println(subfolder);

        System.out.println("*******File Creation********");

        File f3 = new File("//Users//muthu//JAVA//Thread.txt");
        try {
            boolean fileCreation =  f3.createNewFile();
            System.out.println(fileCreation);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        System.out.println("*******Finding All Files & Folder********");
         File f4  = new File("//Users//muthu");
        File [] filefolderlist =f4.listFiles();
        for(File f :filefolderlist ) {
//            if(f.isDirectory())// finding Folder
//            {
//                System.out.println("Folder List "+f);
//            }
            if (f.isFile()) {
                String file = f.getName();
                int last = file.lastIndexOf(".");
                String Name = file.substring(last + 1);
                System.out.println("File List " + Name);
            }
            File f5 = new File("//Users//muthu//JAVA//Thread.txt");
            try {
                FileOutputStream fos = new FileOutputStream(f5);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject("This is my first content");
                oos.flush();
                oos.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            File f6 = new File("//Users//muthu//JAVA//Thread.txt");
            try {
                FileInputStream  fis = new FileInputStream(f6);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ois.readObject();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }
    }
}
