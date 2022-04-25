/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainservidortcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Jupiter
 */
public class MainServidorTCP {

    public static void main(String[] args) throws IOException {
      
        int PUERTO = 44556;
       // Scanner sc = new Scanner(System.in);        
        

        //ServidorTCP servidorTCP = new ServidorTCP(); //Se crea el servidor TCP
        ServerSocket ss = new ServerSocket(PUERTO);//para abrir un puerto
        Socket s = ss.accept();;//para aceptar los sockets
        
        InputStreamReader in = new InputStreamReader(s.getInputStream());//saber el paquete de quien es
        BufferedReader bf = new BufferedReader(in);//leer dentro del contenido del paquete
        String str = bf.readLine();//leer el dato del contenido de ese paquete

        System.out.println("CLIENT:"+str);

        PrintWriter escribir = new PrintWriter(s.getOutputStream());
        escribir.println("Aloha");
        escribir.flush();
    }
}
