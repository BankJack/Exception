package test1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ComManager m=new ComManager();
        System.out.println("购买商品");
        while (true){
            m.print();
            System.out.println("请输入需要购买的商品名");
            String name=input.next();
            System.out.println("请输入需要买多少");
            int cont=input.nextInt();
            try{
                Com com=m.buy(name,cont);
                System.out.println("购买成功，商品现在的信息为；");
                System.out.println(com.toString());
            }catch (NoneException ne) {
                System.out.println("输入错误，请重新输入");
            }finally {
                System.out.println();
            }
        }
    }
}
