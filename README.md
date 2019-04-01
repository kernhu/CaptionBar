# CaptionBar <a href="https://bintray.com/sky580/aerie/captionbar/1.0.2/link"><img src="https://api.bintray.com/packages/sky580/aerie/captionbar/images/download.svg?version=1.0.2"/></a>
ActionBar/TitleBar/ToolBar

CaptionBar是一个 支持多种类型的ActionBar（TitleBar/ToolBar）的开源库，它遵循面向对象设计思维，根据Android Activity继承原理设计，采用Build模式封装，并且统一ActionBar（TitleBar/ToolBar）的风格。它使用方便，很多属性可以自己设置（状态栏一体化、ActionBar高度、背景、字体大小、颜色、icon、事件监听等等），同时也支持自定义。避免了在项目开发中需要为每一个项目中每一个Activity定制一个ActionBar（TitleBar/ToolBar）的繁琐工作。同时，该项目还会继续维护，新增更多更丰富的ActionBar（TitleBar/ToolBar），欢迎大家提出bug和加入自定义ActionBar（TitleBar/ToolBar）队伍中。
<br><br>

![](https://github.com/KernHu/CaptionBar/raw/master/screenshots/caption.gif)  


### I: How to use it.
##### 1.创建一个Activity继承至CaptionActivity。（ eng： Create an Activity and extends CaptionActivity.）;

##### 2.在AndroidManifest中设置主题为 android:theme="@style/Theme.AppCompat.Light.NoActionBar" 。（ eng：set the Theme "android:theme="@style/Theme.AppCompat.Light.NoActionBar"" in the AndroidManifest）;

##### 3.在你所创建Activity的OnCreate中调用以下代码。（ eng： invoke the code in your activity）;

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
	
### II: dependencie it to your project

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

* Step 1. 在需要使用该库的build.gradle文件的dependencies添加依赖(eng:cpoy the dependency in your build.gradle where you want use it);

```
	dependencies {
	       implementation 'com.github.KernHu:CaptionBar:Tag'
	}

```

### III: Contact me

Email: vsky580@gmail.com  

Facebook: https://www.facebook.com/kern.hu.580

QQ群：43447852

Hello,I'm kern....
如果有帮助到你，请给我一个小星星。If it helps you,please give me a star.
<br><br>
![](https://github.com/KernHu/CaptionBar/raw/master/QR-code/alipay_code.png)  ![](https://github.com/KernHu/CaptionBar/raw/master/QR-code/alipay_invite_code.png)  ![](https://github.com/KernHu/CaptionBar/raw/master/QR-code/wechat_code.png)  

<br><br>
### Ⅳ：Apache License
```
   Copyright [2019-03] [KernHu Email:vsky580@gmail.com]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
