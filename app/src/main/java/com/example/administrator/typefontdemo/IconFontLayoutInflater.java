package com.example.administrator.typefontdemo;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v7.app.AppCompatDelegate;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/9/18.
 */
public class IconFontLayoutInflater implements LayoutInflaterFactory {

    private AppCompatDelegate mAppCompatDelegate;
    private Typeface mTypeface;

    public IconFontLayoutInflater(AppCompatDelegate mAppCompatDelegate, Context context) {
        if(null == mTypeface){
            mTypeface = Typeface.createFromAsset(context.getAssets(),"huawenxingkai.ttf");
        }
        this.mAppCompatDelegate = mAppCompatDelegate;
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {

        View view = mAppCompatDelegate.createView(parent,name,context,attrs);
        if(view instanceof TextView){
            ((TextView)view).setTypeface(mTypeface);
        }

        return view;
    }

}
