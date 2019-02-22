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
public final class CharacterUtil{ 
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2CharFunctions#singleton(java.lang.Byte,java.lang.Character)}
*@see it.unimi.dsi.fastutil.bytes.Byte2CharFunctions#singleton(java.lang.Byte,java.lang.Character)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction it.unimi.dsi.fastutil.bytes.Byte2CharFunctions.singleton(java.lang.Byte,java.lang.Character)
*singleton(java.lang.Byte p0,java.lang.Character p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction singleton(java.lang.Byte p0,java.lang.Character p1){
	return it.unimi.dsi.fastutil.bytes.Byte2CharFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps#singleton(java.lang.Byte,java.lang.Character,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps#singleton(java.lang.Byte,java.lang.Character,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps.singleton(java.lang.Byte,java.lang.Character,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(java.lang.Byte p0,java.lang.Character p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap singleton(java.lang.Byte p0,java.lang.Character p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2BooleanFunctions#singleton(java.lang.Character,java.lang.Boolean)}
*@see it.unimi.dsi.fastutil.chars.Char2BooleanFunctions#singleton(java.lang.Character,java.lang.Boolean)
*<code>public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction it.unimi.dsi.fastutil.chars.Char2BooleanFunctions.singleton(java.lang.Character,java.lang.Boolean)
*singleton(java.lang.Character p0,java.lang.Boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction singleton(java.lang.Character p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.chars.Char2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps#singleton(java.lang.Character,java.lang.Boolean,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps#singleton(java.lang.Character,java.lang.Boolean,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(java.lang.Character,java.lang.Boolean,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(java.lang.Character p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(java.lang.Character p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ByteFunctions#singleton(java.lang.Character,java.lang.Byte)}
*@see it.unimi.dsi.fastutil.chars.Char2ByteFunctions#singleton(java.lang.Character,java.lang.Byte)
*<code>public static it.unimi.dsi.fastutil.chars.Char2ByteFunction it.unimi.dsi.fastutil.chars.Char2ByteFunctions.singleton(java.lang.Character,java.lang.Byte)
*singleton(java.lang.Character p0,java.lang.Byte p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction singleton(java.lang.Character p0,java.lang.Byte p1){
	return it.unimi.dsi.fastutil.chars.Char2ByteFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps#singleton(java.lang.Character,java.lang.Byte,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps#singleton(java.lang.Character,java.lang.Byte,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps.singleton(java.lang.Character,java.lang.Byte,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(java.lang.Character p0,java.lang.Byte p1,it.unimi.dsi.fastutil.chars.CharComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(java.lang.Character p0,java.lang.Byte p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2CharFunctions#singleton(java.lang.Character,java.lang.Character)}
*@see it.unimi.dsi.fastutil.chars.Char2CharFunctions#singleton(java.lang.Character,java.lang.Character)
*<code>public static it.unimi.dsi.fastutil.chars.Char2CharFunction it.unimi.dsi.fastutil.chars.Char2CharFunctions.singleton(java.lang.Character,java.lang.Character)
*singleton(java.lang.Character p0,java.lang.Character p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2CharFunction singleton(java.lang.Character p0,java.lang.Character p1){
	return it.unimi.dsi.fastutil.chars.Char2CharFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2CharSortedMaps#singleton(java.lang.Character,java.lang.Character,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2CharSortedMaps#singleton(java.lang.Character,java.lang.Character,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap it.unimi.dsi.fastutil.chars.Char2CharSortedMaps.singleton(java.lang.Character,java.lang.Character,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(java.lang.Character p0,java.lang.Character p1,it.unimi.dsi.fastutil.chars.CharComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap singleton(java.lang.Character p0,java.lang.Character p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2DoubleFunctions#singleton(java.lang.Character,java.lang.Double)}
*@see it.unimi.dsi.fastutil.chars.Char2DoubleFunctions#singleton(java.lang.Character,java.lang.Double)
*<code>public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction it.unimi.dsi.fastutil.chars.Char2DoubleFunctions.singleton(java.lang.Character,java.lang.Double)
*singleton(java.lang.Character p0,java.lang.Double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction singleton(java.lang.Character p0,java.lang.Double p1){
	return it.unimi.dsi.fastutil.chars.Char2DoubleFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps#singleton(java.lang.Character,java.lang.Double,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps#singleton(java.lang.Character,java.lang.Double,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps.singleton(java.lang.Character,java.lang.Double,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(java.lang.Character p0,java.lang.Double p1,it.unimi.dsi.fastutil.chars.CharComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap singleton(java.lang.Character p0,java.lang.Double p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2FloatFunctions#singleton(java.lang.Character,java.lang.Float)}
*@see it.unimi.dsi.fastutil.chars.Char2FloatFunctions#singleton(java.lang.Character,java.lang.Float)
*<code>public static it.unimi.dsi.fastutil.chars.Char2FloatFunction it.unimi.dsi.fastutil.chars.Char2FloatFunctions.singleton(java.lang.Character,java.lang.Float)
*singleton(java.lang.Character p0,java.lang.Float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction singleton(java.lang.Character p0,java.lang.Float p1){
	return it.unimi.dsi.fastutil.chars.Char2FloatFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps#singleton(java.lang.Character,java.lang.Float,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps#singleton(java.lang.Character,java.lang.Float,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps.singleton(java.lang.Character,java.lang.Float,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(java.lang.Character p0,java.lang.Float p1,it.unimi.dsi.fastutil.chars.CharComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap singleton(java.lang.Character p0,java.lang.Float p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2IntFunctions#singleton(java.lang.Character,java.lang.Integer)}
*@see it.unimi.dsi.fastutil.chars.Char2IntFunctions#singleton(java.lang.Character,java.lang.Integer)
*<code>public static it.unimi.dsi.fastutil.chars.Char2IntFunction it.unimi.dsi.fastutil.chars.Char2IntFunctions.singleton(java.lang.Character,java.lang.Integer)
*singleton(java.lang.Character p0,java.lang.Integer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2IntFunction singleton(java.lang.Character p0,java.lang.Integer p1){
	return it.unimi.dsi.fastutil.chars.Char2IntFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2IntSortedMaps#singleton(java.lang.Character,java.lang.Integer,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2IntSortedMaps#singleton(java.lang.Character,java.lang.Integer,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap it.unimi.dsi.fastutil.chars.Char2IntSortedMaps.singleton(java.lang.Character,java.lang.Integer,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(java.lang.Character p0,java.lang.Integer p1,it.unimi.dsi.fastutil.chars.CharComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap singleton(java.lang.Character p0,java.lang.Integer p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2IntSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2LongFunctions#singleton(java.lang.Character,java.lang.Long)}
*@see it.unimi.dsi.fastutil.chars.Char2LongFunctions#singleton(java.lang.Character,java.lang.Long)
*<code>public static it.unimi.dsi.fastutil.chars.Char2LongFunction it.unimi.dsi.fastutil.chars.Char2LongFunctions.singleton(java.lang.Character,java.lang.Long)
*singleton(java.lang.Character p0,java.lang.Long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2LongFunction singleton(java.lang.Character p0,java.lang.Long p1){
	return it.unimi.dsi.fastutil.chars.Char2LongFunctions.singleton(p0,p1);
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
*{@link it.unimi.dsi.fastutil.chars.Char2ObjectFunctions#singleton(java.lang.Character,V)}
*@see it.unimi.dsi.fastutil.chars.Char2ObjectFunctions#singleton(java.lang.Character,V)
*<code>public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.singleton(java.lang.Character,V)
*singleton(java.lang.Character p0,V p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> singleton(java.lang.Character p0,V p1){
	return it.unimi.dsi.fastutil.chars.Char2ObjectFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps#singleton(java.lang.Character,V,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps#singleton(java.lang.Character,V,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps.singleton(java.lang.Character,V,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(java.lang.Character p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> singleton(java.lang.Character p0,V p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ShortFunctions#singleton(java.lang.Character,java.lang.Short)}
*@see it.unimi.dsi.fastutil.chars.Char2ShortFunctions#singleton(java.lang.Character,java.lang.Short)
*<code>public static it.unimi.dsi.fastutil.chars.Char2ShortFunction it.unimi.dsi.fastutil.chars.Char2ShortFunctions.singleton(java.lang.Character,java.lang.Short)
*singleton(java.lang.Character p0,java.lang.Short p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction singleton(java.lang.Character p0,java.lang.Short p1){
	return it.unimi.dsi.fastutil.chars.Char2ShortFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps#singleton(java.lang.Character,java.lang.Short,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps#singleton(java.lang.Character,java.lang.Short,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps.singleton(java.lang.Character,java.lang.Short,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(java.lang.Character p0,java.lang.Short p1,it.unimi.dsi.fastutil.chars.CharComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap singleton(java.lang.Character p0,java.lang.Short p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharSets#singleton(java.lang.Character)}
*@see it.unimi.dsi.fastutil.chars.CharSets#singleton(java.lang.Character)
*<code>public static it.unimi.dsi.fastutil.chars.CharSet it.unimi.dsi.fastutil.chars.CharSets.singleton(java.lang.Character)
*singleton(java.lang.Character p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharSet singleton(java.lang.Character p0){
	return it.unimi.dsi.fastutil.chars.CharSets.singleton(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2CharFunctions#singleton(java.lang.Double,java.lang.Character)}
*@see it.unimi.dsi.fastutil.doubles.Double2CharFunctions#singleton(java.lang.Double,java.lang.Character)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2CharFunction it.unimi.dsi.fastutil.doubles.Double2CharFunctions.singleton(java.lang.Double,java.lang.Character)
*singleton(java.lang.Double p0,java.lang.Character p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction singleton(java.lang.Double p0,java.lang.Character p1){
	return it.unimi.dsi.fastutil.doubles.Double2CharFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps#singleton(java.lang.Double,java.lang.Character,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps#singleton(java.lang.Double,java.lang.Character,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps.singleton(java.lang.Double,java.lang.Character,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(java.lang.Double p0,java.lang.Character p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap singleton(java.lang.Double p0,java.lang.Character p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2CharFunctions#singleton(java.lang.Float,java.lang.Character)}
*@see it.unimi.dsi.fastutil.floats.Float2CharFunctions#singleton(java.lang.Float,java.lang.Character)
*<code>public static it.unimi.dsi.fastutil.floats.Float2CharFunction it.unimi.dsi.fastutil.floats.Float2CharFunctions.singleton(java.lang.Float,java.lang.Character)
*singleton(java.lang.Float p0,java.lang.Character p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2CharFunction singleton(java.lang.Float p0,java.lang.Character p1){
	return it.unimi.dsi.fastutil.floats.Float2CharFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2CharSortedMaps#singleton(java.lang.Float,java.lang.Character,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2CharSortedMaps#singleton(java.lang.Float,java.lang.Character,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap it.unimi.dsi.fastutil.floats.Float2CharSortedMaps.singleton(java.lang.Float,java.lang.Character,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Float p0,java.lang.Character p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap singleton(java.lang.Float p0,java.lang.Character p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2CharFunctions#singleton(java.lang.Integer,java.lang.Character)}
*@see it.unimi.dsi.fastutil.ints.Int2CharFunctions#singleton(java.lang.Integer,java.lang.Character)
*<code>public static it.unimi.dsi.fastutil.ints.Int2CharFunction it.unimi.dsi.fastutil.ints.Int2CharFunctions.singleton(java.lang.Integer,java.lang.Character)
*singleton(java.lang.Integer p0,java.lang.Character p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2CharFunction singleton(java.lang.Integer p0,java.lang.Character p1){
	return it.unimi.dsi.fastutil.ints.Int2CharFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2CharSortedMaps#singleton(java.lang.Integer,java.lang.Character,it.unimi.dsi.fastutil.ints.IntComparator)}
*@see it.unimi.dsi.fastutil.ints.Int2CharSortedMaps#singleton(java.lang.Integer,java.lang.Character,it.unimi.dsi.fastutil.ints.IntComparator)
*<code>public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap it.unimi.dsi.fastutil.ints.Int2CharSortedMaps.singleton(java.lang.Integer,java.lang.Character,it.unimi.dsi.fastutil.ints.IntComparator)
*singleton(java.lang.Integer p0,java.lang.Character p1,it.unimi.dsi.fastutil.ints.IntComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap singleton(java.lang.Integer p0,java.lang.Character p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2CharFunctions#singleton(java.lang.Long,java.lang.Character)}
*@see it.unimi.dsi.fastutil.longs.Long2CharFunctions#singleton(java.lang.Long,java.lang.Character)
*<code>public static it.unimi.dsi.fastutil.longs.Long2CharFunction it.unimi.dsi.fastutil.longs.Long2CharFunctions.singleton(java.lang.Long,java.lang.Character)
*singleton(java.lang.Long p0,java.lang.Character p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2CharFunction singleton(java.lang.Long p0,java.lang.Character p1){
	return it.unimi.dsi.fastutil.longs.Long2CharFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2CharSortedMaps#singleton(java.lang.Long,java.lang.Character,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2CharSortedMaps#singleton(java.lang.Long,java.lang.Character,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap it.unimi.dsi.fastutil.longs.Long2CharSortedMaps.singleton(java.lang.Long,java.lang.Character,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Long p0,java.lang.Character p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap singleton(java.lang.Long p0,java.lang.Character p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2CharFunctions#singleton(K,java.lang.Character)}
*@see it.unimi.dsi.fastutil.objects.Object2CharFunctions#singleton(K,java.lang.Character)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> it.unimi.dsi.fastutil.objects.Object2CharFunctions.singleton(K,java.lang.Character)
*singleton(K p0,java.lang.Character p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> singleton(K p0,java.lang.Character p1){
	return it.unimi.dsi.fastutil.objects.Object2CharFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2CharSortedMaps#singleton(K,java.lang.Character,java.util.Comparator<? super K>)}
*@see it.unimi.dsi.fastutil.objects.Object2CharSortedMaps#singleton(K,java.lang.Character,java.util.Comparator<? super K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> it.unimi.dsi.fastutil.objects.Object2CharSortedMaps.singleton(K,java.lang.Character,java.util.Comparator<? super K>)
*singleton(K p0,java.lang.Character p1,java.util.Comparator<? super K> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> singleton(K p0,java.lang.Character p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2CharFunctions#singleton(java.lang.Short,java.lang.Character)}
*@see it.unimi.dsi.fastutil.shorts.Short2CharFunctions#singleton(java.lang.Short,java.lang.Character)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2CharFunction it.unimi.dsi.fastutil.shorts.Short2CharFunctions.singleton(java.lang.Short,java.lang.Character)
*singleton(java.lang.Short p0,java.lang.Character p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction singleton(java.lang.Short p0,java.lang.Character p1){
	return it.unimi.dsi.fastutil.shorts.Short2CharFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps#singleton(java.lang.Short,java.lang.Character,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps#singleton(java.lang.Short,java.lang.Character,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps.singleton(java.lang.Short,java.lang.Character,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(java.lang.Short p0,java.lang.Character p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap singleton(java.lang.Short p0,java.lang.Character p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.CharUtils#toChar(java.lang.Character,char)}
*@see org.apache.commons.lang3.CharUtils#toChar(java.lang.Character,char)
*<code>public static char org.apache.commons.lang3.CharUtils.toChar(java.lang.Character,char)
*toChar(java.lang.Character p0,char p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static char toChar(java.lang.Character p0,char p1){
	return org.apache.commons.lang3.CharUtils.toChar(p0,p1);
}
/**
*{@link org.apache.commons.lang3.CharUtils#toChar(java.lang.Character)}
*@see org.apache.commons.lang3.CharUtils#toChar(java.lang.Character)
*<code>public static char org.apache.commons.lang3.CharUtils.toChar(java.lang.Character)
*toChar(java.lang.Character p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static char toChar(java.lang.Character p0){
	return org.apache.commons.lang3.CharUtils.toChar(p0);
}
/**
*{@link org.apache.commons.lang3.CharUtils#toCharacterObject(char)}
*@see org.apache.commons.lang3.CharUtils#toCharacterObject(char)
*<code>public static java.lang.Character org.apache.commons.lang3.CharUtils.toCharacterObject(char)
*toCharacterObject(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Character toCharacterObject(char p0){
	return org.apache.commons.lang3.CharUtils.toCharacterObject(p0);
}
/**
*{@link org.apache.commons.lang3.CharUtils#toCharacterObject(java.lang.String)}
*@see org.apache.commons.lang3.CharUtils#toCharacterObject(java.lang.String)
*<code>public static java.lang.Character org.apache.commons.lang3.CharUtils.toCharacterObject(java.lang.String)
*toCharacterObject(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Character toCharacterObject(java.lang.String p0){
	return org.apache.commons.lang3.CharUtils.toCharacterObject(p0);
}
/**
*{@link org.apache.commons.lang3.CharUtils#toIntValue(java.lang.Character,int)}
*@see org.apache.commons.lang3.CharUtils#toIntValue(java.lang.Character,int)
*<code>public static int org.apache.commons.lang3.CharUtils.toIntValue(java.lang.Character,int)
*toIntValue(java.lang.Character p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int toIntValue(java.lang.Character p0,int p1){
	return org.apache.commons.lang3.CharUtils.toIntValue(p0,p1);
}
/**
*{@link org.apache.commons.lang3.CharUtils#toIntValue(java.lang.Character)}
*@see org.apache.commons.lang3.CharUtils#toIntValue(java.lang.Character)
*<code>public static int org.apache.commons.lang3.CharUtils.toIntValue(java.lang.Character)
*toIntValue(java.lang.Character p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int toIntValue(java.lang.Character p0){
	return org.apache.commons.lang3.CharUtils.toIntValue(p0);
}
/**
*{@link org.apache.commons.lang3.CharUtils#unicodeEscaped(java.lang.Character)}
*@see org.apache.commons.lang3.CharUtils#unicodeEscaped(java.lang.Character)
*<code>public static java.lang.String org.apache.commons.lang3.CharUtils.unicodeEscaped(java.lang.Character)
*unicodeEscaped(java.lang.Character p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String unicodeEscaped(java.lang.Character p0){
	return org.apache.commons.lang3.CharUtils.unicodeEscaped(p0);
}
}
