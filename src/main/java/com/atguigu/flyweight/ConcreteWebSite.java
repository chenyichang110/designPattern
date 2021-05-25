package com.atguigu.flyweight;

/**
 * 具体的网站
 *
 * @author chenyichang
 * @date 2021/5/25 17:51
 */
public class ConcreteWebSite extends WebSite {

    /**
     * 网站的发布类型
     */
    private final String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为" + type);
        System.out.println("使用者是" + user.getUsername());
    }
}
