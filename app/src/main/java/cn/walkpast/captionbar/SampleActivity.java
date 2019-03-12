package cn.walkpast.captionbar;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.walkpast.caption.CaptionActivity;
import cn.walkpast.caption.bar.DesignCaptionBar;
import cn.walkpast.caption.bar.NormalCaptionBar;
import cn.walkpast.caption.bar.SearchCaptionBar;
import cn.walkpast.caption.bar.TabCaptionBar;
import cn.walkpast.caption.bar.callback.CaptionTabCallback;
import cn.walkpast.caption.bar.callback.SearchActionCallback;
import cn.walkpast.caption.bar.callback.SearchInputCallback;


/**
 * Author: Kern
 * Time: 2019/2/28 11:10
 * Description: This is..
 */

public class SampleActivity extends CaptionActivity {

    public static final String TYPE = "type";
    public static final String LEFTBTN_TITLE = "leftbtn_title";
    public static final String LEFTBTN_TITLE_RIGHTBTN = "leftbtn_title_rightbtn";
    public static final String TITLE_LEFTBTN_RIGHTBTN = "title_leftbtn_rightbtn";
    public static final String SEARCHBOX_RIGHTBTN = "searchbox_rightbtn";
    public static final String LEFTBTN_SEARCHBOX_RIGHTBTN = "leftbtn_searchbox_rightbtn";
    public static final String LEFTBTN_TABS_RIGHTBTN = "leftbtn_tabs_rightbtn";
    public static final String MULTI_TABS = "multi_tabs";


    @BindView(R.id.content_text)
    TextView mContextText;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String type = getIntent().getStringExtra(TYPE);

        switch (type) {

            case LEFTBTN_TITLE:

                getConfig()
                        .setLayoutResID(R.layout.activity_sample)
                        .setOrientationPortrait(true)
                        .setStatusbarBgc(R.color.default_statusbar_background)
                        .setCaptionBarHeight(R.dimen.default_caption_bar_height)
                        .setCaptionBarColor(R.color.default_caption_background)
                        .setCaptionBar(new NormalCaptionBar()
                                .setContext(this)
                                .setTextColor(R.color.default_text_color)
                                .setTextSize(15)
                                //.setLeftText(getString(R.string.caption_left_btn))
                                .setLeftIcon(R.drawable.ic_back)
                                .setTitleText("LeftBtn-Title")
                                .setLeftBtnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        finish();
                                    }
                                })
                                .createView()
                        )
                        .build();

                break;
            case LEFTBTN_TITLE_RIGHTBTN:

                getConfig()
                        .setLayoutResID(R.layout.activity_sample)
                        .setOrientationPortrait(true)
                        .setStatusbarBgc(R.color.default_statusbar_background)
                        .setCaptionBarHeight(R.dimen.default_caption_bar_height)
                        .setCaptionBarColor(R.color.default_caption_background)
                        .setCaptionBar(new NormalCaptionBar()
                                .setContext(this)
                                .setTextColor(R.color.default_text_color)
                                .setTextSize(15)
                                //.setLeftText(getString(R.string.caption_left_btn))
                                .setLeftIcon(R.drawable.ic_back)
                                //.setRightText(getString(R.string.caption_right_btn))
                                .setRightIcon(R.drawable.ic_menu)
                                .setTitleText("LeftBtn-Title-RightBtn")
                                .setLeftBtnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        finish();
                                    }
                                })
                                .setRightBtnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(SampleActivity.this, "RightBtn", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .createView()
                        )
                        .build();

                break;
            case TITLE_LEFTBTN_RIGHTBTN:

                getConfig()
                        .setLayoutResID(R.layout.activity_sample)
                        .setOrientationPortrait(true)
                        .setStatusbarBgc(R.color.design_statusbar_background)
                        .setCaptionBarHeight(R.dimen.design_caption_bar_height)
                        .setCaptionBarColor(R.color.design_caption_background)
                        .setCaptionBar(new DesignCaptionBar()
                                .setContext(this)
                                .setTextColor(R.color.default_text_color)
                                .setTitleTextSize(18)
                                //.setLeftText(getString(R.string.caption_left_btn))
                                .setLeftIcon(R.drawable.ic_addition)
                                //.setMiddleText(getString(R.string.caption_left_btn))
                                .setMiddleIcon(R.drawable.ic_search)
                                //.setRightText(getString(R.string.caption_right_btn))
                                .setRightIcon(R.drawable.ic_close)
                                .setTitleText("Design Caption")
                                .setLeftBtnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(SampleActivity.this, "LeftBtn", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .setMiddleBtnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(SampleActivity.this, "MiddleBtn", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .setRightBtnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        finish();
                                    }
                                })
                                .createView()
                        )
                        .build();

                break;
            case SEARCHBOX_RIGHTBTN:

                getConfig()
                        .setLayoutResID(R.layout.activity_sample)
                        .setOrientationPortrait(true)
                        .setStatusbarBgc(R.color.design_statusbar_background)
                        .setCaptionBarHeight(R.dimen.design_caption_bar_height)
                        .setCaptionBarColor(R.color.design_caption_background)
                        .setCaptionBar(new SearchCaptionBar()
                                .setContext(this)
                                .setTextColor(R.color.default_text_color)
                                .setTextSize(15)
                                .setSearchIcon(R.drawable.ic_search)
                                .setRightPositiveText(getString(R.string.caption_search_positive_text))
                                .setRightNegativeText(getString(R.string.caption_search_negative_text))
                                .setInputClear(R.drawable.ic_close)
                                .setSearchActionCallback(new SearchActionCallback() {
                                    @Override
                                    public void onAction(View view, boolean hasValue, String input) {
                                        if (!hasValue) {
                                            finish();
                                        } else {
                                            Toast.makeText(SampleActivity.this, "go to search", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                })
                                .setSearchInputCallback(new SearchInputCallback() {
                                    @Override
                                    public void onInputChange(View view, String input) {
                                        mContextText.setText(input);
                                    }
                                })
                                .createView()
                        )
                        .build();


                break;
            case LEFTBTN_SEARCHBOX_RIGHTBTN:

                getConfig()
                        .setLayoutResID(R.layout.activity_sample)
                        .setOrientationPortrait(true)
                        .setStatusbarBgc(R.color.design_statusbar_background)
                        .setCaptionBarHeight(R.dimen.design_caption_bar_height)
                        .setCaptionBarColor(R.color.design_caption_background)
                        .setCaptionBar(new SearchCaptionBar()
                                .setContext(this)
                                .setTextColor(R.color.default_text_color)
                                .setTextSize(15)
                                .setLeftText(getString(R.string.caption_search_left))
                                .setLeftIcon(R.drawable.ic_drop)
                                .setSearchIcon(R.drawable.ic_search)
                                .setRightPositiveText(getString(R.string.caption_search_positive_text))
                                .setRightNegativeText(getString(R.string.caption_search_negative_text))
                                .setInputClear(R.drawable.ic_close)
                                .setLeftBtnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(SampleActivity.this, "LeftBtn", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .setSearchActionCallback(new SearchActionCallback() {
                                    @Override
                                    public void onAction(View view, boolean hasValue, String input) {
                                        if (!hasValue) {
                                            finish();
                                        } else {
                                            Toast.makeText(SampleActivity.this, "go to search", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                })
                                .setSearchInputCallback(new SearchInputCallback() {
                                    @Override
                                    public void onInputChange(View view, String input) {
                                        mContextText.setText(input);
                                    }
                                })
                                .createView()
                        )
                        .build();

                break;
            case LEFTBTN_TABS_RIGHTBTN:

                getConfig()
                        .setLayoutResID(R.layout.activity_sample)
                        .setOrientationPortrait(true)
                        .setStatusbarBgc(R.color.default_statusbar_background)
                        .setCaptionBarHeight(R.dimen.default_caption_bar_height)
                        .setCaptionBarColor(R.color.default_caption_background)
                        .setCaptionBar(new TabCaptionBar()
                                .setContext(this)
                                .setTextColor(R.color.tab_text_color)
                                //.setLeftText(getString(R.string.caption_left_btn))
                                .setLeftIcon(R.drawable.ic_addition)
                                //.setRightText(getString(R.string.caption_right_btn))
                                .setRightIcon(R.drawable.ic_search)
                                .setTabTextColor(R.color.default_text_color)
                                .setTabIndicatorColor(R.color.tab_indicator_color)
                                .setTabSelectedTextColor(R.color.tab_selected_text_color)
                                .setTabIndicatorHeight(R.dimen.tab_indicator_height)
                                .setTabMode(TabLayout.MODE_SCROLLABLE)
                                .setLeftBtnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(SampleActivity.this, "LeftBtn", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .setRightBtnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(SampleActivity.this, "LeftBtn", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .setCaptionTabCallback(new CaptionTabCallback() {
                                    @Override
                                    public void onTabInitialized(TabLayout tabLayout) {
                                        mTabLayout = tabLayout;
                                    }
                                })
                                .createView()
                        )
                        .build();

                /**
                 * */
                mTabLayout.addTab(mTabLayout.newTab().setText("Tab 1"));
                mTabLayout.addTab(mTabLayout.newTab().setText("Tab 2"));
                mTabLayout.addTab(mTabLayout.newTab().setText("Tab 3"));
                /**
                 * */
                mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {

                        mContextText.setText(tab.getText());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });

                break;
            case MULTI_TABS:

                getConfig()
                        .setLayoutResID(R.layout.activity_sample)
                        .setOrientationPortrait(true)
                        .setStatusbarBgc(R.color.default_statusbar_background)
                        .setCaptionBarHeight(R.dimen.default_caption_bar_height)
                        .setCaptionBarColor(R.color.default_caption_background)
                        .setCaptionBar(new TabCaptionBar()
                                .setContext(this)
                                .setTabTextColor(R.color.tab_text_color)
                                .setTabIndicatorColor(R.color.tab_indicator_color)
                                .setTabSelectedTextColor(R.color.tab_selected_text_color)
                                .setTabIndicatorHeight(R.dimen.tab_indicator_height)
                                .setTabMode(TabLayout.MODE_SCROLLABLE)
                                .setCaptionTabCallback(new CaptionTabCallback() {
                                    @Override
                                    public void onTabInitialized(TabLayout tabLayout) {
                                        mTabLayout = tabLayout;
                                    }
                                })
                                .createView()
                        )
                        .build();

                /**
                 * */
                mTabLayout.addTab(mTabLayout.newTab().setText("Tab 1"));
                mTabLayout.addTab(mTabLayout.newTab().setText("Tab 2"));
                mTabLayout.addTab(mTabLayout.newTab().setText("Tab 3"));
                mTabLayout.addTab(mTabLayout.newTab().setText("Tab 4"));
                mTabLayout.addTab(mTabLayout.newTab().setText("Tab 5"));
                mTabLayout.addTab(mTabLayout.newTab().setText("Tab 6"));
                mTabLayout.addTab(mTabLayout.newTab().setText("Tab 7"));
                mTabLayout.addTab(mTabLayout.newTab().setText("Tab 8"));

                /**
                 * */
                mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        mContextText.setText(tab.getText());
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {
                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });

                break;
        }

        ButterKnife.bind(this);
    }
}
