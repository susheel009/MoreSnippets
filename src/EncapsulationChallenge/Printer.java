package EncapsulationChallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer() {
        this(100,0,false);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if(tonerLevel<0){
            this.tonerLevel=0;
        } else if(tonerLevel>100){
            this.tonerLevel=100;
        }else{
            this.tonerLevel=tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(this.tonerLevel+tonerAmount<0){
            return -1;
        } else if (this.tonerLevel+tonerAmount>100){
            return -1;
        }else{
            return this.tonerLevel+tonerAmount;
        }
    }
    public int printPages(int pages,boolean twoSided){
        if(twoSided){
            this.pagesPrinted+=(pages/2);
            System.out.println("This is a duplex Printer");
            return pages/2;
        }else{
            this.pagesPrinted+=pages;
            return pages;
        }
    }
}
