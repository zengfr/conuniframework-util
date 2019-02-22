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
public final class StreamUtil{ 
/**
*{@link com.google.common.collect.Streams#concat(java.util.stream.Stream<? extends T>...)}
*@see com.google.common.collect.Streams#concat(java.util.stream.Stream<? extends T>...)
*<code>public static <T> java.util.stream.Stream<T> com.google.common.collect.Streams.concat(java.util.stream.Stream<? extends T>...)
*concat(java.util.stream.Stream<? extends T>... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.stream.Stream<T> concat(java.util.stream.Stream<? extends T>... p0){
	return com.google.common.collect.Streams.concat(p0);
}
/**
*{@link com.google.common.collect.Streams#mapWithIndex(java.util.stream.Stream<T>,com.google.common.collect.Streams$FunctionWithIndex<? super T, ? extends R>)}
*@see com.google.common.collect.Streams#mapWithIndex(java.util.stream.Stream<T>,com.google.common.collect.Streams$FunctionWithIndex<? super T, ? extends R>)
*<code>public static <T,R> java.util.stream.Stream<R> com.google.common.collect.Streams.mapWithIndex(java.util.stream.Stream<T>,com.google.common.collect.Streams$FunctionWithIndex<? super T, ? extends R>)
*mapWithIndex(java.util.stream.Stream<T> p0,com.google.common.collect.Streams$FunctionWithIndex<? super T, ? extends R> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T,R> java.util.stream.Stream<R> mapWithIndex(java.util.stream.Stream<T> p0,com.google.common.collect.Streams.FunctionWithIndex<? super T, ? extends R> p1){
	return com.google.common.collect.Streams.mapWithIndex(p0,p1);
}
/**
*{@link com.google.common.collect.Streams#mapWithIndex(java.util.stream.IntStream,com.google.common.collect.Streams$IntFunctionWithIndex<R>)}
*@see com.google.common.collect.Streams#mapWithIndex(java.util.stream.IntStream,com.google.common.collect.Streams$IntFunctionWithIndex<R>)
*<code>public static <R> java.util.stream.Stream<R> com.google.common.collect.Streams.mapWithIndex(java.util.stream.IntStream,com.google.common.collect.Streams$IntFunctionWithIndex<R>)
*mapWithIndex(java.util.stream.IntStream p0,com.google.common.collect.Streams$IntFunctionWithIndex<R> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <R> java.util.stream.Stream<R> mapWithIndex(java.util.stream.IntStream p0,com.google.common.collect.Streams.IntFunctionWithIndex<R> p1){
	return com.google.common.collect.Streams.mapWithIndex(p0,p1);
}
/**
*{@link com.google.common.collect.Streams#mapWithIndex(java.util.stream.LongStream,com.google.common.collect.Streams$LongFunctionWithIndex<R>)}
*@see com.google.common.collect.Streams#mapWithIndex(java.util.stream.LongStream,com.google.common.collect.Streams$LongFunctionWithIndex<R>)
*<code>public static <R> java.util.stream.Stream<R> com.google.common.collect.Streams.mapWithIndex(java.util.stream.LongStream,com.google.common.collect.Streams$LongFunctionWithIndex<R>)
*mapWithIndex(java.util.stream.LongStream p0,com.google.common.collect.Streams$LongFunctionWithIndex<R> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <R> java.util.stream.Stream<R> mapWithIndex(java.util.stream.LongStream p0,com.google.common.collect.Streams.LongFunctionWithIndex<R> p1){
	return com.google.common.collect.Streams.mapWithIndex(p0,p1);
}
/**
*{@link com.google.common.collect.Streams#mapWithIndex(java.util.stream.DoubleStream,com.google.common.collect.Streams$DoubleFunctionWithIndex<R>)}
*@see com.google.common.collect.Streams#mapWithIndex(java.util.stream.DoubleStream,com.google.common.collect.Streams$DoubleFunctionWithIndex<R>)
*<code>public static <R> java.util.stream.Stream<R> com.google.common.collect.Streams.mapWithIndex(java.util.stream.DoubleStream,com.google.common.collect.Streams$DoubleFunctionWithIndex<R>)
*mapWithIndex(java.util.stream.DoubleStream p0,com.google.common.collect.Streams$DoubleFunctionWithIndex<R> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <R> java.util.stream.Stream<R> mapWithIndex(java.util.stream.DoubleStream p0,com.google.common.collect.Streams.DoubleFunctionWithIndex<R> p1){
	return com.google.common.collect.Streams.mapWithIndex(p0,p1);
}
/**
*{@link com.google.common.collect.Streams#stream(java.lang.Iterable<T>)}
*@see com.google.common.collect.Streams#stream(java.lang.Iterable<T>)
*<code>public static <T> java.util.stream.Stream<T> com.google.common.collect.Streams.stream(java.lang.Iterable<T>)
*stream(java.lang.Iterable<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.stream.Stream<T> stream(java.lang.Iterable<T> p0){
	return com.google.common.collect.Streams.stream(p0);
}
/**
*{@link com.google.common.collect.Streams#stream(java.util.Collection<T>)}
*@see com.google.common.collect.Streams#stream(java.util.Collection<T>)
*<code>public static <T> java.util.stream.Stream<T> com.google.common.collect.Streams.stream(java.util.Collection<T>)
*stream(java.util.Collection<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.stream.Stream<T> stream(java.util.Collection<T> p0){
	return com.google.common.collect.Streams.stream(p0);
}
/**
*{@link com.google.common.collect.Streams#stream(java.util.Iterator<T>)}
*@see com.google.common.collect.Streams#stream(java.util.Iterator<T>)
*<code>public static <T> java.util.stream.Stream<T> com.google.common.collect.Streams.stream(java.util.Iterator<T>)
*stream(java.util.Iterator<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.stream.Stream<T> stream(java.util.Iterator<T> p0){
	return com.google.common.collect.Streams.stream(p0);
}
/**
*{@link com.google.common.collect.Streams#stream(com.google.common.base.Optional<T>)}
*@see com.google.common.collect.Streams#stream(com.google.common.base.Optional<T>)
*<code>public static <T> java.util.stream.Stream<T> com.google.common.collect.Streams.stream(com.google.common.base.Optional<T>)
*stream(com.google.common.base.Optional<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.stream.Stream<T> stream(com.google.common.base.Optional<T> p0){
	return com.google.common.collect.Streams.stream(p0);
}
/**
*{@link com.google.common.collect.Streams#stream(java.util.Optional<T>)}
*@see com.google.common.collect.Streams#stream(java.util.Optional<T>)
*<code>public static <T> java.util.stream.Stream<T> com.google.common.collect.Streams.stream(java.util.Optional<T>)
*stream(java.util.Optional<T> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.util.stream.Stream<T> stream(java.util.Optional<T> p0){
	return com.google.common.collect.Streams.stream(p0);
}
/**
*{@link com.google.common.collect.Streams#zip(java.util.stream.Stream<A>,java.util.stream.Stream<B>,java.util.function.BiFunction<? super A, ? super B, R>)}
*@see com.google.common.collect.Streams#zip(java.util.stream.Stream<A>,java.util.stream.Stream<B>,java.util.function.BiFunction<? super A, ? super B, R>)
*<code>public static <A,B,R> java.util.stream.Stream<R> com.google.common.collect.Streams.zip(java.util.stream.Stream<A>,java.util.stream.Stream<B>,java.util.function.BiFunction<? super A, ? super B, R>)
*zip(java.util.stream.Stream<A> p0,java.util.stream.Stream<B> p1,java.util.function.BiFunction<? super A, ? super B, R> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <A,B,R> java.util.stream.Stream<R> zip(java.util.stream.Stream<A> p0,java.util.stream.Stream<B> p1,java.util.function.BiFunction<? super A, ? super B, R> p2){
	return com.google.common.collect.Streams.zip(p0,p1,p2);
}
}
