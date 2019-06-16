package com.company;

public class Main {
    public static void main (String[] args) {
        String URL = "https://www.istat.it/storage/codici-unita-amministrative/Elenco-comuni-italiani.xls";
        String Path = "C:/Uselhgldfnlvlrs/Mattkljksdjseo/Desjfjdfklsjdktop/prova.hkusdfkefkjsdbkf";
        Download_file df = new Download_file();
        df.URLText = URL;
        df.FolderPath = Path;
        df.DownloadFromURL();
    }

}
