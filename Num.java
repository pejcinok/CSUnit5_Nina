public class Num implements Comparable{

    private int value;



    public Num(int newValue){
        value = newValue;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int theValue){
        value = theValue;
    }

    public String toString(){
        String result = Integer.toString(value);
        return result;
    }


    public boolean equals(Num otherNum){
        return this.value == otherNum.value;

    }
    public int compareTo(Object other){
        Num otherNum = (Num) other;

        return this.getValue() - otherNum.getValue();

    }

}
