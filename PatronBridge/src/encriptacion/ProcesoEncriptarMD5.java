/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encriptacion;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 *
 * @author Aulas Ingenieria
 */
public class ProcesoEncriptarMD5 implements InterfaceEncriptar{
    
    @Override
    public String encryptar(String message, String password) throws Exception {
        try {
            // Obtener una instancia del algoritmo MD5
            MessageDigest md5 = MessageDigest.getInstance("MD5");

            // Calcular el hash MD5 de la cadena
            byte[] hashBytes = md5.digest(message.getBytes());

            // Convertir los bytes del hash a una representación hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashBytes) {
                String hex = Integer.toHexString(0xFF & hashByte);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            // Imprimir el hash MD5 en formato hexadecimal
            System.out.println("Hash MD5: " + hexString.toString());
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;    
    }
}
