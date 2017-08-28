package com.github.zengfr.supercommons;
import org.apache.commons.collections4.collection.PredicatedCollection;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PredicatedCollectionUtil{ 
public static <T> org.apache.commons.collections4.collection.PredicatedCollection<T> predicatedCollection(java.util.Collection<T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
return PredicatedCollection.predicatedCollection(p0,p1);
}
}
