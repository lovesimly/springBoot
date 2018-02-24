package cn.com.love.design;

/**
 * Created by Administrator on 2018/2/11.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("method 2 ");

    }

    public static void main(String [] args){
        Source targetable= new Adapter();
        targetable.method3();



    }


}
