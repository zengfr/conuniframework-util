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
public final class FloatIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#all(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#all(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)
*<code>public static boolean it.unimi.dsi.fastutil.floats.FloatIterators.all(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)
*all(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#any(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#any(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)
*<code>public static boolean it.unimi.dsi.fastutil.floats.FloatIterators.any(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)
*any(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#asFloatIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#asFloatIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(java.util.Iterator)
*asFloatIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asFloatIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asFloatIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(java.io.DataInput)
*asFloatIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asFloatIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asFloatIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(java.io.File) throws java.io.IOException
*asFloatIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asFloatIterator(java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#asFloatIterator(java.lang.CharSequence)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(java.lang.CharSequence) throws java.io.IOException
*asFloatIterator(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asFloatIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asFloatIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.TextIO.asFloatIterator(java.io.BufferedReader)
*asFloatIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asFloatIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#concat(it.unimi.dsi.fastutil.floats.FloatIterator[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#concat(it.unimi.dsi.fastutil.floats.FloatIterator[],int,int)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.concat(it.unimi.dsi.fastutil.floats.FloatIterator[],int,int)
*concat(it.unimi.dsi.fastutil.floats.FloatIterator[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator concat(it.unimi.dsi.fastutil.floats.FloatIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatIterators.concat(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#concat(it.unimi.dsi.fastutil.floats.FloatIterator...)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#concat(it.unimi.dsi.fastutil.floats.FloatIterator...)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.concat(it.unimi.dsi.fastutil.floats.FloatIterator[])
*concat(it.unimi.dsi.fastutil.floats.FloatIterator... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator concat(it.unimi.dsi.fastutil.floats.FloatIterator... p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.concat(p0);
}
/**
*{@link org.apache.commons.collections.primitives.FloatCollections#getEmptyFloatIterator()}
*@see org.apache.commons.collections.primitives.FloatCollections#getEmptyFloatIterator()
*<code>public static org.apache.commons.collections.primitives.FloatIterator org.apache.commons.collections.primitives.FloatCollections.getEmptyFloatIterator()
*getEmptyFloatIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatIterator getEmptyFloatIterator(){
	return org.apache.commons.collections.primitives.FloatCollections.getEmptyFloatIterator();
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#indexOf(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#indexOf(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIterators.indexOf(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)
*indexOf(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.indexOf(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIterators.pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)
*pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatIterators.pour(it.unimi.dsi.fastutil.floats.FloatIterator)
*pour(it.unimi.dsi.fastutil.floats.FloatIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList pour(it.unimi.dsi.fastutil.floats.FloatIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIterators.pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)
*pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatIterators.pour(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator,int)
*<code>public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatIterators.pour(it.unimi.dsi.fastutil.floats.FloatIterator,int)
*pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.pour(p0,p1);
}
/**
*{@link org.apache.commons.collections.primitives.FloatCollections#singletonFloatIterator(float)}
*@see org.apache.commons.collections.primitives.FloatCollections#singletonFloatIterator(float)
*<code>public static org.apache.commons.collections.primitives.FloatIterator org.apache.commons.collections.primitives.FloatCollections.singletonFloatIterator(float)
*singletonFloatIterator(float p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatIterator singletonFloatIterator(float p0){
	return org.apache.commons.collections.primitives.FloatCollections.singletonFloatIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.File) throws java.io.IOException
*storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.DataOutput) throws java.io.IOException
*storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.DataOutput p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.lang.CharSequence) throws java.io.IOException
*storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.PrintStream)
*storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.PrintStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unmodifiable(it.unimi.dsi.fastutil.floats.FloatIterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unmodifiable(it.unimi.dsi.fastutil.floats.FloatIterator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.unmodifiable(it.unimi.dsi.fastutil.floats.FloatIterator)
*unmodifiable(it.unimi.dsi.fastutil.floats.FloatIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator unmodifiable(it.unimi.dsi.fastutil.floats.FloatIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.FloatCollections#unmodifiableFloatIterator(org.apache.commons.collections.primitives.FloatIterator)}
*@see org.apache.commons.collections.primitives.FloatCollections#unmodifiableFloatIterator(org.apache.commons.collections.primitives.FloatIterator)
*<code>public static org.apache.commons.collections.primitives.FloatIterator org.apache.commons.collections.primitives.FloatCollections.unmodifiableFloatIterator(org.apache.commons.collections.primitives.FloatIterator)
*unmodifiableFloatIterator(org.apache.commons.collections.primitives.FloatIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatIterator unmodifiableFloatIterator(org.apache.commons.collections.primitives.FloatIterator p0){
	return org.apache.commons.collections.primitives.FloatCollections.unmodifiableFloatIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)
*<code>public static long it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float...)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float...)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[])
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float... p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[],int,int)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[],int,int)
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[][],long,long)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[][],long,long)
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[][] p1,long p2,long p3){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[]...)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[]...)
*<code>public static long it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[][])
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[]... p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator)
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,int)
*<code>public static float[] it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,int)
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[] unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrapBig(it.unimi.dsi.fastutil.floats.FloatIterator,long)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrapBig(it.unimi.dsi.fastutil.floats.FloatIterator,long)
*<code>public static float[][] it.unimi.dsi.fastutil.floats.FloatIterators.unwrapBig(it.unimi.dsi.fastutil.floats.FloatIterator,long)
*unwrapBig(it.unimi.dsi.fastutil.floats.FloatIterator p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[][] unwrapBig(it.unimi.dsi.fastutil.floats.FloatIterator p0,long p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrapBig(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrapBig(it.unimi.dsi.fastutil.floats.FloatIterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrapBig(it.unimi.dsi.fastutil.floats.FloatIterator)
*<code>public static float[][] it.unimi.dsi.fastutil.floats.FloatIterators.unwrapBig(it.unimi.dsi.fastutil.floats.FloatIterator)
*unwrapBig(it.unimi.dsi.fastutil.floats.FloatIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static float[][] unwrapBig(it.unimi.dsi.fastutil.floats.FloatIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrapBig(p0);
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
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.wrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.FloatIteratorIterator#wrap(org.apache.commons.collections.primitives.FloatIterator)}
*@see org.apache.commons.collections.primitives.adapters.FloatIteratorIterator#wrap(org.apache.commons.collections.primitives.FloatIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.FloatIteratorIterator.wrap(org.apache.commons.collections.primitives.FloatIterator)
*wrap(org.apache.commons.collections.primitives.FloatIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.FloatIterator p0){
	return org.apache.commons.collections.primitives.adapters.FloatIteratorIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IteratorFloatIterator#wrap(java.util.Iterator)}
*@see org.apache.commons.collections.primitives.adapters.IteratorFloatIterator#wrap(java.util.Iterator)
*<code>public static org.apache.commons.collections.primitives.FloatIterator org.apache.commons.collections.primitives.adapters.IteratorFloatIterator.wrap(java.util.Iterator)
*wrap(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorFloatIterator.wrap(p0);
}
}
