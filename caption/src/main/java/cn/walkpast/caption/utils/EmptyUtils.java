package cn.walkpast.caption.utils;

import android.text.TextUtils;

/**
 * Author: Kern
 * Time: 2019/2/27 14:57
 * Description: This is..
 */

public class EmptyUtils {


    public static boolean isEmpty(Object obj) {

        if (obj instanceof Integer) {
            if ((Integer) obj == 0) {
                return true;
            }
        } else if (obj instanceof Double) {
            if ((Double) obj == 0) {
                return true;
            }
        } else if (obj instanceof Float) {
            if ((Float) obj == 0) {
                return true;
            }
        } else if (obj instanceof String) {
            return TextUtils.isEmpty((CharSequence) obj);
        } else if (obj instanceof CharSequence) {
            return TextUtils.isEmpty((CharSequence) obj);
        } else {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

}
