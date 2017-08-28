package com.github.zengfr.supercommons;
import org.apache.commons.beanutils.locale.LocaleBeanUtilsBean;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LocaleBeanUtilsBeanUtil{ 
public static void setInstance(org.apache.commons.beanutils.locale.LocaleBeanUtilsBean p0){
 LocaleBeanUtilsBean.setInstance(p0);
}
public static org.apache.commons.beanutils.locale.LocaleBeanUtilsBean getLocaleBeanUtilsInstance(){
return LocaleBeanUtilsBean.getLocaleBeanUtilsInstance();
}
}
