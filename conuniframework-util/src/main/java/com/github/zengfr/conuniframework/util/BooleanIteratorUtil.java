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
public final class BooleanIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#all(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#all(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)
*<code>public static boolean it.unimi.dsi.fastutil.booleans.BooleanIterators.all(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)
*all(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#any(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#any(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)
*<code>public static boolean it.unimi.dsi.fastutil.booleans.BooleanIterators.any(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)
*any(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#asBooleanIterator(java.util.Iterator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#asBooleanIterator(java.util.Iterator)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.booleans.BooleanIterators.asBooleanIterator(java.util.Iterator)
*asBooleanIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.asBooleanIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asBooleanIterator(java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#asBooleanIterator(java.io.File)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(java.io.File) throws java.io.IOException
*asBooleanIterator(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asBooleanIterator(java.io.DataInput)}
*@see it.unimi.dsi.fastutil.io.BinIO#asBooleanIterator(java.io.DataInput)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(java.io.DataInput)
*asBooleanIterator(java.io.DataInput p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#asBooleanIterator(java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#asBooleanIterator(java.lang.CharSequence)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(java.lang.CharSequence) throws java.io.IOException
*asBooleanIterator(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asBooleanIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asBooleanIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.TextIO.asBooleanIterator(java.io.BufferedReader)
*asBooleanIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asBooleanIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[],int,int)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[],int,int)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.booleans.BooleanIterators.concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[],int,int)
*concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.concat(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#concat(it.unimi.dsi.fastutil.booleans.BooleanIterator...)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#concat(it.unimi.dsi.fastutil.booleans.BooleanIterator...)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.booleans.BooleanIterators.concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[])
*concat(it.unimi.dsi.fastutil.booleans.BooleanIterator... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator concat(it.unimi.dsi.fastutil.booleans.BooleanIterator... p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.concat(p0);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#indexOf(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#indexOf(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)
*<code>public static int it.unimi.dsi.fastutil.booleans.BooleanIterators.indexOf(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)
*indexOf(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.indexOf(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection,int)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection,int)
*<code>public static int it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection,int)
*pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1,int p2){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection)
*<code>public static int it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection)
*pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,int)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,int)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,int)
*pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#pour(it.unimi.dsi.fastutil.booleans.BooleanIterator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#pour(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.DataOutput)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.DataOutput)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.DataOutput) throws java.io.IOException
*storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.DataOutput p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.File)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.File)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.File) throws java.io.IOException
*storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.BinIO#storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.lang.CharSequence)}
*@see it.unimi.dsi.fastutil.io.BinIO#storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.lang.CharSequence)
*<code>public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.lang.CharSequence) throws java.io.IOException
*storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.PrintStream)}
*@see it.unimi.dsi.fastutil.io.TextIO#storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.PrintStream)
*<code>public static void it.unimi.dsi.fastutil.io.TextIO.storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.PrintStream)
*storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.PrintStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeBooleans(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanIterator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.booleans.BooleanIterators.unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unmodifiable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection,int)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection,int)
*<code>public static int it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection,int)
*unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1,int p2){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean[]...)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean[]...)
*<code>public static long it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean[][])
*unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[]... p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean[],int,int)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean[],int,int)
*<code>public static int it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean[],int,int)
*unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection)
*<code>public static long it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection)
*unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,int)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,int)
*<code>public static boolean[] it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,int)
*unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean[] unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*<code>public static boolean[] it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean[] unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean[][],long,long)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean[][],long,long)
*unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[][] p1,long p2,long p3){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean...)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean...)
*<code>public static int it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean[])
*unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean... p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrapBig(it.unimi.dsi.fastutil.booleans.BooleanIterator,long)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrapBig(it.unimi.dsi.fastutil.booleans.BooleanIterator,long)
*<code>public static boolean[][] it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrapBig(it.unimi.dsi.fastutil.booleans.BooleanIterator,long)
*unwrapBig(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean[][] unwrapBig(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,long p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrapBig(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrapBig(it.unimi.dsi.fastutil.booleans.BooleanIterator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#unwrapBig(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*<code>public static boolean[][] it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrapBig(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*unwrapBig(it.unimi.dsi.fastutil.booleans.BooleanIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean[][] unwrapBig(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrapBig(p0);
}
}
