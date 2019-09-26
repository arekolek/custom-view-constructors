package com.github.arekolek.customview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class CustomJavaTextView extends AppCompatTextView {

    public CustomJavaTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText(TextUtil.reverse(getText()));
    }

}
