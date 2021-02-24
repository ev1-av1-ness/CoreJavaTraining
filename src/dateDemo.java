import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

  public static void main(String[] args) {
    //current date...current time
    Date d = new Date(); //date and time
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");

    System.out.println(sdf.format(d)); //возьми d и задай ему формат как sdf
    System.out.println(sd.format(d));
    System.out.println(d.toString());
    //mm//dd//yyyy HH:MM:SS

  }

}
