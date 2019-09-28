package com.shoesfit.store.connection.callbacks;

import com.shoesfit.store.model.NewsInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CallbackFeaturedNews implements Serializable {

    public String status = "";
    public List<NewsInfo> news_infos = new ArrayList<>();

}
