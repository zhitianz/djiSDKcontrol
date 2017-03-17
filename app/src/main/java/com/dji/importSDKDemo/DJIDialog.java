package com.dji.importSDKDemo;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
/**
 * Created by Zhitian Zhang on March 2017
 * Create a system dialog when there is a DJI error.
 */

public class DJIDialog {
    public static void showDialog(Context ctx, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
        builder.setMessage(str);
        builder.setNeutralButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create().show();
    }

}
