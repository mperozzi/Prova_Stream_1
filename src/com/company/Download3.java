package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Download3 {

    Download3() { }

    public static void downloadFileFromURL() {
        File f = new File("C:\\Users\\Matteo\\Desktop\\prova.xls");
        String url = "https://www.istat.it/storage/codici-unita-amministrative/Elenco-comuni-italiani.xls";
        try {
            URL website = new URL(url);
            ReadableByteChannel rbc;
            rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(f);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            fos.close();
            rbc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
