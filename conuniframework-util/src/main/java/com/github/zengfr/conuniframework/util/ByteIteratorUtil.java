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
public final class ByteIteratorUtil{ 
/**
*{@link org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream#adapt(org.apache.commons.collections.primitives.ByteIterator)}
*@see org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream#adapt(org.apache.commons.collections.primitives.ByteIterator)
*<code>public static java.io.InputStream org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream.adapt(org.apache.commons.collections.primitives.ByteIterator)
*adapt(org.apache.commons.collections.primitives.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.InputStream adapt(org.apache.commons.collections.primitives.ByteIterator p0){
	return org.apache.commons.collections.primitives.adapters.io.ByteIteratorInputStream.adapt(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator#adapt(java.io.InputStream)}
*@see org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator#adapt(java.io.InputStream)
*<code>public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator.adapt(java.io.InputStream)
*adapt(java.io.InputStream p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteIterator adapt(java.io.InputStream p0){
	return org.apache.commons.collections.primitives.adapters.io.InputStreamByteIterator.adapt(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#all(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#all(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.bytes.ByteIterators.all(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*all(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#any(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#any(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.bytes.ByteIterators.any(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*any(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#asByteIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#asByteIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(java.util.Iterator)
*asByteIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asByteIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asByteIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.BinIO.asByteIterator(java.io.File) throws java.io.IOException
*asByteIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asByteIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asByteIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.BinIO.asByteIterator(java.io.DataInput)
*asByteIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asByteIterator(java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#asByteIterator(java.lang.CharSequence)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.BinIO.asByteIterator(java.lang.CharSequence) throws java.io.IOException
*asByteIterator(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asByteIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asByteIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asByteIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.TextIO.asByteIterator(java.io.BufferedReader)
*asByteIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asByteIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#concat(it.unimi.dsi.fastutil.bytes.ByteIterator...)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#concat(it.unimi.dsi.fastutil.bytes.ByteIterator...)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.bytes.ByteIterators.concat(it.unimi.dsi.fastutil.bytes.ByteIterator[])
*concat(it.unimi.dsi.fastutil.bytes.ByteIterator... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator concat(it.unimi.dsi.fastutil.bytes.ByteIterator... p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.concat(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#concat(it.unimi.dsi.fastutil.bytes.ByteIterator[],int,int)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#concat(it.unimi.dsi.fastutil.bytes.ByteIterator[],int,int)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.bytes.ByteIterators.concat(it.unimi.dsi.fastutil.bytes.ByteIterator[],int,int)
*concat(it.unimi.dsi.fastutil.bytes.ByteIterator[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator concat(it.unimi.dsi.fastutil.bytes.ByteIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.concat(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.primitives.ByteCollections#getEmptyByteIterator()}
*@see org.apache.commons.collections.primitives.ByteCollections#getEmptyByteIterator()
*<code>public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.ByteCollections.getEmptyByteIterator()
*getEmptyByteIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteIterator getEmptyByteIterator(){
	return org.apache.commons.collections.primitives.ByteCollections.getEmptyByteIterator();
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteIterators.indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator,java.util.function.IntPredicate)
*indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.indexOf(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteIterators.pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)
*pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator,int)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator,int)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteIterators.pour(it.unimi.dsi.fastutil.bytes.ByteIterator,int)
*pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteList it.unimi.dsi.fastutil.bytes.ByteIterators.pour(it.unimi.dsi.fastutil.bytes.ByteIterator)
*pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteList pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteIterators.pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)
*pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.pour(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.primitives.ByteCollections#singletonByteIterator(byte)}
*@see org.apache.commons.collections.primitives.ByteCollections#singletonByteIterator(byte)
*<code>public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.ByteCollections.singletonByteIterator(byte)
*singletonByteIterator(byte p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteIterator singletonByteIterator(byte p0){
	return org.apache.commons.collections.primitives.ByteCollections.singletonByteIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.lang.CharSequence) throws java.io.IOException
*storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.File) throws java.io.IOException
*storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.DataOutput) throws java.io.IOException
*storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.DataOutput p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator,java.io.PrintStream)
*storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.PrintStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unmodifiable(it.unimi.dsi.fastutil.bytes.ByteIterator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unmodifiable(it.unimi.dsi.fastutil.bytes.ByteIterator)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.bytes.ByteIterators.unmodifiable(it.unimi.dsi.fastutil.bytes.ByteIterator)
*unmodifiable(it.unimi.dsi.fastutil.bytes.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator unmodifiable(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ByteCollections#unmodifiableByteIterator(org.apache.commons.collections.primitives.ByteIterator)}
*@see org.apache.commons.collections.primitives.ByteCollections#unmodifiableByteIterator(org.apache.commons.collections.primitives.ByteIterator)
*<code>public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.ByteCollections.unmodifiableByteIterator(org.apache.commons.collections.primitives.ByteIterator)
*unmodifiableByteIterator(org.apache.commons.collections.primitives.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteIterator unmodifiableByteIterator(org.apache.commons.collections.primitives.ByteIterator p0){
	return org.apache.commons.collections.primitives.ByteCollections.unmodifiableByteIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[]...)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[]...)
*<code>public static long it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[][])
*unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[]... p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)
*unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)
*<code>public static long it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)
*unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[],int,int)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[],int,int)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[],int,int)
*unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte...)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte...)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[])
*unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte... p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,int)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,int)
*<code>public static byte[] it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,int)
*unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[][],long,long)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,byte[][],long,long)
*unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,byte[][] p1,long p2,long p3){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*<code>public static byte[] it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator)
*<code>public static byte[][] it.unimi.dsi.fastutil.bytes.ByteIterators.unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator)
*unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrapBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator,long)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator,long)
*<code>public static byte[][] it.unimi.dsi.fastutil.bytes.ByteIterators.unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator,long)
*unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[][] unwrapBig(it.unimi.dsi.fastutil.bytes.ByteIterator p0,long p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrapBig(p0,p1);
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
*{@link org.apache.commons.collections.primitives.adapters.ByteIteratorIterator#wrap(org.apache.commons.collections.primitives.ByteIterator)}
*@see org.apache.commons.collections.primitives.adapters.ByteIteratorIterator#wrap(org.apache.commons.collections.primitives.ByteIterator)
*<code>public static java.util.Iterator org.apache.commons.collections.primitives.adapters.ByteIteratorIterator.wrap(org.apache.commons.collections.primitives.ByteIterator)
*wrap(org.apache.commons.collections.primitives.ByteIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.ByteIterator p0){
	return org.apache.commons.collections.primitives.adapters.ByteIteratorIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IteratorByteIterator#wrap(java.util.Iterator)}
*@see org.apache.commons.collections.primitives.adapters.IteratorByteIterator#wrap(java.util.Iterator)
*<code>public static org.apache.commons.collections.primitives.ByteIterator org.apache.commons.collections.primitives.adapters.IteratorByteIterator.wrap(java.util.Iterator)
*wrap(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorByteIterator.wrap(p0);
}
}
