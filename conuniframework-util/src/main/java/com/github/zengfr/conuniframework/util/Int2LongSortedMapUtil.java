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
public final class Int2LongSortedMapUtil{ 
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#fastIterable(it.unimi.dsi.fastutil.ints.Int2LongSortedMap)}
*@see it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#fastIterable(it.unimi.dsi.fastutil.ints.Int2LongSortedMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.ints.Int2LongMap$Entry> it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.fastIterable(it.unimi.dsi.fastutil.ints.Int2LongSortedMap)
*fastIterable(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.ints.Int2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0){
	return it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.fastIterable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2LongSortedMap)}
*@see it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2LongSortedMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.ints.Int2LongMap$Entry> it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2LongSortedMap)
*fastIterator(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.ints.Int2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0){
	return it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#singleton(int,long)}
*@see it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#singleton(int,long)
*<code>public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.singleton(int,long)
*singleton(int p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(int p0,long p1){
	return it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#singleton(java.lang.Integer,java.lang.Long,it.unimi.dsi.fastutil.ints.IntComparator)}
*@see it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#singleton(java.lang.Integer,java.lang.Long,it.unimi.dsi.fastutil.ints.IntComparator)
*<code>public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.singleton(java.lang.Integer,java.lang.Long,it.unimi.dsi.fastutil.ints.IntComparator)
*singleton(java.lang.Integer p0,java.lang.Long p1,it.unimi.dsi.fastutil.ints.IntComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(java.lang.Integer p0,java.lang.Long p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#singleton(java.lang.Integer,java.lang.Long)}
*@see it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#singleton(java.lang.Integer,java.lang.Long)
*<code>public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.singleton(java.lang.Integer,java.lang.Long)
*singleton(java.lang.Integer p0,java.lang.Long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(java.lang.Integer p0,java.lang.Long p1){
	return it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#singleton(int,long,it.unimi.dsi.fastutil.ints.IntComparator)}
*@see it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#singleton(int,long,it.unimi.dsi.fastutil.ints.IntComparator)
*<code>public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.singleton(int,long,it.unimi.dsi.fastutil.ints.IntComparator)
*singleton(int p0,long p1,it.unimi.dsi.fastutil.ints.IntComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap singleton(int p0,long p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap)}
*@see it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap)
*<code>public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap)
*synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0){
	return it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#unmodifiable(it.unimi.dsi.fastutil.ints.Int2LongSortedMap)}
*@see it.unimi.dsi.fastutil.ints.Int2LongSortedMaps#unmodifiable(it.unimi.dsi.fastutil.ints.Int2LongSortedMap)
*<code>public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.unmodifiable(it.unimi.dsi.fastutil.ints.Int2LongSortedMap)
*unmodifiable(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0){
	return it.unimi.dsi.fastutil.ints.Int2LongSortedMaps.unmodifiable(p0);
}
}
