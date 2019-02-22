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
public final class ImmutableListUtil{ 
/**
*{@link com.google.common.collect.Lists#charactersOf(java.lang.String)}
*@see com.google.common.collect.Lists#charactersOf(java.lang.String)
*<code>public static com.google.common.collect.ImmutableList<java.lang.Character> com.google.common.collect.Lists.charactersOf(java.lang.String)
*charactersOf(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.collect.ImmutableList<java.lang.Character> charactersOf(java.lang.String p0){
	return com.google.common.collect.Lists.charactersOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableList#copyOf(E...)}
*@see com.google.common.collect.ImmutableList#copyOf(E...)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.copyOf(E[])
*copyOf(E... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> copyOf(E... p0){
	return com.google.common.collect.ImmutableList.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableList#copyOf(java.util.Collection<? extends E>)}
*@see com.google.common.collect.ImmutableList#copyOf(java.util.Collection<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.copyOf(java.util.Collection<? extends E>)
*copyOf(java.util.Collection<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.util.Collection<? extends E> p0){
	return com.google.common.collect.ImmutableList.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableList#copyOf(java.lang.Iterable<? extends E>)}
*@see com.google.common.collect.ImmutableList#copyOf(java.lang.Iterable<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.copyOf(java.lang.Iterable<? extends E>)
*copyOf(java.lang.Iterable<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.ImmutableList.copyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableList#copyOf(java.util.Iterator<? extends E>)}
*@see com.google.common.collect.ImmutableList#copyOf(java.util.Iterator<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.copyOf(java.util.Iterator<? extends E>)
*copyOf(java.util.Iterator<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.util.Iterator<? extends E> p0){
	return com.google.common.collect.ImmutableList.copyOf(p0);
}
/**
*{@link com.google.common.util.concurrent.Futures#inCompletionOrder(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>>)}
*@see com.google.common.util.concurrent.Futures#inCompletionOrder(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>>)
*<code>public static <T> com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<T>> com.google.common.util.concurrent.Futures.inCompletionOrder(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>>)
*inCompletionOrder(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<T>> inCompletionOrder(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>> p0){
	return com.google.common.util.concurrent.Futures.inCompletionOrder(p0);
}
/**
*{@link com.google.common.io.MoreFiles#listFiles(java.nio.file.Path)}
*@see com.google.common.io.MoreFiles#listFiles(java.nio.file.Path)
*<code>public static com.google.common.collect.ImmutableList<java.nio.file.Path> com.google.common.io.MoreFiles.listFiles(java.nio.file.Path) throws java.io.IOException
*listFiles(java.nio.file.Path p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.collect.ImmutableList<java.nio.file.Path> listFiles(java.nio.file.Path p0) throws java.io.IOException{
	return com.google.common.io.MoreFiles.listFiles(p0);
}
/**
*{@link com.google.common.collect.ImmutableList#of(E,E,E)}
*@see com.google.common.collect.ImmutableList#of(E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E,E)
*of(E p0,E p1,E p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2){
	return com.google.common.collect.ImmutableList.of(p0,p1,p2);
}
/**
*{@link com.google.common.collect.ImmutableList#of(E,E,E,E)}
*@see com.google.common.collect.ImmutableList#of(E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E,E,E)
*of(E p0,E p1,E p2,E p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3){
	return com.google.common.collect.ImmutableList.of(p0,p1,p2,p3);
}
/**
*{@link com.google.common.collect.ImmutableList#of(E,E,E,E,E,E)}
*@see com.google.common.collect.ImmutableList#of(E,E,E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E,E,E,E,E)
*of(E p0,E p1,E p2,E p3,E p4,E p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5){
	return com.google.common.collect.ImmutableList.of(p0,p1,p2,p3,p4,p5);
}
/**
*{@link com.google.common.collect.ImmutableList#of(E,E,E,E,E)}
*@see com.google.common.collect.ImmutableList#of(E,E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E,E,E,E)
*of(E p0,E p1,E p2,E p3,E p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4){
	return com.google.common.collect.ImmutableList.of(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.collect.ImmutableList#of()}
*@see com.google.common.collect.ImmutableList#of()
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of()
*of()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(){
	return com.google.common.collect.ImmutableList.of();
}
/**
*{@link com.google.common.collect.ImmutableList#of(E,E)}
*@see com.google.common.collect.ImmutableList#of(E,E)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E)
*of(E p0,E p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1){
	return com.google.common.collect.ImmutableList.of(p0,p1);
}
/**
*{@link com.google.common.collect.ImmutableList#of(E)}
*@see com.google.common.collect.ImmutableList#of(E)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E)
*of(E p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0){
	return com.google.common.collect.ImmutableList.of(p0);
}
/**
*{@link com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E,E,E,E,E)}
*@see com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E,E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E,E,E,E,E,E,E,E,E,E)
*of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9,E p10)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9,E p10){
	return com.google.common.collect.ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
}
/**
*{@link com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E,E,E,E)}
*@see com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E,E,E,E,E,E,E,E,E)
*of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9){
	return com.google.common.collect.ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
}
/**
*{@link com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E,E,E,E,E,E,E...)}
*@see com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E,E,E,E,E,E,E...)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E,E,E,E,E,E,E,E,E,E,E,E...)
*of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9,E p10,E p11,E... p12)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8,E p9,E p10,E p11,E... p12){
	return com.google.common.collect.ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12);
}
/**
*{@link com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E,E,E)}
*@see com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E,E,E,E,E,E,E,E)
*of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7,E p8){
	return com.google.common.collect.ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7,p8);
}
/**
*{@link com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E,E)}
*@see com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E,E,E,E,E,E,E)
*of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6,E p7){
	return com.google.common.collect.ImmutableList.of(p0,p1,p2,p3,p4,p5,p6,p7);
}
/**
*{@link com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E)}
*@see com.google.common.collect.ImmutableList#of(E,E,E,E,E,E,E)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.of(E,E,E,E,E,E,E)
*of(E p0,E p1,E p2,E p3,E p4,E p5,E p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> of(E p0,E p1,E p2,E p3,E p4,E p5,E p6){
	return com.google.common.collect.ImmutableList.of(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link com.google.common.collect.ImmutableList#sortedCopyOf(java.lang.Iterable<? extends E>)}
*@see com.google.common.collect.ImmutableList#sortedCopyOf(java.lang.Iterable<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.sortedCopyOf(java.lang.Iterable<? extends E>)
*sortedCopyOf(java.lang.Iterable<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Comparable<? super E> > com.google.common.collect.ImmutableList<E> sortedCopyOf(java.lang.Iterable<? extends E> p0){
	return com.google.common.collect.ImmutableList.sortedCopyOf(p0);
}
/**
*{@link com.google.common.collect.ImmutableList#sortedCopyOf(java.util.Comparator<? super E>,java.lang.Iterable<? extends E>)}
*@see com.google.common.collect.ImmutableList#sortedCopyOf(java.util.Comparator<? super E>,java.lang.Iterable<? extends E>)
*<code>public static <E> com.google.common.collect.ImmutableList<E> com.google.common.collect.ImmutableList.sortedCopyOf(java.util.Comparator<? super E>,java.lang.Iterable<? extends E>)
*sortedCopyOf(java.util.Comparator<? super E> p0,java.lang.Iterable<? extends E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> com.google.common.collect.ImmutableList<E> sortedCopyOf(java.util.Comparator<? super E> p0,java.lang.Iterable<? extends E> p1){
	return com.google.common.collect.ImmutableList.sortedCopyOf(p0,p1);
}
}
