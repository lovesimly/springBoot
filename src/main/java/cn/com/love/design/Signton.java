package cn.com.love.design;

/**
 * Created by Administrator on 2018/2/24.
 */
public class Signton {
    private static Signton ourInstance = new Signton();

    public static Signton getInstance() {
        return ourInstance;
    }

    private Signton() {
    }
}
