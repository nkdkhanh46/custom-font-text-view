package com.martin.library

import android.content.Context
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.widget.TextView

class CustomFontTextView: TextView {

    constructor(context: Context): super(context) {
        applyCustomFont(context)
    }

    constructor(context: Context, attrs: AttributeSet): super(context, attrs) {
        applyCustomFont(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int): super(context, attrs, defStyle) {
        applyCustomFont(context, attrs)
    }

    private fun applyCustomFont(context: Context, attrs: AttributeSet? = null) {
        includeFontPadding = false

        if (attrs != null) {
            val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomFontTextView)
            val fontName = typedArray.getString(R.styleable.CustomFontTextView_fontName)

            try {
                typeface = FontCacheUtils.getTypeface(fontName?:"", context)
            } catch (e: Exception) {
                Log.e("Get typeface error", e.message)
            }

            typedArray.recycle()
        }
    }

    fun setFont(fontName: String) {
        try {
            typeface = FontCacheUtils.getTypeface(fontName, context)
        } catch (e: Exception) {
            Log.e("Get typeface error", e.message)
        }

        invalidate()
    }
}
