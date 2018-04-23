/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miumg.gt.ticketsws.ws.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author BYRON TOLEDO
 */
public class Md5Encrypt {
   
    private static final char[] HEXADECIMAL = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    
    public static String get_md5(String value) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes = md.digest(value.getBytes());
            StringBuilder sb = new StringBuilder(2 * bytes.length);
            for (int i = 0; i < bytes.length; i++) {
                int low = (int) (bytes[i] & 0x0f);
                int high = (int) ((bytes[i] & 0xf0) >> 4);
                sb.append(HEXADECIMAL[high]);
                sb.append(HEXADECIMAL[low]);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }


    
}