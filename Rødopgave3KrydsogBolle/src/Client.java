import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {


        //String ip = InetAddress.getLocalHost().getHostAddress();
        String ip = "localhost";
        Socket socket = new Socket(ip, 5555);

        InputStream inputStream = socket.getInputStream();

        String row1[];
        String row2[];
        String row3[];

        row1 = new String[3];
        row2 = new String[3];
        row3 = new String[3];

        row1[0] = "1";
        row1[1] = "2";
        row1[2] = "3";
        row2[0] = "4";
        row2[1] = "5";
        row2[2] = "6";
        row3[0] = "7";
        row3[1] = "8";
        row3[2] = "9";


        BufferedReader buffOut = new BufferedReader(new InputStreamReader(inputStream));
        BufferedReader buffIn = new BufferedReader(new InputStreamReader(System.in));

        OutputStream outputStream = socket.getOutputStream();

        PrintWriter printWriter = new PrintWriter(outputStream, true);



        while (true) {
            if (buffOut.ready()) { // Modtager fra Server

                // der laves et string objekt af buffOut(altså det man modtog fra Server)
                String choice = buffOut.readLine();

                System.out.println("Server Chose This Spot " + choice);

                // if else spørger om man modtog et tal fra 1-9 og sætter et X ind på tilsvarende plads hvis det er tilfældet
                // herefter printes det nye "bord"
                if (choice.equals("1")) {
                    row1[0] = "X";
                    System.out.println(row1[0] + " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0] + " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0] + " " + row3[1] + " " + row3[2]);
                } else if (choice.equals("2")) {
                    row1[1] = "X";
                    System.out.println(row1[0] + " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0] + " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0] + " " + row3[1] + " " + row3[2]);

                } else if (choice.equals("3")) {
                    row1[2] = "X";
                    System.out.println(row1[0] + " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0] + " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0] + " " + row3[1] + " " + row3[2]);

                } else if (choice.equals("4")) {
                    row2[0] = "X";
                    System.out.println(row1[0] + " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0] + " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0] + " " + row3[1] + " " + row3[2]);

                } else if (choice.equals("5")) {
                    row2[1] = "X";
                    System.out.println(row1[0] + " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0] + " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0] + " " + row3[1] + " " + row3[2]);

                } else if (choice.equals("6")) {
                    row2[2] = "X";
                    System.out.println(row1[0] + " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0] + " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0] + " " + row3[1] + " " + row3[2]);

                } else if (choice.equals("7")) {
                    row3[0] = "X";
                    System.out.println(row1[0] + " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0] + " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0] + " " + row3[1] + " " + row3[2]);

                } else if (choice.equals("8")) {
                    row3[1] = "X";
                    System.out.println(row1[0] + " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0] + " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0] + " " + row3[1] + " " + row3[2]);

                } else if (choice.equals("9")) {
                    row3[2] = "X";
                    System.out.println(row1[0] + " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0] + " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0] + " " + row3[1] + " " + row3[2]);
                }
            }


            if (buffIn.ready()) { // Sender til Server

                // laver string objekt af buffIn (altså det man skriver)
                String choice = buffIn.readLine();
                System.out.println("Client Chose this Spot " + choice);
                // forespørger om det man skrev var et tal mellem 1-9 og sætter et O ind på den tilsvarende plads hvis det er rigtigt
                // hvorefter det opdateret "bord" bliver printet
                if(choice.equals("1")){
                    row1[0] = "O";
                    System.out.println(row1[0]+ " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0]+ " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0]+ " " + row3[1] + " " + row3[2]);
                }else if (choice.equals("2")){
                    row1[1] = "O";
                    System.out.println(row1[0]+ " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0]+ " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0]+ " " + row3[1] + " " + row3[2]);

                }else if (choice.equals("3")){
                    row1[2] = "O";
                    System.out.println(row1[0]+ " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0]+ " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0]+ " " + row3[1] + " " + row3[2]);

                }else if (choice.equals("4")){
                    row2[0] = "O";
                    System.out.println(row1[0]+ " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0]+ " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0]+ " " + row3[1] + " " + row3[2]);

                }else if (choice.equals("5")){
                    row2[1] = "O";
                    System.out.println(row1[0]+ " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0]+ " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0]+ " " + row3[1] + " " + row3[2]);

                }else if (choice.equals("6")){
                    row2[2] = "O";
                    System.out.println(row1[0]+ " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0]+ " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0]+ " " + row3[1] + " " + row3[2]);

                }else if (choice.equals("7")){
                    row3[0] = "O";
                    System.out.println(row1[0]+ " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0]+ " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0]+ " " + row3[1] + " " + row3[2]);

                }else if (choice.equals("8")){
                    row3[1] = "O";
                    System.out.println(row1[0]+ " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0]+ " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0]+ " " + row3[1] + " " + row3[2]);

                }else if (choice.equals("9")){
                    row3[2] = "O";
                    System.out.println(row1[0]+ " " + row1[1] + " " + row1[2]);
                    System.out.println(row2[0]+ " " + row2[1] + " " + row2[2]);
                    System.out.println(row3[0]+ " " + row3[1] + " " + row3[2]);
                }

                // her sendes det man skrev til Server
                printWriter.println(choice);



            }

            Thread.sleep(1000);
        }





    }
}

