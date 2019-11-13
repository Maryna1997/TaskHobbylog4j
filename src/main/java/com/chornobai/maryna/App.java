package com.chornobai.maryna;
import org.apache.log4j.Logger;


public class App 
{
    final static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args ) throws HobbyException
    {
        logger.info("Start...");
        Football hobby1 = new Football("Football", 6, 25);
        Running hobby2 = new Running("Running", 8, 200);
        Football hobby3 = new Football("Football", 10, 83);
        Running hobby4 = new Running("Running", -8, 400);

        int i = 1;

        Hobby[] arrayHobby = {hobby1, hobby2, hobby3, hobby4};
        for (Hobby var: arrayHobby) {
            try {
                var.tellAboutHobby();
            }
            catch (HobbyException ex) {
                logger.error("Error: negative age!");
            }

        }
        logger.info("Finish!");
    }
}
