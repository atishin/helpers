package com.github.atishin.helpers;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.FontAwesome;

/**
 * Created by atish on 21.05.2016.
 */
public class Helpers {

    public static Drawable getFontAwesomeIcon(Context context, FontAwesome.Icon icon) {
        return new IconicsDrawable(context, icon).color(R.color.md_white_1000).actionBarSize();
    }
    public static boolean hasInternetConnection(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
        if (ni != null && ni.isConnected()) {
            return true;
        }
        return false;
    }

    public static void notifyNoConnection(Context context) {
        Toast.makeText(context, "No internet connection", Toast.LENGTH_SHORT).show();
    }
}
