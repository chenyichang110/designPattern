package com.atguigu.flyweight;

import java.util.HashMap;

/**
 * 工厂类，根据需要创建不同的网站
 *
 * @author chenyichang
 * @date 2021/5/25 17:50
 */
public class WebSiteFactory {
    private final HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    /**
     * 根据网站类型，返回一个网站，如果没有就创建一个网站
     */
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            //创建并放入池中
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    /**
     * 获得网站的分类个数
     */
    public int getWebSiteCount() {
        return pool.size();
    }
}
