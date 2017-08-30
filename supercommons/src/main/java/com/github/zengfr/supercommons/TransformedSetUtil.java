package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedSetUtil{ 
/**
*public static <E> org.apache.commons.collections4.set.TransformedSet<E> org.apache.commons.collections4.set.TransformedSet.transformingSet(java.util.Set<E>,org.apache.commons.collections4.Transformer<? super E, ? extends E>)
*/ 
public static <E> org.apache.commons.collections4.set.TransformedSet<E> transformingSet(java.util.Set<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
	return org.apache.commons.collections4.set.TransformedSet.transformingSet(p0,p1);
}
}
