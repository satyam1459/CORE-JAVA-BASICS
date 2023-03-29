package OOPS.src.com.kunal.introdution.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }
    BoxWeight (BoxWeight other ){
        super(other);
        weight=other.weight;

    }

    BoxWeight (double side, double weight ){
        super(side);
        this.weight=weight;

    }

    public BoxWeight(double l,double h,double w, double weight){
//Super class doesn't have idea what the child class contains
        super(l,h,w);       //what is this? call the parent class constructor
        //used to initialise values present in parent class

//We are using super keyword here whereas we can use this keyword because we want to explicitly refer width of upper class
//if current class has width to then this will refer to current class
       // System.out.println(super.w);
//Child class cares what parent class contains
        this.weight=weight;
    }
}
