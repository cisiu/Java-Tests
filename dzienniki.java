package pakiet;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dzienniki {
    private final static Logger LOGGER = Logger.getLogger(dzienniki.class .getName());
    public static void main(String args[]) throws IOException {
        FileHandler fh;
        fh = new FileHandler("/home/cisu/Dokumenty/dziennik.txt");
        LOGGER.addHandler(fh);
        LOGGER.setLevel(Level.INFO);


        LOGGER.info("hello");
        LOGGER.severe("severe");
    }
1
}
