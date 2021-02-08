package utilities;

import pojos.States;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadToTxt {
    public static List<Object> returnAllStates(String filePath)  {

        List<Object> allStatesIds =new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line =reader.readLine();
              //  System.out.println(line);

            int i =0;
            while (line !=null){
                String temp = "";
                temp= line.split(",")[i].trim();

                sb.append(System.lineSeparator())    ;
                line=reader.readLine();

              //  System.out.println(i++);

                allStatesIds.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allStatesIds;
    }
    public static List<States>  returnAllCountries(String filePath)  {

        List<States> allStates =new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line =reader.readLine();
            //    System.out.println(line);

            int i =0;
            while (line !=null){
                States states = new States();
                //   String temp = "";
                //    temp= line.split(",")[0].trim();
                sb.append(line);
                sb.append(System.lineSeparator())    ;
                line=reader.readLine();
                String [] each = line.split(",");
//                states.getId(each[0]);
//                states.getName(each[1]);
                allStates.add(states);


            //    System.out.println(i++);

                //  allSSNCountry.add(temp);
            }

            String everthing = sb.toString();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return allStates;

    }




}
