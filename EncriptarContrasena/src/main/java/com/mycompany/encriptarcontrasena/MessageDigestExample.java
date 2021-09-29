/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encriptarcontrasena;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/**
 *
 * @author alumno
 */
public class MessageDigestExample {
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
    
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the message");
      String message = sc.nextLine();
	   
      MessageDigest md = MessageDigest.getInstance("MD5");

      md.update(message.getBytes());
      
      byte[] digest = md.digest();      
      System.out.println(digest);  
     
      StringBuffer hexString = new StringBuffer();
      
      for (int i = 0;i<digest.length;i++) {
         hexString.append(Integer.toHexString(0xFF & digest[i]));
      }
      System.out.println("Hex format : " + hexString.toString());
    }

    
    
}
