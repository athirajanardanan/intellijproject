package File;
//Create a class File that will have the following behaviors: open, edit, close. Edit and close are
        //implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will
       // provide specific implementation of open behaviour: Example: to open .
        //java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

public abstract class file {
    abstract void open();
    void edit()
    {
        System.out.println("This file is editable");
    }
    void close()
    {
        System.out.println("You can close this file by clicking '*' ");
    }

}
class JavaFile extends file
{
    void open()
    {
        System.out.println("You need notepad++ or sublime txt");
    }
}
class WordFile extends file{
    void open()
    {
        System.out.println("You need microsoft word to open a word file");
    }
}
class PdfFile extends file{
    void open()
    {
        System.out.println("You need PDF reader to open a pdf file");
    }
}
class Test2
{
    public static void main(String[] args)
    {
        file obj=new JavaFile();
        file obj1=new PdfFile();
        file obj2=new WordFile();
        obj.open();
        obj1.open();
        obj2.open();
        System.out.println("~~~~~~~~~~~~~~~~~~Close and edit are common to 3~~~~~~~~~~~~~~~~~`");
        obj.edit();
        obj.close();

    }
}
