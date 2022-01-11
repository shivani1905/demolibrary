package com.milople.mylibrary;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class AlertMessage {
    String title,message;

    public AlertMessage(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public void showalert(Context ctx) {
        new AlertDialog.Builder(ctx)
                .setTitle(title).setMessage(message)
                .setPositiveButton("okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).show();
    }
}
