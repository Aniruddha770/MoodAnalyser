/***********************************************************************
 *  UC-1-ability to analyse and Respond Happy or Sad Mood message
 *
 * @author Aniruddha
 * @since 30/06/2021
 ***********************************************************************/

public class MoodAnalyser {
    String message;

    //Constructor without parameter
    public MoodAnalyser() {

    }

    //Constructor with parameter
    public MoodAnalyser(String message) {
        this.message = message;
    }

    //analyseMood method
    public String analyseMood() {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
