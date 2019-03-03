package cn.walkpast.captionbar;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.walkpast.caption.CaptionActivity;
import cn.walkpast.caption.bar.SearchCaptionBar;
import cn.walkpast.caption.bar.callback.SearchActionCallback;
import cn.walkpast.caption.bar.callback.SearchInputCallback;


/**
 * Author: Kern
 * Time: 2019/2/28 11:10
 * Description: This is..
 */

public class SearchCaptionActivity extends CaptionActivity {

    @BindView(R.id.search_text)
    TextView mSearchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getConfig()
                .setLayoutResID(R.layout.activity_search_caption)
                .setOrientationPortrait(true)
                .setStatusbarBgc(R.color.design_statusbar_background)
                .setCaptionBarHeight(R.dimen.design_caption_bar_height)
                .setCaptionBarBgc(R.color.design_caption_background)
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
                                Toast.makeText(SearchCaptionActivity.this, "LeftBtn", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setSearchActionCallback(new SearchActionCallback() {
                            @Override
                            public void onAction(View view, boolean hasValue, String input) {
                                if (!hasValue) {
                                    finish();
                                } else {
                                    Toast.makeText(SearchCaptionActivity.this, "go to search", Toast.LENGTH_SHORT).show();
                                }
                            }
                        })
                        .setSearchInputCallback(new SearchInputCallback() {
                            @Override
                            public void onInputChange(View view, String input) {

                                mSearchText.setText(input);
                            }
                        })
                        .createView()
                )
                .build();


        ButterKnife.bind(this);
    }
}
