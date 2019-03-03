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
                .setCaptionBarBgc(R.color.default_caption_background)
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

        if (v.getId() == R.id.caption_general) {

            mIntent = new Intent(this, GeneralCaptionActivity.class);

        } else if (v.getId() == R.id.caption_normal) {

            mIntent = new Intent(this, NormalCaptionActivity.class);

        } else if (v.getId() == R.id.caption_design) {

            mIntent = new Intent(this, DesignCaptionActivity.class);

        } else if (v.getId() == R.id.caption_search_single) {

            mIntent = new Intent(this, SearchSingleCaptionActivity.class);

        }else if (v.getId() == R.id.caption_search_multi) {

            mIntent = new Intent(this, SearchCaptionActivity.class);

        } else if (v.getId() == R.id.caption_tablayout) {

            mIntent = new Intent(this, TabCaptionActivity.class);
        } else if (v.getId() == R.id.caption_multi_tab) {

            mIntent = new Intent(this, TabMultiCaptionActivity.class);
        }
        startActivity(mIntent);
    }
}
