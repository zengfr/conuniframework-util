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
public final class LongIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#all(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#all(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.longs.LongIterators.all(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*all(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#any(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#any(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.longs.LongIterators.any(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*any(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asLongIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asLongIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.BinIO.asLongIterator(java.io.DataInput)
*asLongIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asLongIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asLongIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.BinIO.asLongIterator(java.io.File) throws java.io.IOException
*asLongIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asLongIterator(java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#asLongIterator(java.lang.CharSequence)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.BinIO.asLongIterator(java.lang.CharSequence) throws java.io.IOException
*asLongIterator(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asLongIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asLongIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.TextIO.asLongIterator(java.io.BufferedReader)
*asLongIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asLongIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#asLongIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#asLongIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(java.util.Iterator)
*asLongIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#concat(it.unimi.dsi.fastutil.longs.LongIterator[],int,int)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#concat(it.unimi.dsi.fastutil.longs.LongIterator[],int,int)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.concat(it.unimi.dsi.fastutil.longs.LongIterator[],int,int)
*concat(it.unimi.dsi.fastutil.longs.LongIterator[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator concat(it.unimi.dsi.fastutil.longs.LongIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.longs.LongIterators.concat(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#concat(it.unimi.dsi.fastutil.longs.LongIterator...)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#concat(it.unimi.dsi.fastutil.longs.LongIterator...)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.concat(it.unimi.dsi.fastutil.longs.LongIterator[])
*concat(it.unimi.dsi.fastutil.longs.LongIterator... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator concat(it.unimi.dsi.fastutil.longs.LongIterator... p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.concat(p0);
}
/**
*{@link org.apache.commons.collections.primitives.LongCollections#getEmptyLongIterator()}
*@see org.apache.commons.collections.primitives.LongCollections#getEmptyLongIterator()
*<code>public static org.apache.commons.collections.primitives.LongIterator org.apache.commons.collections.primitives.LongCollections.getEmptyLongIterator()
*getEmptyLongIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongIterator getEmptyLongIterator(){
	return org.apache.commons.collections.primitives.LongCollections.getEmptyLongIterator();
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#indexOf(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#indexOf(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*<code>public static int it.unimi.dsi.fastutil.longs.LongIterators.indexOf(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*indexOf(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.indexOf(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator,int)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator,int)
*<code>public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongIterators.pour(it.unimi.dsi.fastutil.longs.LongIterator,int)
*pour(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongList pour(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)
*<code>public static int it.unimi.dsi.fastutil.longs.LongIterators.pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)
*pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2){
	return it.unimi.dsi.fastutil.longs.LongIterators.pour(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator)
*<code>public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongIterators.pour(it.unimi.dsi.fastutil.longs.LongIterator)
*pour(it.unimi.dsi.fastutil.longs.LongIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongList pour(it.unimi.dsi.fastutil.longs.LongIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)
*<code>public static int it.unimi.dsi.fastutil.longs.LongIterators.pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)
*pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.pour(p0,p1);
}
/**
*{@link org.apache.commons.collections.primitives.LongCollections#singletonLongIterator(long)}
*@see org.apache.commons.collections.primitives.LongCollections#singletonLongIterator(long)
*<code>public static org.apache.commons.collections.primitives.LongIterator org.apache.commons.collections.primitives.LongCollections.singletonLongIterator(long)
*singletonLongIterator(long p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongIterator singletonLongIterator(long p0){
	return org.apache.commons.collections.primitives.LongCollections.singletonLongIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.DataOutput) throws java.io.IOException
*storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.DataOutput p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.File) throws java.io.IOException
*storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.lang.CharSequence) throws java.io.IOException
*storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.PrintStream)
*storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.PrintStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unmodifiable(it.unimi.dsi.fastutil.longs.LongIterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unmodifiable(it.unimi.dsi.fastutil.longs.LongIterator)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.unmodifiable(it.unimi.dsi.fastutil.longs.LongIterator)
*unmodifiable(it.unimi.dsi.fastutil.longs.LongIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator unmodifiable(it.unimi.dsi.fastutil.longs.LongIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.LongCollections#unmodifiableLongIterator(org.apache.commons.collections.primitives.LongIterator)}
*@see org.apache.commons.collections.primitives.LongCollections#unmodifiableLongIterator(org.apache.commons.collections.primitives.LongIterator)
*<code>public static org.apache.commons.collections.primitives.LongIterator org.apache.commons.collections.primitives.LongCollections.unmodifiableLongIterator(org.apache.commons.collections.primitives.LongIterator)
*unmodifiableLongIterator(org.apache.commons.collections.primitives.LongIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongIterator unmodifiableLongIterator(org.apache.commons.collections.primitives.LongIterator p0){
	return org.apache.commons.collections.primitives.LongCollections.unmodifiableLongIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,int)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,int)
*<code>public static long[] it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,int)
*unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[] unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long...)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long...)
*<code>public static int it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[])
*unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long... p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)
*<code>public static long it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)
*unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[],int,int)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[],int,int)
*<code>public static int it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[],int,int)
*unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)
*<code>public static int it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)
*unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[]...)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[]...)
*<code>public static long it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[][])
*unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[]... p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[][],long,long)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[][],long,long)
*unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[][] p1,long p2,long p3){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator)
*<code>public static long[] it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator)
*unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[] unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator,long)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator,long)
*<code>public static long[][] it.unimi.dsi.fastutil.longs.LongIterators.unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator,long)
*unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator p0,long p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrapBig(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator)
*<code>public static long[][] it.unimi.dsi.fastutil.longs.LongIterators.unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator)
*unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long[][] unwrapBig(it.unimi.dsi.fastutil.longs.LongIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrapBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#wrap(it.unimi.dsi.fastutil.ints.IntIterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#wrap(it.unimi.dsi.fastutil.ints.IntIterator)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.wrap(it.unimi.dsi.fastutil.ints.IntIterator)
*wrap(it.unimi.dsi.fastutil.ints.IntIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator wrap(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.wrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.wrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IteratorLongIterator#wrap(java.util.Iterator)}
*@see org.apache.commons.collections.primitives.adapters.IteratorLongIterator#wrap(java.util.Iterator)
*<code>public static org.apache.commons.collections.primitives.LongIterator org.apache.commons.collections.primitives.adapters.IteratorLongIterator.wrap(java.util.Iterator)
*wrap(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorLongIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.LongIteratorIterator#wrap(org.apache.commons.collections.primitives.LongIterator)}
*@see org.apache.commons.collections.primitives.adapters.LongIteratorIterator#wrap(org.apache.commons.collections.primitives.LongIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.LongIteratorIterator.wrap(org.apache.commons.collections.primitives.LongIterator)
*wrap(org.apache.commons.collections.primitives.LongIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.LongIterator p0){
	return org.apache.commons.collections.primitives.adapters.LongIteratorIterator.wrap(p0);
}
}
