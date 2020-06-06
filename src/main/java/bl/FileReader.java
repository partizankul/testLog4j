package bl;


import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader implements iReader {
    final static Logger logger = Logger.getLogger(FileReader.class);

    @Override
        public String read() {
        String messege= "";
        try{
            URI url =ClassLoader.getSystemResource("message.txt").toURI();
            logger.info("File URL have been gotten");

            byte[] fileBytes = Files.readAllBytes(Paths.get(url));
            logger.info("Byte array from file have been gotten");

            messege = new String(fileBytes);
            logger.info("Messange from file have been gotten");
        } catch (URISyntaxException | NullPointerException | IOException e){
            logger.error(e);
        }
        return messege;
    }
}
