package com.zoopark.rv.base.provider;

import android.content.Context;

public abstract class BaseSectionHeaderFooter<T> extends BaseProvider {

    public Context mContext;

    private int mCount = 1;

    public BaseSectionHeaderFooter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return this.mCount;
    }

    public void setItemCount(int count) {
        mCount = count;
    }

    public void setData(T newData) {};
}