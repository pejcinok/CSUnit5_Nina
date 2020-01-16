public class Slogan {

    private String sentence;
    private static int count;

    public Slogan(String theSentence){
        sentence = theSentence;
            count += 1;
    }

    public static int getCount(){
        return count;
    }

    public String toString() {
        String result = sentence;
        return result;
    }
}
