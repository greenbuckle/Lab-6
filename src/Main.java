//https://github.com/greenbuckle/Lab-6.git
import java.io.*;

public class Main{
    public static void main(String[] args) {

        String file_name= "students.txt";
        File f = new File(file_name);
        double max=0.0;

        try {

            FileReader fr= new FileReader(f);

            int val;

            BufferedReader br= new BufferedReader(fr);

            String str;
            double CGP;

            while((str=br.readLine())!=null){
                System.out.println(str);
                String[]info= str.split(" ");

                //Java Convert String to double
                CGP=  Double.parseDouble(info[1]);

                if(max<CGP){
                    max=CGP;
                }else{ max=max;
                }


            }
            System.out.println("the maximum CGPA is: "+max);

            fr.close();
            br.close();

        }catch (IOException e){
            System.out.println("IO Exception happened");
        }
    }
}