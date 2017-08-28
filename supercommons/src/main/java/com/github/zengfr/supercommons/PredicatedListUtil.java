package com.zengfr.supercommons;
import org.apache.commons.collections4.list.PredicatedList;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedListUtil{ 
public static <T> org.apache.commons.collections4.list.PredicatedList<T> predicatedList(java.util.List<T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
return PredicatedList.predicatedList(p0,p1);
}
}
