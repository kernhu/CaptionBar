package cn.walkpast.caption.bar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import cn.walkpast.caption.R;
import cn.walkpast.caption.bar.base.BaseCaptionBar;
import cn.walkpast.caption.bar.callback.CaptionTabCallback;
import cn.walkpast.caption.utils.EmptyUtils;


/**
 * Author: Kern
 * Time: 2019/2/27 13:54
 * Description: This is..
 */

public class TabCaptionBar extends BaseCaptionBar {

    private TextView mCaptionTabLeft;
    private TextView mCaptionTabRight;
    private TabLayout mCaptionTabLayout;

    private Context mContext;
    private int mTextColor;
    private int mTextSize = 15;

    private int mLeftTextColor;
    private int mLeftTextSize;
    private int mLeftIcon;
    private String mLeftText;
    private View.OnClickListener mLeftBtnClickListener;

    private int mRightTextColor;
    private int mRightTextSize;
    private int mRightIcon;
    private String mRightText;
    private View.OnClickListener mRightBtnClickListener;

    private int mTabIndicatorColor;
    private int mTabIndicatorHeight;
    private int mTabTextColor;
    private int mTabSelectedTextColor;
    private int mTabMode;
    private CaptionTabCallback mCaptionTabCallback;

    public TextView getCaptionTabLeft() {
        return mCaptionTabLeft;
    }

    public TextView getCaptionTabRight() {
        return mCaptionTabRight;
    }

    public TabLayout getCaptionTabLayout() {
        return mCaptionTabLayout;
    }

    public String getLeftText() {
        return mLeftText;
    }

    public TabCaptionBar setLeftText(String leftText) {
        mLeftText = leftText;
        return this;
    }

    public String getRightText() {
        return mRightText;
    }

    public TabCaptionBar setRightText(String rightText) {
        mRightText = rightText;
        return this;
    }

    public Context getContext() {
        return mContext;
    }

    public TabCaptionBar setContext(Context context) {
        mContext = context;
        return this;
    }

    public int getTextColor() {
        return mTextColor;
    }

    public TabCaptionBar setTextColor(int textColor) {
        mTextColor = textColor;
        return this;
    }

    public int getTextSize() {
        return mTextSize;
    }

    public TabCaptionBar setTextSize(int textSize) {
        mTextSize = textSize;
        return this;
    }

    public int getLeftTextColor() {
        return mLeftTextColor;
    }

    public TabCaptionBar setLeftTextColor(int leftTextColor) {
        mLeftTextColor = leftTextColor;
        return this;
    }

    public int getLeftTextSize() {
        return mLeftTextSize;
    }

    public TabCaptionBar setLeftTextSize(int leftTextSize) {
        mLeftTextSize = leftTextSize;
        return this;
    }

    public int getLeftIcon() {
        return mLeftIcon;
    }

    public TabCaptionBar setLeftIcon(int leftIcon) {
        mLeftIcon = leftIcon;
        return this;
    }

    public View.OnClickListener getLeftBtnClickListener() {
        return mLeftBtnClickListener;
    }

    public TabCaptionBar setLeftBtnClickListener(View.OnClickListener leftBtnClickListener) {
        mLeftBtnClickListener = leftBtnClickListener;
        return this;
    }

    public int getRightTextColor() {
        return mRightTextColor;
    }

    public TabCaptionBar setRightTextColor(int rightTextColor) {
        mRightTextColor = rightTextColor;
        return this;
    }

    public int getRightTextSize() {
        return mRightTextSize;
    }

    public TabCaptionBar setRightTextSize(int rightTextSize) {
        mRightTextSize = rightTextSize;
        return this;
    }

    public int getRightIcon() {
        return mRightIcon;
    }

    public TabCaptionBar setRightIcon(int rightIcon) {
        mRightIcon = rightIcon;
        return this;
    }

    public View.OnClickListener getRightBtnClickListener() {
        return mRightBtnClickListener;
    }

    public TabCaptionBar setRightBtnClickListener(View.OnClickListener rightBtnClickListener) {
        mRightBtnClickListener = rightBtnClickListener;
        return this;
    }

    public int getTabIndicatorColor() {
        return mTabIndicatorColor;
    }

    public TabCaptionBar setTabIndicatorColor(int tabIndicatorColor) {
        mTabIndicatorColor = tabIndicatorColor;
        return this;
    }

    public int getTabIndicatorHeight() {
        return mTabIndicatorHeight;
    }

    public TabCaptionBar setTabIndicatorHeight(int tabIndicatorHeight) {
        mTabIndicatorHeight = tabIndicatorHeight;
        return this;
    }

    public int getTabSelectedTextColor() {
        return mTabSelectedTextColor;
    }

    public TabCaptionBar setTabSelectedTextColor(int tabSelectedTextColor) {
        mTabSelectedTextColor = tabSelectedTextColor;
        return this;
    }

    public int getTabMode() {
        return mTabMode;
    }

    public TabCaptionBar setTabMode(int tabMode) {
        mTabMode = tabMode;
        return this;
    }

    public int getTabTextColor() {
        return mTabTextColor;
    }

    public TabCaptionBar setTabTextColor(int tabTextColor) {
        mTabTextColor = tabTextColor;
        return this;
    }

    public CaptionTabCallback getCaptionTabCallback() {
        return mCaptionTabCallback;
    }

    public TabCaptionBar setCaptionTabCallback(CaptionTabCallback captionTabCallback) {
        mCaptionTabCallback = captionTabCallback;
        return this;
    }

    @Override
    public View getView() {

        if (getContext() == null) {
            throw new NullPointerException("Context is null,it can't be null");
        }

        View view = View.inflate(mContext, R.layout.layout_tab_captionbar, null);
        mCaptionTabLeft = view.findViewById(R.id.caption_tab_left);
        mCaptionTabRight = view.findViewById(R.id.caption_tab_right);
        mCaptionTabLayout = view.findViewById(R.id.caption_tab_layout);
        bindData();

        return view;
    }

    @Override
    public View createView() {

        return getView();
    }


    private void bindData() {

        if (EmptyUtils.isEmpty(getLeftTextColor())) {
            setLeftTextColor(getTextColor());
        }
        if (EmptyUtils.isEmpty(getRightTextColor())) {
            setRightTextColor(getTextColor());
        }

        if (EmptyUtils.isEmpty(getLeftTextSize())) {
            setLeftTextSize(getTextSize());
        }
        if (EmptyUtils.isEmpty(getRightTextSize())) {
            setRightTextSize(getTextSize());
        }

        //LeftBtn
        if (EmptyUtils.isEmpty(getLeftText()) && EmptyUtils.isEmpty(getLeftIcon())) {
            getCaptionTabLeft().setVisibility(View.GONE);
        } else {
            getCaptionTabLeft().setVisibility(View.VISIBLE);
            getCaptionTabLeft().setOnClickListener(getLeftBtnClickListener());
            if (!EmptyUtils.isEmpty(getLeftText())) {
                getCaptionTabLeft().setText(getLeftText());
                getCaptionTabLeft().setTextSize(TypedValue.COMPLEX_UNIT_SP, getLeftTextSize());
                getCaptionTabLeft().setTextColor(getContext().getResources().getColor(getLeftTextColor()));
            }
            if (!EmptyUtils.isEmpty(getLeftIcon())) {
                Drawable drawable = mContext.getResources().getDrawable(getLeftIcon());
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                getCaptionTabLeft().setCompoundDrawables(drawable, null, null, null);
            }
        }

        //RightBtn
        if (EmptyUtils.isEmpty(getRightText()) && EmptyUtils.isEmpty(getRightIcon())) {
            getCaptionTabRight().setVisibility(View.GONE);
        } else {
            getCaptionTabRight().setVisibility(View.VISIBLE);
            getCaptionTabRight().setOnClickListener(getRightBtnClickListener());
            if (!EmptyUtils.isEmpty(getRightText())) {
                getCaptionTabRight().setText(getRightText());
                getCaptionTabRight().setTextSize(TypedValue.COMPLEX_UNIT_SP, getRightTextSize());
                getCaptionTabRight().setTextColor(getContext().getResources().getColor(getRightTextColor()));
            }
            if (!EmptyUtils.isEmpty(getRightIcon())) {
                Drawable drawable = mContext.getResources().getDrawable(getRightIcon());
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                getCaptionTabRight().setCompoundDrawables(null, null, drawable, null);
            }
        }

        //TabLayout
        getCaptionTabLayout().setTabTextColors(getContext().getResources().getColor(getTabTextColor()), getContext().getResources().getColor(getTabSelectedTextColor()));
        getCaptionTabLayout().setTabMode(getTabMode());
        getCaptionTabLayout().setSelectedTabIndicatorHeight((int) getContext().getResources().getDimension(getTabIndicatorHeight()));
        getCaptionTabLayout().setSelectedTabIndicatorColor(getContext().getResources().getColor(getTabIndicatorColor()));
        if(getCaptionTabCallback()!=null){
            getCaptionTabCallback().onTabInitialized(getCaptionTabLayout());
        }
    }
}
