package com.github.zengfr.supercommons;
import org.apache.commons.beanutils.BeanUtilsBean;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BeanUtilsBeanUtil{ 
public static org.apache.commons.beanutils.BeanUtilsBean getInstance(){
return BeanUtilsBean.getInstance();
}
public static void setInstance(org.apache.commons.beanutils.BeanUtilsBean p0){
 BeanUtilsBean.setInstance(p0);
}
}
