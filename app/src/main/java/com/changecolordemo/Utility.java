package com.changecolordemo;

import android.app.Activity;
import android.content.Intent;

public class Utility {

    private static int sTheme;

    public final static int THEME_RED = 0;
    public final static int THEME_YELLOW = 1;
    public final static int THEME_GREEN = 2;
    public final static int THEME_PURPLE = 3;


    public static void changeToTheme(Activity activity, int theme) {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
        activity.overridePendingTransition(android.R.anim.fade_in,
                android.R.anim.fade_out);
    }

    public static void onActivityCreateSetTheme(Activity activity) {
        switch (sTheme) {
            default:
            case THEME_RED:
                activity.setTheme(R.style.RedTheme);
                break;
            case THEME_YELLOW:
                activity.setTheme(R.style.YellowTheme);
                break;
            case THEME_GREEN :
                activity.setTheme(R.style.GreenTheme);
                break;
            case THEME_PURPLE:
                activity.setTheme(R.style.PurpleTheme);
        }
    }

}
