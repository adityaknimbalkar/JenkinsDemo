public class test {
    int a=0,b=0;
    test(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int addAndReturn(){
        return this.a+this.b;
    }
    public static void display(int data){

        System.out.println("this is Ans:-"+data);
    }

    public static  void main(String args[]){

        test t=new test(10,2222);
       display(t.addAndReturn());

    }
}
