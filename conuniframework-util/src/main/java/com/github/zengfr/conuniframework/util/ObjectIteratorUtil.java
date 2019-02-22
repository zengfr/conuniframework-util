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
public final class ObjectIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectIterators#asObjectIterator(java.util.Iterator<K>)}
*@see it.unimi.dsi.fastutil.objects.ObjectIterators#asObjectIterator(java.util.Iterator<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.asObjectIterator(java.util.Iterator<K>)
*asObjectIterator(java.util.Iterator<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> asObjectIterator(java.util.Iterator<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.asObjectIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectIterators#concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>...)}
*@see it.unimi.dsi.fastutil.objects.ObjectIterators#concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>...)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>[])
*concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>... p0){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.concat(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectIterators#concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>[],int,int)}
*@see it.unimi.dsi.fastutil.objects.ObjectIterators#concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>[],int,int)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>[],int,int)
*concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.concat(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectIterators#emptyIterator()}
*@see it.unimi.dsi.fastutil.objects.ObjectIterators#emptyIterator()
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.emptyIterator()
*emptyIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> emptyIterator(){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.emptyIterator();
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap)}
*@see it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2BooleanMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap)
*fastIterator(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ByteMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ByteMap)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ByteMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ByteMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2ByteMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2ByteMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ByteMap)
*fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ByteMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ByteMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2ByteMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2CharMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2CharMap)}
*@see it.unimi.dsi.fastutil.bytes.Byte2CharMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2CharMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2CharMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2CharMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2CharMap)
*fastIterator(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2CharMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap)}
*@see it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2DoubleMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap)
*fastIterator(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2FloatMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2FloatMap)}
*@see it.unimi.dsi.fastutil.bytes.Byte2FloatMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2FloatMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2FloatMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2FloatMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2FloatMap)
*fastIterator(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2FloatMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2IntMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2IntMap)}
*@see it.unimi.dsi.fastutil.bytes.Byte2IntMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2IntMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2IntMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2IntMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2IntMap)
*fastIterator(it.unimi.dsi.fastutil.bytes.Byte2IntMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2IntMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2IntMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2LongMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2LongMap)}
*@see it.unimi.dsi.fastutil.bytes.Byte2LongMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2LongMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2LongMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2LongMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2LongMap)
*fastIterator(it.unimi.dsi.fastutil.bytes.Byte2LongMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2LongMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2LongMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V>)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V>)
*fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2ObjectMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V>)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V>)
*fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2ShortMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ShortMap)}
*@see it.unimi.dsi.fastutil.bytes.Byte2ShortMaps#fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ShortMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2ShortMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2ShortMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ShortMap)
*fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ShortMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ShortMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2ShortMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2BooleanMap)}
*@see it.unimi.dsi.fastutil.chars.Char2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2BooleanMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2BooleanMap$Entry> it.unimi.dsi.fastutil.chars.Char2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2BooleanMap)
*fastIterator(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0){
	return it.unimi.dsi.fastutil.chars.Char2BooleanMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ByteMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2ByteMap)}
*@see it.unimi.dsi.fastutil.chars.Char2ByteMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2ByteMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ByteMap$Entry> it.unimi.dsi.fastutil.chars.Char2ByteMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2ByteMap)
*fastIterator(it.unimi.dsi.fastutil.chars.Char2ByteMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2ByteMap p0){
	return it.unimi.dsi.fastutil.chars.Char2ByteMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2CharMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2CharMap)}
*@see it.unimi.dsi.fastutil.chars.Char2CharMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2CharMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2CharMap$Entry> it.unimi.dsi.fastutil.chars.Char2CharMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2CharMap)
*fastIterator(it.unimi.dsi.fastutil.chars.Char2CharMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2CharMap p0){
	return it.unimi.dsi.fastutil.chars.Char2CharMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2DoubleMap)}
*@see it.unimi.dsi.fastutil.chars.Char2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2DoubleMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2DoubleMap$Entry> it.unimi.dsi.fastutil.chars.Char2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2DoubleMap)
*fastIterator(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0){
	return it.unimi.dsi.fastutil.chars.Char2DoubleMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2FloatMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2FloatMap)}
*@see it.unimi.dsi.fastutil.chars.Char2FloatMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2FloatMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2FloatMap$Entry> it.unimi.dsi.fastutil.chars.Char2FloatMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2FloatMap)
*fastIterator(it.unimi.dsi.fastutil.chars.Char2FloatMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2FloatMap p0){
	return it.unimi.dsi.fastutil.chars.Char2FloatMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2IntMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2IntMap)}
*@see it.unimi.dsi.fastutil.chars.Char2IntMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2IntMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2IntMap$Entry> it.unimi.dsi.fastutil.chars.Char2IntMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2IntMap)
*fastIterator(it.unimi.dsi.fastutil.chars.Char2IntMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2IntMap p0){
	return it.unimi.dsi.fastutil.chars.Char2IntMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2LongMap)}
*@see it.unimi.dsi.fastutil.chars.Char2LongMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2LongMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2LongMap$Entry> it.unimi.dsi.fastutil.chars.Char2LongMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2LongMap)
*fastIterator(it.unimi.dsi.fastutil.chars.Char2LongMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2LongMap p0){
	return it.unimi.dsi.fastutil.chars.Char2LongMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V>)}
*@see it.unimi.dsi.fastutil.chars.Char2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.chars.Char2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V>)
*fastIterator(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ObjectMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.chars.Char2ObjectMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V>)}
*@see it.unimi.dsi.fastutil.chars.Char2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.chars.Char2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V>)
*fastIterator(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ReferenceMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.chars.Char2ReferenceMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ShortMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2ShortMap)}
*@see it.unimi.dsi.fastutil.chars.Char2ShortMaps#fastIterator(it.unimi.dsi.fastutil.chars.Char2ShortMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ShortMap$Entry> it.unimi.dsi.fastutil.chars.Char2ShortMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2ShortMap)
*fastIterator(it.unimi.dsi.fastutil.chars.Char2ShortMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2ShortMap p0){
	return it.unimi.dsi.fastutil.chars.Char2ShortMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2BooleanMap)}
*@see it.unimi.dsi.fastutil.doubles.Double2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2BooleanMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2BooleanMap$Entry> it.unimi.dsi.fastutil.doubles.Double2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2BooleanMap)
*fastIterator(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ByteMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2ByteMap)}
*@see it.unimi.dsi.fastutil.doubles.Double2ByteMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2ByteMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2ByteMap$Entry> it.unimi.dsi.fastutil.doubles.Double2ByteMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2ByteMap)
*fastIterator(it.unimi.dsi.fastutil.doubles.Double2ByteMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2ByteMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2ByteMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2CharMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2CharMap)}
*@see it.unimi.dsi.fastutil.doubles.Double2CharMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2CharMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2CharMap$Entry> it.unimi.dsi.fastutil.doubles.Double2CharMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2CharMap)
*fastIterator(it.unimi.dsi.fastutil.doubles.Double2CharMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2CharMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2CharMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2DoubleMap)}
*@see it.unimi.dsi.fastutil.doubles.Double2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2DoubleMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2DoubleMap$Entry> it.unimi.dsi.fastutil.doubles.Double2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2DoubleMap)
*fastIterator(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2DoubleMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2FloatMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2FloatMap)}
*@see it.unimi.dsi.fastutil.doubles.Double2FloatMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2FloatMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2FloatMap$Entry> it.unimi.dsi.fastutil.doubles.Double2FloatMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2FloatMap)
*fastIterator(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2FloatMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2IntMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2IntMap)}
*@see it.unimi.dsi.fastutil.doubles.Double2IntMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2IntMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2IntMap$Entry> it.unimi.dsi.fastutil.doubles.Double2IntMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2IntMap)
*fastIterator(it.unimi.dsi.fastutil.doubles.Double2IntMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2IntMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2IntMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2LongMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2LongMap)}
*@see it.unimi.dsi.fastutil.doubles.Double2LongMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2LongMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2LongMap$Entry> it.unimi.dsi.fastutil.doubles.Double2LongMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2LongMap)
*fastIterator(it.unimi.dsi.fastutil.doubles.Double2LongMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2LongMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2LongMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V>)}
*@see it.unimi.dsi.fastutil.doubles.Double2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.doubles.Double2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V>)
*fastIterator(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2ObjectMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V>)}
*@see it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V>)
*fastIterator(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2ReferenceMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2ShortMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2ShortMap)}
*@see it.unimi.dsi.fastutil.doubles.Double2ShortMaps#fastIterator(it.unimi.dsi.fastutil.doubles.Double2ShortMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2ShortMap$Entry> it.unimi.dsi.fastutil.doubles.Double2ShortMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2ShortMap)
*fastIterator(it.unimi.dsi.fastutil.doubles.Double2ShortMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2ShortMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2ShortMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2BooleanMap)}
*@see it.unimi.dsi.fastutil.floats.Float2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2BooleanMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2BooleanMap$Entry> it.unimi.dsi.fastutil.floats.Float2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2BooleanMap)
*fastIterator(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0){
	return it.unimi.dsi.fastutil.floats.Float2BooleanMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ByteMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2ByteMap)}
*@see it.unimi.dsi.fastutil.floats.Float2ByteMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2ByteMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ByteMap$Entry> it.unimi.dsi.fastutil.floats.Float2ByteMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2ByteMap)
*fastIterator(it.unimi.dsi.fastutil.floats.Float2ByteMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2ByteMap p0){
	return it.unimi.dsi.fastutil.floats.Float2ByteMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2CharMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2CharMap)}
*@see it.unimi.dsi.fastutil.floats.Float2CharMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2CharMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2CharMap$Entry> it.unimi.dsi.fastutil.floats.Float2CharMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2CharMap)
*fastIterator(it.unimi.dsi.fastutil.floats.Float2CharMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2CharMap p0){
	return it.unimi.dsi.fastutil.floats.Float2CharMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2DoubleMap)}
*@see it.unimi.dsi.fastutil.floats.Float2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2DoubleMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2DoubleMap$Entry> it.unimi.dsi.fastutil.floats.Float2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2DoubleMap)
*fastIterator(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0){
	return it.unimi.dsi.fastutil.floats.Float2DoubleMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2FloatMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2FloatMap)}
*@see it.unimi.dsi.fastutil.floats.Float2FloatMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2FloatMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2FloatMap$Entry> it.unimi.dsi.fastutil.floats.Float2FloatMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2FloatMap)
*fastIterator(it.unimi.dsi.fastutil.floats.Float2FloatMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2FloatMap p0){
	return it.unimi.dsi.fastutil.floats.Float2FloatMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2IntMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2IntMap)}
*@see it.unimi.dsi.fastutil.floats.Float2IntMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2IntMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2IntMap$Entry> it.unimi.dsi.fastutil.floats.Float2IntMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2IntMap)
*fastIterator(it.unimi.dsi.fastutil.floats.Float2IntMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2IntMap p0){
	return it.unimi.dsi.fastutil.floats.Float2IntMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2LongMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2LongMap)}
*@see it.unimi.dsi.fastutil.floats.Float2LongMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2LongMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2LongMap$Entry> it.unimi.dsi.fastutil.floats.Float2LongMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2LongMap)
*fastIterator(it.unimi.dsi.fastutil.floats.Float2LongMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2LongMap p0){
	return it.unimi.dsi.fastutil.floats.Float2LongMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V>)}
*@see it.unimi.dsi.fastutil.floats.Float2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.floats.Float2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V>)
*fastIterator(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ObjectMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.floats.Float2ObjectMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V>)}
*@see it.unimi.dsi.fastutil.floats.Float2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.floats.Float2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V>)
*fastIterator(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ReferenceMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.floats.Float2ReferenceMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2ShortMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2ShortMap)}
*@see it.unimi.dsi.fastutil.floats.Float2ShortMaps#fastIterator(it.unimi.dsi.fastutil.floats.Float2ShortMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ShortMap$Entry> it.unimi.dsi.fastutil.floats.Float2ShortMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2ShortMap)
*fastIterator(it.unimi.dsi.fastutil.floats.Float2ShortMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2ShortMap p0){
	return it.unimi.dsi.fastutil.floats.Float2ShortMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2BooleanMap)}
*@see it.unimi.dsi.fastutil.ints.Int2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2BooleanMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2BooleanMap$Entry> it.unimi.dsi.fastutil.ints.Int2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2BooleanMap)
*fastIterator(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0){
	return it.unimi.dsi.fastutil.ints.Int2BooleanMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ByteMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2ByteMap)}
*@see it.unimi.dsi.fastutil.ints.Int2ByteMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2ByteMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ByteMap$Entry> it.unimi.dsi.fastutil.ints.Int2ByteMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2ByteMap)
*fastIterator(it.unimi.dsi.fastutil.ints.Int2ByteMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2ByteMap p0){
	return it.unimi.dsi.fastutil.ints.Int2ByteMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2CharMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2CharMap)}
*@see it.unimi.dsi.fastutil.ints.Int2CharMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2CharMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2CharMap$Entry> it.unimi.dsi.fastutil.ints.Int2CharMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2CharMap)
*fastIterator(it.unimi.dsi.fastutil.ints.Int2CharMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2CharMap p0){
	return it.unimi.dsi.fastutil.ints.Int2CharMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2DoubleMap)}
*@see it.unimi.dsi.fastutil.ints.Int2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2DoubleMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2DoubleMap$Entry> it.unimi.dsi.fastutil.ints.Int2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2DoubleMap)
*fastIterator(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0){
	return it.unimi.dsi.fastutil.ints.Int2DoubleMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2FloatMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatMap)}
*@see it.unimi.dsi.fastutil.ints.Int2FloatMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2FloatMap$Entry> it.unimi.dsi.fastutil.ints.Int2FloatMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatMap)
*fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatMap p0){
	return it.unimi.dsi.fastutil.ints.Int2FloatMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2IntMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2IntMap)}
*@see it.unimi.dsi.fastutil.ints.Int2IntMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2IntMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2IntMap$Entry> it.unimi.dsi.fastutil.ints.Int2IntMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2IntMap)
*fastIterator(it.unimi.dsi.fastutil.ints.Int2IntMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2IntMap p0){
	return it.unimi.dsi.fastutil.ints.Int2IntMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2LongMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2LongMap)}
*@see it.unimi.dsi.fastutil.ints.Int2LongMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2LongMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2LongMap$Entry> it.unimi.dsi.fastutil.ints.Int2LongMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2LongMap)
*fastIterator(it.unimi.dsi.fastutil.ints.Int2LongMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2LongMap p0){
	return it.unimi.dsi.fastutil.ints.Int2LongMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V>)}
*@see it.unimi.dsi.fastutil.ints.Int2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.ints.Int2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V>)
*fastIterator(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.ints.Int2ObjectMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V>)}
*@see it.unimi.dsi.fastutil.ints.Int2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.ints.Int2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V>)
*fastIterator(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ReferenceMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.ints.Int2ReferenceMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2ShortMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2ShortMap)}
*@see it.unimi.dsi.fastutil.ints.Int2ShortMaps#fastIterator(it.unimi.dsi.fastutil.ints.Int2ShortMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ShortMap$Entry> it.unimi.dsi.fastutil.ints.Int2ShortMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2ShortMap)
*fastIterator(it.unimi.dsi.fastutil.ints.Int2ShortMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2ShortMap p0){
	return it.unimi.dsi.fastutil.ints.Int2ShortMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2BooleanMap)}
*@see it.unimi.dsi.fastutil.longs.Long2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2BooleanMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2BooleanMap$Entry> it.unimi.dsi.fastutil.longs.Long2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2BooleanMap)
*fastIterator(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0){
	return it.unimi.dsi.fastutil.longs.Long2BooleanMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ByteMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2ByteMap)}
*@see it.unimi.dsi.fastutil.longs.Long2ByteMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2ByteMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ByteMap$Entry> it.unimi.dsi.fastutil.longs.Long2ByteMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2ByteMap)
*fastIterator(it.unimi.dsi.fastutil.longs.Long2ByteMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2ByteMap p0){
	return it.unimi.dsi.fastutil.longs.Long2ByteMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2CharMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2CharMap)}
*@see it.unimi.dsi.fastutil.longs.Long2CharMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2CharMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2CharMap$Entry> it.unimi.dsi.fastutil.longs.Long2CharMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2CharMap)
*fastIterator(it.unimi.dsi.fastutil.longs.Long2CharMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2CharMap p0){
	return it.unimi.dsi.fastutil.longs.Long2CharMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2DoubleMap)}
*@see it.unimi.dsi.fastutil.longs.Long2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2DoubleMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2DoubleMap$Entry> it.unimi.dsi.fastutil.longs.Long2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2DoubleMap)
*fastIterator(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0){
	return it.unimi.dsi.fastutil.longs.Long2DoubleMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2FloatMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2FloatMap)}
*@see it.unimi.dsi.fastutil.longs.Long2FloatMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2FloatMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2FloatMap$Entry> it.unimi.dsi.fastutil.longs.Long2FloatMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2FloatMap)
*fastIterator(it.unimi.dsi.fastutil.longs.Long2FloatMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2FloatMap p0){
	return it.unimi.dsi.fastutil.longs.Long2FloatMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2IntMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2IntMap)}
*@see it.unimi.dsi.fastutil.longs.Long2IntMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2IntMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2IntMap$Entry> it.unimi.dsi.fastutil.longs.Long2IntMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2IntMap)
*fastIterator(it.unimi.dsi.fastutil.longs.Long2IntMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2IntMap p0){
	return it.unimi.dsi.fastutil.longs.Long2IntMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2LongMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2LongMap)}
*@see it.unimi.dsi.fastutil.longs.Long2LongMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2LongMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2LongMap$Entry> it.unimi.dsi.fastutil.longs.Long2LongMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2LongMap)
*fastIterator(it.unimi.dsi.fastutil.longs.Long2LongMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2LongMap p0){
	return it.unimi.dsi.fastutil.longs.Long2LongMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V>)}
*@see it.unimi.dsi.fastutil.longs.Long2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.longs.Long2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V>)
*fastIterator(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.longs.Long2ObjectMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V>)}
*@see it.unimi.dsi.fastutil.longs.Long2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.longs.Long2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V>)
*fastIterator(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ReferenceMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.longs.Long2ReferenceMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2ShortMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2ShortMap)}
*@see it.unimi.dsi.fastutil.longs.Long2ShortMaps#fastIterator(it.unimi.dsi.fastutil.longs.Long2ShortMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ShortMap$Entry> it.unimi.dsi.fastutil.longs.Long2ShortMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2ShortMap)
*fastIterator(it.unimi.dsi.fastutil.longs.Long2ShortMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2ShortMap p0){
	return it.unimi.dsi.fastutil.longs.Long2ShortMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Object2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2BooleanMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ByteMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2ByteMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Object2ByteMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2ByteMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ByteMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2ByteMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2ByteMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Object2ByteMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ByteMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2ByteMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2ByteMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2CharMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2CharMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Object2CharMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2CharMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2CharMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2CharMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2CharMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Object2CharMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2CharMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2CharMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2CharMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Object2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2DoubleMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2DoubleMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2DoubleMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2FloatMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2FloatMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Object2FloatMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2FloatMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2FloatMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2FloatMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2FloatMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Object2FloatMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2FloatMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2FloatMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2FloatMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2IntMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2IntMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Object2IntMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2IntMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2IntMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2IntMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2IntMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Object2IntMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2IntMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2IntMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2IntMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2LongMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2LongMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Object2LongMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2LongMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2LongMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2LongMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2LongMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Object2LongMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2LongMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2LongMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2LongMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V>)}
*@see it.unimi.dsi.fastutil.objects.Object2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V>)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ObjectMap$Entry<K, V>> it.unimi.dsi.fastutil.objects.Object2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V>)
*fastIterator(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry<K, V>> fastIterator(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Object2ObjectMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V>)}
*@see it.unimi.dsi.fastutil.objects.Object2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V>)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ReferenceMap$Entry<K, V>> it.unimi.dsi.fastutil.objects.Object2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V>)
*fastIterator(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ReferenceMap.Entry<K, V>> fastIterator(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Object2ReferenceMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2ShortMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2ShortMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Object2ShortMaps#fastIterator(it.unimi.dsi.fastutil.objects.Object2ShortMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ShortMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2ShortMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2ShortMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Object2ShortMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ShortMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2ShortMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2ShortMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Reference2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2BooleanMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2BooleanMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2BooleanMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ByteMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Reference2ByteMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2ByteMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2ByteMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2ByteMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ByteMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2CharMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2CharMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Reference2CharMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2CharMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2CharMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2CharMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2CharMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Reference2CharMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2CharMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2CharMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2CharMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Reference2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2DoubleMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2DoubleMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2DoubleMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2FloatMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Reference2FloatMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2FloatMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2FloatMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2FloatMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2FloatMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2IntMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2IntMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Reference2IntMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2IntMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2IntMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2IntMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2IntMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Reference2IntMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2IntMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2IntMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2LongMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2LongMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Reference2LongMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2LongMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2LongMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2LongMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2LongMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Reference2LongMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2LongMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2LongMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2LongMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V>)}
*@see it.unimi.dsi.fastutil.objects.Reference2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V>)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2ObjectMap$Entry<K, V>> it.unimi.dsi.fastutil.objects.Reference2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V>)
*fastIterator(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<K, V>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ObjectMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V>)}
*@see it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V>)
*<code>public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2ReferenceMap$Entry<K, V>> it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V>)
*fastIterator(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2ReferenceMap.Entry<K, V>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Reference2ShortMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K>)}
*@see it.unimi.dsi.fastutil.objects.Reference2ShortMaps#fastIterator(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2ShortMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2ShortMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K>)
*fastIterator(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2ShortMap.Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ShortMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2BooleanMap)}
*@see it.unimi.dsi.fastutil.shorts.Short2BooleanMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2BooleanMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2BooleanMap$Entry> it.unimi.dsi.fastutil.shorts.Short2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2BooleanMap)
*fastIterator(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2BooleanMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ByteMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2ByteMap)}
*@see it.unimi.dsi.fastutil.shorts.Short2ByteMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2ByteMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ByteMap$Entry> it.unimi.dsi.fastutil.shorts.Short2ByteMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2ByteMap)
*fastIterator(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2ByteMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2CharMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2CharMap)}
*@see it.unimi.dsi.fastutil.shorts.Short2CharMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2CharMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2CharMap$Entry> it.unimi.dsi.fastutil.shorts.Short2CharMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2CharMap)
*fastIterator(it.unimi.dsi.fastutil.shorts.Short2CharMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2CharMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2CharMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2CharMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2DoubleMap)}
*@see it.unimi.dsi.fastutil.shorts.Short2DoubleMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2DoubleMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2DoubleMap$Entry> it.unimi.dsi.fastutil.shorts.Short2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2DoubleMap)
*fastIterator(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2DoubleMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2DoubleMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2FloatMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2FloatMap)}
*@see it.unimi.dsi.fastutil.shorts.Short2FloatMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2FloatMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2FloatMap$Entry> it.unimi.dsi.fastutil.shorts.Short2FloatMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2FloatMap)
*fastIterator(it.unimi.dsi.fastutil.shorts.Short2FloatMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2FloatMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2FloatMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2IntMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2IntMap)}
*@see it.unimi.dsi.fastutil.shorts.Short2IntMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2IntMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2IntMap$Entry> it.unimi.dsi.fastutil.shorts.Short2IntMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2IntMap)
*fastIterator(it.unimi.dsi.fastutil.shorts.Short2IntMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2IntMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2IntMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2IntMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2LongMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2LongMap)}
*@see it.unimi.dsi.fastutil.shorts.Short2LongMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2LongMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2LongMap$Entry> it.unimi.dsi.fastutil.shorts.Short2LongMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2LongMap)
*fastIterator(it.unimi.dsi.fastutil.shorts.Short2LongMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2LongMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2LongMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2LongMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V>)}
*@see it.unimi.dsi.fastutil.shorts.Short2ObjectMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.shorts.Short2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V>)
*fastIterator(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ObjectMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V>)}
*@see it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V>)
*<code>public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V>)
*fastIterator(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ReferenceMap.Entry<V>> fastIterator(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2ShortMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2ShortMap)}
*@see it.unimi.dsi.fastutil.shorts.Short2ShortMaps#fastIterator(it.unimi.dsi.fastutil.shorts.Short2ShortMap)
*<code>public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ShortMap$Entry> it.unimi.dsi.fastutil.shorts.Short2ShortMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2ShortMap)
*fastIterator(it.unimi.dsi.fastutil.shorts.Short2ShortMap p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ShortMap.Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2ShortMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2ShortMaps.fastIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectIterators#unmodifiable(it.unimi.dsi.fastutil.objects.ObjectIterator<K>)}
*@see it.unimi.dsi.fastutil.objects.ObjectIterators#unmodifiable(it.unimi.dsi.fastutil.objects.ObjectIterator<K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.unmodifiable(it.unimi.dsi.fastutil.objects.ObjectIterator<K>)
*unmodifiable(it.unimi.dsi.fastutil.objects.ObjectIterator<K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectIterator<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.unmodifiable(p0);
}
}
