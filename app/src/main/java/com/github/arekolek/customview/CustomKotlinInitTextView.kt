package com.github.arekolek.customview

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class CustomKotlinInitTextView(context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {
    init {
        text = text.reversed()
    }
}
