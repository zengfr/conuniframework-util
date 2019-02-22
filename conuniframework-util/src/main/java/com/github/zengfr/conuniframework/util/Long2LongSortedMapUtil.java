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
public final class Long2LongSortedMapUtil{ 
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#fastIterable(it.unimi.dsi.fastutil.longs.Long2LongSortedMap)}
*@see it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#fastIterable(it.unimi.dsi.fastutil.longs.Long2LongSortedMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.longs.Long2LongMap$Entry> it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.fastIterable(it.unimi.dsi.fastutil.longs.Long2LongSortedMap)
*fastIterable(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.longs.Long2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0){
	return it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.fastIterable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2LongSortedMap)}
*@see it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2LongSortedMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.longs.Long2LongMap$Entry> it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2LongSortedMap)
*fastIterator(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.longs.Long2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0){
	return it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#singleton(long,long)}
*@see it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#singleton(long,long)
*<code>public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.singleton(long,long)
*singleton(long p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(long p0,long p1){
	return it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#singleton(java.lang.Long,java.lang.Long,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#singleton(java.lang.Long,java.lang.Long,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.singleton(java.lang.Long,java.lang.Long,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Long p0,java.lang.Long p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(java.lang.Long p0,java.lang.Long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#singleton(java.lang.Long,java.lang.Long)}
*@see it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#singleton(java.lang.Long,java.lang.Long)
*<code>public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.singleton(java.lang.Long,java.lang.Long)
*singleton(java.lang.Long p0,java.lang.Long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(java.lang.Long p0,java.lang.Long p1){
	return it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#singleton(long,long,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#singleton(long,long,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.singleton(long,long,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap singleton(long p0,long p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap)}
*@see it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap)
*<code>public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap)
*synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0){
	return it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#unmodifiable(it.unimi.dsi.fastutil.longs.Long2LongSortedMap)}
*@see it.unimi.dsi.fastutil.longs.Long2LongSortedMaps#unmodifiable(it.unimi.dsi.fastutil.longs.Long2LongSortedMap)
*<code>public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.unmodifiable(it.unimi.dsi.fastutil.longs.Long2LongSortedMap)
*unmodifiable(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap unmodifiable(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0){
	return it.unimi.dsi.fastutil.longs.Long2LongSortedMaps.unmodifiable(p0);
}
}
