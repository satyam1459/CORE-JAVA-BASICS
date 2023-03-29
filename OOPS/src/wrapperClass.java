public class wrapperClass {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
        Integer a=45;
        Integer b=55;
        swap(a,b);
        System.out.println(a+" "+b);
    final A kunal =new A("Kunal Kushwaha");
    kunal.name="other name";

    //When a non primitive is final , you cannot reassign it
    //kunal=new A("New object");

    }
    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
}
class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name=name;
    }
}
