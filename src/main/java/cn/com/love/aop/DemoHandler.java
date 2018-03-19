package cn.com.love.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DemoHandler implements InvocationHandler {
    
    private Object subject;

    public DemoHandler(Object subject) {
        super();
        this.subject = subject;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        
        method.invoke(subject, args);
        // TODO Auto-generated method stub
        return null;
    }
    
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        
        InvocationHandler handler= new DemoHandler(subject);
        
        Subject proxy=(Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.hello();
        
        
        
    }

}
