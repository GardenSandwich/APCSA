package Unit_5._5_8.brokencalculator;

public class Calculator {
    private int total;
    private int value; // Value is the number stored in memory

    public Calculator(int startingValue){
        this.total = startingValue;
        value = 0;
    }

    public int add(int value){
        this.total = this.total + value;
        return this.total;
    }

    /**
     * Adds the instance variable value to the total
     */
    public int add(){
        this.total += value;
        return  this.total;
    }

    public int multiple(int value){
        this.total *= value;
        return  this.total;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
