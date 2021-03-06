package com.leon.reading_counter.utils.custom_dialogue;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;

public class LovelyDialogCompat {

    /**
     * If you don't want to change implemented interfaces when migrating from standard dialogs
     * to LovelyDialogs - use this method.
     */
    public static View.OnClickListener wrap(Dialog.OnClickListener listener) {
        return new LovelyDialogCompat.DialogOnClickListenerAdapter(listener);
    }

    static class DialogOnClickListenerAdapter implements View.OnClickListener {

        private final Dialog.OnClickListener adapted;

        DialogOnClickListenerAdapter(DialogInterface.OnClickListener adapted) {
            this.adapted = adapted;
        }

        void onClick(DialogInterface dialogInterface, int which) {
            if (adapted != null) {
                adapted.onClick(dialogInterface, which);
            }
        }

        @Override
        public void onClick(View v) {

        }
    }
}

