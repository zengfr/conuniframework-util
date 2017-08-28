package com.zengfr.supercommons;
import org.apache.commons.collections4.CollectionUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CArrayUtil{ 
public static <C> boolean addAll(java.util.Collection<C> p0,C[] p1){
return CollectionUtils.addAll(p0,p1);
}
}
