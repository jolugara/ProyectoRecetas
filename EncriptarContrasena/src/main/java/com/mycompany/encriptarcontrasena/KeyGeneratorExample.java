/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encriptarcontrasena;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/**
 *
 * @author alumno
 */
public class KeyGeneratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        // TODO code application logic here
                //IV
        IvParameterSpec ivSpec = new IvParameterSpec(new byte[16]);  //Oups. All 0s

        //Key
        KeyGenerator generator = KeyGenerator.getInstance("AES");
        generator.init(128);
        SecretKey secretKey = generator.generateKey();

        //Encrypt
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "BC");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivSpec);
        cipher.update(message.getBytes());

        byte[] data = cipher.doFinal();
        System.out.println(HexUtil.toString(data));
    }
    
}
