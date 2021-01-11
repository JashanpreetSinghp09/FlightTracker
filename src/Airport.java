import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Airport {


    private Queue<String> takeoff;
    private Queue<String> landing;
    private Stack<String> activity_log;


    Airport() {
        this.takeoff = new LinkedList();
        this.landing = new LinkedList();
        this.activity_log = new Stack();
    }



    public void addTakeOff(String flight){
      this.takeoff.add(flight);
      this.activity_log.add(flight);
    }



    public void addLanding(String flight){
        this.landing.add(flight);
        this.activity_log.add(flight);
    }


    public String handleNextAction(){
        String result = "";
        String result2 = "";
        if(this.takeoff.isEmpty()){
            return result;
        }else {
            for (int i = 0; i <= takeoff.size(); i++) {
                String take_off = this.takeoff.remove();
                result = take_off + " Take-off" + "\n";
            }
                for (int i =0;i< landing.size();i++){
                    String land = this.landing.remove();
                    result2 = land + " Landing" + "\n";
                }

            }


        return result + "\n" + result2;
    }

    public String waitingPlanes(){
        String result = "";
        String result2 = "";
        String r2="";
        if(takeoff.size() == 0 && landing.size()==0){
            return result = "No plane in the landing and take-off queues";

        }else{
            for(int i =0;i <= takeoff.size();i++){
                result += takeoff.remove() + "\n";
            }
            for(int i=0;i<= landing.size();i++){
                result2 += landing.remove() + "\n";
            }
             r2 = "Planes waiting for landing"+ "\n"+
                    "--------------------------------"+"\n"+
                    result2;
        }
       return  "Planes waiting for take-off"+"\n"+
               "-----------------------------"+"\n"+
               result + r2;
    }

    public String log() {
        String result = "";
        if (activity_log.size() == 0) {
            result = "No activity exists";
        } else {
            for (int i = 0; i <= activity_log.size(); i++) {
                result += activity_log.pop() + " Take-off" + "\n";
            }

        }return "List of the langing/take-off activities"+"\n" +
                "----------------------------------------"+"\n" +
                result;

    }



}




