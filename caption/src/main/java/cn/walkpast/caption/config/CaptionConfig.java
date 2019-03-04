package cn.walkpast.caption.config;

/**
 * Author: Kern
 * Time: 2019/3/4 10:56
 * Description: This is..
 */

public class CaptionConfig {

    private static CaptionConfig mCaptionConfig;


    private int mStatusBarBgc;

    private int mCaptionBarBgc;

    private static int mCaptionBarHeight;


    public static CaptionConfig getInstance() {
        if (mCaptionConfig == null) {
            mCaptionConfig = new CaptionConfig();
        }
        return mCaptionConfig;
    }

    public int getStatusBarBgc() {
        return mStatusBarBgc;
    }

    public CaptionConfig setStatusBarBgc(int statusBarBgc) {
        mStatusBarBgc = statusBarBgc;
        return this;
    }

    public int getCaptionBarBgc() {
        return mCaptionBarBgc;
    }

    public CaptionConfig setCaptionBarBgc(int captionBarBgc) {
        mCaptionBarBgc = captionBarBgc;
        return this;
    }

    public int getCaptionBarHeight() {
        return mCaptionBarHeight;
    }

    public CaptionConfig setCaptionBarHeight(int captionBarHeight) {
        mCaptionBarHeight = captionBarHeight;
        return this;
    }

    public void build() {


    }
}
