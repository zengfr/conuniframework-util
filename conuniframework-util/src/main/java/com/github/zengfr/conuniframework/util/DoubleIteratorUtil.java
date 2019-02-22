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
public final class DoubleIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#all(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#all(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)
*<code>public static boolean it.unimi.dsi.fastutil.doubles.DoubleIterators.all(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)
*all(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#any(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#any(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)
*<code>public static boolean it.unimi.dsi.fastutil.doubles.DoubleIterators.any(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)
*any(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#asDoubleIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#asDoubleIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(java.util.Iterator)
*asDoubleIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asDoubleIterator(java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#asDoubleIterator(java.lang.CharSequence)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(java.lang.CharSequence) throws java.io.IOException
*asDoubleIterator(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asDoubleIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asDoubleIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(java.io.File) throws java.io.IOException
*asDoubleIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asDoubleIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asDoubleIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(java.io.DataInput)
*asDoubleIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asDoubleIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asDoubleIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.TextIO.asDoubleIterator(java.io.BufferedReader)
*asDoubleIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asDoubleIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[],int,int)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[],int,int)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[],int,int)
*concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.concat(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#concat(it.unimi.dsi.fastutil.doubles.DoubleIterator...)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#concat(it.unimi.dsi.fastutil.doubles.DoubleIterator...)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[])
*concat(it.unimi.dsi.fastutil.doubles.DoubleIterator... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator concat(it.unimi.dsi.fastutil.doubles.DoubleIterator... p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.concat(p0);
}
/**
*{@link org.apache.commons.collections.primitives.DoubleCollections#getEmptyDoubleIterator()}
*@see org.apache.commons.collections.primitives.DoubleCollections#getEmptyDoubleIterator()
*<code>public static org.apache.commons.collections.primitives.DoubleIterator org.apache.commons.collections.primitives.DoubleCollections.getEmptyDoubleIterator()
*getEmptyDoubleIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleIterator getEmptyDoubleIterator(){
	return org.apache.commons.collections.primitives.DoubleCollections.getEmptyDoubleIterator();
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#indexOf(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#indexOf(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.indexOf(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)
*indexOf(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.indexOf(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,int)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,int)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,int)
*pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)
*pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)
*pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(p0);
}
/**
*{@link org.apache.commons.collections.primitives.DoubleCollections#singletonDoubleIterator(double)}
*@see org.apache.commons.collections.primitives.DoubleCollections#singletonDoubleIterator(double)
*<code>public static org.apache.commons.collections.primitives.DoubleIterator org.apache.commons.collections.primitives.DoubleCollections.singletonDoubleIterator(double)
*singletonDoubleIterator(double p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleIterator singletonDoubleIterator(double p0){
	return org.apache.commons.collections.primitives.DoubleCollections.singletonDoubleIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.lang.CharSequence) throws java.io.IOException
*storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.File) throws java.io.IOException
*storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.DataOutput) throws java.io.IOException
*storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.DataOutput p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.PrintStream)
*storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.PrintStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.DoubleCollections#unmodifiableDoubleIterator(org.apache.commons.collections.primitives.DoubleIterator)}
*@see org.apache.commons.collections.primitives.DoubleCollections#unmodifiableDoubleIterator(org.apache.commons.collections.primitives.DoubleIterator)
*<code>public static org.apache.commons.collections.primitives.DoubleIterator org.apache.commons.collections.primitives.DoubleCollections.unmodifiableDoubleIterator(org.apache.commons.collections.primitives.DoubleIterator)
*unmodifiableDoubleIterator(org.apache.commons.collections.primitives.DoubleIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleIterator unmodifiableDoubleIterator(org.apache.commons.collections.primitives.DoubleIterator p0){
	return org.apache.commons.collections.primitives.DoubleCollections.unmodifiableDoubleIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,int)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,int)
*<code>public static double[] it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,int)
*unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double[] unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)
*unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*<code>public static double[] it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double[] unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double...)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double...)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double[])
*unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double... p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double[],int,int)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double[],int,int)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double[],int,int)
*unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double[]...)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double[]...)
*<code>public static long it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double[][])
*unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double[]... p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)
*<code>public static long it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)
*unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double[][],long,long)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double[][],long,long)
*unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double[][] p1,long p2,long p3){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrapBig(it.unimi.dsi.fastutil.doubles.DoubleIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrapBig(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*<code>public static double[][] it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrapBig(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*unwrapBig(it.unimi.dsi.fastutil.doubles.DoubleIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double[][] unwrapBig(it.unimi.dsi.fastutil.doubles.DoubleIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrapBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrapBig(it.unimi.dsi.fastutil.doubles.DoubleIterator,long)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrapBig(it.unimi.dsi.fastutil.doubles.DoubleIterator,long)
*<code>public static double[][] it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrapBig(it.unimi.dsi.fastutil.doubles.DoubleIterator,long)
*unwrapBig(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double[][] unwrapBig(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,long p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrapBig(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#wrap(it.unimi.dsi.fastutil.floats.FloatIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#wrap(it.unimi.dsi.fastutil.floats.FloatIterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(it.unimi.dsi.fastutil.floats.FloatIterator)
*wrap(it.unimi.dsi.fastutil.floats.FloatIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.floats.FloatIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
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
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator#wrap(org.apache.commons.collections.primitives.DoubleIterator)}
*@see org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator#wrap(org.apache.commons.collections.primitives.DoubleIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator.wrap(org.apache.commons.collections.primitives.DoubleIterator)
*wrap(org.apache.commons.collections.primitives.DoubleIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.DoubleIterator p0){
	return org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IteratorDoubleIterator#wrap(java.util.Iterator)}
*@see org.apache.commons.collections.primitives.adapters.IteratorDoubleIterator#wrap(java.util.Iterator)
*<code>public static org.apache.commons.collections.primitives.DoubleIterator org.apache.commons.collections.primitives.adapters.IteratorDoubleIterator.wrap(java.util.Iterator)
*wrap(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorDoubleIterator.wrap(p0);
}
}
