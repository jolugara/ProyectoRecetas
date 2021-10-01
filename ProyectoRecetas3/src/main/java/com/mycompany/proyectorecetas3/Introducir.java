/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectorecetas3;

import static com.mycompany.proyectorecetas3.LeerFichero.muestraContenido;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Introducir {
    
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        String mensaje;
  
        System.out.println("Lista de posibles recetas:");
        muestraContenido("C:\\Users\\alumno\\Desktop\\recetas.txt");
        try (FileWriter fw = new FileWriter("C:\\Users\\alumno\\Desktop\\prueba1.txt", true); //try with resources
             PrintWriter salida = new PrintWriter(fw)) {
             System.out.println("Introduce la receta:");                         
             mensaje = sc.nextLine();
             salida.println(mensaje);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());                                                                  
        }
    }
}
