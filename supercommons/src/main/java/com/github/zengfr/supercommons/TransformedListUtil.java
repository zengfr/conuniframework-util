package com.github.zengfr.supercommons;
import org.apache.commons.collections4.list.TransformedList;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TransformedListUtil{ 
public static <E> org.apache.commons.collections4.list.TransformedList<E> transformedList(java.util.List<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return TransformedList.transformedList(p0,p1);
}
public static <E> org.apache.commons.collections4.list.TransformedList<E> transformingList(java.util.List<E> p0,org.apache.commons.collections4.Transformer<? super E, ? extends E> p1){
return TransformedList.transformingList(p0,p1);
}
}
