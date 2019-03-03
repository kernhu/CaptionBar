package cn.walkpast.captionbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import cn.walkpast.caption.CaptionActivity;
import cn.walkpast.caption.bar.DesignCaptionBar;


/**
 * Author: Kern
 * Time: 2019/2/28 11:10
 * Description: This is..
 */

public class DesignCaptionActivity extends CaptionActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getConfig()
                .setLayoutResID(R.layout.activity_design_caption)
                .setOrientationPortrait(true)
                .setStatusbarBgc(R.color.design_statusbar_background)
                .setCaptionBarHeight(R.dimen.design_caption_bar_height)
                .setCaptionBarBgc(R.color.design_caption_background)
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
                                Toast.makeText(DesignCaptionActivity.this, "LeftBtn", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setMiddleBtnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(DesignCaptionActivity.this, "MiddleBtn", Toast.LENGTH_SHORT).show();
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
    }
}
