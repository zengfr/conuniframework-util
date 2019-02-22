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
public final class Char2LongSortedMapUtil{ 
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#fastIterable(it.unimi.dsi.fastutil.chars.Char2LongSortedMap)}
*@see it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#fastIterable(it.unimi.dsi.fastutil.chars.Char2LongSortedMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.chars.Char2LongMap$Entry> it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.fastIterable(it.unimi.dsi.fastutil.chars.Char2LongSortedMap)
*fastIterable(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.chars.Char2LongMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0){
	return it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.fastIterable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2LongSortedMap)}
*@see it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2LongSortedMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.chars.Char2LongMap$Entry> it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2LongSortedMap)
*fastIterator(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.chars.Char2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0){
	return it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#singleton(char,long)}
*@see it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#singleton(char,long)
*<code>public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.singleton(char,long)
*singleton(char p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(char p0,long p1){
	return it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#singleton(java.lang.Character,java.lang.Long,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#singleton(java.lang.Character,java.lang.Long,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.singleton(java.lang.Character,java.lang.Long,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(java.lang.Character p0,java.lang.Long p1,it.unimi.dsi.fastutil.chars.CharComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(java.lang.Character p0,java.lang.Long p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#singleton(java.lang.Character,java.lang.Long)}
*@see it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#singleton(java.lang.Character,java.lang.Long)
*<code>public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.singleton(java.lang.Character,java.lang.Long)
*singleton(java.lang.Character p0,java.lang.Long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(java.lang.Character p0,java.lang.Long p1){
	return it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#singleton(char,long,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#singleton(char,long,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.singleton(char,long,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(char p0,long p1,it.unimi.dsi.fastutil.chars.CharComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap singleton(char p0,long p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap)}
*@see it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap)
*<code>public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap)
*synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0){
	return it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#unmodifiable(it.unimi.dsi.fastutil.chars.Char2LongSortedMap)}
*@see it.unimi.dsi.fastutil.chars.Char2LongSortedMaps#unmodifiable(it.unimi.dsi.fastutil.chars.Char2LongSortedMap)
*<code>public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.unmodifiable(it.unimi.dsi.fastutil.chars.Char2LongSortedMap)
*unmodifiable(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0){
	return it.unimi.dsi.fastutil.chars.Char2LongSortedMaps.unmodifiable(p0);
}
}
