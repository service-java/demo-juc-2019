package extthread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {

    private SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf, String dateString) {
        super();
        this.sdf = sdf;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef = sdf.parse(dateString);
            String newDateString = sdf.format(dateRef).toString();
            if (!newDateString.equals(dateString)) {
                System.out.println("ThreadName=" + this.getName()
                        + " ַ" + dateString + " תɵΪ"
                        + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
