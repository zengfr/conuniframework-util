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
public final class Int2FloatSortedMapUtil{ 
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#fastIterable(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#fastIterable(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.ints.Int2FloatMap$Entry> it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.fastIterable(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap)
*fastIterable(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.ints.Int2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0){
	return it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.fastIterable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.ints.Int2FloatMap$Entry> it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap)
*fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.ints.Int2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0){
	return it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#singleton(int,float)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#singleton(int,float)
*<code>public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.singleton(int,float)
*singleton(int p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(int p0,float p1){
	return it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#singleton(java.lang.Integer,java.lang.Float,it.unimi.dsi.fastutil.ints.IntComparator)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#singleton(java.lang.Integer,java.lang.Float,it.unimi.dsi.fastutil.ints.IntComparator)
*<code>public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.singleton(java.lang.Integer,java.lang.Float,it.unimi.dsi.fastutil.ints.IntComparator)
*singleton(java.lang.Integer p0,java.lang.Float p1,it.unimi.dsi.fastutil.ints.IntComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(java.lang.Integer p0,java.lang.Float p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#singleton(java.lang.Integer,java.lang.Float)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#singleton(java.lang.Integer,java.lang.Float)
*<code>public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.singleton(java.lang.Integer,java.lang.Float)
*singleton(java.lang.Integer p0,java.lang.Float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(java.lang.Integer p0,java.lang.Float p1){
	return it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#singleton(int,float,it.unimi.dsi.fastutil.ints.IntComparator)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#singleton(int,float,it.unimi.dsi.fastutil.ints.IntComparator)
*<code>public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.singleton(int,float,it.unimi.dsi.fastutil.ints.IntComparator)
*singleton(int p0,float p1,it.unimi.dsi.fastutil.ints.IntComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap singleton(int p0,float p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap)
*<code>public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap)
*synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0){
	return it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#unmodifiable(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps#unmodifiable(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap)
*<code>public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.unmodifiable(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap)
*unmodifiable(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap unmodifiable(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0){
	return it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps.unmodifiable(p0);
}
}
