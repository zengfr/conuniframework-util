package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class LongListIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.longs.LongListIterator)}
*@see it.unimi.dsi.fastutil.longs.LongBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.longs.LongListIterator)
*<code>public static it.unimi.dsi.fastutil.longs.LongBigListIterator it.unimi.dsi.fastutil.longs.LongBigListIterators.asBigListIterator(it.unimi.dsi.fastutil.longs.LongListIterator)
*asBigListIterator(it.unimi.dsi.fastutil.longs.LongListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongBigListIterator asBigListIterator(it.unimi.dsi.fastutil.longs.LongListIterator p0){
	return it.unimi.dsi.fastutil.longs.LongBigListIterators.asBigListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#asLongIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#asLongIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.longs.LongListIterator it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(java.util.ListIterator)
*asLongIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongListIterator asLongIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(p0);
}
/**
*{@link org.apache.commons.collections.primitives.LongCollections#getEmptyLongListIterator()}
*@see org.apache.commons.collections.primitives.LongCollections#getEmptyLongListIterator()
*<code>public static org.apache.commons.collections.primitives.LongListIterator org.apache.commons.collections.primitives.LongCollections.getEmptyLongListIterator()
*getEmptyLongListIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongListIterator getEmptyLongListIterator(){
	return org.apache.commons.collections.primitives.LongCollections.getEmptyLongListIterator();
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#singleton(long)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#singleton(long)
*<code>public static it.unimi.dsi.fastutil.longs.LongListIterator it.unimi.dsi.fastutil.longs.LongIterators.singleton(long)
*singleton(long p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongListIterator singleton(long p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.LongCollections#singletonLongListIterator(long)}
*@see org.apache.commons.collections.primitives.LongCollections#singletonLongListIterator(long)
*<code>public static org.apache.commons.collections.primitives.LongListIterator org.apache.commons.collections.primitives.LongCollections.singletonLongListIterator(long)
*singletonLongListIterator(long p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongListIterator singletonLongListIterator(long p0){
	return org.apache.commons.collections.primitives.LongCollections.singletonLongListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unmodifiable(it.unimi.dsi.fastutil.longs.LongListIterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unmodifiable(it.unimi.dsi.fastutil.longs.LongListIterator)
*<code>public static it.unimi.dsi.fastutil.longs.LongListIterator it.unimi.dsi.fastutil.longs.LongIterators.unmodifiable(it.unimi.dsi.fastutil.longs.LongListIterator)
*unmodifiable(it.unimi.dsi.fastutil.longs.LongListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongListIterator unmodifiable(it.unimi.dsi.fastutil.longs.LongListIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.LongCollections#unmodifiableLongListIterator(org.apache.commons.collections.primitives.LongListIterator)}
*@see org.apache.commons.collections.primitives.LongCollections#unmodifiableLongListIterator(org.apache.commons.collections.primitives.LongListIterator)
*<code>public static org.apache.commons.collections.primitives.LongListIterator org.apache.commons.collections.primitives.LongCollections.unmodifiableLongListIterator(org.apache.commons.collections.primitives.LongListIterator)
*unmodifiableLongListIterator(org.apache.commons.collections.primitives.LongListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongListIterator unmodifiableLongListIterator(org.apache.commons.collections.primitives.LongListIterator p0){
	return org.apache.commons.collections.primitives.LongCollections.unmodifiableLongListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#wrap(long[],int,int)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#wrap(long[],int,int)
*<code>public static it.unimi.dsi.fastutil.longs.LongListIterator it.unimi.dsi.fastutil.longs.LongIterators.wrap(long[],int,int)
*wrap(long[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongListIterator wrap(long[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.longs.LongIterators.wrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#wrap(long...)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#wrap(long...)
*<code>public static it.unimi.dsi.fastutil.longs.LongListIterator it.unimi.dsi.fastutil.longs.LongIterators.wrap(long[])
*wrap(long... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongListIterator wrap(long... p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListIteratorLongListIterator#wrap(java.util.ListIterator)}
*@see org.apache.commons.collections.primitives.adapters.ListIteratorLongListIterator#wrap(java.util.ListIterator)
*<code>public static org.apache.commons.collections.primitives.LongListIterator org.apache.commons.collections.primitives.adapters.ListIteratorLongListIterator.wrap(java.util.ListIterator)
*wrap(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongListIterator wrap(java.util.ListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ListIteratorLongListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.LongListIteratorListIterator#wrap(org.apache.commons.collections.primitives.LongListIterator)}
*@see org.apache.commons.collections.primitives.adapters.LongListIteratorListIterator#wrap(org.apache.commons.collections.primitives.LongListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.LongListIteratorListIterator.wrap(org.apache.commons.collections.primitives.LongListIterator)
*wrap(org.apache.commons.collections.primitives.LongListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.LongListIterator p0){
	return org.apache.commons.collections.primitives.adapters.LongListIteratorListIterator.wrap(p0);
}
}
