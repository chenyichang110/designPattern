package com.atguigu.flyweight;

/**
 * 享元模式
 *
 * @author chenyichang
 * @date 2021/5/25 17:57
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite_news = webSiteFactory.getWebSiteCategory("新闻");
        webSite_news.use(new User("tom"));

        WebSite webSite_blog = webSiteFactory.getWebSiteCategory("博客");
        webSite_blog.use(new User("jack"));

        WebSite webSite_blog1 = webSiteFactory.getWebSiteCategory("博客");
        webSite_blog1.use(new User("smith"));


        WebSite webSite_blog2 = webSiteFactory.getWebSiteCategory("博客");
        webSite_blog2.use(new User("king"));

        System.out.println(webSite_blog == webSite_blog1);//都是同一个对象
        System.out.println(webSiteFactory.getWebSiteCount());


    }
}
