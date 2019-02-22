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
public final class RangeUtil{ 
/**
*{@link com.google.common.collect.Range#all()}
*@see com.google.common.collect.Range#all()
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.all()
*all()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> all(){
	return com.google.common.collect.Range.all();
}
/**
*{@link com.google.common.collect.Range#atLeast(C)}
*@see com.google.common.collect.Range#atLeast(C)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.atLeast(C)
*atLeast(C p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> atLeast(C p0){
	return com.google.common.collect.Range.atLeast(p0);
}
/**
*{@link com.google.common.collect.Range#atMost(C)}
*@see com.google.common.collect.Range#atMost(C)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.atMost(C)
*atMost(C p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> atMost(C p0){
	return com.google.common.collect.Range.atMost(p0);
}
/**
*{@link org.apache.commons.lang3.Range#between(T,T)}
*@see org.apache.commons.lang3.Range#between(T,T)
*<code>public static <T> org.apache.commons.lang3.Range<T> org.apache.commons.lang3.Range.between(T,T)
*between(T p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Comparable<T> > org.apache.commons.lang3.Range<T> between(T p0,T p1){
	return org.apache.commons.lang3.Range.between(p0,p1);
}
/**
*{@link org.apache.commons.lang3.Range#between(T,T,java.util.Comparator<T>)}
*@see org.apache.commons.lang3.Range#between(T,T,java.util.Comparator<T>)
*<code>public static <T> org.apache.commons.lang3.Range<T> org.apache.commons.lang3.Range.between(T,T,java.util.Comparator<T>)
*between(T p0,T p1,java.util.Comparator<T> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.lang3.Range<T> between(T p0,T p1,java.util.Comparator<T> p2){
	return org.apache.commons.lang3.Range.between(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Range#closed(C,C)}
*@see com.google.common.collect.Range#closed(C,C)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.closed(C,C)
*closed(C p0,C p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> closed(C p0,C p1){
	return com.google.common.collect.Range.closed(p0,p1);
}
/**
*{@link com.google.common.collect.Range#closedOpen(C,C)}
*@see com.google.common.collect.Range#closedOpen(C,C)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.closedOpen(C,C)
*closedOpen(C p0,C p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> closedOpen(C p0,C p1){
	return com.google.common.collect.Range.closedOpen(p0,p1);
}
/**
*{@link com.google.common.collect.Range#downTo(C,com.google.common.collect.BoundType)}
*@see com.google.common.collect.Range#downTo(C,com.google.common.collect.BoundType)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.downTo(C,com.google.common.collect.BoundType)
*downTo(C p0,com.google.common.collect.BoundType p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> downTo(C p0,com.google.common.collect.BoundType p1){
	return com.google.common.collect.Range.downTo(p0,p1);
}
/**
*{@link com.google.common.collect.Range#encloseAll(java.lang.Iterable<C>)}
*@see com.google.common.collect.Range#encloseAll(java.lang.Iterable<C>)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.encloseAll(java.lang.Iterable<C>)
*encloseAll(java.lang.Iterable<C> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> encloseAll(java.lang.Iterable<C> p0){
	return com.google.common.collect.Range.encloseAll(p0);
}
/**
*{@link com.google.common.collect.Range#greaterThan(C)}
*@see com.google.common.collect.Range#greaterThan(C)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.greaterThan(C)
*greaterThan(C p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> greaterThan(C p0){
	return com.google.common.collect.Range.greaterThan(p0);
}
/**
*{@link org.apache.commons.lang3.Range#is(T)}
*@see org.apache.commons.lang3.Range#is(T)
*<code>public static <T> org.apache.commons.lang3.Range<T> org.apache.commons.lang3.Range.is(T)
*is(T p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Comparable<T> > org.apache.commons.lang3.Range<T> is(T p0){
	return org.apache.commons.lang3.Range.is(p0);
}
/**
*{@link org.apache.commons.lang3.Range#is(T,java.util.Comparator<T>)}
*@see org.apache.commons.lang3.Range#is(T,java.util.Comparator<T>)
*<code>public static <T> org.apache.commons.lang3.Range<T> org.apache.commons.lang3.Range.is(T,java.util.Comparator<T>)
*is(T p0,java.util.Comparator<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> org.apache.commons.lang3.Range<T> is(T p0,java.util.Comparator<T> p1){
	return org.apache.commons.lang3.Range.is(p0,p1);
}
/**
*{@link com.google.common.collect.Range#lessThan(C)}
*@see com.google.common.collect.Range#lessThan(C)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.lessThan(C)
*lessThan(C p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> lessThan(C p0){
	return com.google.common.collect.Range.lessThan(p0);
}
/**
*{@link com.google.common.collect.Range#open(C,C)}
*@see com.google.common.collect.Range#open(C,C)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.open(C,C)
*open(C p0,C p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> open(C p0,C p1){
	return com.google.common.collect.Range.open(p0,p1);
}
/**
*{@link com.google.common.collect.Range#openClosed(C,C)}
*@see com.google.common.collect.Range#openClosed(C,C)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.openClosed(C,C)
*openClosed(C p0,C p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> openClosed(C p0,C p1){
	return com.google.common.collect.Range.openClosed(p0,p1);
}
/**
*{@link com.google.common.collect.Range#range(C,com.google.common.collect.BoundType,C,com.google.common.collect.BoundType)}
*@see com.google.common.collect.Range#range(C,com.google.common.collect.BoundType,C,com.google.common.collect.BoundType)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.range(C,com.google.common.collect.BoundType,C,com.google.common.collect.BoundType)
*range(C p0,com.google.common.collect.BoundType p1,C p2,com.google.common.collect.BoundType p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> range(C p0,com.google.common.collect.BoundType p1,C p2,com.google.common.collect.BoundType p3){
	return com.google.common.collect.Range.range(p0,p1,p2,p3);
}
/**
*{@link com.google.common.collect.Range#singleton(C)}
*@see com.google.common.collect.Range#singleton(C)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.singleton(C)
*singleton(C p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> singleton(C p0){
	return com.google.common.collect.Range.singleton(p0);
}
/**
*{@link com.google.common.collect.Range#upTo(C,com.google.common.collect.BoundType)}
*@see com.google.common.collect.Range#upTo(C,com.google.common.collect.BoundType)
*<code>public static <C> com.google.common.collect.Range<C> com.google.common.collect.Range.upTo(C,com.google.common.collect.BoundType)
*upTo(C p0,com.google.common.collect.BoundType p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> upTo(C p0,com.google.common.collect.BoundType p1){
	return com.google.common.collect.Range.upTo(p0,p1);
}
}
