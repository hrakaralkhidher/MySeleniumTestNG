package MyProjects.Day.utilities;

public class BrowserUtils {
    public static void Wait(int second){
        try{
            Thread.sleep(1000 * second);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
