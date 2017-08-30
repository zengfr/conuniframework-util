package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedListUtil{ 
/**
*public static <T> org.apache.commons.collections4.list.PredicatedList<T> org.apache.commons.collections4.list.PredicatedList.predicatedList(java.util.List<T>,org.apache.commons.collections4.Predicate<? super T>)
*/ 
public static <T> org.apache.commons.collections4.list.PredicatedList<T> predicatedList(java.util.List<T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.list.PredicatedList.predicatedList(p0,p1);
}
}
