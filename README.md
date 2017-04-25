# SuperVideoView
基于Android原生视音频播放器VideoView封装，添加手势控制等功能。

一、功能优势

（1）播放进度控制

（2）进度提示

（3）屏幕切换

（4）音量调节

（5）屏幕亮度

（6）手势滑动控制

二、Bug解决

 解决VideoView在播放视频时，切换屏幕导致视频不能全屏的问题以及黑块问题。

三、使用方式

（1）源码导入

（2）布局文件中设置：

    <?xml version="1.0" encoding="utf-8"?>  
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"  
        xmlns:tools="http://schemas.android.com/tools"  
        android:layout_width="match_parent"  
        android:layout_height="match_parent"  
        tools:context="com.song.supervideoview.MainActivity">  
     
        <com.song.supervideoview.SuperVideoView  
            android:id="@+id/supervideo"  
            android:layout_width="match_parent"  
            android:layout_height="match_parent" />  
            
    </RelativeLayout>  

（3）Activity或Frament中引用：

    @Override  
        protected void onCreate(Bundle savedInstanceState) {  
            super.onCreate(savedInstanceState);  
            setContentView(R.layout.activity_main);  
            ButterKnife.bind(this);  
            videoView.register(this);// 注册宿主  
            videoView.setVideoPath(mVideoUriPath); //设置媒体路径，网络媒体和本地媒体路径都使用此方法设置  
        }  
      
        @Override  
        protected void onPause() {  
            super.onPause();  
            videoView.onPause();  
        }  
      
        @Override  
        protected void onResume() {  
            super.onResume();  
            videoView.onResume();  
        }  

（4）代码中对外提供了修改样式等接口，详细可以具体查看源码

四、效果图

<img width="500" height="300" src="https://raw.githubusercontent.com/songxiaoliang/SuperVideoView/master/demo/S70425-160651.jpg"/>
