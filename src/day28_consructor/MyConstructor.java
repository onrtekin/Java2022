package day28_consructor;

public class MyConstructor {
    static int x=3;
    static int y=5;
    public  MyConstructor(){
        x+=1;
        System.out.println("-x"+x);
    }

    public MyConstructor(int i){
        this();
        this.y=i;
        x+=y;
        System.out.println("-x"+x);

    }

    public  MyConstructor(int i,int i2){
        this(3);
        this.x-=4;
        System.out.println("-x"+x);

    }

    public static void main(String[] args) {

        MyConstructor mc1=new MyConstructor(4,3);

    }

}
