package cn.walkpast.captionbar;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.walkpast.caption.CaptionActivity;
import cn.walkpast.caption.bar.TabCaptionBar;
import cn.walkpast.caption.bar.callback.CaptionTabCallback;

/**
 * Author: Kern
 * Time: 2019/2/28 15:47
 * Description: This is..
 */

public class TabMultiCaptionActivity extends CaptionActivity {

    private TabLayout mTabLayout;

    @BindView(R.id.tab_text)
    TextView mTabText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getConfig()
                .setLayoutResID(R.layout.activity_tab_caption)
                .setOrientationPortrait(true)
                .setStatusbarBgc(R.color.default_statusbar_background)
                .setCaptionBarHeight(R.dimen.default_caption_bar_height)
                .setCaptionBarBgc(R.color.default_caption_background)
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


        //
        ButterKnife.bind(this);
        //

        initView();
    }

    private void initView() {

        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 1"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 2"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 3"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 4"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 5"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 6"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 7"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 8"));


        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                mTabText.setText(tab.getText());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
