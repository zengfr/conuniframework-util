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
public final class IntIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#all(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#all(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.ints.IntIterators.all(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*all(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#any(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#any(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.ints.IntIterators.any(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*any(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#asIntIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#asIntIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(java.util.Iterator)
*asIntIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asIntIterator(java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#asIntIterator(java.lang.CharSequence)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.BinIO.asIntIterator(java.lang.CharSequence) throws java.io.IOException
*asIntIterator(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asIntIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asIntIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.BinIO.asIntIterator(java.io.File) throws java.io.IOException
*asIntIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asIntIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asIntIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.BinIO.asIntIterator(java.io.DataInput)
*asIntIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asIntIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asIntIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.TextIO.asIntIterator(java.io.BufferedReader)
*asIntIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asIntIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#concat(it.unimi.dsi.fastutil.ints.IntIterator[],int,int)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#concat(it.unimi.dsi.fastutil.ints.IntIterator[],int,int)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.concat(it.unimi.dsi.fastutil.ints.IntIterator[],int,int)
*concat(it.unimi.dsi.fastutil.ints.IntIterator[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator concat(it.unimi.dsi.fastutil.ints.IntIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.ints.IntIterators.concat(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#concat(it.unimi.dsi.fastutil.ints.IntIterator...)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#concat(it.unimi.dsi.fastutil.ints.IntIterator...)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.concat(it.unimi.dsi.fastutil.ints.IntIterator[])
*concat(it.unimi.dsi.fastutil.ints.IntIterator... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator concat(it.unimi.dsi.fastutil.ints.IntIterator... p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.concat(p0);
}
/**
*{@link org.apache.commons.collections.primitives.IntCollections#getEmptyIntIterator()}
*@see org.apache.commons.collections.primitives.IntCollections#getEmptyIntIterator()
*<code>public static org.apache.commons.collections.primitives.IntIterator org.apache.commons.collections.primitives.IntCollections.getEmptyIntIterator()
*getEmptyIntIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntIterator getEmptyIntIterator(){
	return org.apache.commons.collections.primitives.IntCollections.getEmptyIntIterator();
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#indexOf(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#indexOf(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*<code>public static int it.unimi.dsi.fastutil.ints.IntIterators.indexOf(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*indexOf(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.indexOf(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator,int)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator,int)
*<code>public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntIterators.pour(it.unimi.dsi.fastutil.ints.IntIterator,int)
*pour(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntList pour(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)
*<code>public static int it.unimi.dsi.fastutil.ints.IntIterators.pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)
*pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator)
*<code>public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntIterators.pour(it.unimi.dsi.fastutil.ints.IntIterator)
*pour(it.unimi.dsi.fastutil.ints.IntIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntList pour(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)
*<code>public static int it.unimi.dsi.fastutil.ints.IntIterators.pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)
*pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2){
	return it.unimi.dsi.fastutil.ints.IntIterators.pour(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.primitives.IntCollections#singletonIntIterator(int)}
*@see org.apache.commons.collections.primitives.IntCollections#singletonIntIterator(int)
*<code>public static org.apache.commons.collections.primitives.IntIterator org.apache.commons.collections.primitives.IntCollections.singletonIntIterator(int)
*singletonIntIterator(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntIterator singletonIntIterator(int p0){
	return org.apache.commons.collections.primitives.IntCollections.singletonIntIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.DataOutput) throws java.io.IOException
*storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.DataOutput p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.File) throws java.io.IOException
*storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.lang.CharSequence) throws java.io.IOException
*storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.PrintStream)
*storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.PrintStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unmodifiable(it.unimi.dsi.fastutil.ints.IntIterator)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unmodifiable(it.unimi.dsi.fastutil.ints.IntIterator)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.unmodifiable(it.unimi.dsi.fastutil.ints.IntIterator)
*unmodifiable(it.unimi.dsi.fastutil.ints.IntIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator unmodifiable(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.IntCollections#unmodifiableIntIterator(org.apache.commons.collections.primitives.IntIterator)}
*@see org.apache.commons.collections.primitives.IntCollections#unmodifiableIntIterator(org.apache.commons.collections.primitives.IntIterator)
*<code>public static org.apache.commons.collections.primitives.IntIterator org.apache.commons.collections.primitives.IntCollections.unmodifiableIntIterator(org.apache.commons.collections.primitives.IntIterator)
*unmodifiableIntIterator(org.apache.commons.collections.primitives.IntIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntIterator unmodifiableIntIterator(org.apache.commons.collections.primitives.IntIterator p0){
	return org.apache.commons.collections.primitives.IntCollections.unmodifiableIntIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int...)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int...)
*<code>public static int it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int[])
*unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int... p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int)
*<code>public static int[] it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int)
*unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int[] unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)
*<code>public static long it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)
*unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int[],int,int)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int[],int,int)
*<code>public static int it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int[],int,int)
*unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int[][],long,long)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int[][],long,long)
*unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int[][] p1,long p2,long p3){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int[]...)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int[]...)
*<code>public static long it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int[][])
*unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int[]... p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)
*<code>public static int it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)
*unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator)
*<code>public static int[] it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator)
*unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int[] unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unwrapBig(it.unimi.dsi.fastutil.ints.IntIterator)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unwrapBig(it.unimi.dsi.fastutil.ints.IntIterator)
*<code>public static int[][] it.unimi.dsi.fastutil.ints.IntIterators.unwrapBig(it.unimi.dsi.fastutil.ints.IntIterator)
*unwrapBig(it.unimi.dsi.fastutil.ints.IntIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int[][] unwrapBig(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrapBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unwrapBig(it.unimi.dsi.fastutil.ints.IntIterator,long)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unwrapBig(it.unimi.dsi.fastutil.ints.IntIterator,long)
*<code>public static int[][] it.unimi.dsi.fastutil.ints.IntIterators.unwrapBig(it.unimi.dsi.fastutil.ints.IntIterator,long)
*unwrapBig(it.unimi.dsi.fastutil.ints.IntIterator p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int[][] unwrapBig(it.unimi.dsi.fastutil.ints.IntIterator p0,long p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrapBig(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#wrap(it.unimi.dsi.fastutil.ints.IntIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#wrap(it.unimi.dsi.fastutil.ints.IntIterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(it.unimi.dsi.fastutil.ints.IntIterator)
*wrap(it.unimi.dsi.fastutil.ints.IntIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.wrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IntIteratorIterator#wrap(org.apache.commons.collections.primitives.IntIterator)}
*@see org.apache.commons.collections.primitives.adapters.IntIteratorIterator#wrap(org.apache.commons.collections.primitives.IntIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.IntIteratorIterator.wrap(org.apache.commons.collections.primitives.IntIterator)
*wrap(org.apache.commons.collections.primitives.IntIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.IntIterator p0){
	return org.apache.commons.collections.primitives.adapters.IntIteratorIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IteratorIntIterator#wrap(java.util.Iterator)}
*@see org.apache.commons.collections.primitives.adapters.IteratorIntIterator#wrap(java.util.Iterator)
*<code>public static org.apache.commons.collections.primitives.IntIterator org.apache.commons.collections.primitives.adapters.IteratorIntIterator.wrap(java.util.Iterator)
*wrap(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorIntIterator.wrap(p0);
}
}
