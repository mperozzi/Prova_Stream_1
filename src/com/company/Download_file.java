package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.FileAlreadyExistsException;

import java.util.Scanner;

public class Download_file {

    private boolean flag;
    public String URLText;
    public String FolderPath;

    Download_file() {
        this.flag = false;
    }

    public void DownloadFromURL() {
        do {
            try {
                ReadableByteChannel readChannel = Channels.newChannel(new URL(URLText).openStream());
                FileOutputStream fileOS = new FileOutputStream(this.FolderPath);
                FileChannel writeChannel = fileOS.getChannel();
                writeChannel.transferFrom(readChannel, 0, Long.MAX_VALUE);
                System.out.println("File creato");

                if (writeChannel != null) {
                    this.flag = true;
                } else this.flag = false;

            } catch (FileAlreadyExistsException e) {
                e.printStackTrace();
                System.out.println("Il file esiste già! Indicare un altro nome");

            } catch (FileNotFoundException e) {
                System.out.println(e);
                System.out.println("Inserire un corretto percorso del file");
                Scanner input = new Scanner(System.in);
                this.FolderPath = input.nextLine();

            } catch (MalformedURLException e) {
                e.printStackTrace();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } while (flag == false);
    }
}
