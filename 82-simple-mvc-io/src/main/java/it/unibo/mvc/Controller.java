package it.unibo.mvc;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Application controller. Performs the I/O.
 */
public class Controller {

        File current;

        public Controller() {
            this.current = new File(System.getProperty("user.home")
            + System.getProperty("file.separator")
            + "output.txt");
        };

        public void setCurrentFile(File file) {
            this.current = file;
        }
        
        public File getCurrentFile() {
            return this.current;
        }

        public String getCurrentPath() {
            return this.current.getAbsolutePath();
        }

        public void writeOnCurrentFile(String s) {
            try (PrintStream ps = new PrintStream(current, StandardCharsets.UTF_8)) {
                    ps.print(s);
            } catch (IOException e) {
                e.printStackTrace(); //NOPMD
            }   
        }
}
