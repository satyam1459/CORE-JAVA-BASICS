package OOPS.src.com.kunal.introdution.polymorphism;

public class Numbers {

    double sum(double a, int b){
        return a+b;
    }

    int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
        obj.sum(2,3);
        System.out.println(obj.sum(1,7));

        //obj.sum(4,5,6,7);
    }
}
