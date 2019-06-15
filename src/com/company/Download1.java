package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Download1 {
    Download1() throws IOException {
    }

    URL website = new URL("http://www.website.com/information.asp");
    ReadableByteChannel rbc = Channels.newChannel(website.openStream());
    FileOutputStream fos;

    {
        try {
            fos = new FileOutputStream("information.html");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //fos. //rbc, 0, Long.MAX_VALUE);
}
