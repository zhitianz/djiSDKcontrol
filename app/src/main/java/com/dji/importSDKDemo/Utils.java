package com.dji.importSDKDemo;

import android.content.Context;



import dji.common.error.DJIError;
/**
 * Created by Administrator on 3/14/2017.
 */

public class Utils {
    public static void showDialogBasedOnError(Context ctx, DJIError djiError) {
        if (null == djiError)
            DJIDialog.showDialog(ctx, "Success");
        else
            DJIDialog.showDialog(ctx, djiError.getDescription());
    }
}
