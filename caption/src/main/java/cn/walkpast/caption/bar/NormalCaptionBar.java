package cn.walkpast.caption.bar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import cn.walkpast.caption.R;
import cn.walkpast.caption.bar.base.BaseCaptionBar;
import cn.walkpast.caption.utils.EmptyUtils;


/**
 * Author: Kern
 * Time: 2019/2/27 13:54
 * Description: This is..
 */

public class NormalCaptionBar extends BaseCaptionBar {

    private TextView mCaptionNormalLeft;
    private TextView mCaptionNormalRight;
    private TextView mCaptionNormalTitle;

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

    private int mTitleTextColor;
    private int mTitleTextSize;
    private String mTitleText;

    public TextView getCaptionNormalLeft() {
        return mCaptionNormalLeft;
    }

    public TextView getCaptionNormalRight() {
        return mCaptionNormalRight;
    }

    public TextView getCaptionNormalTitle() {
        return mCaptionNormalTitle;
    }

    public String getLeftText() {
        return mLeftText;
    }

    public NormalCaptionBar setLeftText(String leftText) {
        mLeftText = leftText;
        return this;
    }

    public String getRightText() {
        return mRightText;
    }

    public NormalCaptionBar setRightText(String rightText) {
        mRightText = rightText;
        return this;
    }

    public Context getContext() {
        return mContext;
    }

    public NormalCaptionBar setContext(Context context) {
        mContext = context;
        return this;
    }

    public int getTextColor() {
        return mTextColor;
    }

    public NormalCaptionBar setTextColor(int textColor) {
        mTextColor = textColor;
        return this;
    }

    public int getTextSize() {
        return mTextSize;
    }

    public NormalCaptionBar setTextSize(int textSize) {
        mTextSize = textSize;
        return this;
    }

    public int getLeftTextColor() {
        return mLeftTextColor;
    }

    public NormalCaptionBar setLeftTextColor(int leftTextColor) {
        mLeftTextColor = leftTextColor;
        return this;
    }

    public int getLeftTextSize() {
        return mLeftTextSize;
    }

    public NormalCaptionBar setLeftTextSize(int leftTextSize) {
        mLeftTextSize = leftTextSize;
        return this;
    }

    public int getLeftIcon() {
        return mLeftIcon;
    }

    public NormalCaptionBar setLeftIcon(int leftIcon) {
        mLeftIcon = leftIcon;
        return this;
    }

    public View.OnClickListener getLeftBtnClickListener() {
        return mLeftBtnClickListener;
    }

    public NormalCaptionBar setLeftBtnClickListener(View.OnClickListener leftBtnClickListener) {
        mLeftBtnClickListener = leftBtnClickListener;
        return this;
    }

    public int getRightTextColor() {
        return mRightTextColor;
    }

    public NormalCaptionBar setRightTextColor(int rightTextColor) {
        mRightTextColor = rightTextColor;
        return this;
    }

    public int getRightTextSize() {
        return mRightTextSize;
    }

    public NormalCaptionBar setRightTextSize(int rightTextSize) {
        mRightTextSize = rightTextSize;
        return this;
    }

    public int getRightIcon() {
        return mRightIcon;
    }

    public NormalCaptionBar setRightIcon(int rightIcon) {
        mRightIcon = rightIcon;
        return this;
    }

    public View.OnClickListener getRightBtnClickListener() {
        return mRightBtnClickListener;
    }

    public NormalCaptionBar setRightBtnClickListener(View.OnClickListener rightBtnClickListener) {
        mRightBtnClickListener = rightBtnClickListener;
        return this;
    }

    public int getTitleTextColor() {
        return mTitleTextColor;
    }

    public NormalCaptionBar setTitleTextColor(int titleTextColor) {
        mTitleTextColor = titleTextColor;
        return this;
    }

    public int getTitleTextSize() {
        return mTitleTextSize;
    }

    public NormalCaptionBar setTitleTextSize(int titleTextSize) {
        mTitleTextSize = titleTextSize;
        return this;
    }

    public String getTitleText() {
        return mTitleText;
    }

    public NormalCaptionBar setTitleText(String titleText) {
        mTitleText = titleText;
        return this;
    }

    @Override
    public View getView() {

        if (getContext() == null) {
            throw new NullPointerException("Context is null,it can't be null");
        }

        View view = View.inflate(mContext, R.layout.layout_normal_captionbar, null);
        mCaptionNormalLeft = view.findViewById(R.id.caption_normal_left);
        mCaptionNormalRight = view.findViewById(R.id.caption_normal_right);
        mCaptionNormalTitle = view.findViewById(R.id.caption_normal_title);
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
        if (EmptyUtils.isEmpty(getTitleTextColor())) {
            setTitleTextColor(getTextColor());
        }

        if (EmptyUtils.isEmpty(getLeftTextSize())) {
            setLeftTextSize(getTextSize());
        }
        if (EmptyUtils.isEmpty(getRightTextSize())) {
            setRightTextSize(getTextSize());
        }
        if (EmptyUtils.isEmpty(getTitleTextSize())) {
            setTitleTextSize(getTextSize());
        }


        //LeftBtn
        if (EmptyUtils.isEmpty(getLeftText()) && EmptyUtils.isEmpty(getLeftIcon())) {
            getCaptionNormalLeft().setVisibility(View.GONE);
        } else {
            getCaptionNormalLeft().setVisibility(View.VISIBLE);
            getCaptionNormalLeft().setOnClickListener(getLeftBtnClickListener());
            if (!EmptyUtils.isEmpty(getLeftText())) {
                getCaptionNormalLeft().setText(getLeftText());
                getCaptionNormalLeft().setTextSize(TypedValue.COMPLEX_UNIT_SP, getLeftTextSize());
                getCaptionNormalLeft().setTextColor(getContext().getResources().getColor(getLeftTextColor()));
            }
            if (!EmptyUtils.isEmpty(getLeftIcon())) {
                Drawable drawable = mContext.getResources().getDrawable(getLeftIcon());
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                getCaptionNormalLeft().setCompoundDrawables(drawable, null, null, null);
            }
        }

        //RightBtn
        if (EmptyUtils.isEmpty(getRightText()) && EmptyUtils.isEmpty(getRightIcon())) {
            getCaptionNormalRight().setVisibility(View.GONE);
        } else {
            getCaptionNormalRight().setVisibility(View.VISIBLE);
            getCaptionNormalRight().setOnClickListener(getRightBtnClickListener());
            if (!EmptyUtils.isEmpty(getRightText())) {
                getCaptionNormalRight().setText(getRightText());
                getCaptionNormalRight().setTextSize(TypedValue.COMPLEX_UNIT_SP, getRightTextSize());
                getCaptionNormalRight().setTextColor(getContext().getResources().getColor(getRightTextColor()));
            }
            if (!EmptyUtils.isEmpty(getRightIcon())) {
                Drawable drawable = mContext.getResources().getDrawable(getRightIcon());
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                getCaptionNormalRight().setCompoundDrawables(null, null, drawable, null);
            }
        }

        //Title
        if (EmptyUtils.isEmpty(getTitleText())) {
            getCaptionNormalTitle().setVisibility(View.GONE);
        } else {
            getCaptionNormalTitle().setVisibility(View.VISIBLE);
            getCaptionNormalTitle().setTextSize(TypedValue.COMPLEX_UNIT_SP, getTitleTextSize());
            getCaptionNormalTitle().setTextColor(getContext().getResources().getColor(getTitleTextColor()));
            getCaptionNormalTitle().setText(getTitleText());
        }
    }
}
