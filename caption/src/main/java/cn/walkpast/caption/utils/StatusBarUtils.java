package cn.walkpast.caption.utils;

import android.content.Context;

import java.lang.reflect.Field;

/**
 * Author: Kern
 * DateTime: 2019/3/6 13:42
 * Description: This is...
 **/

public class StatusBarUtils {

    public static int getHeight(Context context){

        Class<?> c = null;
        Object obj = null;
        Field field = null;
        int x = 0, sbarHeight = 0;
        try {
            c = Class.forName("com.android.internal.R$dimen");
            obj = c.newInstance();
            field = c.getField("status_bar_height");
            x = Integer.parseInt(field.get(obj).toString());
            sbarHeight = context.getResources().getDimensionPixelSize(x);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return sbarHeight;
    }
}
