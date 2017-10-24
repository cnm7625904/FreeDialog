package jljt.wangs.com.freedialog;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by Administrator。 on 2017/10/22.
 */

public class DimenUtil {
    public static int getScreenWidth(final Context context){
        final Resources resources=context.getApplicationContext().getResources();
        final DisplayMetrics dm=resources.getDisplayMetrics();
        return dm.widthPixels;
    }
    public static int getScreenHeight(final Context context){
        final Resources resources=context.getApplicationContext().getResources();
        final DisplayMetrics dm=resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
