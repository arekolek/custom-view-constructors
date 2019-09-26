package com.github.arekolek.customview

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class CustomKotlinConstructorTextView : AppCompatTextView {
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        text = text.reversed()
    }
}
