package com.example.demo.util;

import java.util.UUID;

/**
 * @author panjin
 * @create 2019-03-22 16:20
 */
public class IdGen {
    public static String getUUID(){
        UUID uuid=UUID.randomUUID ();
        return uuid.toString ().substring (0,32);
    }
}
