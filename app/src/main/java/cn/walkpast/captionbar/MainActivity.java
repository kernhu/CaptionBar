package cn.walkpast.captionbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.walkpast.caption.CaptionActivity;
import cn.walkpast.caption.bar.NormalCaptionBar;

public class MainActivity extends CaptionActivity implements View.OnClickListener {

    @BindView(R.id.caption_general)
    TextView mCaptionGeneral;
    @BindView(R.id.caption_normal)
    TextView mCaptionNormal;
    @BindView(R.id.caption_design)
    TextView mCaptionDesign;
    @BindView(R.id.caption_search_single)
    TextView mCaptionSearchSingle;
    @BindView(R.id.caption_search_multi)
    TextView mCaptionSearchMulti;
    @BindView(R.id.caption_tablayout)
    TextView mCaptionTabLayout;

    @BindView(R.id.caption_multi_tab)
    TextView mCaptionMultiTab;

    private Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getConfig()
                .setLayoutResID(R.layout.activity_main)
                .setOrientationPortrait(true)
                .setStatusbarBgc(R.color.default_statusbar_background)
                .setCaptionBarHeight(R.dimen.default_caption_bar_height)
                .setCaptionBarColor(R.color.default_caption_background)
                .setCaptionBar(new NormalCaptionBar()
                        .setContext(this)
                        .setTextColor(R.color.default_text_color)
                        .setTextSize(15)
                        .setTitleText("CaptionBar Demo")
                        .createView()
                )
                .build();

        ButterKnife.bind(this);

    }


    @OnClick({R.id.caption_general, R.id.caption_normal, R.id.caption_design, R.id.caption_search_single, R.id.caption_search_multi, R.id.caption_tablayout, R.id.caption_multi_tab})
    @Override
    public void onClick(View v) {

        mIntent = new Intent(this, SampleActivity.class);
        String type = null;

        if (v.getId() == R.id.caption_general) {

            type = SampleActivity.LEFTBTN_TITLE;

        } else if (v.getId() == R.id.caption_normal) {

            type = SampleActivity.LEFTBTN_TITLE_RIGHTBTN;

        } else if (v.getId() == R.id.caption_design) {

            type = SampleActivity.TITLE_LEFTBTN_RIGHTBTN;

        } else if (v.getId() == R.id.caption_search_single) {

            type = SampleActivity.SEARCHBOX_RIGHTBTN;

        } else if (v.getId() == R.id.caption_search_multi) {

            type = SampleActivity.LEFTBTN_SEARCHBOX_RIGHTBTN;

        } else if (v.getId() == R.id.caption_tablayout) {

            type = SampleActivity.LEFTBTN_TABS_RIGHTBTN;

        } else if (v.getId() == R.id.caption_multi_tab) {

            type = SampleActivity.MULTI_TABS;
        }
        mIntent.putExtra(SampleActivity.TYPE, type);
        startActivity(mIntent);
    }
}
