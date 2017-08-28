package com.zengfr.supercommons;
import org.apache.commons.collections4.set.TransformedSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedSetUtil{ 
public static <E> org.apache.commons.collections4.set.TransformedSet<E> transformingSet(java.util.Set<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return TransformedSet.transformingSet(p0,p1);
}
}
