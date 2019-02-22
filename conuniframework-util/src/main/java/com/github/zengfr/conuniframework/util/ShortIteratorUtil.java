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
public final class ShortIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#all(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#all(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.shorts.ShortIterators.all(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*all(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#any(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#any(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.shorts.ShortIterators.any(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*any(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asShortIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asShortIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.BinIO.asShortIterator(java.io.File) throws java.io.IOException
*asShortIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asShortIterator(java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#asShortIterator(java.lang.CharSequence)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.BinIO.asShortIterator(java.lang.CharSequence) throws java.io.IOException
*asShortIterator(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asShortIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asShortIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.BinIO.asShortIterator(java.io.DataInput)
*asShortIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asShortIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asShortIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.TextIO.asShortIterator(java.io.BufferedReader)
*asShortIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asShortIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#asShortIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#asShortIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(java.util.Iterator)
*asShortIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#concat(it.unimi.dsi.fastutil.shorts.ShortIterator[],int,int)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#concat(it.unimi.dsi.fastutil.shorts.ShortIterator[],int,int)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.concat(it.unimi.dsi.fastutil.shorts.ShortIterator[],int,int)
*concat(it.unimi.dsi.fastutil.shorts.ShortIterator[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator concat(it.unimi.dsi.fastutil.shorts.ShortIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.concat(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#concat(it.unimi.dsi.fastutil.shorts.ShortIterator...)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#concat(it.unimi.dsi.fastutil.shorts.ShortIterator...)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.concat(it.unimi.dsi.fastutil.shorts.ShortIterator[])
*concat(it.unimi.dsi.fastutil.shorts.ShortIterator... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator concat(it.unimi.dsi.fastutil.shorts.ShortIterator... p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.concat(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ShortCollections#getEmptyShortIterator()}
*@see org.apache.commons.collections.primitives.ShortCollections#getEmptyShortIterator()
*<code>public static org.apache.commons.collections.primitives.ShortIterator org.apache.commons.collections.primitives.ShortCollections.getEmptyShortIterator()
*getEmptyShortIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ShortIterator getEmptyShortIterator(){
	return org.apache.commons.collections.primitives.ShortCollections.getEmptyShortIterator();
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortIterators.indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.indexOf(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#pour(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#pour(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortIterators.pour(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection)
*pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#pour(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection,int)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#pour(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection,int)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortIterators.pour(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection,int)
*pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1,int p2){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.pour(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#pour(it.unimi.dsi.fastutil.shorts.ShortIterator,int)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#pour(it.unimi.dsi.fastutil.shorts.ShortIterator,int)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortIterators.pour(it.unimi.dsi.fastutil.shorts.ShortIterator,int)
*pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#pour(it.unimi.dsi.fastutil.shorts.ShortIterator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#pour(it.unimi.dsi.fastutil.shorts.ShortIterator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortIterators.pour(it.unimi.dsi.fastutil.shorts.ShortIterator)
*pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.pour(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ShortCollections#singletonShortIterator(short)}
*@see org.apache.commons.collections.primitives.ShortCollections#singletonShortIterator(short)
*<code>public static org.apache.commons.collections.primitives.ShortIterator org.apache.commons.collections.primitives.ShortCollections.singletonShortIterator(short)
*singletonShortIterator(short p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ShortIterator singletonShortIterator(short p0){
	return org.apache.commons.collections.primitives.ShortCollections.singletonShortIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.lang.CharSequence) throws java.io.IOException
*storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.DataOutput) throws java.io.IOException
*storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.DataOutput p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.File) throws java.io.IOException
*storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.PrintStream)
*storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.PrintStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeShorts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#unmodifiable(it.unimi.dsi.fastutil.shorts.ShortIterator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#unmodifiable(it.unimi.dsi.fastutil.shorts.ShortIterator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.unmodifiable(it.unimi.dsi.fastutil.shorts.ShortIterator)
*unmodifiable(it.unimi.dsi.fastutil.shorts.ShortIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator unmodifiable(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ShortCollections#unmodifiableShortIterator(org.apache.commons.collections.primitives.ShortIterator)}
*@see org.apache.commons.collections.primitives.ShortCollections#unmodifiableShortIterator(org.apache.commons.collections.primitives.ShortIterator)
*<code>public static org.apache.commons.collections.primitives.ShortIterator org.apache.commons.collections.primitives.ShortCollections.unmodifiableShortIterator(org.apache.commons.collections.primitives.ShortIterator)
*unmodifiableShortIterator(org.apache.commons.collections.primitives.ShortIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ShortIterator unmodifiableShortIterator(org.apache.commons.collections.primitives.ShortIterator p0){
	return org.apache.commons.collections.primitives.ShortCollections.unmodifiableShortIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection)
*<code>public static long it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection)
*unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short...)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short...)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short[])
*unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short... p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short[],int,int)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short[],int,int)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short[],int,int)
*unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,int)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,int)
*<code>public static short[] it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,int)
*unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static short[] unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short[][],long,long)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short[][],long,long)
*unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short[][] p1,long p2,long p3){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short[]...)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short[]...)
*<code>public static long it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short[][])
*unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short[]... p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection,int)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection,int)
*<code>public static int it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection,int)
*unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1,int p2){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*<code>public static short[] it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static short[] unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#unwrapBig(it.unimi.dsi.fastutil.shorts.ShortIterator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#unwrapBig(it.unimi.dsi.fastutil.shorts.ShortIterator)
*<code>public static short[][] it.unimi.dsi.fastutil.shorts.ShortIterators.unwrapBig(it.unimi.dsi.fastutil.shorts.ShortIterator)
*unwrapBig(it.unimi.dsi.fastutil.shorts.ShortIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static short[][] unwrapBig(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrapBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#unwrapBig(it.unimi.dsi.fastutil.shorts.ShortIterator,long)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#unwrapBig(it.unimi.dsi.fastutil.shorts.ShortIterator,long)
*<code>public static short[][] it.unimi.dsi.fastutil.shorts.ShortIterators.unwrapBig(it.unimi.dsi.fastutil.shorts.ShortIterator,long)
*unwrapBig(it.unimi.dsi.fastutil.shorts.ShortIterator p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static short[][] unwrapBig(it.unimi.dsi.fastutil.shorts.ShortIterator p0,long p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrapBig(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IteratorShortIterator#wrap(java.util.Iterator)}
*@see org.apache.commons.collections.primitives.adapters.IteratorShortIterator#wrap(java.util.Iterator)
*<code>public static org.apache.commons.collections.primitives.ShortIterator org.apache.commons.collections.primitives.adapters.IteratorShortIterator.wrap(java.util.Iterator)
*wrap(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ShortIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorShortIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ShortIteratorIterator#wrap(org.apache.commons.collections.primitives.ShortIterator)}
*@see org.apache.commons.collections.primitives.adapters.ShortIteratorIterator#wrap(org.apache.commons.collections.primitives.ShortIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.ShortIteratorIterator.wrap(org.apache.commons.collections.primitives.ShortIterator)
*wrap(org.apache.commons.collections.primitives.ShortIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.ShortIterator p0){
	return org.apache.commons.collections.primitives.adapters.ShortIteratorIterator.wrap(p0);
}
}
