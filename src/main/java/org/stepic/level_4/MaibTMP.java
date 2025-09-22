package org.stepic.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class MaibTMP {
    public static void main(String[] args) throws IOException {

//        Reader reader = new BufferedReader(new InputStreamReader(System.in));
//        int [] ints = new int[]{reader.read()};
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//            System.out.println();
//        }

        Charset charset = StandardCharsets.UTF_8;
        byte [] b = "Ы".getBytes(charset);
        int [] result = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            result [i] = Byte.toUnsignedInt(b [i]);
        }
        System.out.print(Arrays.toString(result));
    }
}
