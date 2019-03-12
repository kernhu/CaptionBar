package cn.walkpast.caption;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;


public class CaptionActivity extends AppCompatActivity {

    private FrameLayout mFrameCaptionContainer;
    private FrameLayout mFrameContentContainer;

    /**
     * @param config
     */
    protected void setContentView(Config config) {

        if (config.isOrientationPortrait()) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }

        //set the background color of status bar
        setStatusBar(config.getStatusbarBgc());


        super.setContentView(R.layout.activity_caption);
        mFrameCaptionContainer = findViewById(R.id.frame_caption_container);
        mFrameContentContainer = findViewById(R.id.frame_content_container);


        //create action bar
        addCaptionBar(config);
        //
        addContainerFrame(config.mLayoutResID);

    }

    /**
     * create an action bar,
     *
     * @param config
     */
    private void addCaptionBar(Config config) {

        ActionBar mActionBar = getSupportActionBar();
        if (mActionBar != null && mActionBar.isShowing()) {
            mActionBar.hide();
        }

        if (config.getCaptionBar() == null) {
            mFrameCaptionContainer.setVisibility(View.GONE);
        } else {
            mFrameCaptionContainer.setVisibility(View.VISIBLE);
            mFrameCaptionContainer.setBackgroundColor(getResources().getColor(config.getCaptionBarColor()));
            ViewGroup.LayoutParams mContainerParams = mFrameCaptionContainer.getLayoutParams();
            mContainerParams.height = (int) getResources().getDimension(config.getCaptionBarHeight());
            mFrameCaptionContainer.addView(config.getCaptionBar());
        }

    }

    /**
     * add the children layout
     *
     * @param layoutResID
     */
    private void addContainerFrame(int layoutResID) {

        mFrameContentContainer.addView(mFrameContentContainer.inflate(this, layoutResID, null));
    }


    /**
     * set the background color of status bar
     *
     * @param color
     */
    protected void setStatusBar(int color) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {//5.0及以上
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(getResources().getColor(color));
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {//4.4到5.0
            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);
        }

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            // 透明状态栏
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            // 透明导航栏
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
//            SystemStatusManager tintManager = new SystemStatusManager(this);
//            tintManager.setStatusBarTintEnabled(true);
//            tintManager.setStatusBarTintResource(0);
//            // 设置状态栏的颜色
//            tintManager.setStatusBarTintResource(color);
//            getWindow().getDecorView().setFitsSystemWindows(true);
//        }


//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
//        {
//            Window win = getWindow();
//            WindowManager.LayoutParams winParams = win.getAttributes();
//            final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
//            winParams.flags |= bits;
//            win.setAttributes(winParams);
//            getWindow().setStatusBarColor(getResources().getColor(color));
//        }
//        SystemStatusManager tintManager = new SystemStatusManager(this);
//        tintManager.setStatusBarTintEnabled(true);
//        tintManager.setStatusBarTintResource(0);

    }


    protected Config getConfig() {

        return new Config();
    }

    public class Config {

        /**
         *
         */
        private boolean isOrientationPortrait = true;


        /**
         * layoutResID
         */
        private int mLayoutResID;

        /**
         *
         */
        private int mStatusBarColor;

        /**
         *
         */
        private int mCaptionBarColor;

        /**
         *
         */
        private int mStatusBarBackground;

        /**
         *
         */
        private int mCaptionBarBackground;


        /**
         *
         */
        private int mCaptionBarHeight;

        /**
         *
         */
        private View mCaptionBar;

        public Config() {
        }

        public boolean isOrientationPortrait() {
            return isOrientationPortrait;
        }

        public Config setOrientationPortrait(boolean orientationPortrait) {
            isOrientationPortrait = orientationPortrait;
            return this;
        }

        public int getLayoutResID() {
            return mLayoutResID;
        }

        public Config setLayoutResID(int layoutResID) {
            mLayoutResID = layoutResID;
            return this;
        }

        public int getStatusBarColor() {
            return mStatusBarColor;
        }

        public Config setStatusBarColor(int statusBarColor) {
            mStatusBarColor = statusBarColor;
            return this;
        }

        public int getCaptionBarColor() {
            return mCaptionBarColor;
        }

        public Config setCaptionBarColor(int captionBarColor) {
            mCaptionBarColor = captionBarColor;
            return this;
        }

        public int getStatusbarBgc() {
            return mStatusBarBackground;
        }

        public Config setStatusbarBgc(int statusbarBackground) {
            mStatusBarBackground = statusbarBackground;
            return this;
        }

        public int getCaptionBarBackground() {
            return mCaptionBarBackground;
        }

        public Config setCaptionBarBackground(int captionBarBgc) {
            mCaptionBarBackground = captionBarBgc;
            return this;
        }

        public int getCaptionBarHeight() {
            return mCaptionBarHeight;
        }

        public Config setCaptionBarHeight(int captionbarHeight) {
            mCaptionBarHeight = captionbarHeight;
            return this;
        }

        public View getCaptionBar() {
            return mCaptionBar;
        }

        public Config setCaptionBar(View captionBar) {
            mCaptionBar = captionBar;
            return this;
        }

        public void build() {

            setContentView(this);
        }
    }


}
