package utilities;



import pojos.Customers;
import pojos.States;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

    public class WriteToTxt {
//        public static void  saveAllData(String fileName, Customers[] customers){
//            try {
//                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//                for (int i = 0; i < customers.length; i++) {
//                    if (customers[i].getSsn()!=null)
//                        writer.append(customers[i].getSsn()+","+
//                                customers[i].getAddress()+","+
//                                customers[i].getId()+","+
//                                customers[i].getCity()+","+
//                                customers[i].getEmail()+ ","+
//                                customers[i].getFirstName()+","+
//                                customers[i].getLastName()+","+
//                                customers[i].getMiddleInitial()+","+
//                                customers[i].getMobilePhoneNumber()+","+
//                                customers[i].getPhoneNumber()+","+
//                                customers[i].getState()+","+
//                                customers[i].getZipCode()+","+
//                                customers[i].getState()+"\n");
//                    if (customers[i].getCountry()!=null)
//                        writer.append(customers[i].getCountry()+"\n");
//                    if (customers[i].getUser()!=null)
//                        writer.append(customers[i].getUser()+customers[i].getUser()+"\n");
//
//
//
//                }
//                writer.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }


 //       }
        public static void  saveAllSsn(String fileName, Customers[] customers){
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                for (int i = 0; i < customers.length; i++) {
                    if (customers[i].getSsn()!=null)
                        writer.append(customers[i].getSsn()+"\n");


                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        public static void  statesInfo(String fileName, States[] states){
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));
                for (int i = 0; i < states.length; i++) {
                    if (states[i].getId()!=null)
                        writer.append(states[i].getId()+"\n");


                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


    }




