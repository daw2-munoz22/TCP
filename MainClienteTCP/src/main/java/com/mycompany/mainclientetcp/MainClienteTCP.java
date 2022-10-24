/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/*Practica de TCP - UDP (Apartado TCP)*/
package com.mycompany.mainclientetcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Jupiter
 */
public class MainClienteTCP {

    public static void main(String[] args) throws IOException {     
            Scanner sc = new Scanner(System.in);            

            String servidor = sc.next();
            int puerto = sc.nextInt();
                     
            Socket so = new Socket(servidor, puerto);
            PrintWriter p = new PrintWriter(so.getOutputStream());
            p.println("ALOHA");
            p.flush();

            InputStreamReader i = new InputStreamReader(so.getInputStream());
            BufferedReader buf = new BufferedReader(i);
            String sr = buf.readLine();
            System.out.println("Server: "+sr);
        
    }
}
