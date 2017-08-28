package com.zengfr.supercommons;
import org.apache.commons.collections.list.SetUniqueList;
import org.apache.commons.collections4.list.SetUniqueList;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SetUniqueListUtil{ 
public static org.apache.commons.collections.list.SetUniqueList decorate(java.util.List p0){
return SetUniqueList.decorate(p0);
}
public static <E> org.apache.commons.collections4.list.SetUniqueList<E> setUniqueList(java.util.List<E> p0){
return SetUniqueList.setUniqueList(p0);
}
}
