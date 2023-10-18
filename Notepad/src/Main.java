import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Try Catch yerine throws IOExeption yapmayı tercih ettim.
        fileReader();//Bir önceki kayıt altına alınan notu yazdırmak için iki farklı metot oluşturdum
        fileWriter();//Daha farklı bir yolunu biliyorsan fikirlerine açığım
    }
    public static void fileWriter() throws IOException {
        File notepadFile =new File("notepad.txt");
        Scanner text = new Scanner(System.in);//Scanner ile kullanıcıdan kaydetmek istediği metni alıyoruz
        System.out.print("Lütfen notunuzu giriniz : ");
        String info= text.nextLine();
        String input=" " +info;//Bir önceki runda eklemiş olduğumuz not ile
                               //bir sonraki run ile eklediğimiz not arasında bir boşluk kalması için bu şekilde tasarlandı

        FileWriter notepadWriter=new FileWriter(notepadFile,true);
        BufferedWriter noteWriter=new BufferedWriter(notepadWriter);
        noteWriter.write(input);
        noteWriter.close();
    }
    public static void fileReader() throws IOException {
        File notepadFile =new File("notepad.txt");
        FileReader notepadFileReader=new FileReader(notepadFile);
        String line;

        BufferedReader bufferedReader=new BufferedReader(notepadFileReader);
        System.out.println("Notes : ");
        System.out.print("En son kaydettiğiniz not : ");//Son kayıt altına alınan metni ilk olarak ekrana yazıyoruz.
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line+" ");
        }
        bufferedReader.close();
    }
}