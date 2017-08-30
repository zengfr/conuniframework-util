package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectIteratorUtil{ 
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.asObjectIterator(java.util.Iterator<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> asObjectIterator(java.util.Iterator<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.asObjectIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>[])
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>... p0){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.concat(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>[],int,int)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> concat(it.unimi.dsi.fastutil.objects.ObjectIterator<? extends K>[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.concat(p0,p1,p2);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.emptyIterator()
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> emptyIterator(){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.emptyIterator();
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2BooleanMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2ByteMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2ByteMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ByteMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ByteMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2ByteMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2CharMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2CharMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2CharMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2CharMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2DoubleMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2FloatMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2FloatMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2FloatMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2FloatMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2IntMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2IntMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2IntMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2IntMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2IntMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2LongMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2LongMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2LongMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2LongMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2LongMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2ObjectMap.it.unimi.dsi.fastutil.bytes.Byte2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap.it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.bytes.Byte2ShortMap$Entry> it.unimi.dsi.fastutil.bytes.Byte2ShortMaps.fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ShortMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.bytes.Byte2ShortMap p0){
	return it.unimi.dsi.fastutil.bytes.Byte2ShortMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2BooleanMap$Entry> it.unimi.dsi.fastutil.chars.Char2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2BooleanMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0){
	return it.unimi.dsi.fastutil.chars.Char2BooleanMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ByteMap$Entry> it.unimi.dsi.fastutil.chars.Char2ByteMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2ByteMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2ByteMap p0){
	return it.unimi.dsi.fastutil.chars.Char2ByteMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2CharMap$Entry> it.unimi.dsi.fastutil.chars.Char2CharMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2CharMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2CharMap p0){
	return it.unimi.dsi.fastutil.chars.Char2CharMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2DoubleMap$Entry> it.unimi.dsi.fastutil.chars.Char2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2DoubleMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0){
	return it.unimi.dsi.fastutil.chars.Char2DoubleMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2FloatMap$Entry> it.unimi.dsi.fastutil.chars.Char2FloatMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2FloatMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2FloatMap p0){
	return it.unimi.dsi.fastutil.chars.Char2FloatMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2IntMap$Entry> it.unimi.dsi.fastutil.chars.Char2IntMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2IntMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2IntMap p0){
	return it.unimi.dsi.fastutil.chars.Char2IntMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2LongMap$Entry> it.unimi.dsi.fastutil.chars.Char2LongMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2LongMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2LongMap p0){
	return it.unimi.dsi.fastutil.chars.Char2LongMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ObjectMap.it.unimi.dsi.fastutil.chars.Char2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.chars.Char2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.chars.Char2ObjectMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ReferenceMap.it.unimi.dsi.fastutil.chars.Char2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.chars.Char2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.chars.Char2ReferenceMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.chars.Char2ShortMap$Entry> it.unimi.dsi.fastutil.chars.Char2ShortMaps.fastIterator(it.unimi.dsi.fastutil.chars.Char2ShortMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2ShortMap p0){
	return it.unimi.dsi.fastutil.chars.Char2ShortMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2BooleanMap$Entry> it.unimi.dsi.fastutil.doubles.Double2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2BooleanMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2ByteMap$Entry> it.unimi.dsi.fastutil.doubles.Double2ByteMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2ByteMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2ByteMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2ByteMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2CharMap$Entry> it.unimi.dsi.fastutil.doubles.Double2CharMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2CharMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2CharMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2CharMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2DoubleMap$Entry> it.unimi.dsi.fastutil.doubles.Double2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2DoubleMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2DoubleMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2FloatMap$Entry> it.unimi.dsi.fastutil.doubles.Double2FloatMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2FloatMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2FloatMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2IntMap$Entry> it.unimi.dsi.fastutil.doubles.Double2IntMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2IntMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2IntMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2IntMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2LongMap$Entry> it.unimi.dsi.fastutil.doubles.Double2LongMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2LongMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2LongMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2LongMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2ObjectMap.it.unimi.dsi.fastutil.doubles.Double2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.doubles.Double2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.doubles.Double2ObjectMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2ReferenceMap.it.unimi.dsi.fastutil.doubles.Double2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.doubles.Double2ShortMap$Entry> it.unimi.dsi.fastutil.doubles.Double2ShortMaps.fastIterator(it.unimi.dsi.fastutil.doubles.Double2ShortMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.doubles.Double2ShortMap p0){
	return it.unimi.dsi.fastutil.doubles.Double2ShortMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2BooleanMap$Entry> it.unimi.dsi.fastutil.floats.Float2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2BooleanMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0){
	return it.unimi.dsi.fastutil.floats.Float2BooleanMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ByteMap$Entry> it.unimi.dsi.fastutil.floats.Float2ByteMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2ByteMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2ByteMap p0){
	return it.unimi.dsi.fastutil.floats.Float2ByteMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2CharMap$Entry> it.unimi.dsi.fastutil.floats.Float2CharMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2CharMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2CharMap p0){
	return it.unimi.dsi.fastutil.floats.Float2CharMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2DoubleMap$Entry> it.unimi.dsi.fastutil.floats.Float2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2DoubleMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0){
	return it.unimi.dsi.fastutil.floats.Float2DoubleMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2FloatMap$Entry> it.unimi.dsi.fastutil.floats.Float2FloatMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2FloatMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2FloatMap p0){
	return it.unimi.dsi.fastutil.floats.Float2FloatMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2IntMap$Entry> it.unimi.dsi.fastutil.floats.Float2IntMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2IntMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2IntMap p0){
	return it.unimi.dsi.fastutil.floats.Float2IntMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2LongMap$Entry> it.unimi.dsi.fastutil.floats.Float2LongMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2LongMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2LongMap p0){
	return it.unimi.dsi.fastutil.floats.Float2LongMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ObjectMap.it.unimi.dsi.fastutil.floats.Float2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.floats.Float2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.floats.Float2ObjectMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ReferenceMap.it.unimi.dsi.fastutil.floats.Float2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.floats.Float2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.floats.Float2ReferenceMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.floats.Float2ShortMap$Entry> it.unimi.dsi.fastutil.floats.Float2ShortMaps.fastIterator(it.unimi.dsi.fastutil.floats.Float2ShortMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2ShortMap p0){
	return it.unimi.dsi.fastutil.floats.Float2ShortMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2BooleanMap$Entry> it.unimi.dsi.fastutil.ints.Int2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2BooleanMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0){
	return it.unimi.dsi.fastutil.ints.Int2BooleanMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ByteMap$Entry> it.unimi.dsi.fastutil.ints.Int2ByteMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2ByteMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2ByteMap p0){
	return it.unimi.dsi.fastutil.ints.Int2ByteMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2CharMap$Entry> it.unimi.dsi.fastutil.ints.Int2CharMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2CharMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2CharMap p0){
	return it.unimi.dsi.fastutil.ints.Int2CharMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2DoubleMap$Entry> it.unimi.dsi.fastutil.ints.Int2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2DoubleMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0){
	return it.unimi.dsi.fastutil.ints.Int2DoubleMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2FloatMap$Entry> it.unimi.dsi.fastutil.ints.Int2FloatMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2FloatMap p0){
	return it.unimi.dsi.fastutil.ints.Int2FloatMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2IntMap$Entry> it.unimi.dsi.fastutil.ints.Int2IntMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2IntMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2IntMap p0){
	return it.unimi.dsi.fastutil.ints.Int2IntMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2LongMap$Entry> it.unimi.dsi.fastutil.ints.Int2LongMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2LongMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2LongMap p0){
	return it.unimi.dsi.fastutil.ints.Int2LongMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ObjectMap.it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.ints.Int2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.ints.Int2ObjectMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ReferenceMap.it.unimi.dsi.fastutil.ints.Int2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.ints.Int2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.ints.Int2ReferenceMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.ints.Int2ShortMap$Entry> it.unimi.dsi.fastutil.ints.Int2ShortMaps.fastIterator(it.unimi.dsi.fastutil.ints.Int2ShortMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.ints.Int2ShortMap p0){
	return it.unimi.dsi.fastutil.ints.Int2ShortMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2BooleanMap$Entry> it.unimi.dsi.fastutil.longs.Long2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2BooleanMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0){
	return it.unimi.dsi.fastutil.longs.Long2BooleanMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ByteMap$Entry> it.unimi.dsi.fastutil.longs.Long2ByteMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2ByteMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2ByteMap p0){
	return it.unimi.dsi.fastutil.longs.Long2ByteMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2CharMap$Entry> it.unimi.dsi.fastutil.longs.Long2CharMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2CharMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2CharMap p0){
	return it.unimi.dsi.fastutil.longs.Long2CharMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2DoubleMap$Entry> it.unimi.dsi.fastutil.longs.Long2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2DoubleMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0){
	return it.unimi.dsi.fastutil.longs.Long2DoubleMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2FloatMap$Entry> it.unimi.dsi.fastutil.longs.Long2FloatMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2FloatMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2FloatMap p0){
	return it.unimi.dsi.fastutil.longs.Long2FloatMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2IntMap$Entry> it.unimi.dsi.fastutil.longs.Long2IntMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2IntMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2IntMap p0){
	return it.unimi.dsi.fastutil.longs.Long2IntMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2LongMap$Entry> it.unimi.dsi.fastutil.longs.Long2LongMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2LongMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2LongMap p0){
	return it.unimi.dsi.fastutil.longs.Long2LongMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ObjectMap.it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.longs.Long2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.longs.Long2ObjectMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ReferenceMap.it.unimi.dsi.fastutil.longs.Long2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.longs.Long2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.longs.Long2ReferenceMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.longs.Long2ShortMap$Entry> it.unimi.dsi.fastutil.longs.Long2ShortMaps.fastIterator(it.unimi.dsi.fastutil.longs.Long2ShortMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.longs.Long2ShortMap p0){
	return it.unimi.dsi.fastutil.longs.Long2ShortMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2BooleanMap.it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2BooleanMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ByteMap.it.unimi.dsi.fastutil.objects.Object2ByteMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2ByteMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2ByteMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2ByteMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2ByteMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2CharMap.it.unimi.dsi.fastutil.objects.Object2CharMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2CharMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2CharMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2CharMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2CharMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2DoubleMap.it.unimi.dsi.fastutil.objects.Object2DoubleMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2DoubleMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2FloatMap.it.unimi.dsi.fastutil.objects.Object2FloatMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2FloatMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2FloatMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2FloatMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2FloatMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2IntMap.it.unimi.dsi.fastutil.objects.Object2IntMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2IntMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2IntMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2IntMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2IntMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2LongMap.it.unimi.dsi.fastutil.objects.Object2LongMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2LongMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2LongMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2LongMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2LongMaps.fastIterator(p0);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ObjectMap.it.unimi.dsi.fastutil.objects.Object2ObjectMap$Entry<K, V>> it.unimi.dsi.fastutil.objects.Object2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K, V>> fastIterator(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Object2ObjectMaps.fastIterator(p0);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ReferenceMap.it.unimi.dsi.fastutil.objects.Object2ReferenceMap$Entry<K, V>> it.unimi.dsi.fastutil.objects.Object2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K, V>> fastIterator(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Object2ReferenceMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Object2ShortMap.it.unimi.dsi.fastutil.objects.Object2ShortMap$Entry<K>> it.unimi.dsi.fastutil.objects.Object2ShortMaps.fastIterator(it.unimi.dsi.fastutil.objects.Object2ShortMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Object2ShortMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Object2ShortMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2BooleanMap.it.unimi.dsi.fastutil.objects.Reference2BooleanMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2BooleanMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2ByteMap.it.unimi.dsi.fastutil.objects.Reference2ByteMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2ByteMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ByteMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2CharMap.it.unimi.dsi.fastutil.objects.Reference2CharMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2CharMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2CharMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2CharMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2CharMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2DoubleMap.it.unimi.dsi.fastutil.objects.Reference2DoubleMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2DoubleMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2FloatMap.it.unimi.dsi.fastutil.objects.Reference2FloatMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2FloatMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2FloatMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2IntMap.it.unimi.dsi.fastutil.objects.Reference2IntMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2IntMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2IntMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2IntMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2IntMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2LongMap.it.unimi.dsi.fastutil.objects.Reference2LongMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2LongMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2LongMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2LongMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2LongMaps.fastIterator(p0);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2ObjectMap.it.unimi.dsi.fastutil.objects.Reference2ObjectMap$Entry<K, V>> it.unimi.dsi.fastutil.objects.Reference2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K, V>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ObjectMaps.fastIterator(p0);
}
/**
*public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2ReferenceMap.it.unimi.dsi.fastutil.objects.Reference2ReferenceMap$Entry<K, V>> it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V>)
*/ 
public static <K,V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K, V>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.objects.Reference2ShortMap.it.unimi.dsi.fastutil.objects.Reference2ShortMap$Entry<K>> it.unimi.dsi.fastutil.objects.Reference2ShortMaps.fastIterator(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<K>> fastIterator(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K> p0){
	return it.unimi.dsi.fastutil.objects.Reference2ShortMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2BooleanMap$Entry> it.unimi.dsi.fastutil.shorts.Short2BooleanMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2BooleanMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ByteMap$Entry> it.unimi.dsi.fastutil.shorts.Short2ByteMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2ByteMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2ByteMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2CharMap$Entry> it.unimi.dsi.fastutil.shorts.Short2CharMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2CharMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2CharMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2CharMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2DoubleMap$Entry> it.unimi.dsi.fastutil.shorts.Short2DoubleMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2DoubleMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2DoubleMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2FloatMap$Entry> it.unimi.dsi.fastutil.shorts.Short2FloatMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2FloatMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2FloatMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2FloatMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2IntMap$Entry> it.unimi.dsi.fastutil.shorts.Short2IntMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2IntMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2IntMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2IntMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2LongMap$Entry> it.unimi.dsi.fastutil.shorts.Short2LongMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2LongMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2LongMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2LongMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ObjectMap.it.unimi.dsi.fastutil.shorts.Short2ObjectMap$Entry<V>> it.unimi.dsi.fastutil.shorts.Short2ObjectMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> p0){
	return it.unimi.dsi.fastutil.shorts.Short2ObjectMaps.fastIterator(p0);
}
/**
*public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ReferenceMap.it.unimi.dsi.fastutil.shorts.Short2ReferenceMap$Entry<V>> it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V>)
*/ 
public static <V> it.unimi.dsi.fastutil.objects.ObjectIterator<Entry<V>> fastIterator(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> p0){
	return it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps.fastIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.objects.ObjectIterator<it.unimi.dsi.fastutil.shorts.Short2ShortMap$Entry> it.unimi.dsi.fastutil.shorts.Short2ShortMaps.fastIterator(it.unimi.dsi.fastutil.shorts.Short2ShortMap)
*/ 
public static it.unimi.dsi.fastutil.objects.ObjectIterator<Entry> fastIterator(it.unimi.dsi.fastutil.shorts.Short2ShortMap p0){
	return it.unimi.dsi.fastutil.shorts.Short2ShortMaps.fastIterator(p0);
}
/**
*public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> it.unimi.dsi.fastutil.objects.ObjectIterators.unmodifiable(it.unimi.dsi.fastutil.objects.ObjectIterator<K>)
*/ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectIterator<K> unmodifiable(it.unimi.dsi.fastutil.objects.ObjectIterator<K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.unmodifiable(p0);
}
}
