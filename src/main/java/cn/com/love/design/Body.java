package cn.com.love.design;

/**
 * Created by Administrator on 2018/2/11.
 */
public class Body implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public  static void main(String [] args){
        try {
            Body body = new Body();
            Body body1=(Body) body.clone();
            System.out.println(body==body1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}
