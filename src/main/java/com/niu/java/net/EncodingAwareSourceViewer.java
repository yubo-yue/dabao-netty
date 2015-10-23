package com.niu.java.net;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by yubo on 10/9/15.
 */
public class EncodingAwareSourceViewer {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try {
                String encoding = "ISO-8859-1";
                URL u = new URL(args[i]);


                URLConnection uc = u.openConnection();
                String contentType = uc.getContentType();
                int encodingStart = contentType.indexOf("charset=");
                if (encodingStart != -1) {
                    encoding = contentType.substring(encodingStart + 8);
                }

                InputStream in = new BufferedInputStream(uc.getInputStream());

                Reader r = new InputStreamReader(in, encoding);
                int c;
                while ((c = r.read()) != -1) {
                    System.out.print((char) c);
                }

                r.close();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
