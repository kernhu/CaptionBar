package cn.walkpast.caption.bar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import cn.walkpast.caption.R;
import cn.walkpast.caption.bar.base.BaseCaptionBar;
import cn.walkpast.caption.bar.callback.SearchActionCallback;
import cn.walkpast.caption.bar.callback.SearchInputCallback;
import cn.walkpast.caption.utils.EmptyUtils;


/**
 * Author: Kern
 * Time: 2019/2/27 13:54
 * Description: This is..
 */

public class SearchCaptionBar extends BaseCaptionBar {

    private TextView mCaptionSearchLeft;
    private TextView mCaptionSearchRight;
    private RelativeLayout mCaptionSearchBox;
    private ImageView mCaptionSearchIcon;
    private ImageView mCaptionInputClear;
    private EditText mCaptionSearchInput;

    private Context mContext;
    private int mTextColor = 0xFFFFFFFF;
    private int mTextSize = 15;

    private int mLeftTextColor;
    private int mLeftTextSize;
    private int mLeftIcon;
    private String mLeftText;
    private View.OnClickListener mLeftBtnClickListener;

    private int mRightTextColor;
    private int mRightTextSize;
    private String mRightPositiveText;
    private int mRightPositiveBackground;
    private String mRightNegativeText;
    private int mRightNegativeBackground;
    private SearchActionCallback mSearchActionCallback;

    private int mSearchIcon;
    private int mInputClear;
    private int mSearchBoxBackground;

    private int mInputTextSize;
    private int mInputTextColor;
    private String mInputHint;
    private int mInputTextHintColor;
    private SearchInputCallback mSearchInputCallback;

    public TextView getCaptionSearchLeft() {
        return mCaptionSearchLeft;
    }

    public TextView getCaptionSearchRight() {
        return mCaptionSearchRight;
    }

    public RelativeLayout getCaptionSearchBox() {
        return mCaptionSearchBox;
    }

    public ImageView getCaptionSearchIcon() {
        return mCaptionSearchIcon;
    }

    public ImageView getCaptionInputClear() {
        return mCaptionInputClear;
    }

    public EditText getCaptionSearchInput() {
        return mCaptionSearchInput;
    }

    public String getLeftText() {
        return mLeftText;
    }

    public SearchCaptionBar setLeftText(String leftText) {
        mLeftText = leftText;
        return this;
    }


    public Context getContext() {
        return mContext;
    }

    public SearchCaptionBar setContext(Context context) {
        mContext = context;
        return this;
    }

    public int getTextColor() {
        return mTextColor;
    }

    public SearchCaptionBar setTextColor(int textColor) {
        mTextColor = textColor;
        return this;
    }

    public int getTextSize() {
        return mTextSize;
    }

    public SearchCaptionBar setTextSize(int textSize) {
        mTextSize = textSize;
        return this;
    }

    public int getLeftTextColor() {
        return mLeftTextColor;
    }

    public SearchCaptionBar setLeftTextColor(int leftTextColor) {
        mLeftTextColor = leftTextColor;
        return this;
    }

    public int getLeftTextSize() {
        return mLeftTextSize;
    }

    public SearchCaptionBar setLeftTextSize(int leftTextSize) {
        mLeftTextSize = leftTextSize;
        return this;
    }

    public int getLeftIcon() {
        return mLeftIcon;
    }

    public SearchCaptionBar setLeftIcon(int leftIcon) {
        mLeftIcon = leftIcon;
        return this;
    }

    public View.OnClickListener getLeftBtnClickListener() {
        return mLeftBtnClickListener;
    }

    public SearchCaptionBar setLeftBtnClickListener(View.OnClickListener leftBtnClickListener) {
        mLeftBtnClickListener = leftBtnClickListener;
        return this;
    }

    public int getRightTextColor() {
        return mRightTextColor;
    }

    public SearchCaptionBar setRightTextColor(int rightTextColor) {
        mRightTextColor = rightTextColor;
        return this;
    }

    public int getRightTextSize() {
        return mRightTextSize;
    }

    public SearchCaptionBar setRightTextSize(int rightTextSize) {
        mRightTextSize = rightTextSize;
        return this;
    }

    public SearchActionCallback getSearchActionCallback() {
        return mSearchActionCallback;
    }

    public SearchCaptionBar setSearchActionCallback(SearchActionCallback actionCallback) {
        mSearchActionCallback = actionCallback;
        return this;
    }

    public String getRightPositiveText() {
        return mRightPositiveText;
    }

    public SearchCaptionBar setRightPositiveText(String rightPositiveText) {
        mRightPositiveText = rightPositiveText;
        return this;
    }

    public int getRightPositiveBackground() {
        return mRightPositiveBackground;
    }

    public SearchCaptionBar setRightPositiveBackground(int rightPositiveBackground) {
        mRightPositiveBackground = rightPositiveBackground;
        return this;
    }

    public String getRightNegativeText() {
        return mRightNegativeText;
    }

    public SearchCaptionBar setRightNegativeText(String rightNegativeText) {
        mRightNegativeText = rightNegativeText;
        return this;
    }

    public int getRightNegativeBackground() {
        return mRightNegativeBackground;
    }

    public SearchCaptionBar setRightNegativeBackground(int rightNegativeBackground) {
        mRightNegativeBackground = rightNegativeBackground;
        return this;
    }

    public int getSearchIcon() {
        return mSearchIcon;
    }

    public SearchCaptionBar setSearchIcon(int searchIcon) {
        mSearchIcon = searchIcon;
        return this;
    }

    public int getInputClear() {
        return mInputClear;
    }

    public SearchCaptionBar setInputClear(int inputClear) {
        mInputClear = inputClear;
        return this;
    }

    public int getSearchBoxBackground() {
        return mSearchBoxBackground;
    }

    public SearchCaptionBar setSearchBoxBackground(int searchBoxBackground) {
        mSearchBoxBackground = searchBoxBackground;
        return this;
    }

    public int getInputTextSize() {
        return mInputTextSize;
    }

    public SearchCaptionBar setInputTextSize(int inputTextSize) {
        mInputTextSize = inputTextSize;
        return this;
    }

    public int getInputTextColor() {
        return mInputTextColor;
    }

    public SearchCaptionBar setInputTextColor(int inputTextColor) {
        mInputTextColor = inputTextColor;
        return this;
    }

    public String getInputHint() {
        return mInputHint;
    }

    public SearchCaptionBar setInputHint(String inputHint) {
        mInputHint = inputHint;
        return this;
    }

    public int getInputTextHintColor() {
        return mInputTextHintColor;
    }

    public SearchCaptionBar setInputTextHintColor(int inputTextHintColor) {
        mInputTextHintColor = inputTextHintColor;
        return this;
    }

    public SearchInputCallback getSearchInputCallback() {
        return mSearchInputCallback;
    }

    public SearchCaptionBar setSearchInputCallback(SearchInputCallback searchInputCallback) {
        mSearchInputCallback = searchInputCallback;
        return this;
    }

    @Override
    public View getView() {

        if (getContext() == null) {
            throw new NullPointerException("Context is null,it can't be null");
        }

        View view = View.inflate(mContext, R.layout.layout_search_captionbar, null);
        mCaptionSearchLeft = view.findViewById(R.id.caption_search_left);
        mCaptionSearchRight = view.findViewById(R.id.caption_search_right);
        mCaptionSearchBox = view.findViewById(R.id.caption_search_box);
        mCaptionSearchIcon = view.findViewById(R.id.caption_search_icon);
        mCaptionInputClear = view.findViewById(R.id.caption_search_clear);
        mCaptionSearchInput = view.findViewById(R.id.caption_search_input);
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
        if (EmptyUtils.isEmpty(getInputTextColor())) {
            setInputTextColor(getTextColor());
        }
        if (EmptyUtils.isEmpty(getLeftTextSize())) {
            setLeftTextSize(getTextSize());
        }
        if (EmptyUtils.isEmpty(getRightTextSize())) {
            setRightTextSize(getTextSize());
        }
        if (EmptyUtils.isEmpty(getInputTextSize())) {
            setInputTextSize(getTextSize());
        }
        if (EmptyUtils.isEmpty(getRightPositiveBackground())) {
            setRightPositiveBackground(R.drawable.shape_search_right_positive_background);
        }
        if (EmptyUtils.isEmpty(getRightNegativeBackground())) {
            setRightNegativeBackground(R.drawable.shape_search_right_negative_background);
        }

        if (EmptyUtils.isEmpty(getSearchBoxBackground())) {
            setSearchBoxBackground(R.drawable.shape_search_box_background);
        }

        if (EmptyUtils.isEmpty(getInputTextHintColor())) {
            setInputTextHintColor(R.color.caption_search_input_hint_color);
        }

        if (EmptyUtils.isEmpty(getRightPositiveText())) {
            throw new NullPointerException("RightPositiveText can't be null, please set a value for it");
        }
        if (EmptyUtils.isEmpty(getRightNegativeText())) {
            throw new NullPointerException("RightNegativeText can't be null, please set a value for it");
        }
        if (EmptyUtils.isEmpty(getInputClear())) {
            throw new NullPointerException("InputClear can't be null, please set a value for it");
        }

        //LeftBtn
        if (EmptyUtils.isEmpty(getLeftText()) && EmptyUtils.isEmpty(getLeftIcon())) {
            getCaptionSearchLeft().setVisibility(View.GONE);
        } else {
            getCaptionSearchLeft().setVisibility(View.VISIBLE);
            getCaptionSearchLeft().setOnClickListener(getLeftBtnClickListener());
            if (!EmptyUtils.isEmpty(getLeftText())) {
                getCaptionSearchLeft().setText(getLeftText());
                getCaptionSearchLeft().setTextSize(TypedValue.COMPLEX_UNIT_SP, getLeftTextSize());
                getCaptionSearchLeft().setTextColor(getContext().getResources().getColor(getLeftTextColor()));
            }
            if (!EmptyUtils.isEmpty(getLeftIcon())) {
                Drawable drawable = mContext.getResources().getDrawable(getLeftIcon());
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                getCaptionSearchLeft().setCompoundDrawables(null, null, drawable, null);
            }
        }

        //RightBtn
        if (EmptyUtils.isEmpty(getRightPositiveText())) {
            getCaptionSearchRight().setVisibility(View.GONE);
        } else {
            getCaptionSearchRight().setVisibility(View.VISIBLE);
            getCaptionSearchRight().setOnClickListener(this);
            getCaptionSearchRight().setText(getRightPositiveText());
            getCaptionSearchRight().setTextSize(TypedValue.COMPLEX_UNIT_SP, getRightTextSize());
            getCaptionSearchRight().setTextColor(getContext().getResources().getColor(getRightTextColor()));
            getCaptionSearchRight().setBackground(getContext().getResources().getDrawable(getRightPositiveBackground()));
        }

        //Icon
        if (EmptyUtils.isEmpty(getSearchIcon())) {
            getCaptionSearchIcon().setVisibility(View.GONE);
        } else {
            getCaptionSearchIcon().setVisibility(View.VISIBLE);
            getCaptionSearchIcon().setImageDrawable(mContext.getResources().getDrawable(getSearchIcon()));
        }

        //Box Background
        getCaptionSearchBox().setBackground(mContext.getResources().getDrawable(getSearchBoxBackground()));
        getCaptionInputClear().setImageDrawable(mContext.getResources().getDrawable(getInputClear()));
        getCaptionInputClear().setOnClickListener(this);
        getCaptionInputClear().setVisibility(View.GONE);
        //
        getCaptionSearchInput().setHint(getInputHint());
        getCaptionSearchInput().setHintTextColor(mContext.getResources().getColor(getInputTextHintColor()));
        getCaptionSearchInput().setTextColor(mContext.getResources().getColor(getInputTextColor()));
        getCaptionSearchInput().setTextSize(TypedValue.COMPLEX_UNIT_SP, getInputTextSize());
        getCaptionSearchInput().addTextChangedListener(mTextWatcher);


        if (EmptyUtils.isEmpty(getCaptionSearchInput().getText().toString())) {
            getCaptionInputClear().setVisibility(View.GONE);
            getCaptionSearchRight().setText(getRightNegativeText());
            getCaptionSearchRight().setBackground(mContext.getResources().getDrawable(getRightNegativeBackground()));
        } else {
            getCaptionInputClear().setVisibility(View.VISIBLE);
            getCaptionSearchRight().setText(getRightPositiveText());
            getCaptionSearchRight().setBackground(mContext.getResources().getDrawable(getRightPositiveBackground()));
        }

    }


    @Override
    public void onClick(View v) {
        super.onClick(v);

        if (v.getId() == R.id.caption_search_clear) {
            Toast.makeText(getContext(), "Clean", Toast.LENGTH_SHORT).show();
            getCaptionSearchInput().setText("");
        } else if (v.getId() == R.id.caption_search_right) {
            if (getSearchActionCallback() != null) {
                getSearchActionCallback().onAction(getCaptionSearchRight(), !EmptyUtils.isEmpty(getCaptionSearchInput().getText().toString()), getCaptionSearchInput().getText().toString());
            }
        }
    }

    TextWatcher mTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            if (EmptyUtils.isEmpty(s)) {
                getCaptionInputClear().setVisibility(View.GONE);
                getCaptionSearchRight().setText(getRightNegativeText());
                getCaptionSearchRight().setBackground(mContext.getResources().getDrawable(getRightNegativeBackground()));
            } else {
                getCaptionInputClear().setVisibility(View.VISIBLE);
                getCaptionSearchRight().setText(getRightPositiveText());
                getCaptionSearchRight().setBackground(mContext.getResources().getDrawable(getRightPositiveBackground()));
            }

            if (getSearchInputCallback() != null) {
                getSearchInputCallback().onInputChange(getCaptionSearchInput(), s.toString());
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
