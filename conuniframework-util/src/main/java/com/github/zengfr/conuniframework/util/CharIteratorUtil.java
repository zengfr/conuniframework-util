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
public final class CharIteratorUtil{ 
/**
*{@link org.apache.commons.collections.primitives.adapters.io.CharIteratorReader#adapt(org.apache.commons.collections.primitives.CharIterator)}
*@see org.apache.commons.collections.primitives.adapters.io.CharIteratorReader#adapt(org.apache.commons.collections.primitives.CharIterator)
*<code>public static java.io.Reader org.apache.commons.collections.primitives.adapters.io.CharIteratorReader.adapt(org.apache.commons.collections.primitives.CharIterator)
*adapt(org.apache.commons.collections.primitives.CharIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.Reader adapt(org.apache.commons.collections.primitives.CharIterator p0){
	return org.apache.commons.collections.primitives.adapters.io.CharIteratorReader.adapt(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator#adapt(java.io.Reader)}
*@see org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator#adapt(java.io.Reader)
*<code>public static org.apache.commons.collections.primitives.CharIterator org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator.adapt(java.io.Reader)
*adapt(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharIterator adapt(java.io.Reader p0){
	return org.apache.commons.collections.primitives.adapters.io.ReaderCharIterator.adapt(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#all(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#all(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.chars.CharIterators.all(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*all(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#any(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#any(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.chars.CharIterators.any(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*any(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#asCharIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#asCharIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(java.util.Iterator)
*asCharIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asCharIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asCharIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.io.BinIO.asCharIterator(java.io.DataInput)
*asCharIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asCharIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asCharIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.io.BinIO.asCharIterator(java.io.File) throws java.io.IOException
*asCharIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asCharIterator(java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#asCharIterator(java.lang.CharSequence)
*<code>public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.io.BinIO.asCharIterator(java.lang.CharSequence) throws java.io.IOException
*asCharIterator(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asCharIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#concat(it.unimi.dsi.fastutil.chars.CharIterator...)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#concat(it.unimi.dsi.fastutil.chars.CharIterator...)
*<code>public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.chars.CharIterators.concat(it.unimi.dsi.fastutil.chars.CharIterator[])
*concat(it.unimi.dsi.fastutil.chars.CharIterator... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator concat(it.unimi.dsi.fastutil.chars.CharIterator... p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.concat(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#concat(it.unimi.dsi.fastutil.chars.CharIterator[],int,int)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#concat(it.unimi.dsi.fastutil.chars.CharIterator[],int,int)
*<code>public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.chars.CharIterators.concat(it.unimi.dsi.fastutil.chars.CharIterator[],int,int)
*concat(it.unimi.dsi.fastutil.chars.CharIterator[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator concat(it.unimi.dsi.fastutil.chars.CharIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.chars.CharIterators.concat(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.primitives.CharCollections#getEmptyCharIterator()}
*@see org.apache.commons.collections.primitives.CharCollections#getEmptyCharIterator()
*<code>public static org.apache.commons.collections.primitives.CharIterator org.apache.commons.collections.primitives.CharCollections.getEmptyCharIterator()
*getEmptyCharIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharIterator getEmptyCharIterator(){
	return org.apache.commons.collections.primitives.CharCollections.getEmptyCharIterator();
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#indexOf(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#indexOf(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*<code>public static int it.unimi.dsi.fastutil.chars.CharIterators.indexOf(it.unimi.dsi.fastutil.chars.CharIterator,java.util.function.IntPredicate)
*indexOf(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(it.unimi.dsi.fastutil.chars.CharIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.indexOf(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)
*<code>public static int it.unimi.dsi.fastutil.chars.CharIterators.pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)
*pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator,int)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator,int)
*<code>public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharIterators.pour(it.unimi.dsi.fastutil.chars.CharIterator,int)
*pour(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharList pour(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator)
*<code>public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharIterators.pour(it.unimi.dsi.fastutil.chars.CharIterator)
*pour(it.unimi.dsi.fastutil.chars.CharIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharList pour(it.unimi.dsi.fastutil.chars.CharIterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)
*<code>public static int it.unimi.dsi.fastutil.chars.CharIterators.pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)
*pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2){
	return it.unimi.dsi.fastutil.chars.CharIterators.pour(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.primitives.CharCollections#singletonCharIterator(char)}
*@see org.apache.commons.collections.primitives.CharCollections#singletonCharIterator(char)
*<code>public static org.apache.commons.collections.primitives.CharIterator org.apache.commons.collections.primitives.CharCollections.singletonCharIterator(char)
*singletonCharIterator(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharIterator singletonCharIterator(char p0){
	return org.apache.commons.collections.primitives.CharCollections.singletonCharIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.io.File) throws java.io.IOException
*storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.lang.CharSequence) throws java.io.IOException
*storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeChars(it.unimi.dsi.fastutil.chars.CharIterator,java.io.DataOutput) throws java.io.IOException
*storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.DataOutput p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeChars(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unmodifiable(it.unimi.dsi.fastutil.chars.CharIterator)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unmodifiable(it.unimi.dsi.fastutil.chars.CharIterator)
*<code>public static it.unimi.dsi.fastutil.chars.CharIterator it.unimi.dsi.fastutil.chars.CharIterators.unmodifiable(it.unimi.dsi.fastutil.chars.CharIterator)
*unmodifiable(it.unimi.dsi.fastutil.chars.CharIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharIterator unmodifiable(it.unimi.dsi.fastutil.chars.CharIterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.CharCollections#unmodifiableCharIterator(org.apache.commons.collections.primitives.CharIterator)}
*@see org.apache.commons.collections.primitives.CharCollections#unmodifiableCharIterator(org.apache.commons.collections.primitives.CharIterator)
*<code>public static org.apache.commons.collections.primitives.CharIterator org.apache.commons.collections.primitives.CharCollections.unmodifiableCharIterator(org.apache.commons.collections.primitives.CharIterator)
*unmodifiableCharIterator(org.apache.commons.collections.primitives.CharIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharIterator unmodifiableCharIterator(org.apache.commons.collections.primitives.CharIterator p0){
	return org.apache.commons.collections.primitives.CharCollections.unmodifiableCharIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char[]...)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char[]...)
*<code>public static long it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char[][])
*unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[]... p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)
*<code>public static int it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)
*unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)
*<code>public static long it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)
*unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char[],int,int)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char[],int,int)
*<code>public static int it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char[],int,int)
*unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char...)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char...)
*<code>public static int it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char[])
*unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char... p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,int)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,int)
*<code>public static char[] it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,int)
*unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static char[] unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char[][],long,long)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,char[][],long,long)
*unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,char[][] p1,long p2,long p3){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator)
*<code>public static char[] it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator)
*unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static char[] unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unwrapBig(it.unimi.dsi.fastutil.chars.CharIterator)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unwrapBig(it.unimi.dsi.fastutil.chars.CharIterator)
*<code>public static char[][] it.unimi.dsi.fastutil.chars.CharIterators.unwrapBig(it.unimi.dsi.fastutil.chars.CharIterator)
*unwrapBig(it.unimi.dsi.fastutil.chars.CharIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static char[][] unwrapBig(it.unimi.dsi.fastutil.chars.CharIterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrapBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unwrapBig(it.unimi.dsi.fastutil.chars.CharIterator,long)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unwrapBig(it.unimi.dsi.fastutil.chars.CharIterator,long)
*<code>public static char[][] it.unimi.dsi.fastutil.chars.CharIterators.unwrapBig(it.unimi.dsi.fastutil.chars.CharIterator,long)
*unwrapBig(it.unimi.dsi.fastutil.chars.CharIterator p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static char[][] unwrapBig(it.unimi.dsi.fastutil.chars.CharIterator p0,long p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrapBig(p0,p1);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CharIteratorIterator#wrap(org.apache.commons.collections.primitives.CharIterator)}
*@see org.apache.commons.collections.primitives.adapters.CharIteratorIterator#wrap(org.apache.commons.collections.primitives.CharIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.CharIteratorIterator.wrap(org.apache.commons.collections.primitives.CharIterator)
*wrap(org.apache.commons.collections.primitives.CharIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.CharIterator p0){
	return org.apache.commons.collections.primitives.adapters.CharIteratorIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IteratorCharIterator#wrap(java.util.Iterator)}
*@see org.apache.commons.collections.primitives.adapters.IteratorCharIterator#wrap(java.util.Iterator)
*<code>public static org.apache.commons.collections.primitives.CharIterator org.apache.commons.collections.primitives.adapters.IteratorCharIterator.wrap(java.util.Iterator)
*wrap(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorCharIterator.wrap(p0);
}
}
