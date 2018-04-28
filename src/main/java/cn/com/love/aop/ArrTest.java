package cn.com.love.aop;

import org.junit.Test;

/**
 * Created by lujingzhong on 2018/4/19.
 */
public class ArrTest {

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 6, 9};
        int[] b = {2, 3, 6, 8, 10, 19};


        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int p=0;
            for (int j = p; j < b.length; j++) {
                if (temp == b[j]) {
                    p=j+1;
                    System.out.println(temp);
                }
            }

        }

    }


    /**
     *
     */
    @Test
    public void method(){
        int[] a = {1, 3, 5, 6, 9};
        int[] b = {2, 3, 6, 8, 10, 19};
        int b_index=0;

        for (int i = 0; i <a.length ; i++) {

            for (int j = b_index; j <b.length ; j++) {
                if(a[i]<b[b_index]){
                   break;
                }
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    b_index = j++;
                    break;

                }
                if(a[i]>b[b_index]){
                    b_index++;
                }

            }

        }


    }

    @Test
    public void method2(){
        int[] a = {1, 3, 5, 6, 9};
        int[] b = {2, 3, 6, 8, 10, 19};
        int b_index=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = b_index; j <b.length ; j++) {
                if(a[i]<b[j]){
                    break;

                }
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    b_index++;
                    break;

                }
                if (a[i]>b[j]){
                    b_index++;

                }

            }

        }
}}
