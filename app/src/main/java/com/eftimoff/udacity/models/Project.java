package com.eftimoff.udacity.models;

import android.support.annotation.ColorRes;
import android.support.annotation.StringRes;

/**
 * Created by georgieftimov on 06/04/16.
 */
public class Project {

    @StringRes
    private int title;
    @ColorRes
    private int color;

    public Project(@StringRes int title, @ColorRes int color) {
        this.title = title;
        this.color = color;
    }

    @StringRes
    public int getTitle() {
        return title;
    }

    public void setTitle(@StringRes int title) {
        this.title = title;
    }

    @ColorRes
    public int getColor() {
        return color;
    }

    public void setColor(@ColorRes int color) {
        this.color = color;
    }
}
