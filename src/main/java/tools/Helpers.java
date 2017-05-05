package tools;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sebastianciocan on 5/5/2017.
 */
public class Helpers {

    public static String getCurrentTimeStamp(){
        SimpleDateFormat sdfDate = new SimpleDateFormat("ddHHmmss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return  strDate;
    }
}
