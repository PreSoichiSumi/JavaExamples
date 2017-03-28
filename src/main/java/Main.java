package main.java;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import javafx.scene.control.Separator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Path rootDir = Paths.get("resources");
        Random rand = new Random(0);
        System.out.println("generate file containing randomized characters");

        for (char c = 'a'; c <= 'z'; c++) {
        Path p = Paths.get(rootDir.toString() + "/" + c + ".txt");
        File f=p.toFile();
        if(f.exists()) f.delete();
        f = Files.createFile(p).toFile();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 500; i++) {
            char c2=(char)('a' + rand.nextInt(25));
            sb.append(c2);
            if(i%20==19)
                sb.append(LineSeparator.Unix);
        }
        writeStringToFile(f,sb.toString());
        }*/

        /*File f1=new File("resources/a.txt");
        FileReader fr=new FileReader(f1);
        BufferedReader br=new BufferedReader(fr);
        br.lines().forEach(l-> System.out.println(l));

        System.out.println("line readed");

        File f2=new File("resources/b.txt");
        FileWriter fw=new FileWriter(f2);
        BufferedWriter bw=new BufferedWriter(fw);
        String tmp="this is a nozomi super express";
        bw.write(tmp);
        bw.newLine();
        bw.write("new lined.");
        bw.close();
        fw.close();

        System.out.println("file wrote"+ LineSeparator.Unix);

        FileReader fr2=new FileReader(f2);
        BufferedReader br2=new BufferedReader(fr2);
        br2.lines().forEach(l-> System.out.println(l));
        System.out.println("lines read"+ LineSeparator.Unix);*/
    }
    public static void writeStringToFile(File f, String str) {
        //リソースが複数の時はこうする
        try (FileWriter fw = new FileWriter(f);
            BufferedWriter bw=new BufferedWriter(fw)) {
            bw.write(str);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
