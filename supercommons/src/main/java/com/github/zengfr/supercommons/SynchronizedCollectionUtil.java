package com.github.zengfr.supercommons;
import org.apache.commons.collections4.collection.SynchronizedCollection;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SynchronizedCollectionUtil{ 
public static <T> org.apache.commons.collections4.collection.SynchronizedCollection<T> synchronizedCollection(java.util.Collection<T> p0){
return SynchronizedCollection.synchronizedCollection(p0);
}
}
