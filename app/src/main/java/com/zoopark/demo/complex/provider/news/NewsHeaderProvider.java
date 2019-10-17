package com.zoopark.demo.complex.provider.news;

import android.content.Context;

import com.zoopark.demo.R;
import com.zoopark.rv.base.BaseSectionHeaderFooter;
import com.zoopark.rv.base.BaseViewHolder;
import com.zoopark.rv.base.IndexPath;

public class NewsHeaderProvider extends BaseSectionHeaderFooter {

    public NewsHeaderProvider(Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.item_complex_news_header;
    }

    @Override
    public void onBind(BaseViewHolder holder, IndexPath indexPath) {}
}
