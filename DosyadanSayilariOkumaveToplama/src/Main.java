import java.io.*;

public class Main {
    public static void main(String[] args){
        //Dosyamızı oluşturduk
        File numbersFile =new File("numbers.txt");
        //Hatalar için try catch oluşturduk
        try {
            //Dosyamızın içerisine yazılacak kısmı belirttik
            String input="5\n10\n20\n12\n33";
            //input kısmını doyamıza yazdırdık.
            FileWriter numbersWriter=new FileWriter(numbersFile,false);
            BufferedWriter nWriter=new BufferedWriter(numbersWriter);
            nWriter.write(input);
            nWriter.close();
            //Dosyayı okumaya başladık
            FileReader numbersFileReader=new FileReader(numbersFile);
            //Dosyamızı satır satır okuyoruz
            String line;

            BufferedReader bufferedReader=new BufferedReader(numbersFileReader);
            int total=0;
            System.out.print("Dosya içersindeki sayılar : ");
            while ((line=bufferedReader.readLine())!=null){
                //Dosya içerisindeki sayılar String olarak bulunduğundan dolayı int dönüşümü yaptık.
                //Dosya içersindeki sayıları okurken toplamını aldık
                System.out.print(line+" ");
                total += Integer.parseInt(line);
            }
            System.out.println();
            //dosya içersindeki sayıların toplamını ekrana yazdırdık.
            System.out.println("Dosya içerisindeki Sayıların Toplamı : "+total);
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
