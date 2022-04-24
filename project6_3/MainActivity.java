package com.cookandroid.project6_3;

import androidx.appcompat.app.AppCompatActivity;
import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("TabHost 2020044005 김민정");

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecdog = tabHost.newTabSpec("dog").setIndicator("강아지");
        tabSpecdog.setContent(R.id.Dog);
        tabHost.addTab(tabSpecdog);

        TabHost.TabSpec tabSpeccat = tabHost.newTabSpec("cat").setIndicator("고양이");
        tabSpeccat.setContent(R.id.Cat);
        tabHost.addTab(tabSpeccat);

        TabHost.TabSpec tabSpecrab = tabHost.newTabSpec("rabbit").setIndicator("토끼");
        tabSpecrab.setContent(R.id.Rabbit);
        tabHost.addTab(tabSpecrab);

        TabHost.TabSpec tabSpechorse = tabHost.newTabSpec("horse").setIndicator("말");
        tabSpechorse.setContent(R.id.Horse);
        tabHost.addTab(tabSpechorse);

        tabHost.setCurrentTab(0);
    }
}