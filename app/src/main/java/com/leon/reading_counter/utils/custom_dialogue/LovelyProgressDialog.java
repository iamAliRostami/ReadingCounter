package com.leon.reading_counter.utils.custom_dialogue;

import android.content.Context;

import com.leon.reading_counter.R;

/**
 * Created by yarolegovich on 16.04.2016.
 */
public class LovelyProgressDialog extends AbsLovelyDialog<LovelyProgressDialog> {

    {
        setCancelable(false);
    }

    public LovelyProgressDialog(Context context) {
        super(context);
    }

    public LovelyProgressDialog(Context context, int theme) {
        super(context, theme);
    }

    @Override
    protected int getLayout() {
        return R.layout.dialog_progress;
    }
}
