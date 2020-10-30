package cn.pear.others;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

public class MyViewResolver implements ViewResolver, Ordered {

    private int order;
    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        if(viewName.startsWith("pear:")){
            return new MyView();
        }else{
            return null;
        }
    }

    @Override
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
