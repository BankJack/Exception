package test1;

public class ComManager {
        Com[] arr=new Com[100];
        private int size;

    public ComManager() {
        Com c1=new Com("牛肉",10,38.8);
        Com c2=new Com("香蕉",0,8.8);
        Com c3=new Com("鸡肉",15,18.8);
        Com c4=new Com("苹果",0,5.8);
        Com c5=new Com("羊肉",8,28.8);
        arr[this.size++]=c1;
        arr[this.size++]=c2;
        arr[this.size++]=c3;
        arr[this.size++]=c4;
        arr[this.size++]=c5;
    }

    public Com buy(String name,int cont) throws NoneException{
        Com c=null;
        for (int i = 0; i < this.size; i++) {
            if(arr[i].getName().equals(name)){
                if(arr[i].getCont()>=cont){
                    arr[i].setCont(arr[i].getCont()-cont);
                   c=arr[i];
                }
            }
        }
        if(c==null){
            throw new NoneException();
        }
        return c;
    }

    public void print(){
     for (int i=0;i<size;i++){
         System.out.println(arr[i].toString());
     }
    }
}
