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

public class DesignCaptionBar extends BaseCaptionBar {

    private TextView mCaptionDesignTitle;
    private TextView mCaptionDesignlLeft;
    private TextView mCaptionDesignMiddle;
    private TextView mCaptionDesignRight;

    private Context mContext;
    private int mTextColor;
    private int mTextSize = 15;

    private int mLeftTextColor;
    private int mLeftTextSize;
    private int mLeftIcon;
    private String mLeftText;
    private View.OnClickListener mLeftBtnClickListener;

    private int mMiddleTextColor;
    private int mMiddleTextSize;
    private int mMiddleIcon;
    private String mMiddleText;
    private View.OnClickListener mMiddleBtnClickListener;

    private int mRightTextColor;
    private int mRightTextSize;
    private int mRightIcon;
    private String mRightText;
    private View.OnClickListener mRightBtnClickListener;

    private int mTitleTextColor;
    private int mTitleTextSize;
    private String mTitleText;


    public TextView getCaptionDesignTitle() {
        return mCaptionDesignTitle;
    }

    public TextView getCaptionDesignlLeft() {
        return mCaptionDesignlLeft;
    }

    public TextView getCaptionDesignMiddle() {
        return mCaptionDesignMiddle;
    }

    public TextView getCaptionDesignRight() {
        return mCaptionDesignRight;
    }

    public Context getContext() {
        return mContext;
    }

    public DesignCaptionBar setContext(Context context) {
        mContext = context;
        return this;
    }

    public int getTextColor() {
        return mTextColor;
    }

    public DesignCaptionBar setTextColor(int textColor) {
        mTextColor = textColor;
        return this;
    }

    public int getTextSize() {
        return mTextSize;
    }

    public DesignCaptionBar setTextSize(int textSize) {
        mTextSize = textSize;
        return this;
    }

    public int getLeftTextColor() {
        return mLeftTextColor;
    }

    public DesignCaptionBar setLeftTextColor(int leftTextColor) {
        mLeftTextColor = leftTextColor;
        return this;
    }

    public int getLeftTextSize() {
        return mLeftTextSize;
    }

    public DesignCaptionBar setLeftTextSize(int leftTextSize) {
        mLeftTextSize = leftTextSize;
        return this;
    }

    public int getLeftIcon() {
        return mLeftIcon;
    }

    public DesignCaptionBar setLeftIcon(int leftIcon) {
        mLeftIcon = leftIcon;
        return this;
    }

    public String getLeftText() {
        return mLeftText;
    }

    public DesignCaptionBar setLeftText(String leftText) {
        mLeftText = leftText;
        return this;
    }

    public View.OnClickListener getLeftBtnClickListener() {
        return mLeftBtnClickListener;
    }

    public DesignCaptionBar setLeftBtnClickListener(View.OnClickListener leftBtnClickListener) {
        mLeftBtnClickListener = leftBtnClickListener;
        return this;
    }

    public int getMiddleTextColor() {
        return mMiddleTextColor;
    }

    public DesignCaptionBar setMiddleTextColor(int middleTextColor) {
        mMiddleTextColor = middleTextColor;
        return this;
    }

    public int getMiddleTextSize() {
        return mMiddleTextSize;
    }

    public DesignCaptionBar setMiddleTextSize(int middleTextSize) {
        mMiddleTextSize = middleTextSize;
        return this;
    }

    public int getMiddleIcon() {
        return mMiddleIcon;
    }

    public DesignCaptionBar setMiddleIcon(int middleIcon) {
        mMiddleIcon = middleIcon;
        return this;
    }

    public String getMiddleText() {
        return mMiddleText;
    }

    public DesignCaptionBar setMiddleText(String middleText) {
        mMiddleText = middleText;
        return this;
    }

    public View.OnClickListener getMiddleBtnClickListener() {
        return mMiddleBtnClickListener;
    }

    public DesignCaptionBar setMiddleBtnClickListener(View.OnClickListener middleBtnClickListener) {
        mMiddleBtnClickListener = middleBtnClickListener;
        return this;
    }

    public int getRightTextColor() {
        return mRightTextColor;
    }

    public DesignCaptionBar setRightTextColor(int rightTextColor) {
        mRightTextColor = rightTextColor;
        return this;
    }

    public int getRightTextSize() {
        return mRightTextSize;
    }

    public DesignCaptionBar setRightTextSize(int rightTextSize) {
        mRightTextSize = rightTextSize;
        return this;
    }

    public int getRightIcon() {
        return mRightIcon;
    }

    public DesignCaptionBar setRightIcon(int rightIcon) {
        mRightIcon = rightIcon;
        return this;
    }

    public String getRightText() {
        return mRightText;
    }

    public DesignCaptionBar setRightText(String rightText) {
        mRightText = rightText;
        return this;
    }

    public View.OnClickListener getRightBtnClickListener() {
        return mRightBtnClickListener;
    }

    public DesignCaptionBar setRightBtnClickListener(View.OnClickListener rightBtnClickListener) {
        mRightBtnClickListener = rightBtnClickListener;
        return this;
    }

    public int getTitleTextColor() {
        return mTitleTextColor;
    }

    public DesignCaptionBar setTitleTextColor(int titleTextColor) {
        mTitleTextColor = titleTextColor;
        return this;
    }

    public int getTitleTextSize() {
        return mTitleTextSize;
    }

    public DesignCaptionBar setTitleTextSize(int titleTextSize) {
        mTitleTextSize = titleTextSize;
        return this;
    }

    public String getTitleText() {
        return mTitleText;
    }

    public DesignCaptionBar setTitleText(String titleText) {
        mTitleText = titleText;
        return this;
    }

    @Override
    public View getView() {

        if (getContext() == null) {
            throw new NullPointerException("Context is null,it can't be null");
        }

        View view = View.inflate(mContext, R.layout.layout_design_captionbar, null);
        mCaptionDesignTitle = view.findViewById(R.id.caption_design_title);
        mCaptionDesignlLeft = view.findViewById(R.id.caption_design_left);
        mCaptionDesignMiddle = view.findViewById(R.id.caption_design_middle);
        mCaptionDesignRight = view.findViewById(R.id.caption_design_right);
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
        if (EmptyUtils.isEmpty(getMiddleTextColor())) {
            setMiddleTextColor(getTextColor());
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
        if (EmptyUtils.isEmpty(getMiddleTextSize())) {
            setMiddleTextSize(getTextSize());
        }
        if (EmptyUtils.isEmpty(getRightTextSize())) {
            setRightTextSize(getTextSize());
        }
        if (EmptyUtils.isEmpty(getTitleTextSize())) {
            setTitleTextSize(getTextSize());
        }

        //Title
        if (EmptyUtils.isEmpty(getTitleText())) {
            getCaptionDesignTitle().setVisibility(View.GONE);
        } else {
            getCaptionDesignTitle().setVisibility(View.VISIBLE);
            getCaptionDesignTitle().setTextSize(TypedValue.COMPLEX_UNIT_SP, getTitleTextSize());
            getCaptionDesignTitle().setTextColor(getContext().getResources().getColor(getLeftTextColor()));
            getCaptionDesignTitle().setText(getTitleText());
        }

        //LeftBtn
        if (EmptyUtils.isEmpty(getLeftText()) && EmptyUtils.isEmpty(getLeftIcon())) {
            getCaptionDesignlLeft().setVisibility(View.GONE);
        } else {
            getCaptionDesignlLeft().setVisibility(View.VISIBLE);
            getCaptionDesignlLeft().setOnClickListener(getLeftBtnClickListener());
            if (!EmptyUtils.isEmpty(getLeftText())) {
                getCaptionDesignlLeft().setText(getLeftText());
                getCaptionDesignlLeft().setTextSize(TypedValue.COMPLEX_UNIT_SP, getLeftTextSize());
                getCaptionDesignlLeft().setTextColor(getContext().getResources().getColor(getLeftTextColor()));
            }
            if (!EmptyUtils.isEmpty(getLeftIcon())) {
                Drawable drawable = mContext.getResources().getDrawable(getLeftIcon());
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                getCaptionDesignlLeft().setCompoundDrawables(drawable, null, null, null);
            }
        }

        //MiddleBtn
        if (EmptyUtils.isEmpty(getMiddleText()) && EmptyUtils.isEmpty(getMiddleIcon())) {
            getCaptionDesignMiddle().setVisibility(View.GONE);
        } else {
            getCaptionDesignMiddle().setVisibility(View.VISIBLE);
            getCaptionDesignMiddle().setOnClickListener(getMiddleBtnClickListener());
            if (!EmptyUtils.isEmpty(getMiddleText())) {
                getCaptionDesignMiddle().setText(getMiddleText());
                getCaptionDesignMiddle().setTextSize(TypedValue.COMPLEX_UNIT_SP, getMiddleTextSize());
                getCaptionDesignMiddle().setTextColor(getContext().getResources().getColor(getMiddleTextColor()));
            }
            if (!EmptyUtils.isEmpty(getMiddleIcon())) {
                Drawable drawable = mContext.getResources().getDrawable(getMiddleIcon());
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                getCaptionDesignMiddle().setCompoundDrawables(drawable, null, null, null);
            }
        }

        //RightBtn
        if (EmptyUtils.isEmpty(getRightText()) && EmptyUtils.isEmpty(getRightIcon())) {
            getCaptionDesignRight().setVisibility(View.GONE);
        } else {
            getCaptionDesignRight().setVisibility(View.VISIBLE);
            getCaptionDesignRight().setOnClickListener(getRightBtnClickListener());
            if (!EmptyUtils.isEmpty(getRightText())) {
                getCaptionDesignRight().setText(getRightText());
                getCaptionDesignRight().setTextSize(TypedValue.COMPLEX_UNIT_SP, getRightTextSize());
                getCaptionDesignRight().setTextColor(getContext().getResources().getColor(getRightTextColor()));
            }
            if (!EmptyUtils.isEmpty(getRightIcon())) {
                Drawable drawable = mContext.getResources().getDrawable(getRightIcon());
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                getCaptionDesignRight().setCompoundDrawables(null, null, drawable, null);
            }
        }

    }
}
