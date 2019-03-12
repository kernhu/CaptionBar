# CaptionBar
ActionBar/TitleBar

CaptionBar是一个 支持多种类型的ActionBar（TitleBar）的开源库，它遵循面向对象设计思维，根据Android Activity继承原理设计，采用Build模式封装，并且统一ActionBar（TitleBar）的风格。它使用方便，很多属性可以自己设置（状态栏一体化、ActionBar高度、背景、字体大小、颜色、icon、事件监听等等），同时也支持自定义。避免了在项目开发中需要为每一个项目中每一个Activity定制一个ActionBar（TitleBar）的繁琐工作。同时，该项目还会继续维护，新增更多更丰富的ActionBar（TitleBar），欢迎大家提出bug和加入自定义ActionBar（TitleBar）队伍中。
<br><br>

![](https://github.com/KernHu/CaptionBar/raw/master/screenshots/caption.gif)  


### I: How to use it.
##### 1.创建一个Activity继承至CaptionActivity。（ eng： Create an Activity and extends CaptionActivity.）;

##### 2.在AndroidManifest中设置主题为 android:theme="@style/Theme.AppCompat.Light.NoActionBar" 。（ eng：set the Theme "android:theme="@style/Theme.AppCompat.Light.NoActionBar"" in the AndroidManifest）;

##### 3.在你所创建Activity的OnCreate中调用以下代码。（ eng： invoke the code in your activity）;

* Jist Title :
```
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
                        .setTitleText("Dawn Demo")
                        .createView()
                )
                .build();
```

* LeftBtn + Title +RightBtn :

```
     getConfig()
                .setLayoutResID(R.layout.activity_normal_caption)
                .setOrientationPortrait(true)
                .setStatusbarBgc(R.color.default_statusbar_background)
                .setCaptionBarHeight(R.dimen.default_caption_bar_height)
                .setCaptionBarBgc(R.color.default_caption_background)
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
                                Toast.makeText(NormalCaptionActivity.this, "RightBtn", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .createView()
                )
                .build();
```

* Title + LeftBtn + MiddleBtn + RightBtn :

```
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
```
		
* SearchBox + RightBtn :

```
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
                                    Toast.makeText(SearchSingleCaptionActivity.this, "go to search", Toast.LENGTH_SHORT).show();
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
```

* LeftBtn + SearchBox + RightBtn :

```
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
```

* LeftBtn + TabLayout + RightBtn :

```
      getConfig()
                .setLayoutResID(R.layout.activity_tab_caption)
                .setOrientationPortrait(true)
                .setStatusbarBgc(R.color.default_statusbar_background)
                .setCaptionBarHeight(R.dimen.default_caption_bar_height)
                .setCaptionBarBgc(R.color.default_caption_background)
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
                                Toast.makeText(TabCaptionActivity.this, "LeftBtn", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setRightBtnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(TabCaptionActivity.this, "LeftBtn", Toast.LENGTH_SHORT).show();
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
```

*  TabLayout :

```
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
```
		
### II: dependencie it to your project

* Step 1. 在需要使用该库的build.gradle文件的dependencies添加依赖(cpoy the dependency in your build.gradle where you want use it);

```
	dependencies {
	       compile 'cn.walkpast.caption:CaptionBar:1.0.5'
	}

```

### III: Contact me

Email: vsky580@gmail.com  

Facebook: https://www.facebook.com/kern.hu.580

QQ群：43447852

Hello,I'm kern....
如果有帮助到你，请给我一个小星星。If it helps you,please give me a star.

