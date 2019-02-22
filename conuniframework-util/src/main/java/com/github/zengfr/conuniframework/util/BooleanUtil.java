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
public final class BooleanUtil{ 
/**
*{@link org.apache.commons.lang3.ObjectUtils#CONST(boolean)}
*@see org.apache.commons.lang3.ObjectUtils#CONST(boolean)
*<code>public static boolean org.apache.commons.lang3.ObjectUtils.CONST(boolean)
*CONST(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean CONST(boolean p0){
	return org.apache.commons.lang3.ObjectUtils.CONST(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#add(boolean[],int,boolean)}
*@see org.apache.commons.lang3.ArrayUtils#add(boolean[],int,boolean)
*<code>public static boolean[] org.apache.commons.lang3.ArrayUtils.add(boolean[],int,boolean)
*add(boolean[] p0,int p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean[] add(boolean[] p0,int p1,boolean p2){
	return org.apache.commons.lang3.ArrayUtils.add(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#add(boolean[],boolean)}
*@see org.apache.commons.lang3.ArrayUtils#add(boolean[],boolean)
*<code>public static boolean[] org.apache.commons.lang3.ArrayUtils.add(boolean[],boolean)
*add(boolean[] p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean[] add(boolean[] p0,boolean p1){
	return org.apache.commons.lang3.ArrayUtils.add(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#addAll(java.util.Collection<C>,java.lang.Iterable<? extends C>)}
*@see org.apache.commons.collections4.CollectionUtils#addAll(java.util.Collection<C>,java.lang.Iterable<? extends C>)
*<code>public static <C> boolean org.apache.commons.collections4.CollectionUtils.addAll(java.util.Collection<C>,java.lang.Iterable<? extends C>)
*addAll(java.util.Collection<C> p0,java.lang.Iterable<? extends C> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C> boolean addAll(java.util.Collection<C> p0,java.lang.Iterable<? extends C> p1){
	return org.apache.commons.collections4.CollectionUtils.addAll(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#addAll(java.util.Collection<C>,java.util.Iterator<? extends C>)}
*@see org.apache.commons.collections4.CollectionUtils#addAll(java.util.Collection<C>,java.util.Iterator<? extends C>)
*<code>public static <C> boolean org.apache.commons.collections4.CollectionUtils.addAll(java.util.Collection<C>,java.util.Iterator<? extends C>)
*addAll(java.util.Collection<C> p0,java.util.Iterator<? extends C> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C> boolean addAll(java.util.Collection<C> p0,java.util.Iterator<? extends C> p1){
	return org.apache.commons.collections4.CollectionUtils.addAll(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#addAll(java.util.Collection<C>,java.util.Enumeration<? extends C>)}
*@see org.apache.commons.collections4.CollectionUtils#addAll(java.util.Collection<C>,java.util.Enumeration<? extends C>)
*<code>public static <C> boolean org.apache.commons.collections4.CollectionUtils.addAll(java.util.Collection<C>,java.util.Enumeration<? extends C>)
*addAll(java.util.Collection<C> p0,java.util.Enumeration<? extends C> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C> boolean addAll(java.util.Collection<C> p0,java.util.Enumeration<? extends C> p1){
	return org.apache.commons.collections4.CollectionUtils.addAll(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#addAll(java.util.Collection<C>,C...)}
*@see org.apache.commons.collections4.CollectionUtils#addAll(java.util.Collection<C>,C...)
*<code>public static <C> boolean org.apache.commons.collections4.CollectionUtils.addAll(java.util.Collection<C>,C...)
*addAll(java.util.Collection<C> p0,C... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C> boolean addAll(java.util.Collection<C> p0,C... p1){
	return org.apache.commons.collections4.CollectionUtils.addAll(p0,p1);
}
/**
*{@link com.google.common.collect.Iterables#addAll(java.util.Collection<T>,java.lang.Iterable<? extends T>)}
*@see com.google.common.collect.Iterables#addAll(java.util.Collection<T>,java.lang.Iterable<? extends T>)
*<code>public static <T> boolean com.google.common.collect.Iterables.addAll(java.util.Collection<T>,java.lang.Iterable<? extends T>)
*addAll(java.util.Collection<T> p0,java.lang.Iterable<? extends T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean addAll(java.util.Collection<T> p0,java.lang.Iterable<? extends T> p1){
	return com.google.common.collect.Iterables.addAll(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#addAll(java.util.Collection<T>,java.util.Iterator<? extends T>)}
*@see com.google.common.collect.Iterators#addAll(java.util.Collection<T>,java.util.Iterator<? extends T>)
*<code>public static <T> boolean com.google.common.collect.Iterators.addAll(java.util.Collection<T>,java.util.Iterator<? extends T>)
*addAll(java.util.Collection<T> p0,java.util.Iterator<? extends T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean addAll(java.util.Collection<T> p0,java.util.Iterator<? extends T> p1){
	return com.google.common.collect.Iterators.addAll(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#addIgnoreNull(java.util.Collection<T>,T)}
*@see org.apache.commons.collections4.CollectionUtils#addIgnoreNull(java.util.Collection<T>,T)
*<code>public static <T> boolean org.apache.commons.collections4.CollectionUtils.addIgnoreNull(java.util.Collection<T>,T)
*addIgnoreNull(java.util.Collection<T> p0,T p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean addIgnoreNull(java.util.Collection<T> p0,T p1){
	return org.apache.commons.collections4.CollectionUtils.addIgnoreNull(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#addIgnoreNull(java.util.Collection,java.lang.Object)}
*@see org.apache.commons.collections.CollectionUtils#addIgnoreNull(java.util.Collection,java.lang.Object)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.addIgnoreNull(java.util.Collection,java.lang.Object)
*addIgnoreNull(java.util.Collection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean addIgnoreNull(java.util.Collection p0,java.lang.Object p1){
	return org.apache.commons.collections.CollectionUtils.addIgnoreNull(p0,p1);
}
/**
*{@link org.apache.commons.io.filefilter.FileFilterUtils#ageFileFilter(long,boolean)}
*@see org.apache.commons.io.filefilter.FileFilterUtils#ageFileFilter(long,boolean)
*<code>public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(long,boolean)
*ageFileFilter(long p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(long p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0,p1);
}
/**
*{@link org.apache.commons.io.filefilter.FileFilterUtils#ageFileFilter(java.io.File,boolean)}
*@see org.apache.commons.io.filefilter.FileFilterUtils#ageFileFilter(java.io.File,boolean)
*<code>public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.io.File,boolean)
*ageFileFilter(java.io.File p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0,p1);
}
/**
*{@link org.apache.commons.io.filefilter.FileFilterUtils#ageFileFilter(java.util.Date,boolean)}
*@see org.apache.commons.io.filefilter.FileFilterUtils#ageFileFilter(java.util.Date,boolean)
*<code>public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.util.Date,boolean)
*ageFileFilter(java.util.Date p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.util.Date p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(p0,p1);
}
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
*{@link it.unimi.dsi.fastutil.longs.LongIterators#all(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#all(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.longs.LongIterators.all(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*all(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean all(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.all(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectIterators#all(it.unimi.dsi.fastutil.objects.ObjectIterator<K>,java.util.function.Predicate<? super K>)}
*@see it.unimi.dsi.fastutil.objects.ObjectIterators#all(it.unimi.dsi.fastutil.objects.ObjectIterator<K>,java.util.function.Predicate<? super K>)
*<code>public static <K> boolean it.unimi.dsi.fastutil.objects.ObjectIterators.all(it.unimi.dsi.fastutil.objects.ObjectIterator<K>,java.util.function.Predicate<? super K>)
*all(it.unimi.dsi.fastutil.objects.ObjectIterator<K> p0,java.util.function.Predicate<? super K> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> boolean all(it.unimi.dsi.fastutil.objects.ObjectIterator<K> p0,java.util.function.Predicate<? super K> p1){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.all(p0,p1);
}
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
*{@link com.google.common.collect.Iterables#all(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.collect.Iterables#all(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> boolean com.google.common.collect.Iterables.all(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*all(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean all(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterables.all(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#all(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.collect.Iterators#all(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> boolean com.google.common.collect.Iterators.all(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*all(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean all(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterators.all(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#allNotNull(java.lang.Object...)}
*@see org.apache.commons.lang3.ObjectUtils#allNotNull(java.lang.Object...)
*<code>public static boolean org.apache.commons.lang3.ObjectUtils.allNotNull(java.lang.Object...)
*allNotNull(java.lang.Object... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean allNotNull(java.lang.Object... p0){
	return org.apache.commons.lang3.ObjectUtils.allNotNull(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#and(java.lang.Boolean...)}
*@see org.apache.commons.lang3.BooleanUtils#and(java.lang.Boolean...)
*<code>public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.and(java.lang.Boolean...)
*and(java.lang.Boolean... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean and(java.lang.Boolean... p0){
	return org.apache.commons.lang3.BooleanUtils.and(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#and(boolean...)}
*@see org.apache.commons.lang3.BooleanUtils#and(boolean...)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.and(boolean...)
*and(boolean... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean and(boolean... p0){
	return org.apache.commons.lang3.BooleanUtils.and(p0);
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
*{@link it.unimi.dsi.fastutil.longs.LongIterators#any(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#any(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*<code>public static boolean it.unimi.dsi.fastutil.longs.LongIterators.any(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*any(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean any(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.any(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectIterators#any(it.unimi.dsi.fastutil.objects.ObjectIterator<K>,java.util.function.Predicate<? super K>)}
*@see it.unimi.dsi.fastutil.objects.ObjectIterators#any(it.unimi.dsi.fastutil.objects.ObjectIterator<K>,java.util.function.Predicate<? super K>)
*<code>public static <K> boolean it.unimi.dsi.fastutil.objects.ObjectIterators.any(it.unimi.dsi.fastutil.objects.ObjectIterator<K>,java.util.function.Predicate<? super K>)
*any(it.unimi.dsi.fastutil.objects.ObjectIterator<K> p0,java.util.function.Predicate<? super K> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> boolean any(it.unimi.dsi.fastutil.objects.ObjectIterator<K> p0,java.util.function.Predicate<? super K> p1){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.any(p0,p1);
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
*{@link com.google.common.collect.Iterables#any(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.collect.Iterables#any(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> boolean com.google.common.collect.Iterables.any(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*any(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean any(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterables.any(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#any(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.collect.Iterators#any(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> boolean com.google.common.collect.Iterators.any(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*any(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean any(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterators.any(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#anyNotNull(java.lang.Object...)}
*@see org.apache.commons.lang3.ObjectUtils#anyNotNull(java.lang.Object...)
*<code>public static boolean org.apache.commons.lang3.ObjectUtils.anyNotNull(java.lang.Object...)
*anyNotNull(java.lang.Object... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean anyNotNull(java.lang.Object... p0){
	return org.apache.commons.lang3.ObjectUtils.anyNotNull(p0);
}
/**
*{@link com.google.common.util.concurrent.Uninterruptibles#awaitUninterruptibly(java.util.concurrent.CountDownLatch,long,java.util.concurrent.TimeUnit)}
*@see com.google.common.util.concurrent.Uninterruptibles#awaitUninterruptibly(java.util.concurrent.CountDownLatch,long,java.util.concurrent.TimeUnit)
*<code>public static boolean com.google.common.util.concurrent.Uninterruptibles.awaitUninterruptibly(java.util.concurrent.CountDownLatch,long,java.util.concurrent.TimeUnit)
*awaitUninterruptibly(java.util.concurrent.CountDownLatch p0,long p1,java.util.concurrent.TimeUnit p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.Uninterruptibles.awaitUninterruptibly(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.ComparatorUtils#booleanComparator(boolean)}
*@see org.apache.commons.collections4.ComparatorUtils#booleanComparator(boolean)
*<code>public static java.util.Comparator<java.lang.Boolean> org.apache.commons.collections4.ComparatorUtils.booleanComparator(boolean)
*booleanComparator(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Comparator<java.lang.Boolean> booleanComparator(boolean p0){
	return org.apache.commons.collections4.ComparatorUtils.booleanComparator(p0);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.Reader,boolean,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.Reader,boolean,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(java.io.Reader,boolean,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(java.io.Reader p0,boolean p1,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(java.io.Reader p0,boolean p1,org.codehaus.plexus.util.xml.Xpp3DomBuilder.InputLocationBuilder p2) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.Reader,boolean)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.Reader,boolean)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(java.io.Reader,boolean) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(java.io.Reader p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(java.io.Reader p0,boolean p1) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(org.codehaus.plexus.util.xml.pull.XmlPullParser,boolean)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(org.codehaus.plexus.util.xml.pull.XmlPullParser,boolean)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(org.codehaus.plexus.util.xml.pull.XmlPullParser,boolean) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(org.codehaus.plexus.util.xml.pull.XmlPullParser p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(org.codehaus.plexus.util.xml.pull.XmlPullParser p0,boolean p1) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(org.codehaus.plexus.util.xml.pull.XmlPullParser,boolean,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(org.codehaus.plexus.util.xml.pull.XmlPullParser,boolean,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(org.codehaus.plexus.util.xml.pull.XmlPullParser,boolean,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(org.codehaus.plexus.util.xml.pull.XmlPullParser p0,boolean p1,org.codehaus.plexus.util.xml.Xpp3DomBuilder$InputLocationBuilder p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(org.codehaus.plexus.util.xml.pull.XmlPullParser p0,boolean p1,org.codehaus.plexus.util.xml.Xpp3DomBuilder.InputLocationBuilder p2) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.InputStream,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.xml.Xpp3DomBuilder#build(java.io.InputStream,java.lang.String,boolean)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(java.io.InputStream,java.lang.String,boolean) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException
*build(java.io.InputStream p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom build(java.io.InputStream p0,java.lang.String p1,boolean p2) throws org.codehaus.plexus.util.xml.pull.XmlPullParserException,java.io.IOException{
	return org.codehaus.plexus.util.xml.Xpp3DomBuilder.build(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,char,int)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,char,int)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,char,int)
*checkArgument(boolean p0,java.lang.String p1,char p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,char p2,int p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,char,char)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,char,char)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,char,char)
*checkArgument(boolean p0,java.lang.String p1,char p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,char p2,char p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean)}
*@see com.google.common.base.Preconditions#checkArgument(boolean)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean)
*checkArgument(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0){
	 com.google.common.base.Preconditions.checkArgument(p0);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,char,long)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,char,long)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,char,long)
*checkArgument(boolean p0,java.lang.String p1,char p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,char p2,long p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.Object)
*checkArgument(boolean p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.Object p1){
	 com.google.common.base.Preconditions.checkArgument(p0,p1);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object...)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object...)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object...)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object... p2){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,char)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,char)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,char)
*checkArgument(boolean p0,java.lang.String p1,char p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,char p2){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,int)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,int)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,int)
*checkArgument(boolean p0,java.lang.String p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,int p2){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,long)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,long)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,long)
*checkArgument(boolean p0,java.lang.String p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,long p2){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4,java.lang.Object p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4,java.lang.Object p5){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3,p4,p5);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,char)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,char)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object,char)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,char p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,long,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,long,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,long,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,long p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,long p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,long,long)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,long,long)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,long,long)
*checkArgument(boolean p0,java.lang.String p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,long p2,long p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,long)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,long)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object,long)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,long p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,int)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,int)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object,int)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,int p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,int,long)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,int,long)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,int,long)
*checkArgument(boolean p0,java.lang.String p1,int p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,int p2,long p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,int,int)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,int,int)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,int,int)
*checkArgument(boolean p0,java.lang.String p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,int p2,int p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,int,char)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,int,char)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,int,char)
*checkArgument(boolean p0,java.lang.String p1,int p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,int p2,char p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,char,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,char,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,char,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,char p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,char p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,long,int)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,long,int)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,long,int)
*checkArgument(boolean p0,java.lang.String p1,long p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,long p2,int p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,long,char)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,long,char)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,long,char)
*checkArgument(boolean p0,java.lang.String p1,long p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,long p2,char p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,int,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkArgument(boolean,java.lang.String,int,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkArgument(boolean,java.lang.String,int,java.lang.Object)
*checkArgument(boolean p0,java.lang.String p1,int p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkArgument(boolean p0,java.lang.String p1,int p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkArgument(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#checkEqualLength(int[],int[],boolean)}
*@see org.apache.commons.math3.util.MathArrays#checkEqualLength(int[],int[],boolean)
*<code>public static boolean org.apache.commons.math3.util.MathArrays.checkEqualLength(int[],int[],boolean)
*checkEqualLength(int[] p0,int[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean checkEqualLength(int[] p0,int[] p1,boolean p2){
	return org.apache.commons.math3.util.MathArrays.checkEqualLength(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#checkEqualLength(double[],double[],boolean)}
*@see org.apache.commons.math3.util.MathArrays#checkEqualLength(double[],double[],boolean)
*<code>public static boolean org.apache.commons.math3.util.MathArrays.checkEqualLength(double[],double[],boolean)
*checkEqualLength(double[] p0,double[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean checkEqualLength(double[] p0,double[] p1,boolean p2){
	return org.apache.commons.math3.util.MathArrays.checkEqualLength(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean,boolean)}
*@see org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean,boolean)
*<code>public static boolean org.apache.commons.math3.util.MathArrays.checkOrder(double[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean,boolean) throws org.apache.commons.math3.exception.NonMonotonicSequenceException
*checkOrder(double[] p0,org.apache.commons.math3.util.MathArrays$OrderDirection p1,boolean p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean checkOrder(double[] p0,org.apache.commons.math3.util.MathArrays.OrderDirection p1,boolean p2,boolean p3) throws org.apache.commons.math3.exception.NonMonotonicSequenceException{
	return org.apache.commons.math3.util.MathArrays.checkOrder(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)}
*@see org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)
*<code>public static void org.apache.commons.math3.util.MathArrays.checkOrder(double[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean) throws org.apache.commons.math3.exception.NonMonotonicSequenceException
*checkOrder(double[] p0,org.apache.commons.math3.util.MathArrays$OrderDirection p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkOrder(double[] p0,org.apache.commons.math3.util.MathArrays.OrderDirection p1,boolean p2) throws org.apache.commons.math3.exception.NonMonotonicSequenceException{
	 org.apache.commons.math3.util.MathArrays.checkOrder(p0,p1,p2);
}
/**
*{@link com.facebook.util.Validations#checkState(boolean,java.lang.Class<T>,java.lang.String,java.lang.Object...)}
*@see com.facebook.util.Validations#checkState(boolean,java.lang.Class<T>,java.lang.String,java.lang.Object...)
*<code>public static <T> void com.facebook.util.Validations.checkState(boolean,java.lang.Class<T>,java.lang.String,java.lang.Object...) throws T
*checkState(boolean p0,java.lang.Class<T> p1,java.lang.String p2,java.lang.Object... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Exception > void checkState(boolean p0,java.lang.Class<T> p1,java.lang.String p2,java.lang.Object... p3) throws T{
	 com.facebook.util.Validations.checkState(p0,p1,p2,p3);
}
/**
*{@link com.facebook.util.Validations#checkState(boolean,java.lang.Class<T>,java.lang.String)}
*@see com.facebook.util.Validations#checkState(boolean,java.lang.Class<T>,java.lang.String)
*<code>public static <T> void com.facebook.util.Validations.checkState(boolean,java.lang.Class<T>,java.lang.String) throws T
*checkState(boolean p0,java.lang.Class<T> p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Exception > void checkState(boolean p0,java.lang.Class<T> p1,java.lang.String p2) throws T{
	 com.facebook.util.Validations.checkState(p0,p1,p2);
}
/**
*{@link com.facebook.util.Validations#checkState(boolean,java.lang.Class<T>)}
*@see com.facebook.util.Validations#checkState(boolean,java.lang.Class<T>)
*<code>public static <T> void com.facebook.util.Validations.checkState(boolean,java.lang.Class<T>) throws T
*checkState(boolean p0,java.lang.Class<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Exception > void checkState(boolean p0,java.lang.Class<T> p1) throws T{
	 com.facebook.util.Validations.checkState(p0,p1);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,char,char)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,char,char)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,char,char)
*checkState(boolean p0,java.lang.String p1,char p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,char p2,char p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,char,int)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,char,int)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,char,int)
*checkState(boolean p0,java.lang.String p1,char p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,char p2,int p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,char,long)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,char,long)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,char,long)
*checkState(boolean p0,java.lang.String p1,char p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,char p2,long p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,char,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,char,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,char,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,char p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,char p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,int,char)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,int,char)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,int,char)
*checkState(boolean p0,java.lang.String p1,int p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,int p2,char p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean)}
*@see com.google.common.base.Preconditions#checkState(boolean)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean)
*checkState(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0){
	 com.google.common.base.Preconditions.checkState(p0);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.Object)
*checkState(boolean p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.Object p1){
	 com.google.common.base.Preconditions.checkState(p0,p1);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object...)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object...)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object...)
*checkState(boolean p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object... p2){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,char)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,char)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,char)
*checkState(boolean p0,java.lang.String p1,char p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,char p2){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,int)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,int)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,int)
*checkState(boolean p0,java.lang.String p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,int p2){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,long)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,long)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,long)
*checkState(boolean p0,java.lang.String p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,long p2){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,char)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,char)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object,char)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2,char p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,int)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,int)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object,int)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2,int p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,long)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,long)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object,long)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2,long p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,java.lang.Object,java.lang.Object,java.lang.Object,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4,java.lang.Object p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,java.lang.Object p2,java.lang.Object p3,java.lang.Object p4,java.lang.Object p5){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3,p4,p5);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,int,int)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,int,int)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,int,int)
*checkState(boolean p0,java.lang.String p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,int p2,int p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,int,long)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,int,long)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,int,long)
*checkState(boolean p0,java.lang.String p1,int p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,int p2,long p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,int,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,int,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,int,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,int p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,int p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,long,char)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,long,char)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,long,char)
*checkState(boolean p0,java.lang.String p1,long p2,char p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,long p2,char p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,long,int)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,long,int)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,long,int)
*checkState(boolean p0,java.lang.String p1,long p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,long p2,int p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,long,java.lang.Object)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,long,java.lang.Object)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,long,java.lang.Object)
*checkState(boolean p0,java.lang.String p1,long p2,java.lang.Object p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,long p2,java.lang.Object p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link com.google.common.base.Preconditions#checkState(boolean,java.lang.String,long,long)}
*@see com.google.common.base.Preconditions#checkState(boolean,java.lang.String,long,long)
*<code>public static void com.google.common.base.Preconditions.checkState(boolean,java.lang.String,long,long)
*checkState(boolean p0,java.lang.String p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void checkState(boolean p0,java.lang.String p1,long p2,long p3){
	 com.google.common.base.Preconditions.checkState(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#chiSquareTest(double[],long[],double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#chiSquareTest(double[],long[],double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(double[],long[],double) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*chiSquareTest(double[] p0,long[] p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean chiSquareTest(double[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#chiSquareTest(long[][],double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#chiSquareTest(long[][],double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(long[][],double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*chiSquareTest(long[][] p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean chiSquareTest(long[][] p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.chiSquareTest(p0,p1);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#chiSquareTestDataSetsComparison(long[],long[],double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#chiSquareTestDataSetsComparison(long[],long[],double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.chiSquareTestDataSetsComparison(long[],long[],double) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*chiSquareTestDataSetsComparison(long[] p0,long[] p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean chiSquareTestDataSetsComparison(long[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.chiSquareTestDataSetsComparison(p0,p1,p2);
}
/**
*{@link com.google.common.io.Closeables#close(java.io.Closeable,boolean)}
*@see com.google.common.io.Closeables#close(java.io.Closeable,boolean)
*<code>public static void com.google.common.io.Closeables.close(java.io.Closeable,boolean) throws java.io.IOException
*close(java.io.Closeable p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void close(java.io.Closeable p0,boolean p1) throws java.io.IOException{
	 com.google.common.io.Closeables.close(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,java.util.Comparator<? super O>,boolean)}
*@see org.apache.commons.collections4.CollectionUtils#collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,java.util.Comparator<? super O>,boolean)
*<code>public static <O> java.util.List<O> org.apache.commons.collections4.CollectionUtils.collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,java.util.Comparator<? super O>,boolean)
*collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,java.util.Comparator<? super O> p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O> java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,java.util.Comparator<? super O> p2,boolean p3){
	return org.apache.commons.collections4.CollectionUtils.collate(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,boolean)}
*@see org.apache.commons.collections4.CollectionUtils#collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,boolean)
*<code>public static <O> java.util.List<O> org.apache.commons.collections4.CollectionUtils.collate(java.lang.Iterable<? extends O>,java.lang.Iterable<? extends O>,boolean)
*collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O extends java.lang.Comparable<? super O> > java.util.List<O> collate(java.lang.Iterable<? extends O> p0,java.lang.Iterable<? extends O> p1,boolean p2){
	return org.apache.commons.collections4.CollectionUtils.collate(p0,p1,p2);
}
/**
*{@link com.google.common.primitives.Booleans#compare(boolean,boolean)}
*@see com.google.common.primitives.Booleans#compare(boolean,boolean)
*<code>public static int com.google.common.primitives.Booleans.compare(boolean,boolean)
*compare(boolean p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int compare(boolean p0,boolean p1){
	return com.google.common.primitives.Booleans.compare(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#compare(java.lang.String,java.lang.String,boolean)}
*@see org.apache.commons.lang3.StringUtils#compare(java.lang.String,java.lang.String,boolean)
*<code>public static int org.apache.commons.lang3.StringUtils.compare(java.lang.String,java.lang.String,boolean)
*compare(java.lang.String p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int compare(java.lang.String p0,java.lang.String p1,boolean p2){
	return org.apache.commons.lang3.StringUtils.compare(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#compare(T,T,boolean)}
*@see org.apache.commons.lang3.ObjectUtils#compare(T,T,boolean)
*<code>public static <T> int org.apache.commons.lang3.ObjectUtils.compare(T,T,boolean)
*compare(T p0,T p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Comparable<? super T> > int compare(T p0,T p1,boolean p2){
	return org.apache.commons.lang3.ObjectUtils.compare(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.StringUtils#compareIgnoreCase(java.lang.String,java.lang.String,boolean)}
*@see org.apache.commons.lang3.StringUtils#compareIgnoreCase(java.lang.String,java.lang.String,boolean)
*<code>public static int org.apache.commons.lang3.StringUtils.compareIgnoreCase(java.lang.String,java.lang.String,boolean)
*compareIgnoreCase(java.lang.String p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int compareIgnoreCase(java.lang.String p0,java.lang.String p1,boolean p2){
	return org.apache.commons.lang3.StringUtils.compareIgnoreCase(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#contains(java.util.Iterator<E>,java.lang.Object)}
*@see org.apache.commons.collections4.IteratorUtils#contains(java.util.Iterator<E>,java.lang.Object)
*<code>public static <E> boolean org.apache.commons.collections4.IteratorUtils.contains(java.util.Iterator<E>,java.lang.Object)
*contains(java.util.Iterator<E> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> boolean contains(java.util.Iterator<E> p0,java.lang.Object p1){
	return org.apache.commons.collections4.IteratorUtils.contains(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#contains(java.lang.Iterable<? extends E>,E,org.apache.commons.collections4.Equator<? super E>)}
*@see org.apache.commons.collections4.IterableUtils#contains(java.lang.Iterable<? extends E>,E,org.apache.commons.collections4.Equator<? super E>)
*<code>public static <E> boolean org.apache.commons.collections4.IterableUtils.contains(java.lang.Iterable<? extends E>,E,org.apache.commons.collections4.Equator<? super E>)
*contains(java.lang.Iterable<? extends E> p0,E p1,org.apache.commons.collections4.Equator<? super E> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> boolean contains(java.lang.Iterable<? extends E> p0,E p1,org.apache.commons.collections4.Equator<? super E> p2){
	return org.apache.commons.collections4.IterableUtils.contains(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#contains(java.lang.Iterable<E>,java.lang.Object)}
*@see org.apache.commons.collections4.IterableUtils#contains(java.lang.Iterable<E>,java.lang.Object)
*<code>public static <E> boolean org.apache.commons.collections4.IterableUtils.contains(java.lang.Iterable<E>,java.lang.Object)
*contains(java.lang.Iterable<E> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> boolean contains(java.lang.Iterable<E> p0,java.lang.Object p1){
	return org.apache.commons.collections4.IterableUtils.contains(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#contains(java.lang.String,java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#contains(java.lang.String,java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.contains(java.lang.String,java.lang.String)
*contains(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(java.lang.String p0,java.lang.String p1){
	return org.codehaus.plexus.util.StringUtils.contains(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#contains(java.lang.String,char)}
*@see org.codehaus.plexus.util.StringUtils#contains(java.lang.String,char)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.contains(java.lang.String,char)
*contains(java.lang.String p0,char p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(java.lang.String p0,char p1){
	return org.codehaus.plexus.util.StringUtils.contains(p0,p1);
}
/**
*{@link com.google.common.collect.Iterables#contains(java.lang.Iterable<?>,java.lang.Object)}
*@see com.google.common.collect.Iterables#contains(java.lang.Iterable<?>,java.lang.Object)
*<code>public static boolean com.google.common.collect.Iterables.contains(java.lang.Iterable<?>,java.lang.Object)
*contains(java.lang.Iterable<?> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(java.lang.Iterable<?> p0,java.lang.Object p1){
	return com.google.common.collect.Iterables.contains(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#contains(java.util.Iterator<?>,java.lang.Object)}
*@see com.google.common.collect.Iterators#contains(java.util.Iterator<?>,java.lang.Object)
*<code>public static boolean com.google.common.collect.Iterators.contains(java.util.Iterator<?>,java.lang.Object)
*contains(java.util.Iterator<?> p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(java.util.Iterator<?> p0,java.lang.Object p1){
	return com.google.common.collect.Iterators.contains(p0,p1);
}
/**
*{@link com.google.common.primitives.Booleans#contains(boolean[],boolean)}
*@see com.google.common.primitives.Booleans#contains(boolean[],boolean)
*<code>public static boolean com.google.common.primitives.Booleans.contains(boolean[],boolean)
*contains(boolean[] p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(boolean[] p0,boolean p1){
	return com.google.common.primitives.Booleans.contains(p0,p1);
}
/**
*{@link com.google.common.primitives.Bytes#contains(byte[],byte)}
*@see com.google.common.primitives.Bytes#contains(byte[],byte)
*<code>public static boolean com.google.common.primitives.Bytes.contains(byte[],byte)
*contains(byte[] p0,byte p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(byte[] p0,byte p1){
	return com.google.common.primitives.Bytes.contains(p0,p1);
}
/**
*{@link com.google.common.primitives.Chars#contains(char[],char)}
*@see com.google.common.primitives.Chars#contains(char[],char)
*<code>public static boolean com.google.common.primitives.Chars.contains(char[],char)
*contains(char[] p0,char p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(char[] p0,char p1){
	return com.google.common.primitives.Chars.contains(p0,p1);
}
/**
*{@link com.google.common.primitives.Doubles#contains(double[],double)}
*@see com.google.common.primitives.Doubles#contains(double[],double)
*<code>public static boolean com.google.common.primitives.Doubles.contains(double[],double)
*contains(double[] p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(double[] p0,double p1){
	return com.google.common.primitives.Doubles.contains(p0,p1);
}
/**
*{@link com.google.common.primitives.Floats#contains(float[],float)}
*@see com.google.common.primitives.Floats#contains(float[],float)
*<code>public static boolean com.google.common.primitives.Floats.contains(float[],float)
*contains(float[] p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(float[] p0,float p1){
	return com.google.common.primitives.Floats.contains(p0,p1);
}
/**
*{@link com.google.common.primitives.Ints#contains(int[],int)}
*@see com.google.common.primitives.Ints#contains(int[],int)
*<code>public static boolean com.google.common.primitives.Ints.contains(int[],int)
*contains(int[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(int[] p0,int p1){
	return com.google.common.primitives.Ints.contains(p0,p1);
}
/**
*{@link com.google.common.primitives.Longs#contains(long[],long)}
*@see com.google.common.primitives.Longs#contains(long[],long)
*<code>public static boolean com.google.common.primitives.Longs.contains(long[],long)
*contains(long[] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(long[] p0,long p1){
	return com.google.common.primitives.Longs.contains(p0,p1);
}
/**
*{@link com.google.common.primitives.Shorts#contains(short[],short)}
*@see com.google.common.primitives.Shorts#contains(short[],short)
*<code>public static boolean com.google.common.primitives.Shorts.contains(short[],short)
*contains(short[] p0,short p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(short[] p0,short p1){
	return com.google.common.primitives.Shorts.contains(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#contains(java.lang.CharSequence,int)}
*@see org.apache.commons.lang3.StringUtils#contains(java.lang.CharSequence,int)
*<code>public static boolean org.apache.commons.lang3.StringUtils.contains(java.lang.CharSequence,int)
*contains(java.lang.CharSequence p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(java.lang.CharSequence p0,int p1){
	return org.apache.commons.lang3.StringUtils.contains(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#contains(java.lang.CharSequence,java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#contains(java.lang.CharSequence,java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.contains(java.lang.CharSequence,java.lang.CharSequence)
*contains(java.lang.CharSequence p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.contains(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#contains(double[],double,double)}
*@see org.apache.commons.lang3.ArrayUtils#contains(double[],double,double)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.contains(double[],double,double)
*contains(double[] p0,double p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(double[] p0,double p1,double p2){
	return org.apache.commons.lang3.ArrayUtils.contains(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)}
*@see org.apache.commons.lang3.ArrayUtils#contains(java.lang.Object[],java.lang.Object)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.contains(java.lang.Object[],java.lang.Object)
*contains(java.lang.Object[] p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contains(java.lang.Object[] p0,java.lang.Object p1){
	return org.apache.commons.lang3.ArrayUtils.contains(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#containsAll(java.util.Collection<?>,java.util.Collection<?>)}
*@see org.apache.commons.collections4.CollectionUtils#containsAll(java.util.Collection<?>,java.util.Collection<?>)
*<code>public static boolean org.apache.commons.collections4.CollectionUtils.containsAll(java.util.Collection<?>,java.util.Collection<?>)
*containsAll(java.util.Collection<?> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsAll(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.containsAll(p0,p1);
}
/**
*{@link org.apache.commons.lang3.text.WordUtils#containsAllWords(java.lang.CharSequence,java.lang.CharSequence...)}
*@see org.apache.commons.lang3.text.WordUtils#containsAllWords(java.lang.CharSequence,java.lang.CharSequence...)
*<code>public static boolean org.apache.commons.lang3.text.WordUtils.containsAllWords(java.lang.CharSequence,java.lang.CharSequence...)
*containsAllWords(java.lang.CharSequence p0,java.lang.CharSequence... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsAllWords(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.text.WordUtils.containsAllWords(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#containsAny(java.util.Collection<?>,T...)}
*@see org.apache.commons.collections4.CollectionUtils#containsAny(java.util.Collection<?>,T...)
*<code>public static <T> boolean org.apache.commons.collections4.CollectionUtils.containsAny(java.util.Collection<?>,T...)
*containsAny(java.util.Collection<?> p0,T... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean containsAny(java.util.Collection<?> p0,T... p1){
	return org.apache.commons.collections4.CollectionUtils.containsAny(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#containsAny(java.util.Collection<?>,java.util.Collection<?>)}
*@see org.apache.commons.collections4.CollectionUtils#containsAny(java.util.Collection<?>,java.util.Collection<?>)
*<code>public static boolean org.apache.commons.collections4.CollectionUtils.containsAny(java.util.Collection<?>,java.util.Collection<?>)
*containsAny(java.util.Collection<?> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsAny(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.containsAny(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#containsAny(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#containsAny(java.util.Collection,java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.containsAny(java.util.Collection,java.util.Collection)
*containsAny(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsAny(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.containsAny(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#containsAny(java.lang.CharSequence,java.lang.CharSequence...)}
*@see org.apache.commons.lang3.StringUtils#containsAny(java.lang.CharSequence,java.lang.CharSequence...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence,java.lang.CharSequence...)
*containsAny(java.lang.CharSequence p0,java.lang.CharSequence... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.containsAny(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#containsAny(java.lang.CharSequence,char...)}
*@see org.apache.commons.lang3.StringUtils#containsAny(java.lang.CharSequence,char...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence,char...)
*containsAny(java.lang.CharSequence p0,char... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsAny(java.lang.CharSequence p0,char... p1){
	return org.apache.commons.lang3.StringUtils.containsAny(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#containsAny(java.lang.CharSequence,java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#containsAny(java.lang.CharSequence,java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence,java.lang.CharSequence)
*containsAny(java.lang.CharSequence p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsAny(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.containsAny(p0,p1);
}
/**
*{@link org.apache.commons.lang3.CharSetUtils#containsAny(java.lang.String,java.lang.String...)}
*@see org.apache.commons.lang3.CharSetUtils#containsAny(java.lang.String,java.lang.String...)
*<code>public static boolean org.apache.commons.lang3.CharSetUtils.containsAny(java.lang.String,java.lang.String...)
*containsAny(java.lang.String p0,java.lang.String... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsAny(java.lang.String p0,java.lang.String... p1){
	return org.apache.commons.lang3.CharSetUtils.containsAny(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#containsIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#containsIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.containsIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*containsIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.containsIgnoreCase(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#containsNone(java.lang.CharSequence,char...)}
*@see org.apache.commons.lang3.StringUtils#containsNone(java.lang.CharSequence,char...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence,char...)
*containsNone(java.lang.CharSequence p0,char... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsNone(java.lang.CharSequence p0,char... p1){
	return org.apache.commons.lang3.StringUtils.containsNone(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#containsNone(java.lang.CharSequence,java.lang.String)}
*@see org.apache.commons.lang3.StringUtils#containsNone(java.lang.CharSequence,java.lang.String)
*<code>public static boolean org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence,java.lang.String)
*containsNone(java.lang.CharSequence p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsNone(java.lang.CharSequence p0,java.lang.String p1){
	return org.apache.commons.lang3.StringUtils.containsNone(p0,p1);
}
/**
*{@link com.google.common.collect.Multisets#containsOccurrences(com.google.common.collect.Multiset<?>,com.google.common.collect.Multiset<?>)}
*@see com.google.common.collect.Multisets#containsOccurrences(com.google.common.collect.Multiset<?>,com.google.common.collect.Multiset<?>)
*<code>public static boolean com.google.common.collect.Multisets.containsOccurrences(com.google.common.collect.Multiset<?>,com.google.common.collect.Multiset<?>)
*containsOccurrences(com.google.common.collect.Multiset<?> p0,com.google.common.collect.Multiset<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsOccurrences(com.google.common.collect.Multiset<?> p0,com.google.common.collect.Multiset<?> p1){
	return com.google.common.collect.Multisets.containsOccurrences(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#containsOnly(java.lang.CharSequence,java.lang.String)}
*@see org.apache.commons.lang3.StringUtils#containsOnly(java.lang.CharSequence,java.lang.String)
*<code>public static boolean org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence,java.lang.String)
*containsOnly(java.lang.CharSequence p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsOnly(java.lang.CharSequence p0,java.lang.String p1){
	return org.apache.commons.lang3.StringUtils.containsOnly(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#containsOnly(java.lang.CharSequence,char...)}
*@see org.apache.commons.lang3.StringUtils#containsOnly(java.lang.CharSequence,char...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence,char...)
*containsOnly(java.lang.CharSequence p0,char... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsOnly(java.lang.CharSequence p0,char... p1){
	return org.apache.commons.lang3.StringUtils.containsOnly(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#containsTypeVariables(java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#containsTypeVariables(java.lang.reflect.Type)
*<code>public static boolean org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(java.lang.reflect.Type)
*containsTypeVariables(java.lang.reflect.Type p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsTypeVariables(java.lang.reflect.Type p0){
	return org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#containsWhitespace(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#containsWhitespace(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.containsWhitespace(java.lang.CharSequence)
*containsWhitespace(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean containsWhitespace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.containsWhitespace(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#contentEquals(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#contentEquals(java.io.File,java.io.File)
*<code>public static boolean org.codehaus.plexus.util.FileUtils.contentEquals(java.io.File,java.io.File) throws java.io.IOException
*contentEquals(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contentEquals(java.io.File p0,java.io.File p1) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.contentEquals(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.IOUtil#contentEquals(java.io.InputStream,java.io.InputStream)}
*@see org.codehaus.plexus.util.IOUtil#contentEquals(java.io.InputStream,java.io.InputStream)
*<code>public static boolean org.codehaus.plexus.util.IOUtil.contentEquals(java.io.InputStream,java.io.InputStream) throws java.io.IOException
*contentEquals(java.io.InputStream p0,java.io.InputStream p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contentEquals(java.io.InputStream p0,java.io.InputStream p1) throws java.io.IOException{
	return org.codehaus.plexus.util.IOUtil.contentEquals(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#contentEquals(java.io.Reader,java.io.Reader)}
*@see org.apache.commons.io.IOUtils#contentEquals(java.io.Reader,java.io.Reader)
*<code>public static boolean org.apache.commons.io.IOUtils.contentEquals(java.io.Reader,java.io.Reader) throws java.io.IOException
*contentEquals(java.io.Reader p0,java.io.Reader p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contentEquals(java.io.Reader p0,java.io.Reader p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.contentEquals(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#contentEqualsIgnoreEOL(java.io.Reader,java.io.Reader)}
*@see org.apache.commons.io.IOUtils#contentEqualsIgnoreEOL(java.io.Reader,java.io.Reader)
*<code>public static boolean org.apache.commons.io.IOUtils.contentEqualsIgnoreEOL(java.io.Reader,java.io.Reader) throws java.io.IOException
*contentEqualsIgnoreEOL(java.io.Reader p0,java.io.Reader p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contentEqualsIgnoreEOL(java.io.Reader p0,java.io.Reader p1) throws java.io.IOException{
	return org.apache.commons.io.IOUtils.contentEqualsIgnoreEOL(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#contentEqualsIgnoreEOL(java.io.File,java.io.File,java.lang.String)}
*@see org.apache.commons.io.FileUtils#contentEqualsIgnoreEOL(java.io.File,java.io.File,java.lang.String)
*<code>public static boolean org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(java.io.File,java.io.File,java.lang.String) throws java.io.IOException
*contentEqualsIgnoreEOL(java.io.File p0,java.io.File p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean contentEqualsIgnoreEOL(java.io.File p0,java.io.File p1,java.lang.String p2) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#copyDirectory(java.io.File,java.io.File,java.io.FileFilter,boolean)}
*@see org.apache.commons.io.FileUtils#copyDirectory(java.io.File,java.io.File,java.io.FileFilter,boolean)
*<code>public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,java.io.FileFilter,boolean) throws java.io.IOException
*copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#copyDirectory(java.io.File,java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#copyDirectory(java.io.File,java.io.File,boolean)
*<code>public static void org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*copyDirectory(java.io.File p0,java.io.File p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyDirectory(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyFile(java.io.File,java.io.File,java.lang.String,org.codehaus.plexus.util.FileUtils$FilterWrapper[],boolean)}
*@see org.codehaus.plexus.util.FileUtils#copyFile(java.io.File,java.io.File,java.lang.String,org.codehaus.plexus.util.FileUtils$FilterWrapper[],boolean)
*<code>public static void org.codehaus.plexus.util.FileUtils.copyFile(java.io.File,java.io.File,java.lang.String,org.codehaus.plexus.util.FileUtils$FilterWrapper[],boolean) throws java.io.IOException
*copyFile(java.io.File p0,java.io.File p1,java.lang.String p2,org.codehaus.plexus.util.FileUtils$FilterWrapper[] p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFile(java.io.File p0,java.io.File p1,java.lang.String p2,org.codehaus.plexus.util.FileUtils.FilterWrapper[] p3,boolean p4) throws java.io.IOException{
	 org.codehaus.plexus.util.FileUtils.copyFile(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.io.FileUtils#copyFile(java.io.File,java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#copyFile(java.io.File,java.io.File,boolean)
*<code>public static void org.apache.commons.io.FileUtils.copyFile(java.io.File,java.io.File,boolean) throws java.io.IOException
*copyFile(java.io.File p0,java.io.File p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFile(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyFile(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#copyFileIfModified(java.io.File,java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#copyFileIfModified(java.io.File,java.io.File)
*<code>public static boolean org.codehaus.plexus.util.FileUtils.copyFileIfModified(java.io.File,java.io.File) throws java.io.IOException
*copyFileIfModified(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean copyFileIfModified(java.io.File p0,java.io.File p1) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.copyFileIfModified(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#copyFileToDirectory(java.io.File,java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#copyFileToDirectory(java.io.File,java.io.File,boolean)
*<code>public static void org.apache.commons.io.FileUtils.copyFileToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*copyFileToDirectory(java.io.File p0,java.io.File p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void copyFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.copyFileToDirectory(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory#create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int,boolean,org.apache.commons.math3.fitting.leastsquares.ParameterValidator)}
*@see org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory#create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int,boolean,org.apache.commons.math3.fitting.leastsquares.ParameterValidator)
*<code>public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation>,int,int,boolean,org.apache.commons.math3.fitting.leastsquares.ParameterValidator)
*create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem$Evaluation> p4,int p5,int p6,boolean p7,org.apache.commons.math3.fitting.leastsquares.ParameterValidator p8)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem create(org.apache.commons.math3.fitting.leastsquares.MultivariateJacobianFunction p0,org.apache.commons.math3.linear.RealVector p1,org.apache.commons.math3.linear.RealVector p2,org.apache.commons.math3.linear.RealMatrix p3,org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.fitting.leastsquares.LeastSquaresProblem.Evaluation> p4,int p5,int p6,boolean p7,org.apache.commons.math3.fitting.leastsquares.ParameterValidator p8){
	return org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.create(p0,p1,p2,p3,p4,p5,p6,p7,p8);
}
/**
*{@link org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean)}
*@see org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean)
*<code>public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean)
*create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)}
*@see org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)
*<code>public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)
*create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4,int p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4,int p5){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4,p5);
}
/**
*{@link org.apache.commons.io.input.Tailer#create(java.io.File,java.nio.charset.Charset,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)}
*@see org.apache.commons.io.input.Tailer#create(java.io.File,java.nio.charset.Charset,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)
*<code>public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,java.nio.charset.Charset,org.apache.commons.io.input.TailerListener,long,boolean,boolean,int)
*create(java.io.File p0,java.nio.charset.Charset p1,org.apache.commons.io.input.TailerListener p2,long p3,boolean p4,boolean p5,int p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,java.nio.charset.Charset p1,org.apache.commons.io.input.TailerListener p2,long p3,boolean p4,boolean p5,int p6){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,int)}
*@see org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,int)
*<code>public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,int)
*create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,int p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,int p4){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean)}
*@see org.apache.commons.io.input.Tailer#create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean)
*<code>public static org.apache.commons.io.input.Tailer org.apache.commons.io.input.Tailer.create(java.io.File,org.apache.commons.io.input.TailerListener,long,boolean,boolean)
*create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4){
	return org.apache.commons.io.input.Tailer.create(p0,p1,p2,p3,p4);
}
/**
*{@link org.codehaus.plexus.util.NioFiles#deleteIfExists(java.io.File)}
*@see org.codehaus.plexus.util.NioFiles#deleteIfExists(java.io.File)
*<code>public static boolean org.codehaus.plexus.util.NioFiles.deleteIfExists(java.io.File) throws java.io.IOException
*deleteIfExists(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean deleteIfExists(java.io.File p0) throws java.io.IOException{
	return org.codehaus.plexus.util.NioFiles.deleteIfExists(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#deleteQuietly(java.io.File)}
*@see org.apache.commons.io.FileUtils#deleteQuietly(java.io.File)
*<code>public static boolean org.apache.commons.io.FileUtils.deleteQuietly(java.io.File)
*deleteQuietly(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean deleteQuietly(java.io.File p0){
	return org.apache.commons.io.FileUtils.deleteQuietly(p0);
}
/**
*{@link org.apache.commons.io.FilenameUtils#directoryContains(java.lang.String,java.lang.String)}
*@see org.apache.commons.io.FilenameUtils#directoryContains(java.lang.String,java.lang.String)
*<code>public static boolean org.apache.commons.io.FilenameUtils.directoryContains(java.lang.String,java.lang.String) throws java.io.IOException
*directoryContains(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean directoryContains(java.lang.String p0,java.lang.String p1) throws java.io.IOException{
	return org.apache.commons.io.FilenameUtils.directoryContains(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#directoryContains(java.io.File,java.io.File)}
*@see org.apache.commons.io.FileUtils#directoryContains(java.io.File,java.io.File)
*<code>public static boolean org.apache.commons.io.FileUtils.directoryContains(java.io.File,java.io.File) throws java.io.IOException
*directoryContains(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean directoryContains(java.io.File p0,java.io.File p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.directoryContains(p0,p1);
}
/**
*{@link com.google.common.collect.Iterables#elementsEqual(java.lang.Iterable<?>,java.lang.Iterable<?>)}
*@see com.google.common.collect.Iterables#elementsEqual(java.lang.Iterable<?>,java.lang.Iterable<?>)
*<code>public static boolean com.google.common.collect.Iterables.elementsEqual(java.lang.Iterable<?>,java.lang.Iterable<?>)
*elementsEqual(java.lang.Iterable<?> p0,java.lang.Iterable<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean elementsEqual(java.lang.Iterable<?> p0,java.lang.Iterable<?> p1){
	return com.google.common.collect.Iterables.elementsEqual(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#elementsEqual(java.util.Iterator<?>,java.util.Iterator<?>)}
*@see com.google.common.collect.Iterators#elementsEqual(java.util.Iterator<?>,java.util.Iterator<?>)
*<code>public static boolean com.google.common.collect.Iterators.elementsEqual(java.util.Iterator<?>,java.util.Iterator<?>)
*elementsEqual(java.util.Iterator<?> p0,java.util.Iterator<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean elementsEqual(java.util.Iterator<?> p0,java.util.Iterator<?> p1){
	return com.google.common.collect.Iterators.elementsEqual(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.Base64#encodeBase64(byte[],boolean)}
*@see org.codehaus.plexus.util.Base64#encodeBase64(byte[],boolean)
*<code>public static byte[] org.codehaus.plexus.util.Base64.encodeBase64(byte[],boolean)
*encodeBase64(byte[] p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static byte[] encodeBase64(byte[] p0,boolean p1){
	return org.codehaus.plexus.util.Base64.encodeBase64(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#endsWith(java.lang.CharSequence,java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#endsWith(java.lang.CharSequence,java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.endsWith(java.lang.CharSequence,java.lang.CharSequence)
*endsWith(java.lang.CharSequence p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean endsWith(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.endsWith(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#endsWithAny(java.lang.CharSequence,java.lang.CharSequence...)}
*@see org.apache.commons.lang3.StringUtils#endsWithAny(java.lang.CharSequence,java.lang.CharSequence...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.endsWithAny(java.lang.CharSequence,java.lang.CharSequence...)
*endsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean endsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.endsWithAny(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#endsWithIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#endsWithIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*endsWithIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean endsWithIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#equalsAny(java.lang.CharSequence,java.lang.CharSequence...)}
*@see org.apache.commons.lang3.StringUtils#equalsAny(java.lang.CharSequence,java.lang.CharSequence...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.equalsAny(java.lang.CharSequence,java.lang.CharSequence...)
*equalsAny(java.lang.CharSequence p0,java.lang.CharSequence... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.equalsAny(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#equalsAnyIgnoreCase(java.lang.CharSequence,java.lang.CharSequence...)}
*@see org.apache.commons.lang3.StringUtils#equalsAnyIgnoreCase(java.lang.CharSequence,java.lang.CharSequence...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.equalsAnyIgnoreCase(java.lang.CharSequence,java.lang.CharSequence...)
*equalsAnyIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsAnyIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.equalsAnyIgnoreCase(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#equalsIgnoreCase(java.lang.String,java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#equalsIgnoreCase(java.lang.String,java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.equalsIgnoreCase(java.lang.String,java.lang.String)
*equalsIgnoreCase(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsIgnoreCase(java.lang.String p0,java.lang.String p1){
	return org.codehaus.plexus.util.StringUtils.equalsIgnoreCase(p0,p1);
}
/**
*{@link com.google.common.base.Ascii#equalsIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)}
*@see com.google.common.base.Ascii#equalsIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*<code>public static boolean com.google.common.base.Ascii.equalsIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*equalsIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return com.google.common.base.Ascii.equalsIgnoreCase(p0,p1);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(double[],double...)}
*@see org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(double[],double...)
*<code>public static boolean org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(double[],double[])
*equalsIncludingNaN(double[] p0,double... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsIncludingNaN(double[] p0,double... p1){
	return org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(p0,p1);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float...)}
*@see org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float...)
*<code>public static boolean org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(float[],float[])
*equalsIncludingNaN(float[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsIncludingNaN(float[] p0,float... p1){
	return org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(p0,p1);
}
/**
*{@link org.apache.commons.math3.util.Precision#equalsIncludingNaN(double,double)}
*@see org.apache.commons.math3.util.Precision#equalsIncludingNaN(double,double)
*<code>public static boolean org.apache.commons.math3.util.Precision.equalsIncludingNaN(double,double)
*equalsIncludingNaN(double p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsIncludingNaN(double p0,double p1){
	return org.apache.commons.math3.util.Precision.equalsIncludingNaN(p0,p1);
}
/**
*{@link org.apache.commons.math3.util.Precision#equalsIncludingNaN(float,float,int)}
*@see org.apache.commons.math3.util.Precision#equalsIncludingNaN(float,float,int)
*<code>public static boolean org.apache.commons.math3.util.Precision.equalsIncludingNaN(float,float,int)
*equalsIncludingNaN(float p0,float p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsIncludingNaN(float p0,float p1,int p2){
	return org.apache.commons.math3.util.Precision.equalsIncludingNaN(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.util.Precision#equalsIncludingNaN(float,float,float)}
*@see org.apache.commons.math3.util.Precision#equalsIncludingNaN(float,float,float)
*<code>public static boolean org.apache.commons.math3.util.Precision.equalsIncludingNaN(float,float,float)
*equalsIncludingNaN(float p0,float p1,float p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsIncludingNaN(float p0,float p1,float p2){
	return org.apache.commons.math3.util.Precision.equalsIncludingNaN(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.util.Precision#equalsIncludingNaN(double,double,int)}
*@see org.apache.commons.math3.util.Precision#equalsIncludingNaN(double,double,int)
*<code>public static boolean org.apache.commons.math3.util.Precision.equalsIncludingNaN(double,double,int)
*equalsIncludingNaN(double p0,double p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsIncludingNaN(double p0,double p1,int p2){
	return org.apache.commons.math3.util.Precision.equalsIncludingNaN(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.util.Precision#equalsIncludingNaN(float,float)}
*@see org.apache.commons.math3.util.Precision#equalsIncludingNaN(float,float)
*<code>public static boolean org.apache.commons.math3.util.Precision.equalsIncludingNaN(float,float)
*equalsIncludingNaN(float p0,float p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsIncludingNaN(float p0,float p1){
	return org.apache.commons.math3.util.Precision.equalsIncludingNaN(p0,p1);
}
/**
*{@link org.apache.commons.math3.util.Precision#equalsIncludingNaN(double,double,double)}
*@see org.apache.commons.math3.util.Precision#equalsIncludingNaN(double,double,double)
*<code>public static boolean org.apache.commons.math3.util.Precision.equalsIncludingNaN(double,double,double)
*equalsIncludingNaN(double p0,double p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsIncludingNaN(double p0,double p1,double p2){
	return org.apache.commons.math3.util.Precision.equalsIncludingNaN(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FilenameUtils#equalsNormalized(java.lang.String,java.lang.String)}
*@see org.apache.commons.io.FilenameUtils#equalsNormalized(java.lang.String,java.lang.String)
*<code>public static boolean org.apache.commons.io.FilenameUtils.equalsNormalized(java.lang.String,java.lang.String)
*equalsNormalized(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsNormalized(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.io.FilenameUtils.equalsNormalized(p0,p1);
}
/**
*{@link org.apache.commons.io.FilenameUtils#equalsNormalizedOnSystem(java.lang.String,java.lang.String)}
*@see org.apache.commons.io.FilenameUtils#equalsNormalizedOnSystem(java.lang.String,java.lang.String)
*<code>public static boolean org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem(java.lang.String,java.lang.String)
*equalsNormalizedOnSystem(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsNormalizedOnSystem(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.io.FilenameUtils.equalsNormalizedOnSystem(p0,p1);
}
/**
*{@link org.apache.commons.io.FilenameUtils#equalsOnSystem(java.lang.String,java.lang.String)}
*@see org.apache.commons.io.FilenameUtils#equalsOnSystem(java.lang.String,java.lang.String)
*<code>public static boolean org.apache.commons.io.FilenameUtils.equalsOnSystem(java.lang.String,java.lang.String)
*equalsOnSystem(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsOnSystem(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.io.FilenameUtils.equalsOnSystem(p0,p1);
}
/**
*{@link org.apache.commons.math3.complex.Complex#equalsWithRelativeTolerance(org.apache.commons.math3.complex.Complex,org.apache.commons.math3.complex.Complex,double)}
*@see org.apache.commons.math3.complex.Complex#equalsWithRelativeTolerance(org.apache.commons.math3.complex.Complex,org.apache.commons.math3.complex.Complex,double)
*<code>public static boolean org.apache.commons.math3.complex.Complex.equalsWithRelativeTolerance(org.apache.commons.math3.complex.Complex,org.apache.commons.math3.complex.Complex,double)
*equalsWithRelativeTolerance(org.apache.commons.math3.complex.Complex p0,org.apache.commons.math3.complex.Complex p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsWithRelativeTolerance(org.apache.commons.math3.complex.Complex p0,org.apache.commons.math3.complex.Complex p1,double p2){
	return org.apache.commons.math3.complex.Complex.equalsWithRelativeTolerance(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.util.Precision#equalsWithRelativeTolerance(double,double,double)}
*@see org.apache.commons.math3.util.Precision#equalsWithRelativeTolerance(double,double,double)
*<code>public static boolean org.apache.commons.math3.util.Precision.equalsWithRelativeTolerance(double,double,double)
*equalsWithRelativeTolerance(double p0,double p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equalsWithRelativeTolerance(double p0,double p1,double p2){
	return org.apache.commons.math3.util.Precision.equalsWithRelativeTolerance(p0,p1,p2);
}
/**
*{@link com.google.common.graph.Graphs#equivalent(com.google.common.graph.Graph<?>,com.google.common.graph.Graph<?>)}
*@see com.google.common.graph.Graphs#equivalent(com.google.common.graph.Graph<?>,com.google.common.graph.Graph<?>)
*<code>public static boolean com.google.common.graph.Graphs.equivalent(com.google.common.graph.Graph<?>,com.google.common.graph.Graph<?>)
*equivalent(com.google.common.graph.Graph<?> p0,com.google.common.graph.Graph<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equivalent(com.google.common.graph.Graph<?> p0,com.google.common.graph.Graph<?> p1){
	return com.google.common.graph.Graphs.equivalent(p0,p1);
}
/**
*{@link com.google.common.graph.Graphs#equivalent(com.google.common.graph.Network<?, ?>,com.google.common.graph.Network<?, ?>)}
*@see com.google.common.graph.Graphs#equivalent(com.google.common.graph.Network<?, ?>,com.google.common.graph.Network<?, ?>)
*<code>public static boolean com.google.common.graph.Graphs.equivalent(com.google.common.graph.Network<?, ?>,com.google.common.graph.Network<?, ?>)
*equivalent(com.google.common.graph.Network<?, ?> p0,com.google.common.graph.Network<?, ?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equivalent(com.google.common.graph.Network<?, ?> p0,com.google.common.graph.Network<?, ?> p1){
	return com.google.common.graph.Graphs.equivalent(p0,p1);
}
/**
*{@link com.google.common.graph.Graphs#equivalent(com.google.common.graph.ValueGraph<?, ?>,com.google.common.graph.ValueGraph<?, ?>)}
*@see com.google.common.graph.Graphs#equivalent(com.google.common.graph.ValueGraph<?, ?>,com.google.common.graph.ValueGraph<?, ?>)
*<code>public static boolean com.google.common.graph.Graphs.equivalent(com.google.common.graph.ValueGraph<?, ?>,com.google.common.graph.ValueGraph<?, ?>)
*equivalent(com.google.common.graph.ValueGraph<?, ?> p0,com.google.common.graph.ValueGraph<?, ?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean equivalent(com.google.common.graph.ValueGraph<?, ?> p0,com.google.common.graph.ValueGraph<?, ?> p1){
	return com.google.common.graph.Graphs.equivalent(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.introspection.ReflectionValueExtractor#evaluate(java.lang.String,java.lang.Object,boolean)}
*@see org.codehaus.plexus.util.introspection.ReflectionValueExtractor#evaluate(java.lang.String,java.lang.Object,boolean)
*<code>public static java.lang.Object org.codehaus.plexus.util.introspection.ReflectionValueExtractor.evaluate(java.lang.String,java.lang.Object,boolean) throws java.lang.Exception
*evaluate(java.lang.String p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object evaluate(java.lang.String p0,java.lang.Object p1,boolean p2) throws java.lang.Exception{
	return org.codehaus.plexus.util.introspection.ReflectionValueExtractor.evaluate(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#exactP(double,int,int,boolean)}
*@see org.apache.commons.math3.stat.inference.TestUtils#exactP(double,int,int,boolean)
*<code>public static double org.apache.commons.math3.stat.inference.TestUtils.exactP(double,int,int,boolean)
*exactP(double p0,int p1,int p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double exactP(double p0,int p1,int p2,boolean p3){
	return org.apache.commons.math3.stat.inference.TestUtils.exactP(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#exists(java.lang.Iterable<C>,org.apache.commons.collections4.Predicate<? super C>)}
*@see org.apache.commons.collections4.CollectionUtils#exists(java.lang.Iterable<C>,org.apache.commons.collections4.Predicate<? super C>)
*<code>public static <C> boolean org.apache.commons.collections4.CollectionUtils.exists(java.lang.Iterable<C>,org.apache.commons.collections4.Predicate<? super C>)
*exists(java.lang.Iterable<C> p0,org.apache.commons.collections4.Predicate<? super C> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C> boolean exists(java.lang.Iterable<C> p0,org.apache.commons.collections4.Predicate<? super C> p1){
	return org.apache.commons.collections4.CollectionUtils.exists(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#exists(java.util.Collection,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.CollectionUtils#exists(java.util.Collection,org.apache.commons.collections.Predicate)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.exists(java.util.Collection,org.apache.commons.collections.Predicate)
*exists(java.util.Collection p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean exists(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.CollectionUtils.exists(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#fileExists(java.lang.String)}
*@see org.codehaus.plexus.util.FileUtils#fileExists(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.FileUtils.fileExists(java.lang.String)
*fileExists(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean fileExists(java.lang.String p0){
	return org.codehaus.plexus.util.FileUtils.fileExists(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#fill(boolean[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.BigArrays#fill(boolean[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.fill(boolean[][],long,long,boolean)
*fill(boolean[][] p0,long p1,long p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void fill(boolean[][] p0,long p1,long p2,boolean p3){
	 it.unimi.dsi.fastutil.BigArrays.fill(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#fill(boolean[][],boolean)}
*@see it.unimi.dsi.fastutil.BigArrays#fill(boolean[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.fill(boolean[][],boolean)
*fill(boolean[][] p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void fill(boolean[][] p0,boolean p1){
	 it.unimi.dsi.fastutil.BigArrays.fill(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#fill(boolean[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#fill(boolean[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.fill(boolean[],int,int,boolean)
*fill(boolean[] p0,int p1,int p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void fill(boolean[] p0,int p1,int p2,boolean p3){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.fill(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanArrays#fill(boolean[],boolean)}
*@see it.unimi.dsi.fastutil.booleans.BooleanArrays#fill(boolean[],boolean)
*<code>public static void it.unimi.dsi.fastutil.booleans.BooleanArrays.fill(boolean[],boolean)
*fill(boolean[] p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void fill(boolean[] p0,boolean p1){
	 it.unimi.dsi.fastutil.booleans.BooleanArrays.fill(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#filter(java.lang.Iterable<T>,org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.CollectionUtils#filter(java.lang.Iterable<T>,org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> boolean org.apache.commons.collections4.CollectionUtils.filter(java.lang.Iterable<T>,org.apache.commons.collections4.Predicate<? super T>)
*filter(java.lang.Iterable<T> p0,org.apache.commons.collections4.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean filter(java.lang.Iterable<T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.CollectionUtils.filter(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#filterInverse(java.lang.Iterable<T>,org.apache.commons.collections4.Predicate<? super T>)}
*@see org.apache.commons.collections4.CollectionUtils#filterInverse(java.lang.Iterable<T>,org.apache.commons.collections4.Predicate<? super T>)
*<code>public static <T> boolean org.apache.commons.collections4.CollectionUtils.filterInverse(java.lang.Iterable<T>,org.apache.commons.collections4.Predicate<? super T>)
*filterInverse(java.lang.Iterable<T> p0,org.apache.commons.collections4.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean filterInverse(java.lang.Iterable<T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
	return org.apache.commons.collections4.CollectionUtils.filterInverse(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ThreadUtils#findThreadGroups(java.lang.ThreadGroup,boolean,org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate)}
*@see org.apache.commons.lang3.ThreadUtils#findThreadGroups(java.lang.ThreadGroup,boolean,org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate)
*<code>public static java.util.Collection<java.lang.ThreadGroup> org.apache.commons.lang3.ThreadUtils.findThreadGroups(java.lang.ThreadGroup,boolean,org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate)
*findThreadGroups(java.lang.ThreadGroup p0,boolean p1,org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.lang.ThreadGroup> findThreadGroups(java.lang.ThreadGroup p0,boolean p1,org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate p2){
	return org.apache.commons.lang3.ThreadUtils.findThreadGroups(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ThreadUtils#findThreads(java.lang.ThreadGroup,boolean,org.apache.commons.lang3.ThreadUtils$ThreadPredicate)}
*@see org.apache.commons.lang3.ThreadUtils#findThreads(java.lang.ThreadGroup,boolean,org.apache.commons.lang3.ThreadUtils$ThreadPredicate)
*<code>public static java.util.Collection<java.lang.Thread> org.apache.commons.lang3.ThreadUtils.findThreads(java.lang.ThreadGroup,boolean,org.apache.commons.lang3.ThreadUtils$ThreadPredicate)
*findThreads(java.lang.ThreadGroup p0,boolean p1,org.apache.commons.lang3.ThreadUtils$ThreadPredicate p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.lang.Thread> findThreads(java.lang.ThreadGroup p0,boolean p1,org.apache.commons.lang3.ThreadUtils.ThreadPredicate p2){
	return org.apache.commons.lang3.ThreadUtils.findThreads(p0,p1,p2);
}
/**
*{@link com.google.common.io.Flushables#flush(java.io.Flushable,boolean)}
*@see com.google.common.io.Flushables#flush(java.io.Flushable,boolean)
*<code>public static void com.google.common.io.Flushables.flush(java.io.Flushable,boolean) throws java.io.IOException
*flush(java.io.Flushable p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void flush(java.io.Flushable p0,boolean p1) throws java.io.IOException{
	 com.google.common.io.Flushables.flush(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.TypeFormat#format(boolean,java.lang.StringBuffer)}
*@see org.codehaus.plexus.util.TypeFormat#format(boolean,java.lang.StringBuffer)
*<code>public static java.lang.StringBuffer org.codehaus.plexus.util.TypeFormat.format(boolean,java.lang.StringBuffer)
*format(boolean p0,java.lang.StringBuffer p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.StringBuffer format(boolean p0,java.lang.StringBuffer p1){
	return org.codehaus.plexus.util.TypeFormat.format(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DurationFormatUtils#formatDuration(long,java.lang.String,boolean)}
*@see org.apache.commons.lang3.time.DurationFormatUtils#formatDuration(long,java.lang.String,boolean)
*<code>public static java.lang.String org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(long,java.lang.String,boolean)
*formatDuration(long p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String formatDuration(long p0,java.lang.String p1,boolean p2){
	return org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.time.DurationFormatUtils#formatDurationWords(long,boolean,boolean)}
*@see org.apache.commons.lang3.time.DurationFormatUtils#formatDurationWords(long,boolean,boolean)
*<code>public static java.lang.String org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(long,boolean,boolean)
*formatDurationWords(long p0,boolean p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String formatDurationWords(long p0,boolean p1,boolean p2){
	return org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.time.DurationFormatUtils#formatPeriod(long,long,java.lang.String,boolean,java.util.TimeZone)}
*@see org.apache.commons.lang3.time.DurationFormatUtils#formatPeriod(long,long,java.lang.String,boolean,java.util.TimeZone)
*<code>public static java.lang.String org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(long,long,java.lang.String,boolean,java.util.TimeZone)
*formatPeriod(long p0,long p1,java.lang.String p2,boolean p3,java.util.TimeZone p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String formatPeriod(long p0,long p1,java.lang.String p2,boolean p3,java.util.TimeZone p4){
	return org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.math.DoubleMath#fuzzyEquals(double,double,double)}
*@see com.google.common.math.DoubleMath#fuzzyEquals(double,double,double)
*<code>public static boolean com.google.common.math.DoubleMath.fuzzyEquals(double,double,double)
*fuzzyEquals(double p0,double p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean fuzzyEquals(double p0,double p1,double p2){
	return com.google.common.math.DoubleMath.fuzzyEquals(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#gTest(double[],long[],double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#gTest(double[],long[],double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.gTest(double[],long[],double) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*gTest(double[] p0,long[] p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean gTest(double[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.NotStrictlyPositiveException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.gTest(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#gTestDataSetsComparison(long[],long[],double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#gTestDataSetsComparison(long[],long[],double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.gTestDataSetsComparison(long[],long[],double) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*gTestDataSetsComparison(long[] p0,long[] p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean gTestDataSetsComparison(long[] p0,long[] p1,double p2) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NotPositiveException,org.apache.commons.math3.exception.ZeroException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.gTestDataSetsComparison(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#getAnnotation(java.lang.reflect.Method,java.lang.Class<A>,boolean,boolean)}
*@see org.apache.commons.lang3.reflect.MethodUtils#getAnnotation(java.lang.reflect.Method,java.lang.Class<A>,boolean,boolean)
*<code>public static <A> A org.apache.commons.lang3.reflect.MethodUtils.getAnnotation(java.lang.reflect.Method,java.lang.Class<A>,boolean,boolean)
*getAnnotation(java.lang.reflect.Method p0,java.lang.Class<A> p1,boolean p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <A extends java.lang.annotation.Annotation > A getAnnotation(java.lang.reflect.Method p0,java.lang.Class<A> p1,boolean p2,boolean p3){
	return org.apache.commons.lang3.reflect.MethodUtils.getAnnotation(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#getApplyLocalized()}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#getApplyLocalized()
*<code>public static boolean org.apache.commons.beanutils.locale.LocaleBeanUtils.getApplyLocalized()
*getApplyLocalized()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean getApplyLocalized(){
	return org.apache.commons.beanutils.locale.LocaleBeanUtils.getApplyLocalized();
}
/**
*{@link org.apache.commons.collections4.MapUtils#getBoolean(java.util.Map<? super K, ?>,K,java.lang.Boolean)}
*@see org.apache.commons.collections4.MapUtils#getBoolean(java.util.Map<? super K, ?>,K,java.lang.Boolean)
*<code>public static <K> java.lang.Boolean org.apache.commons.collections4.MapUtils.getBoolean(java.util.Map<? super K, ?>,K,java.lang.Boolean)
*getBoolean(java.util.Map<? super K, ?> p0,K p1,java.lang.Boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> java.lang.Boolean getBoolean(java.util.Map<? super K, ?> p0,K p1,java.lang.Boolean p2){
	return org.apache.commons.collections4.MapUtils.getBoolean(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.MapUtils#getBoolean(java.util.Map<? super K, ?>,K)}
*@see org.apache.commons.collections4.MapUtils#getBoolean(java.util.Map<? super K, ?>,K)
*<code>public static <K> java.lang.Boolean org.apache.commons.collections4.MapUtils.getBoolean(java.util.Map<? super K, ?>,K)
*getBoolean(java.util.Map<? super K, ?> p0,K p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> java.lang.Boolean getBoolean(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getBoolean(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getBoolean(java.util.Map,java.lang.Object,java.lang.Boolean)}
*@see org.apache.commons.collections.MapUtils#getBoolean(java.util.Map,java.lang.Object,java.lang.Boolean)
*<code>public static java.lang.Boolean org.apache.commons.collections.MapUtils.getBoolean(java.util.Map,java.lang.Object,java.lang.Boolean)
*getBoolean(java.util.Map p0,java.lang.Object p1,java.lang.Boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1,java.lang.Boolean p2){
	return org.apache.commons.collections.MapUtils.getBoolean(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getBoolean(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getBoolean(java.util.Map,java.lang.Object)
*<code>public static java.lang.Boolean org.apache.commons.collections.MapUtils.getBoolean(java.util.Map,java.lang.Object)
*getBoolean(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getBoolean(p0,p1);
}
/**
*{@link org.apache.commons.collections.comparators.BooleanComparator#getBooleanComparator(boolean)}
*@see org.apache.commons.collections.comparators.BooleanComparator#getBooleanComparator(boolean)
*<code>public static org.apache.commons.collections.comparators.BooleanComparator org.apache.commons.collections.comparators.BooleanComparator.getBooleanComparator(boolean)
*getBooleanComparator(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.comparators.BooleanComparator getBooleanComparator(boolean p0){
	return org.apache.commons.collections.comparators.BooleanComparator.getBooleanComparator(p0);
}
/**
*{@link org.apache.commons.collections4.MapUtils#getBooleanValue(java.util.Map<? super K, ?>,K,boolean)}
*@see org.apache.commons.collections4.MapUtils#getBooleanValue(java.util.Map<? super K, ?>,K,boolean)
*<code>public static <K> boolean org.apache.commons.collections4.MapUtils.getBooleanValue(java.util.Map<? super K, ?>,K,boolean)
*getBooleanValue(java.util.Map<? super K, ?> p0,K p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> boolean getBooleanValue(java.util.Map<? super K, ?> p0,K p1,boolean p2){
	return org.apache.commons.collections4.MapUtils.getBooleanValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.MapUtils#getBooleanValue(java.util.Map<? super K, ?>,K)}
*@see org.apache.commons.collections4.MapUtils#getBooleanValue(java.util.Map<? super K, ?>,K)
*<code>public static <K> boolean org.apache.commons.collections4.MapUtils.getBooleanValue(java.util.Map<? super K, ?>,K)
*getBooleanValue(java.util.Map<? super K, ?> p0,K p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> boolean getBooleanValue(java.util.Map<? super K, ?> p0,K p1){
	return org.apache.commons.collections4.MapUtils.getBooleanValue(p0,p1);
}
/**
*{@link org.apache.commons.collections.MapUtils#getBooleanValue(java.util.Map,java.lang.Object,boolean)}
*@see org.apache.commons.collections.MapUtils#getBooleanValue(java.util.Map,java.lang.Object,boolean)
*<code>public static boolean org.apache.commons.collections.MapUtils.getBooleanValue(java.util.Map,java.lang.Object,boolean)
*getBooleanValue(java.util.Map p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1,boolean p2){
	return org.apache.commons.collections.MapUtils.getBooleanValue(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.MapUtils#getBooleanValue(java.util.Map,java.lang.Object)}
*@see org.apache.commons.collections.MapUtils#getBooleanValue(java.util.Map,java.lang.Object)
*<code>public static boolean org.apache.commons.collections.MapUtils.getBooleanValue(java.util.Map,java.lang.Object)
*getBooleanValue(java.util.Map p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1){
	return org.apache.commons.collections.MapUtils.getBooleanValue(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.BeanUtils#getCacheFast(java.util.Map<?, ?>)}
*@see org.apache.commons.beanutils.BeanUtils#getCacheFast(java.util.Map<?, ?>)
*<code>public static boolean org.apache.commons.beanutils.BeanUtils.getCacheFast(java.util.Map<?, ?>)
*getCacheFast(java.util.Map<?, ?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean getCacheFast(java.util.Map<?, ?> p0){
	return org.apache.commons.beanutils.BeanUtils.getCacheFast(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#getDeclaredField(java.lang.Class<?>,java.lang.String,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#getDeclaredField(java.lang.Class<?>,java.lang.String,boolean)
*<code>public static java.lang.reflect.Field org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(java.lang.Class<?>,java.lang.String,boolean)
*getDeclaredField(java.lang.Class<?> p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> p0,java.lang.String p1,boolean p2){
	return org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.ConvertUtils#getDefaultBoolean()}
*@see org.apache.commons.beanutils.ConvertUtils#getDefaultBoolean()
*<code>public static boolean org.apache.commons.beanutils.ConvertUtils.getDefaultBoolean()
*getDefaultBoolean()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean getDefaultBoolean(){
	return org.apache.commons.beanutils.ConvertUtils.getDefaultBoolean();
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*getDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getDirectoryNames(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean) throws java.io.IOException
*getDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getDirectoryNames(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#getField(java.lang.Class<?>,java.lang.String,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#getField(java.lang.Class<?>,java.lang.String,boolean)
*<code>public static java.lang.reflect.Field org.apache.commons.lang3.reflect.FieldUtils.getField(java.lang.Class<?>,java.lang.String,boolean)
*getField(java.lang.Class<?> p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Field getField(java.lang.Class<?> p0,java.lang.String p1,boolean p2){
	return org.apache.commons.lang3.reflect.FieldUtils.getField(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFileAndDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getFileAndDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getFileAndDirectoryNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean,boolean,boolean) throws java.io.IOException
*getFileAndDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4,boolean p5,boolean p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getFileAndDirectoryNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4,boolean p5,boolean p6) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFileAndDirectoryNames(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFileNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getFileNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getFileNames(java.io.File,java.lang.String,java.lang.String,boolean,boolean) throws java.io.IOException
*getFileNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getFileNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3,boolean p4) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFileNames(p0,p1,p2,p3,p4);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFileNames(java.io.File,java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getFileNames(java.io.File,java.lang.String,java.lang.String,boolean)
*<code>public static java.util.List<java.lang.String> org.codehaus.plexus.util.FileUtils.getFileNames(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*getFileNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.String> getFileNames(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFileNames(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#getFiles(java.io.File,java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.FileUtils#getFiles(java.io.File,java.lang.String,java.lang.String,boolean)
*<code>public static java.util.List<java.io.File> org.codehaus.plexus.util.FileUtils.getFiles(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*getFiles(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.io.File> getFiles(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	return org.codehaus.plexus.util.FileUtils.getFiles(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.collections.functors.WhileClosure#getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,boolean)}
*@see org.apache.commons.collections.functors.WhileClosure#getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,boolean)
*<code>public static org.apache.commons.collections.Closure org.apache.commons.collections.functors.WhileClosure.getInstance(org.apache.commons.collections.Predicate,org.apache.commons.collections.Closure,boolean)
*getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate p0,org.apache.commons.collections.Closure p1,boolean p2){
	return org.apache.commons.collections.functors.WhileClosure.getInstance(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#getMethodsListWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>,boolean,boolean)}
*@see org.apache.commons.lang3.reflect.MethodUtils#getMethodsListWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>,boolean,boolean)
*<code>public static java.util.List<java.lang.reflect.Method> org.apache.commons.lang3.reflect.MethodUtils.getMethodsListWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>,boolean,boolean)
*getMethodsListWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1,boolean p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List<java.lang.reflect.Method> getMethodsListWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1,boolean p2,boolean p3){
	return org.apache.commons.lang3.reflect.MethodUtils.getMethodsListWithAnnotation(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#getMethodsWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>,boolean,boolean)}
*@see org.apache.commons.lang3.reflect.MethodUtils#getMethodsWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>,boolean,boolean)
*<code>public static java.lang.reflect.Method[] org.apache.commons.lang3.reflect.MethodUtils.getMethodsWithAnnotation(java.lang.Class<?>,java.lang.Class<? extends java.lang.annotation.Annotation>,boolean,boolean)
*getMethodsWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1,boolean p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.reflect.Method[] getMethodsWithAnnotation(java.lang.Class<?> p0,java.lang.Class<? extends java.lang.annotation.Annotation> p1,boolean p2,boolean p3){
	return org.apache.commons.lang3.reflect.MethodUtils.getMethodsWithAnnotation(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.cli.CommandLineUtils#getSystemEnvVars(boolean)}
*@see org.codehaus.plexus.util.cli.CommandLineUtils#getSystemEnvVars(boolean)
*<code>public static java.util.Properties org.codehaus.plexus.util.cli.CommandLineUtils.getSystemEnvVars(boolean) throws java.io.IOException
*getSystemEnvVars(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Properties getSystemEnvVars(boolean p0) throws java.io.IOException{
	return org.codehaus.plexus.util.cli.CommandLineUtils.getSystemEnvVars(p0);
}
/**
*{@link org.apache.commons.lang3.exception.ExceptionUtils#hasCause(java.lang.Throwable,java.lang.Class<? extends java.lang.Throwable>)}
*@see org.apache.commons.lang3.exception.ExceptionUtils#hasCause(java.lang.Throwable,java.lang.Class<? extends java.lang.Throwable>)
*<code>public static boolean org.apache.commons.lang3.exception.ExceptionUtils.hasCause(java.lang.Throwable,java.lang.Class<? extends java.lang.Throwable>)
*hasCause(java.lang.Throwable p0,java.lang.Class<? extends java.lang.Throwable> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean hasCause(java.lang.Throwable p0,java.lang.Class<? extends java.lang.Throwable> p1){
	return org.apache.commons.lang3.exception.ExceptionUtils.hasCause(p0,p1);
}
/**
*{@link com.google.common.graph.Graphs#hasCycle(com.google.common.graph.Network<?, ?>)}
*@see com.google.common.graph.Graphs#hasCycle(com.google.common.graph.Network<?, ?>)
*<code>public static boolean com.google.common.graph.Graphs.hasCycle(com.google.common.graph.Network<?, ?>)
*hasCycle(com.google.common.graph.Network<?, ?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean hasCycle(com.google.common.graph.Network<?, ?> p0){
	return com.google.common.graph.Graphs.hasCycle(p0);
}
/**
*{@link com.google.common.graph.Graphs#hasCycle(com.google.common.graph.Graph<N>)}
*@see com.google.common.graph.Graphs#hasCycle(com.google.common.graph.Graph<N>)
*<code>public static <N> boolean com.google.common.graph.Graphs.hasCycle(com.google.common.graph.Graph<N>)
*hasCycle(com.google.common.graph.Graph<N> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <N> boolean hasCycle(com.google.common.graph.Graph<N> p0){
	return com.google.common.graph.Graphs.hasCycle(p0);
}
/**
*{@link com.google.common.net.InetAddresses#hasEmbeddedIPv4ClientAddress(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#hasEmbeddedIPv4ClientAddress(java.net.Inet6Address)
*<code>public static boolean com.google.common.net.InetAddresses.hasEmbeddedIPv4ClientAddress(java.net.Inet6Address)
*hasEmbeddedIPv4ClientAddress(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean hasEmbeddedIPv4ClientAddress(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.hasEmbeddedIPv4ClientAddress(p0);
}
/**
*{@link java.lang.Thread#holdsLock(java.lang.Object)}
*@see java.lang.Thread#holdsLock(java.lang.Object)
*<code>public static native boolean java.lang.Thread.holdsLock(java.lang.Object)
*holdsLock(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static native boolean holdsLock(java.lang.Object p0){
	return java.lang.Thread.holdsLock(p0);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#homoscedasticTTest(double[],double[],double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#homoscedasticTTest(double[],double[],double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.homoscedasticTTest(double[],double[],double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*homoscedasticTTest(double[] p0,double[] p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean homoscedasticTTest(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.homoscedasticTTest(p0,p1,p2);
}
/**
*{@link com.google.common.primitives.Booleans#indexOf(boolean[],boolean)}
*@see com.google.common.primitives.Booleans#indexOf(boolean[],boolean)
*<code>public static int com.google.common.primitives.Booleans.indexOf(boolean[],boolean)
*indexOf(boolean[] p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(boolean[] p0,boolean p1){
	return com.google.common.primitives.Booleans.indexOf(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean,int)}
*@see org.apache.commons.lang3.ArrayUtils#indexOf(boolean[],boolean,int)
*<code>public static int org.apache.commons.lang3.ArrayUtils.indexOf(boolean[],boolean,int)
*indexOf(boolean[] p0,boolean p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int indexOf(boolean[] p0,boolean p1,int p2){
	return org.apache.commons.lang3.ArrayUtils.indexOf(p0,p1,p2);
}
/**
*{@link org.apache.commons.beanutils.BeanUtils#initCause(java.lang.Throwable,java.lang.Throwable)}
*@see org.apache.commons.beanutils.BeanUtils#initCause(java.lang.Throwable,java.lang.Throwable)
*<code>public static boolean org.apache.commons.beanutils.BeanUtils.initCause(java.lang.Throwable,java.lang.Throwable)
*initCause(java.lang.Throwable p0,java.lang.Throwable p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean initCause(java.lang.Throwable p0,java.lang.Throwable p1){
	return org.apache.commons.beanutils.BeanUtils.initCause(p0,p1);
}
/**
*{@link java.lang.Thread#interrupted()}
*@see java.lang.Thread#interrupted()
*<code>public static boolean java.lang.Thread.interrupted()
*interrupted()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean interrupted(){
	return java.lang.Thread.interrupted();
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,boolean,java.lang.String)}
*@see org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,boolean,java.lang.String)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object,boolean,java.lang.String) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeMethod(java.lang.Object p0,boolean p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeMethod(java.lang.Object p0,boolean p1,java.lang.String p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,boolean,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,boolean,java.lang.String,java.lang.Object...)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object,boolean,java.lang.String,java.lang.Object...) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeMethod(java.lang.Object p0,boolean p1,java.lang.String p2,java.lang.Object... p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeMethod(java.lang.Object p0,boolean p1,java.lang.String p2,java.lang.Object... p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,boolean,java.lang.String,java.lang.Object[],java.lang.Class<?>...)}
*@see org.apache.commons.lang3.reflect.MethodUtils#invokeMethod(java.lang.Object,boolean,java.lang.String,java.lang.Object[],java.lang.Class<?>...)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(java.lang.Object,boolean,java.lang.String,java.lang.Object[],java.lang.Class<?>[]) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException
*invokeMethod(java.lang.Object p0,boolean p1,java.lang.String p2,java.lang.Object[] p3,java.lang.Class<?>... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object invokeMethod(java.lang.Object p0,boolean p1,java.lang.String p2,java.lang.Object[] p3,java.lang.Class<?>... p4) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
	return org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(p0,p1,p2,p3,p4);
}
/**
*{@link com.google.common.net.InetAddresses#is6to4Address(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#is6to4Address(java.net.Inet6Address)
*<code>public static boolean com.google.common.net.InetAddresses.is6to4Address(java.net.Inet6Address)
*is6to4Address(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean is6to4Address(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.is6to4Address(p0);
}
/**
*{@link org.codehaus.plexus.util.cli.CommandLineUtils#isAlive(java.lang.Process)}
*@see org.codehaus.plexus.util.cli.CommandLineUtils#isAlive(java.lang.Process)
*<code>public static boolean org.codehaus.plexus.util.cli.CommandLineUtils.isAlive(java.lang.Process)
*isAlive(java.lang.Process p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAlive(java.lang.Process p0){
	return org.codehaus.plexus.util.cli.CommandLineUtils.isAlive(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isAllBlank(java.lang.CharSequence...)}
*@see org.apache.commons.lang3.StringUtils#isAllBlank(java.lang.CharSequence...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isAllBlank(java.lang.CharSequence...)
*isAllBlank(java.lang.CharSequence... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAllBlank(java.lang.CharSequence... p0){
	return org.apache.commons.lang3.StringUtils.isAllBlank(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isAllEmpty(java.lang.CharSequence...)}
*@see org.apache.commons.lang3.StringUtils#isAllEmpty(java.lang.CharSequence...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isAllEmpty(java.lang.CharSequence...)
*isAllEmpty(java.lang.CharSequence... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAllEmpty(java.lang.CharSequence... p0){
	return org.apache.commons.lang3.StringUtils.isAllEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isAllLowerCase(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isAllLowerCase(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isAllLowerCase(java.lang.CharSequence)
*isAllLowerCase(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAllLowerCase(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAllLowerCase(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isAllUpperCase(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isAllUpperCase(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isAllUpperCase(java.lang.CharSequence)
*isAllUpperCase(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAllUpperCase(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAllUpperCase(p0);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#isAlpha(java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#isAlpha(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.isAlpha(java.lang.String)
*isAlpha(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAlpha(java.lang.String p0){
	return org.codehaus.plexus.util.StringUtils.isAlpha(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isAlpha(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isAlpha(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isAlpha(java.lang.CharSequence)
*isAlpha(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAlpha(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAlpha(p0);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#isAlphaSpace(java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#isAlphaSpace(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.isAlphaSpace(java.lang.String)
*isAlphaSpace(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAlphaSpace(java.lang.String p0){
	return org.codehaus.plexus.util.StringUtils.isAlphaSpace(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isAlphaSpace(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isAlphaSpace(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isAlphaSpace(java.lang.CharSequence)
*isAlphaSpace(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAlphaSpace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAlphaSpace(p0);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#isAlphanumeric(java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#isAlphanumeric(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.isAlphanumeric(java.lang.String)
*isAlphanumeric(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAlphanumeric(java.lang.String p0){
	return org.codehaus.plexus.util.StringUtils.isAlphanumeric(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isAlphanumeric(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isAlphanumeric(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isAlphanumeric(java.lang.CharSequence)
*isAlphanumeric(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAlphanumeric(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAlphanumeric(p0);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#isAlphanumericSpace(java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#isAlphanumericSpace(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.isAlphanumericSpace(java.lang.String)
*isAlphanumericSpace(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAlphanumericSpace(java.lang.String p0){
	return org.codehaus.plexus.util.StringUtils.isAlphanumericSpace(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isAlphanumericSpace(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isAlphanumericSpace(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isAlphanumericSpace(java.lang.CharSequence)
*isAlphanumericSpace(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAlphanumericSpace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAlphanumericSpace(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isAnyBlank(java.lang.CharSequence...)}
*@see org.apache.commons.lang3.StringUtils#isAnyBlank(java.lang.CharSequence...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isAnyBlank(java.lang.CharSequence...)
*isAnyBlank(java.lang.CharSequence... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAnyBlank(java.lang.CharSequence... p0){
	return org.apache.commons.lang3.StringUtils.isAnyBlank(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isAnyEmpty(java.lang.CharSequence...)}
*@see org.apache.commons.lang3.StringUtils#isAnyEmpty(java.lang.CharSequence...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isAnyEmpty(java.lang.CharSequence...)
*isAnyEmpty(java.lang.CharSequence... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAnyEmpty(java.lang.CharSequence... p0){
	return org.apache.commons.lang3.StringUtils.isAnyEmpty(p0);
}
/**
*{@link org.apache.commons.exec.OS#isArch(java.lang.String)}
*@see org.apache.commons.exec.OS#isArch(java.lang.String)
*<code>public static boolean org.apache.commons.exec.OS.isArch(java.lang.String)
*isArch(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isArch(java.lang.String p0){
	return org.apache.commons.exec.OS.isArch(p0);
}
/**
*{@link org.codehaus.plexus.util.Base64#isArrayByteBase64(byte...)}
*@see org.codehaus.plexus.util.Base64#isArrayByteBase64(byte...)
*<code>public static boolean org.codehaus.plexus.util.Base64.isArrayByteBase64(byte[])
*isArrayByteBase64(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isArrayByteBase64(byte... p0){
	return org.codehaus.plexus.util.Base64.isArrayByteBase64(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isArrayIndexValid(T[],int)}
*@see org.apache.commons.lang3.ArrayUtils#isArrayIndexValid(T[],int)
*<code>public static <T> boolean org.apache.commons.lang3.ArrayUtils.isArrayIndexValid(T[],int)
*isArrayIndexValid(T[] p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean isArrayIndexValid(T[] p0,int p1){
	return org.apache.commons.lang3.ArrayUtils.isArrayIndexValid(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#isArrayType(java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#isArrayType(java.lang.reflect.Type)
*<code>public static boolean org.apache.commons.lang3.reflect.TypeUtils.isArrayType(java.lang.reflect.Type)
*isArrayType(java.lang.reflect.Type p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isArrayType(java.lang.reflect.Type p0){
	return org.apache.commons.lang3.reflect.TypeUtils.isArrayType(p0);
}
/**
*{@link org.apache.commons.lang3.CharUtils#isAscii(char)}
*@see org.apache.commons.lang3.CharUtils#isAscii(char)
*<code>public static boolean org.apache.commons.lang3.CharUtils.isAscii(char)
*isAscii(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAscii(char p0){
	return org.apache.commons.lang3.CharUtils.isAscii(p0);
}
/**
*{@link org.apache.commons.lang3.CharUtils#isAsciiAlpha(char)}
*@see org.apache.commons.lang3.CharUtils#isAsciiAlpha(char)
*<code>public static boolean org.apache.commons.lang3.CharUtils.isAsciiAlpha(char)
*isAsciiAlpha(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAsciiAlpha(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiAlpha(p0);
}
/**
*{@link org.apache.commons.lang3.CharUtils#isAsciiAlphaLower(char)}
*@see org.apache.commons.lang3.CharUtils#isAsciiAlphaLower(char)
*<code>public static boolean org.apache.commons.lang3.CharUtils.isAsciiAlphaLower(char)
*isAsciiAlphaLower(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAsciiAlphaLower(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiAlphaLower(p0);
}
/**
*{@link org.apache.commons.lang3.CharUtils#isAsciiAlphaUpper(char)}
*@see org.apache.commons.lang3.CharUtils#isAsciiAlphaUpper(char)
*<code>public static boolean org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper(char)
*isAsciiAlphaUpper(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAsciiAlphaUpper(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper(p0);
}
/**
*{@link org.apache.commons.lang3.CharUtils#isAsciiAlphanumeric(char)}
*@see org.apache.commons.lang3.CharUtils#isAsciiAlphanumeric(char)
*<code>public static boolean org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric(char)
*isAsciiAlphanumeric(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAsciiAlphanumeric(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric(p0);
}
/**
*{@link org.apache.commons.lang3.CharUtils#isAsciiControl(char)}
*@see org.apache.commons.lang3.CharUtils#isAsciiControl(char)
*<code>public static boolean org.apache.commons.lang3.CharUtils.isAsciiControl(char)
*isAsciiControl(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAsciiControl(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiControl(p0);
}
/**
*{@link org.apache.commons.lang3.CharUtils#isAsciiNumeric(char)}
*@see org.apache.commons.lang3.CharUtils#isAsciiNumeric(char)
*<code>public static boolean org.apache.commons.lang3.CharUtils.isAsciiNumeric(char)
*isAsciiNumeric(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAsciiNumeric(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiNumeric(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isAsciiPrintable(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isAsciiPrintable(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isAsciiPrintable(java.lang.CharSequence)
*isAsciiPrintable(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAsciiPrintable(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isAsciiPrintable(p0);
}
/**
*{@link org.apache.commons.lang3.CharUtils#isAsciiPrintable(char)}
*@see org.apache.commons.lang3.CharUtils#isAsciiPrintable(char)
*<code>public static boolean org.apache.commons.lang3.CharUtils.isAsciiPrintable(char)
*isAsciiPrintable(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAsciiPrintable(char p0){
	return org.apache.commons.lang3.CharUtils.isAsciiPrintable(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class<?>[],java.lang.Class<?>[],boolean)}
*@see org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class<?>[],java.lang.Class<?>[],boolean)
*<code>public static boolean org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class<?>[],java.lang.Class<?>[],boolean)
*isAssignable(java.lang.Class<?>[] p0,java.lang.Class<?>[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAssignable(java.lang.Class<?>[] p0,java.lang.Class<?>[] p1,boolean p2){
	return org.apache.commons.lang3.ClassUtils.isAssignable(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class<?>,java.lang.Class<?>)}
*@see org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class<?>,java.lang.Class<?>)
*<code>public static boolean org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class<?>,java.lang.Class<?>)
*isAssignable(java.lang.Class<?> p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAssignable(java.lang.Class<?> p0,java.lang.Class<?> p1){
	return org.apache.commons.lang3.ClassUtils.isAssignable(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class<?>,java.lang.Class<?>,boolean)}
*@see org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class<?>,java.lang.Class<?>,boolean)
*<code>public static boolean org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class<?>,java.lang.Class<?>,boolean)
*isAssignable(java.lang.Class<?> p0,java.lang.Class<?> p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAssignable(java.lang.Class<?> p0,java.lang.Class<?> p1,boolean p2){
	return org.apache.commons.lang3.ClassUtils.isAssignable(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class<?>[],java.lang.Class<?>...)}
*@see org.apache.commons.lang3.ClassUtils#isAssignable(java.lang.Class<?>[],java.lang.Class<?>...)
*<code>public static boolean org.apache.commons.lang3.ClassUtils.isAssignable(java.lang.Class<?>[],java.lang.Class<?>...)
*isAssignable(java.lang.Class<?>[] p0,java.lang.Class<?>... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAssignable(java.lang.Class<?>[] p0,java.lang.Class<?>... p1){
	return org.apache.commons.lang3.ClassUtils.isAssignable(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#isAssignable(java.lang.reflect.Type,java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#isAssignable(java.lang.reflect.Type,java.lang.reflect.Type)
*<code>public static boolean org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type,java.lang.reflect.Type)
*isAssignable(java.lang.reflect.Type p0,java.lang.reflect.Type p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAssignable(java.lang.reflect.Type p0,java.lang.reflect.Type p1){
	return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#isAssignmentCompatible(java.lang.Class<?>,java.lang.Class<?>)}
*@see org.apache.commons.beanutils.MethodUtils#isAssignmentCompatible(java.lang.Class<?>,java.lang.Class<?>)
*<code>public static final boolean org.apache.commons.beanutils.MethodUtils.isAssignmentCompatible(java.lang.Class<?>,java.lang.Class<?>)
*isAssignmentCompatible(java.lang.Class<?> p0,java.lang.Class<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static final boolean isAssignmentCompatible(java.lang.Class<?> p0,java.lang.Class<?> p1){
	return org.apache.commons.beanutils.MethodUtils.isAssignmentCompatible(p0,p1);
}
/**
*{@link org.apache.commons.lang3.LocaleUtils#isAvailableLocale(java.util.Locale)}
*@see org.apache.commons.lang3.LocaleUtils#isAvailableLocale(java.util.Locale)
*<code>public static boolean org.apache.commons.lang3.LocaleUtils.isAvailableLocale(java.util.Locale)
*isAvailableLocale(java.util.Locale p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isAvailableLocale(java.util.Locale p0){
	return org.apache.commons.lang3.LocaleUtils.isAvailableLocale(p0);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#isBlank(java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#isBlank(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.isBlank(java.lang.String)
*isBlank(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isBlank(java.lang.String p0){
	return org.codehaus.plexus.util.StringUtils.isBlank(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isBlank(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isBlank(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isBlank(java.lang.CharSequence)
*isBlank(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isBlank(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isBlank(p0);
}
/**
*{@link org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#isBracketing(org.apache.commons.math3.analysis.UnivariateFunction,double,double)}
*@see org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#isBracketing(org.apache.commons.math3.analysis.UnivariateFunction,double,double)
*<code>public static boolean org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isBracketing(org.apache.commons.math3.analysis.UnivariateFunction,double,double) throws org.apache.commons.math3.exception.NullArgumentException
*isBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isBracketing(org.apache.commons.math3.analysis.UnivariateFunction p0,double p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isBracketing(p0,p1,p2);
}
/**
*{@link com.google.common.net.InetAddresses#isCompatIPv4Address(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#isCompatIPv4Address(java.net.Inet6Address)
*<code>public static boolean com.google.common.net.InetAddresses.isCompatIPv4Address(java.net.Inet6Address)
*isCompatIPv4Address(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isCompatIPv4Address(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.isCompatIPv4Address(p0);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#isCreatable(java.lang.String)}
*@see org.apache.commons.lang3.math.NumberUtils#isCreatable(java.lang.String)
*<code>public static boolean org.apache.commons.lang3.math.NumberUtils.isCreatable(java.lang.String)
*isCreatable(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isCreatable(java.lang.String p0){
	return org.apache.commons.lang3.math.NumberUtils.isCreatable(p0);
}
/**
*{@link org.apache.commons.exec.util.DebugUtils#isDebugEnabled()}
*@see org.apache.commons.exec.util.DebugUtils#isDebugEnabled()
*<code>public static boolean org.apache.commons.exec.util.DebugUtils.isDebugEnabled()
*isDebugEnabled()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isDebugEnabled(){
	return org.apache.commons.exec.util.DebugUtils.isDebugEnabled();
}
/**
*{@link org.apache.commons.text.WordUtils#isDelimiter(char,char...)}
*@see org.apache.commons.text.WordUtils#isDelimiter(char,char...)
*<code>public static boolean org.apache.commons.text.WordUtils.isDelimiter(char,char[])
*isDelimiter(char p0,char... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isDelimiter(char p0,char... p1){
	return org.apache.commons.text.WordUtils.isDelimiter(p0,p1);
}
/**
*{@link org.apache.commons.text.WordUtils#isDelimiter(int,char...)}
*@see org.apache.commons.text.WordUtils#isDelimiter(int,char...)
*<code>public static boolean org.apache.commons.text.WordUtils.isDelimiter(int,char[])
*isDelimiter(int p0,char... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isDelimiter(int p0,char... p1){
	return org.apache.commons.text.WordUtils.isDelimiter(p0,p1);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#isDigits(java.lang.String)}
*@see org.apache.commons.lang3.math.NumberUtils#isDigits(java.lang.String)
*<code>public static boolean org.apache.commons.lang3.math.NumberUtils.isDigits(java.lang.String)
*isDigits(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isDigits(java.lang.String p0){
	return org.apache.commons.lang3.math.NumberUtils.isDigits(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#isEmpty(java.util.Collection<?>)}
*@see org.apache.commons.collections4.CollectionUtils#isEmpty(java.util.Collection<?>)
*<code>public static boolean org.apache.commons.collections4.CollectionUtils.isEmpty(java.util.Collection<?>)
*isEmpty(java.util.Collection<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.util.Collection<?> p0){
	return org.apache.commons.collections4.CollectionUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#isEmpty(java.util.Iterator<?>)}
*@see org.apache.commons.collections4.IteratorUtils#isEmpty(java.util.Iterator<?>)
*<code>public static boolean org.apache.commons.collections4.IteratorUtils.isEmpty(java.util.Iterator<?>)
*isEmpty(java.util.Iterator<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.util.Iterator<?> p0){
	return org.apache.commons.collections4.IteratorUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.collections4.MultiMapUtils#isEmpty(org.apache.commons.collections4.MultiValuedMap<?, ?>)}
*@see org.apache.commons.collections4.MultiMapUtils#isEmpty(org.apache.commons.collections4.MultiValuedMap<?, ?>)
*<code>public static boolean org.apache.commons.collections4.MultiMapUtils.isEmpty(org.apache.commons.collections4.MultiValuedMap<?, ?>)
*isEmpty(org.apache.commons.collections4.MultiValuedMap<?, ?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(org.apache.commons.collections4.MultiValuedMap<?, ?> p0){
	return org.apache.commons.collections4.MultiMapUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#isEmpty(java.lang.Iterable<?>)}
*@see org.apache.commons.collections4.IterableUtils#isEmpty(java.lang.Iterable<?>)
*<code>public static boolean org.apache.commons.collections4.IterableUtils.isEmpty(java.lang.Iterable<?>)
*isEmpty(java.lang.Iterable<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.lang.Iterable<?> p0){
	return org.apache.commons.collections4.IterableUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.collections4.MapUtils#isEmpty(java.util.Map<?, ?>)}
*@see org.apache.commons.collections4.MapUtils#isEmpty(java.util.Map<?, ?>)
*<code>public static boolean org.apache.commons.collections4.MapUtils.isEmpty(java.util.Map<?, ?>)
*isEmpty(java.util.Map<?, ?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.util.Map<?, ?> p0){
	return org.apache.commons.collections4.MapUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#isEmpty(java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#isEmpty(java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.isEmpty(java.util.Collection)
*isEmpty(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#isEmpty(java.util.Map)}
*@see org.apache.commons.collections.MapUtils#isEmpty(java.util.Map)
*<code>public static boolean org.apache.commons.collections.MapUtils.isEmpty(java.util.Map)
*isEmpty(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.isEmpty(p0);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#isEmpty(java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#isEmpty(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.isEmpty(java.lang.String)
*isEmpty(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.lang.String p0){
	return org.codehaus.plexus.util.StringUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isEmpty(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isEmpty(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isEmpty(java.lang.CharSequence)
*isEmpty(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isEmpty(double...)}
*@see org.apache.commons.lang3.ArrayUtils#isEmpty(double...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(double[])
*isEmpty(double... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(double... p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isEmpty(long...)}
*@see org.apache.commons.lang3.ArrayUtils#isEmpty(long...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(long[])
*isEmpty(long... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(long... p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isEmpty(byte...)}
*@see org.apache.commons.lang3.ArrayUtils#isEmpty(byte...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(byte[])
*isEmpty(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(byte... p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isEmpty(char...)}
*@see org.apache.commons.lang3.ArrayUtils#isEmpty(char...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(char[])
*isEmpty(char... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(char... p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isEmpty(java.lang.Object...)}
*@see org.apache.commons.lang3.ArrayUtils#isEmpty(java.lang.Object...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(java.lang.Object[])
*isEmpty(java.lang.Object... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.lang.Object... p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isEmpty(boolean...)}
*@see org.apache.commons.lang3.ArrayUtils#isEmpty(boolean...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(boolean[])
*isEmpty(boolean... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(boolean... p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isEmpty(short...)}
*@see org.apache.commons.lang3.ArrayUtils#isEmpty(short...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(short[])
*isEmpty(short... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(short... p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isEmpty(float...)}
*@see org.apache.commons.lang3.ArrayUtils#isEmpty(float...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(float[])
*isEmpty(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(float... p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isEmpty(int...)}
*@see org.apache.commons.lang3.ArrayUtils#isEmpty(int...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isEmpty(int[])
*isEmpty(int... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(int... p0){
	return org.apache.commons.lang3.ArrayUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#isEmpty(java.lang.Object)}
*@see org.apache.commons.lang3.ObjectUtils#isEmpty(java.lang.Object)
*<code>public static boolean org.apache.commons.lang3.ObjectUtils.isEmpty(java.lang.Object)
*isEmpty(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEmpty(java.lang.Object p0){
	return org.apache.commons.lang3.ObjectUtils.isEmpty(p0);
}
/**
*{@link org.apache.commons.crypto.jna.OpenSslJna#isEnabled()}
*@see org.apache.commons.crypto.jna.OpenSslJna#isEnabled()
*<code>public static boolean org.apache.commons.crypto.jna.OpenSslJna.isEnabled()
*isEnabled()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEnabled(){
	return org.apache.commons.crypto.jna.OpenSslJna.isEnabled();
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#isEqualCollection(java.util.Collection<? extends E>,java.util.Collection<? extends E>,org.apache.commons.collections4.Equator<? super E>)}
*@see org.apache.commons.collections4.CollectionUtils#isEqualCollection(java.util.Collection<? extends E>,java.util.Collection<? extends E>,org.apache.commons.collections4.Equator<? super E>)
*<code>public static <E> boolean org.apache.commons.collections4.CollectionUtils.isEqualCollection(java.util.Collection<? extends E>,java.util.Collection<? extends E>,org.apache.commons.collections4.Equator<? super E>)
*isEqualCollection(java.util.Collection<? extends E> p0,java.util.Collection<? extends E> p1,org.apache.commons.collections4.Equator<? super E> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> boolean isEqualCollection(java.util.Collection<? extends E> p0,java.util.Collection<? extends E> p1,org.apache.commons.collections4.Equator<? super E> p2){
	return org.apache.commons.collections4.CollectionUtils.isEqualCollection(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#isEqualCollection(java.util.Collection<?>,java.util.Collection<?>)}
*@see org.apache.commons.collections4.CollectionUtils#isEqualCollection(java.util.Collection<?>,java.util.Collection<?>)
*<code>public static boolean org.apache.commons.collections4.CollectionUtils.isEqualCollection(java.util.Collection<?>,java.util.Collection<?>)
*isEqualCollection(java.util.Collection<?> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEqualCollection(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.isEqualCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#isEqualCollection(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#isEqualCollection(java.util.Collection,java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.isEqualCollection(java.util.Collection,java.util.Collection)
*isEqualCollection(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEqualCollection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.isEqualCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections4.ListUtils#isEqualList(java.util.Collection<?>,java.util.Collection<?>)}
*@see org.apache.commons.collections4.ListUtils#isEqualList(java.util.Collection<?>,java.util.Collection<?>)
*<code>public static boolean org.apache.commons.collections4.ListUtils.isEqualList(java.util.Collection<?>,java.util.Collection<?>)
*isEqualList(java.util.Collection<?> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEqualList(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.ListUtils.isEqualList(p0,p1);
}
/**
*{@link org.apache.commons.collections.ListUtils#isEqualList(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.ListUtils#isEqualList(java.util.Collection,java.util.Collection)
*<code>public static boolean org.apache.commons.collections.ListUtils.isEqualList(java.util.Collection,java.util.Collection)
*isEqualList(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEqualList(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.ListUtils.isEqualList(p0,p1);
}
/**
*{@link org.apache.commons.collections4.SetUtils#isEqualSet(java.util.Collection<?>,java.util.Collection<?>)}
*@see org.apache.commons.collections4.SetUtils#isEqualSet(java.util.Collection<?>,java.util.Collection<?>)
*<code>public static boolean org.apache.commons.collections4.SetUtils.isEqualSet(java.util.Collection<?>,java.util.Collection<?>)
*isEqualSet(java.util.Collection<?> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEqualSet(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.SetUtils.isEqualSet(p0,p1);
}
/**
*{@link org.apache.commons.collections.SetUtils#isEqualSet(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.SetUtils#isEqualSet(java.util.Collection,java.util.Collection)
*<code>public static boolean org.apache.commons.collections.SetUtils.isEqualSet(java.util.Collection,java.util.Collection)
*isEqualSet(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEqualSet(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.SetUtils.isEqualSet(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isEquals(java.lang.Object,java.lang.Object)}
*@see org.apache.commons.lang3.ArrayUtils#isEquals(java.lang.Object,java.lang.Object)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isEquals(java.lang.Object,java.lang.Object)
*isEquals(java.lang.Object p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isEquals(java.lang.Object p0,java.lang.Object p1){
	return org.apache.commons.lang3.ArrayUtils.isEquals(p0,p1);
}
/**
*{@link org.apache.commons.io.FilenameUtils#isExtension(java.lang.String,java.lang.String...)}
*@see org.apache.commons.io.FilenameUtils#isExtension(java.lang.String,java.lang.String...)
*<code>public static boolean org.apache.commons.io.FilenameUtils.isExtension(java.lang.String,java.lang.String[])
*isExtension(java.lang.String p0,java.lang.String... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isExtension(java.lang.String p0,java.lang.String... p1){
	return org.apache.commons.io.FilenameUtils.isExtension(p0,p1);
}
/**
*{@link org.apache.commons.io.FilenameUtils#isExtension(java.lang.String,java.lang.String)}
*@see org.apache.commons.io.FilenameUtils#isExtension(java.lang.String,java.lang.String)
*<code>public static boolean org.apache.commons.io.FilenameUtils.isExtension(java.lang.String,java.lang.String)
*isExtension(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isExtension(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.io.FilenameUtils.isExtension(p0,p1);
}
/**
*{@link org.apache.commons.io.FilenameUtils#isExtension(java.lang.String,java.util.Collection<java.lang.String>)}
*@see org.apache.commons.io.FilenameUtils#isExtension(java.lang.String,java.util.Collection<java.lang.String>)
*<code>public static boolean org.apache.commons.io.FilenameUtils.isExtension(java.lang.String,java.util.Collection<java.lang.String>)
*isExtension(java.lang.String p0,java.util.Collection<java.lang.String> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isExtension(java.lang.String p0,java.util.Collection<java.lang.String> p1){
	return org.apache.commons.io.FilenameUtils.isExtension(p0,p1);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#isFalse(java.lang.Boolean)}
*@see org.apache.commons.lang3.BooleanUtils#isFalse(java.lang.Boolean)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.isFalse(java.lang.Boolean)
*isFalse(java.lang.Boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFalse(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.isFalse(p0);
}
/**
*{@link org.codehaus.plexus.util.Os#isFamily(java.lang.String)}
*@see org.codehaus.plexus.util.Os#isFamily(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.Os.isFamily(java.lang.String)
*isFamily(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFamily(java.lang.String p0){
	return org.codehaus.plexus.util.Os.isFamily(p0);
}
/**
*{@link org.apache.commons.exec.OS#isFamilyDOS()}
*@see org.apache.commons.exec.OS#isFamilyDOS()
*<code>public static boolean org.apache.commons.exec.OS.isFamilyDOS()
*isFamilyDOS()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFamilyDOS(){
	return org.apache.commons.exec.OS.isFamilyDOS();
}
/**
*{@link org.apache.commons.exec.OS#isFamilyMac()}
*@see org.apache.commons.exec.OS#isFamilyMac()
*<code>public static boolean org.apache.commons.exec.OS.isFamilyMac()
*isFamilyMac()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFamilyMac(){
	return org.apache.commons.exec.OS.isFamilyMac();
}
/**
*{@link org.apache.commons.exec.OS#isFamilyNetware()}
*@see org.apache.commons.exec.OS#isFamilyNetware()
*<code>public static boolean org.apache.commons.exec.OS.isFamilyNetware()
*isFamilyNetware()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFamilyNetware(){
	return org.apache.commons.exec.OS.isFamilyNetware();
}
/**
*{@link org.apache.commons.exec.OS#isFamilyOS2()}
*@see org.apache.commons.exec.OS#isFamilyOS2()
*<code>public static boolean org.apache.commons.exec.OS.isFamilyOS2()
*isFamilyOS2()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFamilyOS2(){
	return org.apache.commons.exec.OS.isFamilyOS2();
}
/**
*{@link org.apache.commons.exec.OS#isFamilyOS400()}
*@see org.apache.commons.exec.OS#isFamilyOS400()
*<code>public static boolean org.apache.commons.exec.OS.isFamilyOS400()
*isFamilyOS400()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFamilyOS400(){
	return org.apache.commons.exec.OS.isFamilyOS400();
}
/**
*{@link org.apache.commons.exec.OS#isFamilyOpenVms()}
*@see org.apache.commons.exec.OS#isFamilyOpenVms()
*<code>public static boolean org.apache.commons.exec.OS.isFamilyOpenVms()
*isFamilyOpenVms()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFamilyOpenVms(){
	return org.apache.commons.exec.OS.isFamilyOpenVms();
}
/**
*{@link org.apache.commons.exec.OS#isFamilyTandem()}
*@see org.apache.commons.exec.OS#isFamilyTandem()
*<code>public static boolean org.apache.commons.exec.OS.isFamilyTandem()
*isFamilyTandem()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFamilyTandem(){
	return org.apache.commons.exec.OS.isFamilyTandem();
}
/**
*{@link org.apache.commons.exec.OS#isFamilyUnix()}
*@see org.apache.commons.exec.OS#isFamilyUnix()
*<code>public static boolean org.apache.commons.exec.OS.isFamilyUnix()
*isFamilyUnix()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFamilyUnix(){
	return org.apache.commons.exec.OS.isFamilyUnix();
}
/**
*{@link org.apache.commons.exec.OS#isFamilyWin9x()}
*@see org.apache.commons.exec.OS#isFamilyWin9x()
*<code>public static boolean org.apache.commons.exec.OS.isFamilyWin9x()
*isFamilyWin9x()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFamilyWin9x(){
	return org.apache.commons.exec.OS.isFamilyWin9x();
}
/**
*{@link org.apache.commons.exec.OS#isFamilyWindows()}
*@see org.apache.commons.exec.OS#isFamilyWindows()
*<code>public static boolean org.apache.commons.exec.OS.isFamilyWindows()
*isFamilyWindows()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFamilyWindows(){
	return org.apache.commons.exec.OS.isFamilyWindows();
}
/**
*{@link org.apache.commons.exec.OS#isFamilyZOS()}
*@see org.apache.commons.exec.OS#isFamilyZOS()
*<code>public static boolean org.apache.commons.exec.OS.isFamilyZOS()
*isFamilyZOS()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFamilyZOS(){
	return org.apache.commons.exec.OS.isFamilyZOS();
}
/**
*{@link org.apache.commons.io.FileUtils#isFileNewer(java.io.File,long)}
*@see org.apache.commons.io.FileUtils#isFileNewer(java.io.File,long)
*<code>public static boolean org.apache.commons.io.FileUtils.isFileNewer(java.io.File,long)
*isFileNewer(java.io.File p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFileNewer(java.io.File p0,long p1){
	return org.apache.commons.io.FileUtils.isFileNewer(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#isFileNewer(java.io.File,java.util.Date)}
*@see org.apache.commons.io.FileUtils#isFileNewer(java.io.File,java.util.Date)
*<code>public static boolean org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.util.Date)
*isFileNewer(java.io.File p0,java.util.Date p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFileNewer(java.io.File p0,java.util.Date p1){
	return org.apache.commons.io.FileUtils.isFileNewer(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#isFileNewer(java.io.File,java.io.File)}
*@see org.apache.commons.io.FileUtils#isFileNewer(java.io.File,java.io.File)
*<code>public static boolean org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.io.File)
*isFileNewer(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFileNewer(java.io.File p0,java.io.File p1){
	return org.apache.commons.io.FileUtils.isFileNewer(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#isFileOlder(java.io.File,java.io.File)}
*@see org.apache.commons.io.FileUtils#isFileOlder(java.io.File,java.io.File)
*<code>public static boolean org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.io.File)
*isFileOlder(java.io.File p0,java.io.File p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFileOlder(java.io.File p0,java.io.File p1){
	return org.apache.commons.io.FileUtils.isFileOlder(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#isFileOlder(java.io.File,long)}
*@see org.apache.commons.io.FileUtils#isFileOlder(java.io.File,long)
*<code>public static boolean org.apache.commons.io.FileUtils.isFileOlder(java.io.File,long)
*isFileOlder(java.io.File p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFileOlder(java.io.File p0,long p1){
	return org.apache.commons.io.FileUtils.isFileOlder(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#isFileOlder(java.io.File,java.util.Date)}
*@see org.apache.commons.io.FileUtils#isFileOlder(java.io.File,java.util.Date)
*<code>public static boolean org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.util.Date)
*isFileOlder(java.io.File p0,java.util.Date p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFileOlder(java.io.File p0,java.util.Date p1){
	return org.apache.commons.io.FileUtils.isFileOlder(p0,p1);
}
/**
*{@link com.google.common.primitives.Doubles#isFinite(double)}
*@see com.google.common.primitives.Doubles#isFinite(double)
*<code>public static boolean com.google.common.primitives.Doubles.isFinite(double)
*isFinite(double p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFinite(double p0){
	return com.google.common.primitives.Doubles.isFinite(p0);
}
/**
*{@link com.google.common.primitives.Floats#isFinite(float)}
*@see com.google.common.primitives.Floats#isFinite(float)
*<code>public static boolean com.google.common.primitives.Floats.isFinite(float)
*isFinite(float p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFinite(float p0){
	return com.google.common.primitives.Floats.isFinite(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#isFull(java.util.Collection<?>)}
*@see org.apache.commons.collections4.CollectionUtils#isFull(java.util.Collection<?>)
*<code>public static boolean org.apache.commons.collections4.CollectionUtils.isFull(java.util.Collection<?>)
*isFull(java.util.Collection<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFull(java.util.Collection<?> p0){
	return org.apache.commons.collections4.CollectionUtils.isFull(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#isFull(java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#isFull(java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.isFull(java.util.Collection)
*isFull(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isFull(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.isFull(p0);
}
/**
*{@link com.google.common.collect.Comparators#isInOrder(java.lang.Iterable<? extends T>,java.util.Comparator<T>)}
*@see com.google.common.collect.Comparators#isInOrder(java.lang.Iterable<? extends T>,java.util.Comparator<T>)
*<code>public static <T> boolean com.google.common.collect.Comparators.isInOrder(java.lang.Iterable<? extends T>,java.util.Comparator<T>)
*isInOrder(java.lang.Iterable<? extends T> p0,java.util.Comparator<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean isInOrder(java.lang.Iterable<? extends T> p0,java.util.Comparator<T> p1){
	return com.google.common.collect.Comparators.isInOrder(p0,p1);
}
/**
*{@link com.google.common.collect.Comparators#isInStrictOrder(java.lang.Iterable<? extends T>,java.util.Comparator<T>)}
*@see com.google.common.collect.Comparators#isInStrictOrder(java.lang.Iterable<? extends T>,java.util.Comparator<T>)
*<code>public static <T> boolean com.google.common.collect.Comparators.isInStrictOrder(java.lang.Iterable<? extends T>,java.util.Comparator<T>)
*isInStrictOrder(java.lang.Iterable<? extends T> p0,java.util.Comparator<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean isInStrictOrder(java.lang.Iterable<? extends T> p0,java.util.Comparator<T> p1){
	return com.google.common.collect.Comparators.isInStrictOrder(p0,p1);
}
/**
*{@link com.google.common.net.InetAddresses#isInetAddress(java.lang.String)}
*@see com.google.common.net.InetAddresses#isInetAddress(java.lang.String)
*<code>public static boolean com.google.common.net.InetAddresses.isInetAddress(java.lang.String)
*isInetAddress(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isInetAddress(java.lang.String p0){
	return com.google.common.net.InetAddresses.isInetAddress(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#isInnerClass(java.lang.Class<?>)}
*@see org.apache.commons.lang3.ClassUtils#isInnerClass(java.lang.Class<?>)
*<code>public static boolean org.apache.commons.lang3.ClassUtils.isInnerClass(java.lang.Class<?>)
*isInnerClass(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isInnerClass(java.lang.Class<?> p0){
	return org.apache.commons.lang3.ClassUtils.isInnerClass(p0);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#isInstance(java.lang.Object,java.lang.reflect.Type)}
*@see org.apache.commons.lang3.reflect.TypeUtils#isInstance(java.lang.Object,java.lang.reflect.Type)
*<code>public static boolean org.apache.commons.lang3.reflect.TypeUtils.isInstance(java.lang.Object,java.lang.reflect.Type)
*isInstance(java.lang.Object p0,java.lang.reflect.Type p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isInstance(java.lang.Object p0,java.lang.reflect.Type p1){
	return org.apache.commons.lang3.reflect.TypeUtils.isInstance(p0,p1);
}
/**
*{@link com.google.common.net.InetAddresses#isIsatapAddress(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#isIsatapAddress(java.net.Inet6Address)
*<code>public static boolean com.google.common.net.InetAddresses.isIsatapAddress(java.net.Inet6Address)
*isIsatapAddress(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isIsatapAddress(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.isIsatapAddress(p0);
}
/**
*{@link org.apache.commons.lang3.SystemUtils#isJavaAwtHeadless()}
*@see org.apache.commons.lang3.SystemUtils#isJavaAwtHeadless()
*<code>public static boolean org.apache.commons.lang3.SystemUtils.isJavaAwtHeadless()
*isJavaAwtHeadless()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isJavaAwtHeadless(){
	return org.apache.commons.lang3.SystemUtils.isJavaAwtHeadless();
}
/**
*{@link org.apache.commons.lang3.SystemUtils#isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion)}
*@see org.apache.commons.lang3.SystemUtils#isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion)
*<code>public static boolean org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion)
*isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion p0){
	return org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(p0);
}
/**
*{@link org.apache.commons.lang3.SystemUtils#isJavaVersionAtMost(org.apache.commons.lang3.JavaVersion)}
*@see org.apache.commons.lang3.SystemUtils#isJavaVersionAtMost(org.apache.commons.lang3.JavaVersion)
*<code>public static boolean org.apache.commons.lang3.SystemUtils.isJavaVersionAtMost(org.apache.commons.lang3.JavaVersion)
*isJavaVersionAtMost(org.apache.commons.lang3.JavaVersion p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isJavaVersionAtMost(org.apache.commons.lang3.JavaVersion p0){
	return org.apache.commons.lang3.SystemUtils.isJavaVersionAtMost(p0);
}
/**
*{@link org.apache.commons.exec.util.DebugUtils#isLenientEnabled()}
*@see org.apache.commons.exec.util.DebugUtils#isLenientEnabled()
*<code>public static boolean org.apache.commons.exec.util.DebugUtils.isLenientEnabled()
*isLenientEnabled()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isLenientEnabled(){
	return org.apache.commons.exec.util.DebugUtils.isLenientEnabled();
}
/**
*{@link com.google.common.base.Ascii#isLowerCase(char)}
*@see com.google.common.base.Ascii#isLowerCase(char)
*<code>public static boolean com.google.common.base.Ascii.isLowerCase(char)
*isLowerCase(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isLowerCase(char p0){
	return com.google.common.base.Ascii.isLowerCase(p0);
}
/**
*{@link com.google.common.net.InetAddresses#isMappedIPv4Address(java.lang.String)}
*@see com.google.common.net.InetAddresses#isMappedIPv4Address(java.lang.String)
*<code>public static boolean com.google.common.net.InetAddresses.isMappedIPv4Address(java.lang.String)
*isMappedIPv4Address(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isMappedIPv4Address(java.lang.String p0){
	return com.google.common.net.InetAddresses.isMappedIPv4Address(p0);
}
/**
*{@link com.google.common.math.DoubleMath#isMathematicalInteger(double)}
*@see com.google.common.math.DoubleMath#isMathematicalInteger(double)
*<code>public static boolean com.google.common.math.DoubleMath.isMathematicalInteger(double)
*isMathematicalInteger(double p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isMathematicalInteger(double p0){
	return com.google.common.math.DoubleMath.isMathematicalInteger(p0);
}
/**
*{@link com.google.common.net.InetAddresses#isMaximum(java.net.InetAddress)}
*@see com.google.common.net.InetAddresses#isMaximum(java.net.InetAddress)
*<code>public static boolean com.google.common.net.InetAddresses.isMaximum(java.net.InetAddress)
*isMaximum(java.net.InetAddress p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isMaximum(java.net.InetAddress p0){
	return com.google.common.net.InetAddresses.isMaximum(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isMixedCase(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isMixedCase(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isMixedCase(java.lang.CharSequence)
*isMixedCase(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isMixedCase(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isMixedCase(p0);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#isMonotonic(T[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)}
*@see org.apache.commons.math3.util.MathArrays#isMonotonic(T[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)
*<code>public static <T> boolean org.apache.commons.math3.util.MathArrays.isMonotonic(T[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)
*isMonotonic(T[] p0,org.apache.commons.math3.util.MathArrays$OrderDirection p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Comparable<? super T> > boolean isMonotonic(T[] p0,org.apache.commons.math3.util.MathArrays.OrderDirection p1,boolean p2){
	return org.apache.commons.math3.util.MathArrays.isMonotonic(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)}
*@see org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)
*<code>public static boolean org.apache.commons.math3.util.MathArrays.isMonotonic(double[],org.apache.commons.math3.util.MathArrays$OrderDirection,boolean)
*isMonotonic(double[] p0,org.apache.commons.math3.util.MathArrays$OrderDirection p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isMonotonic(double[] p0,org.apache.commons.math3.util.MathArrays.OrderDirection p1,boolean p2){
	return org.apache.commons.math3.util.MathArrays.isMonotonic(p0,p1,p2);
}
/**
*{@link org.apache.commons.exec.OS#isName(java.lang.String)}
*@see org.apache.commons.exec.OS#isName(java.lang.String)
*<code>public static boolean org.apache.commons.exec.OS.isName(java.lang.String)
*isName(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isName(java.lang.String p0){
	return org.apache.commons.exec.OS.isName(p0);
}
/**
*{@link org.apache.commons.crypto.Crypto#isNativeCodeLoaded()}
*@see org.apache.commons.crypto.Crypto#isNativeCodeLoaded()
*<code>public static boolean org.apache.commons.crypto.Crypto.isNativeCodeLoaded()
*isNativeCodeLoaded()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNativeCodeLoaded(){
	return org.apache.commons.crypto.Crypto.isNativeCodeLoaded();
}
/**
*{@link org.codehaus.plexus.util.ExceptionUtils#isNestedThrowable(java.lang.Throwable)}
*@see org.codehaus.plexus.util.ExceptionUtils#isNestedThrowable(java.lang.Throwable)
*<code>public static boolean org.codehaus.plexus.util.ExceptionUtils.isNestedThrowable(java.lang.Throwable)
*isNestedThrowable(java.lang.Throwable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNestedThrowable(java.lang.Throwable p0){
	return org.codehaus.plexus.util.ExceptionUtils.isNestedThrowable(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isNoneBlank(java.lang.CharSequence...)}
*@see org.apache.commons.lang3.StringUtils#isNoneBlank(java.lang.CharSequence...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isNoneBlank(java.lang.CharSequence...)
*isNoneBlank(java.lang.CharSequence... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNoneBlank(java.lang.CharSequence... p0){
	return org.apache.commons.lang3.StringUtils.isNoneBlank(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isNoneEmpty(java.lang.CharSequence...)}
*@see org.apache.commons.lang3.StringUtils#isNoneEmpty(java.lang.CharSequence...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isNoneEmpty(java.lang.CharSequence...)
*isNoneEmpty(java.lang.CharSequence... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNoneEmpty(java.lang.CharSequence... p0){
	return org.apache.commons.lang3.StringUtils.isNoneEmpty(p0);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#isNotBlank(java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#isNotBlank(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.isNotBlank(java.lang.String)
*isNotBlank(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotBlank(java.lang.String p0){
	return org.codehaus.plexus.util.StringUtils.isNotBlank(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isNotBlank(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isNotBlank(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isNotBlank(java.lang.CharSequence)
*isNotBlank(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotBlank(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isNotBlank(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#isNotEmpty(java.util.Collection<?>)}
*@see org.apache.commons.collections4.CollectionUtils#isNotEmpty(java.util.Collection<?>)
*<code>public static boolean org.apache.commons.collections4.CollectionUtils.isNotEmpty(java.util.Collection<?>)
*isNotEmpty(java.util.Collection<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(java.util.Collection<?> p0){
	return org.apache.commons.collections4.CollectionUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.collections4.MapUtils#isNotEmpty(java.util.Map<?, ?>)}
*@see org.apache.commons.collections4.MapUtils#isNotEmpty(java.util.Map<?, ?>)
*<code>public static boolean org.apache.commons.collections4.MapUtils.isNotEmpty(java.util.Map<?, ?>)
*isNotEmpty(java.util.Map<?, ?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(java.util.Map<?, ?> p0){
	return org.apache.commons.collections4.MapUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#isNotEmpty(java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#isNotEmpty(java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.isNotEmpty(java.util.Collection)
*isNotEmpty(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(java.util.Collection p0){
	return org.apache.commons.collections.CollectionUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.collections.MapUtils#isNotEmpty(java.util.Map)}
*@see org.apache.commons.collections.MapUtils#isNotEmpty(java.util.Map)
*<code>public static boolean org.apache.commons.collections.MapUtils.isNotEmpty(java.util.Map)
*isNotEmpty(java.util.Map p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(java.util.Map p0){
	return org.apache.commons.collections.MapUtils.isNotEmpty(p0);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#isNotEmpty(java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#isNotEmpty(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.isNotEmpty(java.lang.String)
*isNotEmpty(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(java.lang.String p0){
	return org.codehaus.plexus.util.StringUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isNotEmpty(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isNotEmpty(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isNotEmpty(java.lang.CharSequence)
*isNotEmpty(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isNotEmpty(byte...)}
*@see org.apache.commons.lang3.ArrayUtils#isNotEmpty(byte...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(byte[])
*isNotEmpty(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(byte... p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isNotEmpty(char...)}
*@see org.apache.commons.lang3.ArrayUtils#isNotEmpty(char...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(char[])
*isNotEmpty(char... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(char... p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isNotEmpty(T...)}
*@see org.apache.commons.lang3.ArrayUtils#isNotEmpty(T...)
*<code>public static <T> boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(T[])
*isNotEmpty(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean isNotEmpty(T... p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isNotEmpty(int...)}
*@see org.apache.commons.lang3.ArrayUtils#isNotEmpty(int...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(int[])
*isNotEmpty(int... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(int... p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isNotEmpty(long...)}
*@see org.apache.commons.lang3.ArrayUtils#isNotEmpty(long...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(long[])
*isNotEmpty(long... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(long... p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isNotEmpty(short...)}
*@see org.apache.commons.lang3.ArrayUtils#isNotEmpty(short...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(short[])
*isNotEmpty(short... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(short... p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isNotEmpty(boolean...)}
*@see org.apache.commons.lang3.ArrayUtils#isNotEmpty(boolean...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(boolean[])
*isNotEmpty(boolean... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(boolean... p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isNotEmpty(float...)}
*@see org.apache.commons.lang3.ArrayUtils#isNotEmpty(float...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(float[])
*isNotEmpty(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(float... p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isNotEmpty(double...)}
*@see org.apache.commons.lang3.ArrayUtils#isNotEmpty(double...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isNotEmpty(double[])
*isNotEmpty(double... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(double... p0){
	return org.apache.commons.lang3.ArrayUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#isNotEmpty(java.lang.Object)}
*@see org.apache.commons.lang3.ObjectUtils#isNotEmpty(java.lang.Object)
*<code>public static boolean org.apache.commons.lang3.ObjectUtils.isNotEmpty(java.lang.Object)
*isNotEmpty(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotEmpty(java.lang.Object p0){
	return org.apache.commons.lang3.ObjectUtils.isNotEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#isNotFalse(java.lang.Boolean)}
*@see org.apache.commons.lang3.BooleanUtils#isNotFalse(java.lang.Boolean)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.isNotFalse(java.lang.Boolean)
*isNotFalse(java.lang.Boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotFalse(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.isNotFalse(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#isNotTrue(java.lang.Boolean)}
*@see org.apache.commons.lang3.BooleanUtils#isNotTrue(java.lang.Boolean)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.isNotTrue(java.lang.Boolean)
*isNotTrue(java.lang.Boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNotTrue(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.isNotTrue(p0);
}
/**
*{@link com.google.common.base.Strings#isNullOrEmpty(java.lang.String)}
*@see com.google.common.base.Strings#isNullOrEmpty(java.lang.String)
*<code>public static boolean com.google.common.base.Strings.isNullOrEmpty(java.lang.String)
*isNullOrEmpty(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNullOrEmpty(java.lang.String p0){
	return com.google.common.base.Strings.isNullOrEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)}
*@see org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)
*<code>public static boolean org.apache.commons.lang3.math.NumberUtils.isNumber(java.lang.String)
*isNumber(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNumber(java.lang.String p0){
	return org.apache.commons.lang3.math.NumberUtils.isNumber(p0);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#isNumeric(java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#isNumeric(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.isNumeric(java.lang.String)
*isNumeric(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNumeric(java.lang.String p0){
	return org.codehaus.plexus.util.StringUtils.isNumeric(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isNumeric(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isNumeric(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isNumeric(java.lang.CharSequence)
*isNumeric(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNumeric(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isNumeric(p0);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#isNumericSpace(java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#isNumericSpace(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.isNumericSpace(java.lang.String)
*isNumericSpace(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNumericSpace(java.lang.String p0){
	return org.codehaus.plexus.util.StringUtils.isNumericSpace(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isNumericSpace(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isNumericSpace(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isNumericSpace(java.lang.CharSequence)
*isNumericSpace(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isNumericSpace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isNumericSpace(p0);
}
/**
*{@link org.apache.commons.exec.OS#isOs(java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
*@see org.apache.commons.exec.OS#isOs(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
*<code>public static boolean org.apache.commons.exec.OS.isOs(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
*isOs(java.lang.String p0,java.lang.String p1,java.lang.String p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isOs(java.lang.String p0,java.lang.String p1,java.lang.String p2,java.lang.String p3){
	return org.apache.commons.exec.OS.isOs(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.SelectorUtils#isOutOfDate(java.io.File,java.io.File,int)}
*@see org.codehaus.plexus.util.SelectorUtils#isOutOfDate(java.io.File,java.io.File,int)
*<code>public static boolean org.codehaus.plexus.util.SelectorUtils.isOutOfDate(java.io.File,java.io.File,int)
*isOutOfDate(java.io.File p0,java.io.File p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isOutOfDate(java.io.File p0,java.io.File p1,int p2){
	return org.codehaus.plexus.util.SelectorUtils.isOutOfDate(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.math.NumberUtils#isParsable(java.lang.String)}
*@see org.apache.commons.lang3.math.NumberUtils#isParsable(java.lang.String)
*<code>public static boolean org.apache.commons.lang3.math.NumberUtils.isParsable(java.lang.String)
*isParsable(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isParsable(java.lang.String p0){
	return org.apache.commons.lang3.math.NumberUtils.isParsable(p0);
}
/**
*{@link org.apache.commons.math3.util.ArithmeticUtils#isPowerOfTwo(long)}
*@see org.apache.commons.math3.util.ArithmeticUtils#isPowerOfTwo(long)
*<code>public static boolean org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(long)
*isPowerOfTwo(long p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isPowerOfTwo(long p0){
	return org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(p0);
}
/**
*{@link com.google.common.math.BigIntegerMath#isPowerOfTwo(java.math.BigInteger)}
*@see com.google.common.math.BigIntegerMath#isPowerOfTwo(java.math.BigInteger)
*<code>public static boolean com.google.common.math.BigIntegerMath.isPowerOfTwo(java.math.BigInteger)
*isPowerOfTwo(java.math.BigInteger p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isPowerOfTwo(java.math.BigInteger p0){
	return com.google.common.math.BigIntegerMath.isPowerOfTwo(p0);
}
/**
*{@link com.google.common.math.DoubleMath#isPowerOfTwo(double)}
*@see com.google.common.math.DoubleMath#isPowerOfTwo(double)
*<code>public static boolean com.google.common.math.DoubleMath.isPowerOfTwo(double)
*isPowerOfTwo(double p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isPowerOfTwo(double p0){
	return com.google.common.math.DoubleMath.isPowerOfTwo(p0);
}
/**
*{@link com.google.common.math.IntMath#isPowerOfTwo(int)}
*@see com.google.common.math.IntMath#isPowerOfTwo(int)
*<code>public static boolean com.google.common.math.IntMath.isPowerOfTwo(int)
*isPowerOfTwo(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isPowerOfTwo(int p0){
	return com.google.common.math.IntMath.isPowerOfTwo(p0);
}
/**
*{@link org.apache.commons.math3.primes.Primes#isPrime(int)}
*@see org.apache.commons.math3.primes.Primes#isPrime(int)
*<code>public static boolean org.apache.commons.math3.primes.Primes.isPrime(int)
*isPrime(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isPrime(int p0){
	return org.apache.commons.math3.primes.Primes.isPrime(p0);
}
/**
*{@link com.google.common.math.LongMath#isPrime(long)}
*@see com.google.common.math.LongMath#isPrime(long)
*<code>public static boolean com.google.common.math.LongMath.isPrime(long)
*isPrime(long p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isPrime(long p0){
	return com.google.common.math.LongMath.isPrime(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#isPrimitiveOrWrapper(java.lang.Class<?>)}
*@see org.apache.commons.lang3.ClassUtils#isPrimitiveOrWrapper(java.lang.Class<?>)
*<code>public static boolean org.apache.commons.lang3.ClassUtils.isPrimitiveOrWrapper(java.lang.Class<?>)
*isPrimitiveOrWrapper(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isPrimitiveOrWrapper(java.lang.Class<?> p0){
	return org.apache.commons.lang3.ClassUtils.isPrimitiveOrWrapper(p0);
}
/**
*{@link org.apache.commons.lang3.ClassUtils#isPrimitiveWrapper(java.lang.Class<?>)}
*@see org.apache.commons.lang3.ClassUtils#isPrimitiveWrapper(java.lang.Class<?>)
*<code>public static boolean org.apache.commons.lang3.ClassUtils.isPrimitiveWrapper(java.lang.Class<?>)
*isPrimitiveWrapper(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isPrimitiveWrapper(java.lang.Class<?> p0){
	return org.apache.commons.lang3.ClassUtils.isPrimitiveWrapper(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#isProperSubCollection(java.util.Collection<?>,java.util.Collection<?>)}
*@see org.apache.commons.collections4.CollectionUtils#isProperSubCollection(java.util.Collection<?>,java.util.Collection<?>)
*<code>public static boolean org.apache.commons.collections4.CollectionUtils.isProperSubCollection(java.util.Collection<?>,java.util.Collection<?>)
*isProperSubCollection(java.util.Collection<?> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isProperSubCollection(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.isProperSubCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#isProperSubCollection(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#isProperSubCollection(java.util.Collection,java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.isProperSubCollection(java.util.Collection,java.util.Collection)
*isProperSubCollection(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isProperSubCollection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.isProperSubCollection(p0,p1);
}
/**
*{@link org.apache.commons.exec.util.StringUtils#isQuoted(java.lang.String)}
*@see org.apache.commons.exec.util.StringUtils#isQuoted(java.lang.String)
*<code>public static boolean org.apache.commons.exec.util.StringUtils.isQuoted(java.lang.String)
*isQuoted(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isQuoted(java.lang.String p0){
	return org.apache.commons.exec.util.StringUtils.isQuoted(p0);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#isReadable(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.PropertyUtils#isReadable(java.lang.Object,java.lang.String)
*<code>public static boolean org.apache.commons.beanutils.PropertyUtils.isReadable(java.lang.Object,java.lang.String)
*isReadable(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isReadable(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.beanutils.PropertyUtils.isReadable(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#isSameDay(java.util.Calendar,java.util.Calendar)}
*@see org.apache.commons.lang3.time.DateUtils#isSameDay(java.util.Calendar,java.util.Calendar)
*<code>public static boolean org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Calendar,java.util.Calendar)
*isSameDay(java.util.Calendar p0,java.util.Calendar p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameDay(java.util.Calendar p0,java.util.Calendar p1){
	return org.apache.commons.lang3.time.DateUtils.isSameDay(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#isSameDay(java.util.Date,java.util.Date)}
*@see org.apache.commons.lang3.time.DateUtils#isSameDay(java.util.Date,java.util.Date)
*<code>public static boolean org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Date,java.util.Date)
*isSameDay(java.util.Date p0,java.util.Date p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameDay(java.util.Date p0,java.util.Date p1){
	return org.apache.commons.lang3.time.DateUtils.isSameDay(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)}
*@see org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Date,java.util.Date)
*<code>public static boolean org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Date,java.util.Date)
*isSameInstant(java.util.Date p0,java.util.Date p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameInstant(java.util.Date p0,java.util.Date p1){
	return org.apache.commons.lang3.time.DateUtils.isSameInstant(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)}
*@see org.apache.commons.lang3.time.DateUtils#isSameInstant(java.util.Calendar,java.util.Calendar)
*<code>public static boolean org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Calendar,java.util.Calendar)
*isSameInstant(java.util.Calendar p0,java.util.Calendar p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameInstant(java.util.Calendar p0,java.util.Calendar p1){
	return org.apache.commons.lang3.time.DateUtils.isSameInstant(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSameLength(double[],double...)}
*@see org.apache.commons.lang3.ArrayUtils#isSameLength(double[],double...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(double[],double[])
*isSameLength(double[] p0,double... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameLength(double[] p0,double... p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSameLength(float[],float...)}
*@see org.apache.commons.lang3.ArrayUtils#isSameLength(float[],float...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(float[],float[])
*isSameLength(float[] p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameLength(float[] p0,float... p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSameLength(boolean[],boolean...)}
*@see org.apache.commons.lang3.ArrayUtils#isSameLength(boolean[],boolean...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(boolean[],boolean[])
*isSameLength(boolean[] p0,boolean... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameLength(boolean[] p0,boolean... p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSameLength(int[],int...)}
*@see org.apache.commons.lang3.ArrayUtils#isSameLength(int[],int...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(int[],int[])
*isSameLength(int[] p0,int... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameLength(int[] p0,int... p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSameLength(long[],long...)}
*@see org.apache.commons.lang3.ArrayUtils#isSameLength(long[],long...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(long[],long[])
*isSameLength(long[] p0,long... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameLength(long[] p0,long... p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSameLength(short[],short...)}
*@see org.apache.commons.lang3.ArrayUtils#isSameLength(short[],short...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(short[],short[])
*isSameLength(short[] p0,short... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameLength(short[] p0,short... p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSameLength(java.lang.Object[],java.lang.Object...)}
*@see org.apache.commons.lang3.ArrayUtils#isSameLength(java.lang.Object[],java.lang.Object...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(java.lang.Object[],java.lang.Object[])
*isSameLength(java.lang.Object[] p0,java.lang.Object... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameLength(java.lang.Object[] p0,java.lang.Object... p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSameLength(char[],char...)}
*@see org.apache.commons.lang3.ArrayUtils#isSameLength(char[],char...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(char[],char[])
*isSameLength(char[] p0,char... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameLength(char[] p0,char... p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSameLength(byte[],byte...)}
*@see org.apache.commons.lang3.ArrayUtils#isSameLength(byte[],byte...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSameLength(byte[],byte[])
*isSameLength(byte[] p0,byte... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameLength(byte[] p0,byte... p1){
	return org.apache.commons.lang3.ArrayUtils.isSameLength(p0,p1);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#isSameLocalTime(java.util.Calendar,java.util.Calendar)}
*@see org.apache.commons.lang3.time.DateUtils#isSameLocalTime(java.util.Calendar,java.util.Calendar)
*<code>public static boolean org.apache.commons.lang3.time.DateUtils.isSameLocalTime(java.util.Calendar,java.util.Calendar)
*isSameLocalTime(java.util.Calendar p0,java.util.Calendar p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameLocalTime(java.util.Calendar p0,java.util.Calendar p1){
	return org.apache.commons.lang3.time.DateUtils.isSameLocalTime(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSameType(java.lang.Object,java.lang.Object)}
*@see org.apache.commons.lang3.ArrayUtils#isSameType(java.lang.Object,java.lang.Object)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSameType(java.lang.Object,java.lang.Object)
*isSameType(java.lang.Object p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSameType(java.lang.Object p0,java.lang.Object p1){
	return org.apache.commons.lang3.ArrayUtils.isSameType(p0,p1);
}
/**
*{@link org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#isSequence(double,double,double)}
*@see org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils#isSequence(double,double,double)
*<code>public static boolean org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isSequence(double,double,double)
*isSequence(double p0,double p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSequence(double p0,double p1,double p2){
	return org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils.isSequence(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.ReflectionUtils#isSetter(java.lang.reflect.Method)}
*@see org.codehaus.plexus.util.ReflectionUtils#isSetter(java.lang.reflect.Method)
*<code>public static boolean org.codehaus.plexus.util.ReflectionUtils.isSetter(java.lang.reflect.Method)
*isSetter(java.lang.reflect.Method p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSetter(java.lang.reflect.Method p0){
	return org.codehaus.plexus.util.ReflectionUtils.isSetter(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(long...)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(long...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(long[])
*isSorted(long... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSorted(long... p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(T[],java.util.Comparator<T>)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(T[],java.util.Comparator<T>)
*<code>public static <T> boolean org.apache.commons.lang3.ArrayUtils.isSorted(T[],java.util.Comparator<T>)
*isSorted(T[] p0,java.util.Comparator<T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean isSorted(T[] p0,java.util.Comparator<T> p1){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(T...)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(T...)
*<code>public static <T> boolean org.apache.commons.lang3.ArrayUtils.isSorted(T[])
*isSorted(T... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T extends java.lang.Comparable<? super T> > boolean isSorted(T... p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(int...)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(int...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(int[])
*isSorted(int... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSorted(int... p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(byte...)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(byte...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(byte[])
*isSorted(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSorted(byte... p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(char...)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(char...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(char[])
*isSorted(char... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSorted(char... p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(boolean...)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(boolean...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(boolean[])
*isSorted(boolean... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSorted(boolean... p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(float...)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(float...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(float[])
*isSorted(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSorted(float... p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(short...)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(short...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(short[])
*isSorted(short... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSorted(short... p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#isSorted(double...)}
*@see org.apache.commons.lang3.ArrayUtils#isSorted(double...)
*<code>public static boolean org.apache.commons.lang3.ArrayUtils.isSorted(double[])
*isSorted(double... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSorted(double... p0){
	return org.apache.commons.lang3.ArrayUtils.isSorted(p0);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#isSubCollection(java.util.Collection<?>,java.util.Collection<?>)}
*@see org.apache.commons.collections4.CollectionUtils#isSubCollection(java.util.Collection<?>,java.util.Collection<?>)
*<code>public static boolean org.apache.commons.collections4.CollectionUtils.isSubCollection(java.util.Collection<?>,java.util.Collection<?>)
*isSubCollection(java.util.Collection<?> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSubCollection(java.util.Collection<?> p0,java.util.Collection<?> p1){
	return org.apache.commons.collections4.CollectionUtils.isSubCollection(p0,p1);
}
/**
*{@link org.apache.commons.collections.CollectionUtils#isSubCollection(java.util.Collection,java.util.Collection)}
*@see org.apache.commons.collections.CollectionUtils#isSubCollection(java.util.Collection,java.util.Collection)
*<code>public static boolean org.apache.commons.collections.CollectionUtils.isSubCollection(java.util.Collection,java.util.Collection)
*isSubCollection(java.util.Collection p0,java.util.Collection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSubCollection(java.util.Collection p0,java.util.Collection p1){
	return org.apache.commons.collections.CollectionUtils.isSubCollection(p0,p1);
}
/**
*{@link org.apache.commons.lang3.CharEncoding#isSupported(java.lang.String)}
*@see org.apache.commons.lang3.CharEncoding#isSupported(java.lang.String)
*<code>public static boolean org.apache.commons.lang3.CharEncoding.isSupported(java.lang.String)
*isSupported(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSupported(java.lang.String p0){
	return org.apache.commons.lang3.CharEncoding.isSupported(p0);
}
/**
*{@link org.codehaus.plexus.util.NioFiles#isSymbolicLink(java.io.File)}
*@see org.codehaus.plexus.util.NioFiles#isSymbolicLink(java.io.File)
*<code>public static boolean org.codehaus.plexus.util.NioFiles.isSymbolicLink(java.io.File)
*isSymbolicLink(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSymbolicLink(java.io.File p0){
	return org.codehaus.plexus.util.NioFiles.isSymbolicLink(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#isSymlink(java.io.File)}
*@see org.apache.commons.io.FileUtils#isSymlink(java.io.File)
*<code>public static boolean org.apache.commons.io.FileUtils.isSymlink(java.io.File) throws java.io.IOException
*isSymlink(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSymlink(java.io.File p0) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.isSymlink(p0);
}
/**
*{@link org.apache.commons.math3.linear.MatrixUtils#isSymmetric(org.apache.commons.math3.linear.RealMatrix,double)}
*@see org.apache.commons.math3.linear.MatrixUtils#isSymmetric(org.apache.commons.math3.linear.RealMatrix,double)
*<code>public static boolean org.apache.commons.math3.linear.MatrixUtils.isSymmetric(org.apache.commons.math3.linear.RealMatrix,double)
*isSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isSymmetric(org.apache.commons.math3.linear.RealMatrix p0,double p1){
	return org.apache.commons.math3.linear.MatrixUtils.isSymmetric(p0,p1);
}
/**
*{@link org.apache.commons.io.TaggedIOException#isTaggedWith(java.lang.Throwable,java.lang.Object)}
*@see org.apache.commons.io.TaggedIOException#isTaggedWith(java.lang.Throwable,java.lang.Object)
*<code>public static boolean org.apache.commons.io.TaggedIOException.isTaggedWith(java.lang.Throwable,java.lang.Object)
*isTaggedWith(java.lang.Throwable p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isTaggedWith(java.lang.Throwable p0,java.lang.Object p1){
	return org.apache.commons.io.TaggedIOException.isTaggedWith(p0,p1);
}
/**
*{@link com.google.common.net.InetAddresses#isTeredoAddress(java.net.Inet6Address)}
*@see com.google.common.net.InetAddresses#isTeredoAddress(java.net.Inet6Address)
*<code>public static boolean com.google.common.net.InetAddresses.isTeredoAddress(java.net.Inet6Address)
*isTeredoAddress(java.net.Inet6Address p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isTeredoAddress(java.net.Inet6Address p0){
	return com.google.common.net.InetAddresses.isTeredoAddress(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#isTrue(java.lang.Boolean)}
*@see org.apache.commons.lang3.BooleanUtils#isTrue(java.lang.Boolean)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.isTrue(java.lang.Boolean)
*isTrue(java.lang.Boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isTrue(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.isTrue(p0);
}
/**
*{@link org.apache.commons.lang3.Validate#isTrue(boolean,java.lang.String,long)}
*@see org.apache.commons.lang3.Validate#isTrue(boolean,java.lang.String,long)
*<code>public static void org.apache.commons.lang3.Validate.isTrue(boolean,java.lang.String,long)
*isTrue(boolean p0,java.lang.String p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void isTrue(boolean p0,java.lang.String p1,long p2){
	 org.apache.commons.lang3.Validate.isTrue(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.Validate#isTrue(boolean)}
*@see org.apache.commons.lang3.Validate#isTrue(boolean)
*<code>public static void org.apache.commons.lang3.Validate.isTrue(boolean)
*isTrue(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void isTrue(boolean p0){
	 org.apache.commons.lang3.Validate.isTrue(p0);
}
/**
*{@link org.apache.commons.lang3.Validate#isTrue(boolean,java.lang.String,double)}
*@see org.apache.commons.lang3.Validate#isTrue(boolean,java.lang.String,double)
*<code>public static void org.apache.commons.lang3.Validate.isTrue(boolean,java.lang.String,double)
*isTrue(boolean p0,java.lang.String p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void isTrue(boolean p0,java.lang.String p1,double p2){
	 org.apache.commons.lang3.Validate.isTrue(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.Validate#isTrue(boolean,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.lang3.Validate#isTrue(boolean,java.lang.String,java.lang.Object...)
*<code>public static void org.apache.commons.lang3.Validate.isTrue(boolean,java.lang.String,java.lang.Object...)
*isTrue(boolean p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void isTrue(boolean p0,java.lang.String p1,java.lang.Object... p2){
	 org.apache.commons.lang3.Validate.isTrue(p0,p1,p2);
}
/**
*{@link com.google.common.base.Ascii#isUpperCase(char)}
*@see com.google.common.base.Ascii#isUpperCase(char)
*<code>public static boolean com.google.common.base.Ascii.isUpperCase(char)
*isUpperCase(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isUpperCase(char p0){
	return com.google.common.base.Ascii.isUpperCase(p0);
}
/**
*{@link com.google.common.net.InetAddresses#isUriInetAddress(java.lang.String)}
*@see com.google.common.net.InetAddresses#isUriInetAddress(java.lang.String)
*<code>public static boolean com.google.common.net.InetAddresses.isUriInetAddress(java.lang.String)
*isUriInetAddress(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isUriInetAddress(java.lang.String p0){
	return com.google.common.net.InetAddresses.isUriInetAddress(p0);
}
/**
*{@link com.google.common.net.HostSpecifier#isValid(java.lang.String)}
*@see com.google.common.net.HostSpecifier#isValid(java.lang.String)
*<code>public static boolean com.google.common.net.HostSpecifier.isValid(java.lang.String)
*isValid(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isValid(java.lang.String p0){
	return com.google.common.net.HostSpecifier.isValid(p0);
}
/**
*{@link org.apache.commons.lang3.AnnotationUtils#isValidAnnotationMemberType(java.lang.Class<?>)}
*@see org.apache.commons.lang3.AnnotationUtils#isValidAnnotationMemberType(java.lang.Class<?>)
*<code>public static boolean org.apache.commons.lang3.AnnotationUtils.isValidAnnotationMemberType(java.lang.Class<?>)
*isValidAnnotationMemberType(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isValidAnnotationMemberType(java.lang.Class<?> p0){
	return org.apache.commons.lang3.AnnotationUtils.isValidAnnotationMemberType(p0);
}
/**
*{@link org.apache.commons.lang3.EnumUtils#isValidEnum(java.lang.Class<E>,java.lang.String)}
*@see org.apache.commons.lang3.EnumUtils#isValidEnum(java.lang.Class<E>,java.lang.String)
*<code>public static <E> boolean org.apache.commons.lang3.EnumUtils.isValidEnum(java.lang.Class<E>,java.lang.String)
*isValidEnum(java.lang.Class<E> p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Enum<E> > boolean isValidEnum(java.lang.Class<E> p0,java.lang.String p1){
	return org.apache.commons.lang3.EnumUtils.isValidEnum(p0,p1);
}
/**
*{@link org.apache.commons.lang3.EnumUtils#isValidEnumIgnoreCase(java.lang.Class<E>,java.lang.String)}
*@see org.apache.commons.lang3.EnumUtils#isValidEnumIgnoreCase(java.lang.Class<E>,java.lang.String)
*<code>public static <E> boolean org.apache.commons.lang3.EnumUtils.isValidEnumIgnoreCase(java.lang.Class<E>,java.lang.String)
*isValidEnumIgnoreCase(java.lang.Class<E> p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E extends java.lang.Enum<E> > boolean isValidEnumIgnoreCase(java.lang.Class<E> p0,java.lang.String p1){
	return org.apache.commons.lang3.EnumUtils.isValidEnumIgnoreCase(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.Os#isValidFamily(java.lang.String)}
*@see org.codehaus.plexus.util.Os#isValidFamily(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.Os.isValidFamily(java.lang.String)
*isValidFamily(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isValidFamily(java.lang.String p0){
	return org.codehaus.plexus.util.Os.isValidFamily(p0);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#isValidWindowsFileName(java.io.File)}
*@see org.codehaus.plexus.util.FileUtils#isValidWindowsFileName(java.io.File)
*<code>public static boolean org.codehaus.plexus.util.FileUtils.isValidWindowsFileName(java.io.File)
*isValidWindowsFileName(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isValidWindowsFileName(java.io.File p0){
	return org.codehaus.plexus.util.FileUtils.isValidWindowsFileName(p0);
}
/**
*{@link org.apache.commons.exec.OS#isVersion(java.lang.String)}
*@see org.apache.commons.exec.OS#isVersion(java.lang.String)
*<code>public static boolean org.apache.commons.exec.OS.isVersion(java.lang.String)
*isVersion(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isVersion(java.lang.String p0){
	return org.apache.commons.exec.OS.isVersion(p0);
}
/**
*{@link com.google.common.base.Utf8#isWellFormed(byte...)}
*@see com.google.common.base.Utf8#isWellFormed(byte...)
*<code>public static boolean com.google.common.base.Utf8.isWellFormed(byte[])
*isWellFormed(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isWellFormed(byte... p0){
	return com.google.common.base.Utf8.isWellFormed(p0);
}
/**
*{@link com.google.common.base.Utf8#isWellFormed(byte[],int,int)}
*@see com.google.common.base.Utf8#isWellFormed(byte[],int,int)
*<code>public static boolean com.google.common.base.Utf8.isWellFormed(byte[],int,int)
*isWellFormed(byte[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isWellFormed(byte[] p0,int p1,int p2){
	return com.google.common.base.Utf8.isWellFormed(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#isWhitespace(java.lang.String)}
*@see org.codehaus.plexus.util.StringUtils#isWhitespace(java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.StringUtils.isWhitespace(java.lang.String)
*isWhitespace(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isWhitespace(java.lang.String p0){
	return org.codehaus.plexus.util.StringUtils.isWhitespace(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#isWhitespace(java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#isWhitespace(java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.isWhitespace(java.lang.CharSequence)
*isWhitespace(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isWhitespace(java.lang.CharSequence p0){
	return org.apache.commons.lang3.StringUtils.isWhitespace(p0);
}
/**
*{@link com.google.common.primitives.Primitives#isWrapperType(java.lang.Class<?>)}
*@see com.google.common.primitives.Primitives#isWrapperType(java.lang.Class<?>)
*<code>public static boolean com.google.common.primitives.Primitives.isWrapperType(java.lang.Class<?>)
*isWrapperType(java.lang.Class<?> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isWrapperType(java.lang.Class<?> p0){
	return com.google.common.primitives.Primitives.isWrapperType(p0);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#isWriteable(java.lang.Object,java.lang.String)}
*@see org.apache.commons.beanutils.PropertyUtils#isWriteable(java.lang.Object,java.lang.String)
*<code>public static boolean org.apache.commons.beanutils.PropertyUtils.isWriteable(java.lang.Object,java.lang.String)
*isWriteable(java.lang.Object p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isWriteable(java.lang.Object p0,java.lang.String p1){
	return org.apache.commons.beanutils.PropertyUtils.isWriteable(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.xml.XmlUtil#isXml(java.io.File)}
*@see org.codehaus.plexus.util.xml.XmlUtil#isXml(java.io.File)
*<code>public static boolean org.codehaus.plexus.util.xml.XmlUtil.isXml(java.io.File)
*isXml(java.io.File p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean isXml(java.io.File p0){
	return org.codehaus.plexus.util.xml.XmlUtil.isXml(p0);
}
/**
*{@link org.apache.commons.io.FileUtils#iterateFiles(java.io.File,java.lang.String[],boolean)}
*@see org.apache.commons.io.FileUtils#iterateFiles(java.io.File,java.lang.String[],boolean)
*<code>public static java.util.Iterator<java.io.File> org.apache.commons.io.FileUtils.iterateFiles(java.io.File,java.lang.String[],boolean)
*iterateFiles(java.io.File p0,java.lang.String[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
	return org.apache.commons.io.FileUtils.iterateFiles(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution,double[],double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution,double[],double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution,double[],double) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException
*kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,double p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#kolmogorovSmirnovTest(double[],double[],boolean)}
*@see org.apache.commons.math3.stat.inference.TestUtils#kolmogorovSmirnovTest(double[],double[],boolean)
*<code>public static double org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(double[],double[],boolean) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException
*kolmogorovSmirnovTest(double[] p0,double[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double kolmogorovSmirnovTest(double[] p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution,double[],boolean)}
*@see org.apache.commons.math3.stat.inference.TestUtils#kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution,double[],boolean)
*<code>public static double org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution,double[],boolean) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException
*kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double kolmogorovSmirnovTest(org.apache.commons.math3.distribution.RealDistribution p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.InsufficientDataException,org.apache.commons.math3.exception.NullArgumentException{
	return org.apache.commons.math3.stat.inference.TestUtils.kolmogorovSmirnovTest(p0,p1,p2);
}
/**
*{@link com.google.common.primitives.Booleans#lastIndexOf(boolean[],boolean)}
*@see com.google.common.primitives.Booleans#lastIndexOf(boolean[],boolean)
*<code>public static int com.google.common.primitives.Booleans.lastIndexOf(boolean[],boolean)
*lastIndexOf(boolean[] p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int lastIndexOf(boolean[] p0,boolean p1){
	return com.google.common.primitives.Booleans.lastIndexOf(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean,int)}
*@see org.apache.commons.lang3.ArrayUtils#lastIndexOf(boolean[],boolean,int)
*<code>public static int org.apache.commons.lang3.ArrayUtils.lastIndexOf(boolean[],boolean,int)
*lastIndexOf(boolean[] p0,boolean p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int lastIndexOf(boolean[] p0,boolean p1,int p2){
	return org.apache.commons.lang3.ArrayUtils.lastIndexOf(p0,p1,p2);
}
/**
*{@link com.google.common.base.Throwables#lazyStackTraceIsLazy()}
*@see com.google.common.base.Throwables#lazyStackTraceIsLazy()
*<code>public static boolean com.google.common.base.Throwables.lazyStackTraceIsLazy()
*lazyStackTraceIsLazy()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean lazyStackTraceIsLazy(){
	return com.google.common.base.Throwables.lazyStackTraceIsLazy();
}
/**
*{@link org.apache.commons.io.FileUtils#listFiles(java.io.File,java.lang.String[],boolean)}
*@see org.apache.commons.io.FileUtils#listFiles(java.io.File,java.lang.String[],boolean)
*<code>public static java.util.Collection<java.io.File> org.apache.commons.io.FileUtils.listFiles(java.io.File,java.lang.String[],boolean)
*listFiles(java.io.File p0,java.lang.String[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
	return org.apache.commons.io.FileUtils.listFiles(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.AbstractScanner#match(java.lang.String,java.lang.String)}
*@see org.codehaus.plexus.util.AbstractScanner#match(java.lang.String,java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.AbstractScanner.match(java.lang.String,java.lang.String)
*match(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean match(java.lang.String p0,java.lang.String p1){
	return org.codehaus.plexus.util.AbstractScanner.match(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.SelectorUtils#match(char[],char[],boolean)}
*@see org.codehaus.plexus.util.SelectorUtils#match(char[],char[],boolean)
*<code>public static boolean org.codehaus.plexus.util.SelectorUtils.match(char[],char[],boolean)
*match(char[] p0,char[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean match(char[] p0,char[] p1,boolean p2){
	return org.codehaus.plexus.util.SelectorUtils.match(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.SelectorUtils#match(java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.SelectorUtils#match(java.lang.String,java.lang.String,boolean)
*<code>public static boolean org.codehaus.plexus.util.SelectorUtils.match(java.lang.String,java.lang.String,boolean)
*match(java.lang.String p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean match(java.lang.String p0,java.lang.String p1,boolean p2){
	return org.codehaus.plexus.util.SelectorUtils.match(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.SelectorUtils#matchPath(java.lang.String,java.lang.String)}
*@see org.codehaus.plexus.util.SelectorUtils#matchPath(java.lang.String,java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.SelectorUtils.matchPath(java.lang.String,java.lang.String)
*matchPath(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean matchPath(java.lang.String p0,java.lang.String p1){
	return org.codehaus.plexus.util.SelectorUtils.matchPath(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.SelectorUtils#matchPath(java.lang.String,java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.SelectorUtils#matchPath(java.lang.String,java.lang.String,java.lang.String,boolean)
*<code>public static boolean org.codehaus.plexus.util.SelectorUtils.matchPath(java.lang.String,java.lang.String,java.lang.String,boolean)
*matchPath(java.lang.String p0,java.lang.String p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean matchPath(java.lang.String p0,java.lang.String p1,java.lang.String p2,boolean p3){
	return org.codehaus.plexus.util.SelectorUtils.matchPath(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.SelectorUtils#matchPath(java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.SelectorUtils#matchPath(java.lang.String,java.lang.String,boolean)
*<code>public static boolean org.codehaus.plexus.util.SelectorUtils.matchPath(java.lang.String,java.lang.String,boolean)
*matchPath(java.lang.String p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean matchPath(java.lang.String p0,java.lang.String p1,boolean p2){
	return org.codehaus.plexus.util.SelectorUtils.matchPath(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.SelectorUtils#matchPatternStart(java.lang.String,java.lang.String,boolean)}
*@see org.codehaus.plexus.util.SelectorUtils#matchPatternStart(java.lang.String,java.lang.String,boolean)
*<code>public static boolean org.codehaus.plexus.util.SelectorUtils.matchPatternStart(java.lang.String,java.lang.String,boolean)
*matchPatternStart(java.lang.String p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean matchPatternStart(java.lang.String p0,java.lang.String p1,boolean p2){
	return org.codehaus.plexus.util.SelectorUtils.matchPatternStart(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.SelectorUtils#matchPatternStart(java.lang.String,java.lang.String)}
*@see org.codehaus.plexus.util.SelectorUtils#matchPatternStart(java.lang.String,java.lang.String)
*<code>public static boolean org.codehaus.plexus.util.SelectorUtils.matchPatternStart(java.lang.String,java.lang.String)
*matchPatternStart(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean matchPatternStart(java.lang.String p0,java.lang.String p1){
	return org.codehaus.plexus.util.SelectorUtils.matchPatternStart(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#matchesAll(java.lang.Iterable<C>,org.apache.commons.collections4.Predicate<? super C>)}
*@see org.apache.commons.collections4.CollectionUtils#matchesAll(java.lang.Iterable<C>,org.apache.commons.collections4.Predicate<? super C>)
*<code>public static <C> boolean org.apache.commons.collections4.CollectionUtils.matchesAll(java.lang.Iterable<C>,org.apache.commons.collections4.Predicate<? super C>)
*matchesAll(java.lang.Iterable<C> p0,org.apache.commons.collections4.Predicate<? super C> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <C> boolean matchesAll(java.lang.Iterable<C> p0,org.apache.commons.collections4.Predicate<? super C> p1){
	return org.apache.commons.collections4.CollectionUtils.matchesAll(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#matchesAll(java.util.Iterator<E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.IteratorUtils#matchesAll(java.util.Iterator<E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> boolean org.apache.commons.collections4.IteratorUtils.matchesAll(java.util.Iterator<E>,org.apache.commons.collections4.Predicate<? super E>)
*matchesAll(java.util.Iterator<E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> boolean matchesAll(java.util.Iterator<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IteratorUtils.matchesAll(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#matchesAll(java.lang.Iterable<E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.IterableUtils#matchesAll(java.lang.Iterable<E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> boolean org.apache.commons.collections4.IterableUtils.matchesAll(java.lang.Iterable<E>,org.apache.commons.collections4.Predicate<? super E>)
*matchesAll(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> boolean matchesAll(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IterableUtils.matchesAll(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#matchesAny(java.util.Iterator<E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.IteratorUtils#matchesAny(java.util.Iterator<E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> boolean org.apache.commons.collections4.IteratorUtils.matchesAny(java.util.Iterator<E>,org.apache.commons.collections4.Predicate<? super E>)
*matchesAny(java.util.Iterator<E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> boolean matchesAny(java.util.Iterator<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IteratorUtils.matchesAny(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IterableUtils#matchesAny(java.lang.Iterable<E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.IterableUtils#matchesAny(java.lang.Iterable<E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> boolean org.apache.commons.collections4.IterableUtils.matchesAny(java.lang.Iterable<E>,org.apache.commons.collections4.Predicate<? super E>)
*matchesAny(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> boolean matchesAny(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IterableUtils.matchesAny(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3Dom#mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom,org.codehaus.plexus.util.xml.Xpp3Dom,java.lang.Boolean)}
*@see org.codehaus.plexus.util.xml.Xpp3Dom#mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom,org.codehaus.plexus.util.xml.Xpp3Dom,java.lang.Boolean)
*<code>public static org.codehaus.plexus.util.xml.Xpp3Dom org.codehaus.plexus.util.xml.Xpp3Dom.mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom,org.codehaus.plexus.util.xml.Xpp3Dom,java.lang.Boolean)
*mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom p0,org.codehaus.plexus.util.xml.Xpp3Dom p1,java.lang.Boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.codehaus.plexus.util.xml.Xpp3Dom mergeXpp3Dom(org.codehaus.plexus.util.xml.Xpp3Dom p0,org.codehaus.plexus.util.xml.Xpp3Dom p1,java.lang.Boolean p2){
	return org.codehaus.plexus.util.xml.Xpp3Dom.mergeXpp3Dom(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#monteCarloP(double,int,int,boolean,int)}
*@see org.apache.commons.math3.stat.inference.TestUtils#monteCarloP(double,int,int,boolean,int)
*<code>public static double org.apache.commons.math3.stat.inference.TestUtils.monteCarloP(double,int,int,boolean,int)
*monteCarloP(double p0,int p1,int p2,boolean p3,int p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static double monteCarloP(double p0,int p1,int p2,boolean p3,int p4){
	return org.apache.commons.math3.stat.inference.TestUtils.monteCarloP(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.io.FileUtils#moveDirectoryToDirectory(java.io.File,java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#moveDirectoryToDirectory(java.io.File,java.io.File,boolean)
*<code>public static void org.apache.commons.io.FileUtils.moveDirectoryToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*moveDirectoryToDirectory(java.io.File p0,java.io.File p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void moveDirectoryToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveDirectoryToDirectory(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#moveFileToDirectory(java.io.File,java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#moveFileToDirectory(java.io.File,java.io.File,boolean)
*<code>public static void org.apache.commons.io.FileUtils.moveFileToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*moveFileToDirectory(java.io.File p0,java.io.File p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void moveFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveFileToDirectory(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#moveToDirectory(java.io.File,java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#moveToDirectory(java.io.File,java.io.File,boolean)
*<code>public static void org.apache.commons.io.FileUtils.moveToDirectory(java.io.File,java.io.File,boolean) throws java.io.IOException
*moveToDirectory(java.io.File p0,java.io.File p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void moveToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.moveToDirectory(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#negate(java.lang.Boolean)}
*@see org.apache.commons.lang3.BooleanUtils#negate(java.lang.Boolean)
*<code>public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.negate(java.lang.Boolean)
*negate(java.lang.Boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean negate(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.negate(p0);
}
/**
*{@link org.apache.commons.lang3.RandomUtils#nextBoolean()}
*@see org.apache.commons.lang3.RandomUtils#nextBoolean()
*<code>public static boolean org.apache.commons.lang3.RandomUtils.nextBoolean()
*nextBoolean()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean nextBoolean(){
	return org.apache.commons.lang3.RandomUtils.nextBoolean();
}
/**
*{@link org.apache.commons.io.FilenameUtils#normalize(java.lang.String,boolean)}
*@see org.apache.commons.io.FilenameUtils#normalize(java.lang.String,boolean)
*<code>public static java.lang.String org.apache.commons.io.FilenameUtils.normalize(java.lang.String,boolean)
*normalize(java.lang.String p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String normalize(java.lang.String p0,boolean p1){
	return org.apache.commons.io.FilenameUtils.normalize(p0,p1);
}
/**
*{@link org.apache.commons.io.FilenameUtils#normalizeNoEndSeparator(java.lang.String,boolean)}
*@see org.apache.commons.io.FilenameUtils#normalizeNoEndSeparator(java.lang.String,boolean)
*<code>public static java.lang.String org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator(java.lang.String,boolean)
*normalizeNoEndSeparator(java.lang.String p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String normalizeNoEndSeparator(java.lang.String p0,boolean p1){
	return org.apache.commons.io.FilenameUtils.normalizeNoEndSeparator(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ObjectUtils#notEqual(java.lang.Object,java.lang.Object)}
*@see org.apache.commons.lang3.ObjectUtils#notEqual(java.lang.Object,java.lang.Object)
*<code>public static boolean org.apache.commons.lang3.ObjectUtils.notEqual(java.lang.Object,java.lang.Object)
*notEqual(java.lang.Object p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean notEqual(java.lang.Object p0,java.lang.Object p1){
	return org.apache.commons.lang3.ObjectUtils.notEqual(p0,p1);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#oneWayAnovaTest(java.util.Collection<double[]>,double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#oneWayAnovaTest(java.util.Collection<double[]>,double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.oneWayAnovaTest(java.util.Collection<double[]>,double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.ConvergenceException,org.apache.commons.math3.exception.MaxCountExceededException
*oneWayAnovaTest(java.util.Collection<double[]> p0,double p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean oneWayAnovaTest(java.util.Collection<double[]> p0,double p1) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.ConvergenceException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.oneWayAnovaTest(p0,p1);
}
/**
*{@link org.apache.commons.io.FileUtils#openOutputStream(java.io.File,boolean)}
*@see org.apache.commons.io.FileUtils#openOutputStream(java.io.File,boolean)
*<code>public static java.io.FileOutputStream org.apache.commons.io.FileUtils.openOutputStream(java.io.File,boolean) throws java.io.IOException
*openOutputStream(java.io.File p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.FileOutputStream openOutputStream(java.io.File p0,boolean p1) throws java.io.IOException{
	return org.apache.commons.io.FileUtils.openOutputStream(p0,p1);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#or(java.lang.Boolean...)}
*@see org.apache.commons.lang3.BooleanUtils#or(java.lang.Boolean...)
*<code>public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.or(java.lang.Boolean...)
*or(java.lang.Boolean... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean or(java.lang.Boolean... p0){
	return org.apache.commons.lang3.BooleanUtils.or(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#or(boolean...)}
*@see org.apache.commons.lang3.BooleanUtils#or(boolean...)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.or(boolean...)
*or(boolean... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean or(boolean... p0){
	return org.apache.commons.lang3.BooleanUtils.or(p0);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#pairedTTest(double[],double[],double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#pairedTTest(double[],double[],double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.pairedTTest(double[],double[],double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*pairedTTest(double[] p0,double[] p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean pairedTTest(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NoDataException,org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.pairedTTest(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#parallelRadixSortIndirect(int[],byte[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#parallelRadixSortIndirect(int[],byte[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.parallelRadixSortIndirect(int[],byte[],int,int,boolean)
*parallelRadixSortIndirect(int[] p0,byte[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,byte[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#parallelRadixSortIndirect(int[],byte[],boolean)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#parallelRadixSortIndirect(int[],byte[],boolean)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.parallelRadixSortIndirect(int[],byte[],boolean)
*parallelRadixSortIndirect(int[] p0,byte[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,byte[] p1,boolean p2){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharArrays#parallelRadixSortIndirect(int[],char[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.chars.CharArrays#parallelRadixSortIndirect(int[],char[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.chars.CharArrays.parallelRadixSortIndirect(int[],char[],int,int,boolean)
*parallelRadixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.chars.CharArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharArrays#parallelRadixSortIndirect(int[],char[],boolean)}
*@see it.unimi.dsi.fastutil.chars.CharArrays#parallelRadixSortIndirect(int[],char[],boolean)
*<code>public static void it.unimi.dsi.fastutil.chars.CharArrays.parallelRadixSortIndirect(int[],char[],boolean)
*parallelRadixSortIndirect(int[] p0,char[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,char[] p1,boolean p2){
	 it.unimi.dsi.fastutil.chars.CharArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#parallelRadixSortIndirect(int[],double[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#parallelRadixSortIndirect(int[],double[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.parallelRadixSortIndirect(int[],double[],int,int,boolean)
*parallelRadixSortIndirect(int[] p0,double[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,double[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#parallelRadixSortIndirect(int[],double[],boolean)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#parallelRadixSortIndirect(int[],double[],boolean)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.parallelRadixSortIndirect(int[],double[],boolean)
*parallelRadixSortIndirect(int[] p0,double[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,double[] p1,boolean p2){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSortIndirect(int[],float[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSortIndirect(int[],float[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSortIndirect(int[],float[],int,int,boolean)
*parallelRadixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSortIndirect(int[],float[],boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#parallelRadixSortIndirect(int[],float[],boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSortIndirect(int[],float[],boolean)
*parallelRadixSortIndirect(int[] p0,float[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,float[] p1,boolean p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntArrays#parallelRadixSortIndirect(int[],int[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.ints.IntArrays#parallelRadixSortIndirect(int[],int[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.ints.IntArrays.parallelRadixSortIndirect(int[],int[],int,int,boolean)
*parallelRadixSortIndirect(int[] p0,int[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,int[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.ints.IntArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntArrays#parallelRadixSortIndirect(int[],int[],boolean)}
*@see it.unimi.dsi.fastutil.ints.IntArrays#parallelRadixSortIndirect(int[],int[],boolean)
*<code>public static void it.unimi.dsi.fastutil.ints.IntArrays.parallelRadixSortIndirect(int[],int[],boolean)
*parallelRadixSortIndirect(int[] p0,int[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,int[] p1,boolean p2){
	 it.unimi.dsi.fastutil.ints.IntArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#parallelRadixSortIndirect(int[],long[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#parallelRadixSortIndirect(int[],long[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.parallelRadixSortIndirect(int[],long[],int,int,boolean)
*parallelRadixSortIndirect(int[] p0,long[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,long[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.longs.LongArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#parallelRadixSortIndirect(int[],long[],boolean)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#parallelRadixSortIndirect(int[],long[],boolean)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.parallelRadixSortIndirect(int[],long[],boolean)
*parallelRadixSortIndirect(int[] p0,long[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,long[] p1,boolean p2){
	 it.unimi.dsi.fastutil.longs.LongArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#parallelRadixSortIndirect(int[],short[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#parallelRadixSortIndirect(int[],short[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.parallelRadixSortIndirect(int[],short[],int,int,boolean)
*parallelRadixSortIndirect(int[] p0,short[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,short[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.parallelRadixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#parallelRadixSortIndirect(int[],short[],boolean)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#parallelRadixSortIndirect(int[],short[],boolean)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.parallelRadixSortIndirect(int[],short[],boolean)
*parallelRadixSortIndirect(int[] p0,short[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void parallelRadixSortIndirect(int[] p0,short[] p1,boolean p2){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.parallelRadixSortIndirect(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.TypeFormat#parseBoolean(java.lang.CharSequence)}
*@see org.codehaus.plexus.util.TypeFormat#parseBoolean(java.lang.CharSequence)
*<code>public static boolean org.codehaus.plexus.util.TypeFormat.parseBoolean(java.lang.CharSequence)
*parseBoolean(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean parseBoolean(java.lang.CharSequence p0){
	return org.codehaus.plexus.util.TypeFormat.parseBoolean(p0);
}
/**
*{@link org.apache.commons.math3.util.CompositeFormat#parseFixedstring(java.lang.String,java.lang.String,java.text.ParsePosition)}
*@see org.apache.commons.math3.util.CompositeFormat#parseFixedstring(java.lang.String,java.lang.String,java.text.ParsePosition)
*<code>public static boolean org.apache.commons.math3.util.CompositeFormat.parseFixedstring(java.lang.String,java.lang.String,java.text.ParsePosition)
*parseFixedstring(java.lang.String p0,java.lang.String p1,java.text.ParsePosition p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean parseFixedstring(java.lang.String p0,java.lang.String p1,java.text.ParsePosition p2){
	return org.apache.commons.math3.util.CompositeFormat.parseFixedstring(p0,p1,p2);
}
/**
*{@link org.codehaus.plexus.util.cli.CommandLineUtils#quote(java.lang.String,boolean)}
*@see org.codehaus.plexus.util.cli.CommandLineUtils#quote(java.lang.String,boolean)
*<code>public static java.lang.String org.codehaus.plexus.util.cli.CommandLineUtils.quote(java.lang.String,boolean) throws org.codehaus.plexus.util.cli.CommandLineException
*quote(java.lang.String p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String quote(java.lang.String p0,boolean p1) throws org.codehaus.plexus.util.cli.CommandLineException{
	return org.codehaus.plexus.util.cli.CommandLineUtils.quote(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.cli.CommandLineUtils#quote(java.lang.String,boolean,boolean,boolean)}
*@see org.codehaus.plexus.util.cli.CommandLineUtils#quote(java.lang.String,boolean,boolean,boolean)
*<code>public static java.lang.String org.codehaus.plexus.util.cli.CommandLineUtils.quote(java.lang.String,boolean,boolean,boolean) throws org.codehaus.plexus.util.cli.CommandLineException
*quote(java.lang.String p0,boolean p1,boolean p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String quote(java.lang.String p0,boolean p1,boolean p2,boolean p3) throws org.codehaus.plexus.util.cli.CommandLineException{
	return org.codehaus.plexus.util.cli.CommandLineUtils.quote(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#quoteAndEscape(java.lang.String,char,char[],char[],char,boolean)}
*@see org.codehaus.plexus.util.StringUtils#quoteAndEscape(java.lang.String,char,char[],char[],char,boolean)
*<code>public static java.lang.String org.codehaus.plexus.util.StringUtils.quoteAndEscape(java.lang.String,char,char[],char[],char,boolean)
*quoteAndEscape(java.lang.String p0,char p1,char[] p2,char[] p3,char p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String quoteAndEscape(java.lang.String p0,char p1,char[] p2,char[] p3,char p4,boolean p5){
	return org.codehaus.plexus.util.StringUtils.quoteAndEscape(p0,p1,p2,p3,p4,p5);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#quoteAndEscape(java.lang.String,char,char[],char,boolean)}
*@see org.codehaus.plexus.util.StringUtils#quoteAndEscape(java.lang.String,char,char[],char,boolean)
*<code>public static java.lang.String org.codehaus.plexus.util.StringUtils.quoteAndEscape(java.lang.String,char,char[],char,boolean)
*quoteAndEscape(java.lang.String p0,char p1,char[] p2,char p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String quoteAndEscape(java.lang.String p0,char p1,char[] p2,char p3,boolean p4){
	return org.codehaus.plexus.util.StringUtils.quoteAndEscape(p0,p1,p2,p3,p4);
}
/**
*{@link org.codehaus.plexus.util.StringUtils#quoteAndEscape(java.lang.String,char,char[],char[],java.lang.String,boolean)}
*@see org.codehaus.plexus.util.StringUtils#quoteAndEscape(java.lang.String,char,char[],char[],java.lang.String,boolean)
*<code>public static java.lang.String org.codehaus.plexus.util.StringUtils.quoteAndEscape(java.lang.String,char,char[],char[],java.lang.String,boolean)
*quoteAndEscape(java.lang.String p0,char p1,char[] p2,char[] p3,java.lang.String p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String quoteAndEscape(java.lang.String p0,char p1,char[] p2,char[] p3,java.lang.String p4,boolean p5){
	return org.codehaus.plexus.util.StringUtils.quoteAndEscape(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#radixSortIndirect(int[],byte[],boolean)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#radixSortIndirect(int[],byte[],boolean)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(int[],byte[],boolean)
*radixSortIndirect(int[] p0,byte[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,byte[] p1,boolean p2){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#radixSortIndirect(int[],byte[],byte[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#radixSortIndirect(int[],byte[],byte[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(int[],byte[],byte[],int,int,boolean)
*radixSortIndirect(int[] p0,byte[] p1,byte[] p2,int p3,int p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,byte[] p1,byte[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#radixSortIndirect(int[],byte[],byte[],boolean)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#radixSortIndirect(int[],byte[],byte[],boolean)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(int[],byte[],byte[],boolean)
*radixSortIndirect(int[] p0,byte[] p1,byte[] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,byte[] p1,byte[] p2,boolean p3){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteArrays#radixSortIndirect(int[],byte[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.bytes.ByteArrays#radixSortIndirect(int[],byte[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(int[],byte[],int,int,boolean)
*radixSortIndirect(int[] p0,byte[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,byte[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.bytes.ByteArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSortIndirect(long[][],byte[][],byte[][],boolean)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSortIndirect(long[][],byte[][],byte[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSortIndirect(long[][],byte[][],byte[][],boolean)
*radixSortIndirect(long[][] p0,byte[][] p1,byte[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,byte[][] p1,byte[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSortIndirect(long[][],byte[][],byte[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.bytes.ByteBigArrays#radixSortIndirect(long[][],byte[][],byte[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSortIndirect(long[][],byte[][],byte[][],long,long,boolean)
*radixSortIndirect(long[][] p0,byte[][] p1,byte[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,byte[][] p1,byte[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.bytes.ByteBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharArrays#radixSortIndirect(int[],char[],boolean)}
*@see it.unimi.dsi.fastutil.chars.CharArrays#radixSortIndirect(int[],char[],boolean)
*<code>public static void it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(int[],char[],boolean)
*radixSortIndirect(int[] p0,char[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,char[] p1,boolean p2){
	 it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharArrays#radixSortIndirect(int[],char[],char[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.chars.CharArrays#radixSortIndirect(int[],char[],char[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(int[],char[],char[],int,int,boolean)
*radixSortIndirect(int[] p0,char[] p1,char[] p2,int p3,int p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,char[] p1,char[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharArrays#radixSortIndirect(int[],char[],char[],boolean)}
*@see it.unimi.dsi.fastutil.chars.CharArrays#radixSortIndirect(int[],char[],char[],boolean)
*<code>public static void it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(int[],char[],char[],boolean)
*radixSortIndirect(int[] p0,char[] p1,char[] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,char[] p1,char[] p2,boolean p3){
	 it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharArrays#radixSortIndirect(int[],char[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.chars.CharArrays#radixSortIndirect(int[],char[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(int[],char[],int,int,boolean)
*radixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,char[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.chars.CharArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharBigArrays#radixSortIndirect(long[][],char[][],char[][],boolean)}
*@see it.unimi.dsi.fastutil.chars.CharBigArrays#radixSortIndirect(long[][],char[][],char[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.chars.CharBigArrays.radixSortIndirect(long[][],char[][],char[][],boolean)
*radixSortIndirect(long[][] p0,char[][] p1,char[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,char[][] p1,char[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.chars.CharBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharBigArrays#radixSortIndirect(long[][],char[][],char[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.chars.CharBigArrays#radixSortIndirect(long[][],char[][],char[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.chars.CharBigArrays.radixSortIndirect(long[][],char[][],char[][],long,long,boolean)
*radixSortIndirect(long[][] p0,char[][] p1,char[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,char[][] p1,char[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.chars.CharBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#radixSortIndirect(int[],double[],boolean)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#radixSortIndirect(int[],double[],boolean)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(int[],double[],boolean)
*radixSortIndirect(int[] p0,double[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,double[] p1,boolean p2){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#radixSortIndirect(int[],double[],double[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#radixSortIndirect(int[],double[],double[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(int[],double[],double[],int,int,boolean)
*radixSortIndirect(int[] p0,double[] p1,double[] p2,int p3,int p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,double[] p1,double[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#radixSortIndirect(int[],double[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#radixSortIndirect(int[],double[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(int[],double[],int,int,boolean)
*radixSortIndirect(int[] p0,double[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,double[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleArrays#radixSortIndirect(int[],double[],double[],boolean)}
*@see it.unimi.dsi.fastutil.doubles.DoubleArrays#radixSortIndirect(int[],double[],double[],boolean)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(int[],double[],double[],boolean)
*radixSortIndirect(int[] p0,double[] p1,double[] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,double[] p1,double[] p2,boolean p3){
	 it.unimi.dsi.fastutil.doubles.DoubleArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleBigArrays#radixSortIndirect(long[][],double[][],double[][],boolean)}
*@see it.unimi.dsi.fastutil.doubles.DoubleBigArrays#radixSortIndirect(long[][],double[][],double[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleBigArrays.radixSortIndirect(long[][],double[][],double[][],boolean)
*radixSortIndirect(long[][] p0,double[][] p1,double[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,double[][] p1,double[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.doubles.DoubleBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleBigArrays#radixSortIndirect(long[][],double[][],double[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.doubles.DoubleBigArrays#radixSortIndirect(long[][],double[][],double[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.doubles.DoubleBigArrays.radixSortIndirect(long[][],double[][],double[][],long,long,boolean)
*radixSortIndirect(long[][] p0,double[][] p1,double[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,double[][] p1,double[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.doubles.DoubleBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(int[],float[],boolean)
*radixSortIndirect(int[] p0,float[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,float[] p1,boolean p2){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],float[],boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],float[],boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(int[],float[],float[],boolean)
*radixSortIndirect(int[] p0,float[] p1,float[] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,boolean p3){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],float[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],float[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(int[],float[],float[],int,int,boolean)
*radixSortIndirect(int[] p0,float[] p1,float[] p2,int p3,int p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,float[] p1,float[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatArrays#radixSortIndirect(int[],float[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(int[],float[],int,int,boolean)
*radixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,float[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.floats.FloatArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatBigArrays#radixSortIndirect(long[][],float[][],float[][],boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatBigArrays#radixSortIndirect(long[][],float[][],float[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatBigArrays.radixSortIndirect(long[][],float[][],float[][],boolean)
*radixSortIndirect(long[][] p0,float[][] p1,float[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,float[][] p1,float[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.floats.FloatBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatBigArrays#radixSortIndirect(long[][],float[][],float[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.floats.FloatBigArrays#radixSortIndirect(long[][],float[][],float[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.floats.FloatBigArrays.radixSortIndirect(long[][],float[][],float[][],long,long,boolean)
*radixSortIndirect(long[][] p0,float[][] p1,float[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,float[][] p1,float[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.floats.FloatBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntArrays#radixSortIndirect(int[],int[],boolean)}
*@see it.unimi.dsi.fastutil.ints.IntArrays#radixSortIndirect(int[],int[],boolean)
*<code>public static void it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(int[],int[],boolean)
*radixSortIndirect(int[] p0,int[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,int[] p1,boolean p2){
	 it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntArrays#radixSortIndirect(int[],int[],int[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.ints.IntArrays#radixSortIndirect(int[],int[],int[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(int[],int[],int[],int,int,boolean)
*radixSortIndirect(int[] p0,int[] p1,int[] p2,int p3,int p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,int[] p1,int[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntArrays#radixSortIndirect(int[],int[],int[],boolean)}
*@see it.unimi.dsi.fastutil.ints.IntArrays#radixSortIndirect(int[],int[],int[],boolean)
*<code>public static void it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(int[],int[],int[],boolean)
*radixSortIndirect(int[] p0,int[] p1,int[] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,int[] p1,int[] p2,boolean p3){
	 it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntArrays#radixSortIndirect(int[],int[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.ints.IntArrays#radixSortIndirect(int[],int[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(int[],int[],int,int,boolean)
*radixSortIndirect(int[] p0,int[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,int[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.ints.IntArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntBigArrays#radixSortIndirect(long[][],int[][],int[][],boolean)}
*@see it.unimi.dsi.fastutil.ints.IntBigArrays#radixSortIndirect(long[][],int[][],int[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.ints.IntBigArrays.radixSortIndirect(long[][],int[][],int[][],boolean)
*radixSortIndirect(long[][] p0,int[][] p1,int[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,int[][] p1,int[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.ints.IntBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntBigArrays#radixSortIndirect(long[][],int[][],int[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.ints.IntBigArrays#radixSortIndirect(long[][],int[][],int[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.ints.IntBigArrays.radixSortIndirect(long[][],int[][],int[][],long,long,boolean)
*radixSortIndirect(long[][] p0,int[][] p1,int[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,int[][] p1,int[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.ints.IntBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#radixSortIndirect(int[],long[],boolean)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#radixSortIndirect(int[],long[],boolean)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(int[],long[],boolean)
*radixSortIndirect(int[] p0,long[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,long[] p1,boolean p2){
	 it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#radixSortIndirect(int[],long[],long[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#radixSortIndirect(int[],long[],long[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(int[],long[],long[],int,int,boolean)
*radixSortIndirect(int[] p0,long[] p1,long[] p2,int p3,int p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,long[] p1,long[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#radixSortIndirect(int[],long[],long[],boolean)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#radixSortIndirect(int[],long[],long[],boolean)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(int[],long[],long[],boolean)
*radixSortIndirect(int[] p0,long[] p1,long[] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,long[] p1,long[] p2,boolean p3){
	 it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongArrays#radixSortIndirect(int[],long[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.longs.LongArrays#radixSortIndirect(int[],long[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(int[],long[],int,int,boolean)
*radixSortIndirect(int[] p0,long[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,long[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.longs.LongArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#radixSortIndirect(long[][],long[][],long[][],boolean)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#radixSortIndirect(long[][],long[][],long[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.longs.LongBigArrays.radixSortIndirect(long[][],long[][],long[][],boolean)
*radixSortIndirect(long[][] p0,long[][] p1,long[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,long[][] p1,long[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.longs.LongBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongBigArrays#radixSortIndirect(long[][],long[][],long[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.longs.LongBigArrays#radixSortIndirect(long[][],long[][],long[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.longs.LongBigArrays.radixSortIndirect(long[][],long[][],long[][],long,long,boolean)
*radixSortIndirect(long[][] p0,long[][] p1,long[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,long[][] p1,long[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.longs.LongBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#radixSortIndirect(int[],short[],boolean)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#radixSortIndirect(int[],short[],boolean)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(int[],short[],boolean)
*radixSortIndirect(int[] p0,short[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,short[] p1,boolean p2){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#radixSortIndirect(int[],short[],short[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#radixSortIndirect(int[],short[],short[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(int[],short[],short[],int,int,boolean)
*radixSortIndirect(int[] p0,short[] p1,short[] p2,int p3,int p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,short[] p1,short[] p2,int p3,int p4,boolean p5){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#radixSortIndirect(int[],short[],short[],boolean)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#radixSortIndirect(int[],short[],short[],boolean)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(int[],short[],short[],boolean)
*radixSortIndirect(int[] p0,short[] p1,short[] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,short[] p1,short[] p2,boolean p3){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortArrays#radixSortIndirect(int[],short[],int,int,boolean)}
*@see it.unimi.dsi.fastutil.shorts.ShortArrays#radixSortIndirect(int[],short[],int,int,boolean)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(int[],short[],int,int,boolean)
*radixSortIndirect(int[] p0,short[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(int[] p0,short[] p1,int p2,int p3,boolean p4){
	 it.unimi.dsi.fastutil.shorts.ShortArrays.radixSortIndirect(p0,p1,p2,p3,p4);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortBigArrays#radixSortIndirect(long[][],short[][],short[][],boolean)}
*@see it.unimi.dsi.fastutil.shorts.ShortBigArrays#radixSortIndirect(long[][],short[][],short[][],boolean)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortBigArrays.radixSortIndirect(long[][],short[][],short[][],boolean)
*radixSortIndirect(long[][] p0,short[][] p1,short[][] p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,short[][] p1,short[][] p2,boolean p3){
	 it.unimi.dsi.fastutil.shorts.ShortBigArrays.radixSortIndirect(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortBigArrays#radixSortIndirect(long[][],short[][],short[][],long,long,boolean)}
*@see it.unimi.dsi.fastutil.shorts.ShortBigArrays#radixSortIndirect(long[][],short[][],short[][],long,long,boolean)
*<code>public static void it.unimi.dsi.fastutil.shorts.ShortBigArrays.radixSortIndirect(long[][],short[][],short[][],long,long,boolean)
*radixSortIndirect(long[][] p0,short[][] p1,short[][] p2,long p3,long p4,boolean p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void radixSortIndirect(long[][] p0,short[][] p1,short[][] p2,long p3,long p4,boolean p5){
	 it.unimi.dsi.fastutil.shorts.ShortBigArrays.radixSortIndirect(p0,p1,p2,p3,p4,p5);
}
/**
*{@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)}
*@see org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char[],java.util.Random)
*<code>public static java.lang.String org.apache.commons.lang3.RandomStringUtils.random(int,int,int,boolean,boolean,char[],java.util.Random)
*random(int p0,int p1,int p2,boolean p3,boolean p4,char[] p5,java.util.Random p6)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char[] p5,java.util.Random p6){
	return org.apache.commons.lang3.RandomStringUtils.random(p0,p1,p2,p3,p4,p5,p6);
}
/**
*{@link org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)}
*@see org.apache.commons.lang3.RandomStringUtils#random(int,boolean,boolean)
*<code>public static java.lang.String org.apache.commons.lang3.RandomStringUtils.random(int,boolean,boolean)
*random(int p0,boolean p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String random(int p0,boolean p1,boolean p2){
	return org.apache.commons.lang3.RandomStringUtils.random(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)}
*@see org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean)
*<code>public static java.lang.String org.apache.commons.lang3.RandomStringUtils.random(int,int,int,boolean,boolean)
*random(int p0,int p1,int p2,boolean p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4){
	return org.apache.commons.lang3.RandomStringUtils.random(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char...)}
*@see org.apache.commons.lang3.RandomStringUtils#random(int,int,int,boolean,boolean,char...)
*<code>public static java.lang.String org.apache.commons.lang3.RandomStringUtils.random(int,int,int,boolean,boolean,char...)
*random(int p0,int p1,int p2,boolean p3,boolean p4,char... p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char... p5){
	return org.apache.commons.lang3.RandomStringUtils.random(p0,p1,p2,p3,p4,p5);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readDeclaredField(java.lang.Object,java.lang.String,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readDeclaredField(java.lang.Object,java.lang.String,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(java.lang.Object,java.lang.String,boolean) throws java.lang.IllegalAccessException
*readDeclaredField(java.lang.Object p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readDeclaredField(java.lang.Object p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readDeclaredStaticField(java.lang.Class<?>,java.lang.String,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readDeclaredStaticField(java.lang.Class<?>,java.lang.String,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(java.lang.Class<?>,java.lang.String,boolean) throws java.lang.IllegalAccessException
*readDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.Object,java.lang.String,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.Object,java.lang.String,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.Object,java.lang.String,boolean) throws java.lang.IllegalAccessException
*readField(java.lang.Object p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readField(java.lang.Object p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.reflect.Field,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readField(java.lang.reflect.Field,java.lang.Object,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.reflect.Field,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*readField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.reflect.Field,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.reflect.Field,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field,boolean) throws java.lang.IllegalAccessException
*readStaticField(java.lang.reflect.Field p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readStaticField(java.lang.reflect.Field p0,boolean p1) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readStaticField(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.Class<?>,java.lang.String,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#readStaticField(java.lang.Class<?>,java.lang.String,boolean)
*<code>public static java.lang.Object org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.Class<?>,java.lang.String,boolean) throws java.lang.IllegalAccessException
*readStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object readStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
	return org.apache.commons.lang3.reflect.FieldUtils.readStaticField(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)}
*@see org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)
*<code>public static int org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)
*reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4){
	return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.builder.CompareToBuilder#reflectionCompare(java.lang.Object,java.lang.Object,boolean)
*<code>public static int org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(java.lang.Object,java.lang.Object,boolean)
*reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2){
	return org.apache.commons.lang3.builder.CompareToBuilder.reflectionCompare(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,java.util.Collection<java.lang.String>)}
*@see org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,java.util.Collection<java.lang.String>)
*<code>public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,java.util.Collection<java.lang.String>)
*reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.util.Collection<java.lang.String> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.util.Collection<java.lang.String> p2){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)}
*@see org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)
*<code>public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,java.lang.String...)
*reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,boolean,java.lang.String...)}
*@see org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,boolean,java.lang.String...)
*<code>public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,boolean,java.lang.Class<?>,boolean,java.lang.String...)
*reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,boolean p4,java.lang.String... p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,boolean p4,java.lang.String... p5){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2,p3,p4,p5);
}
/**
*{@link org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,boolean)
*<code>public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,boolean)
*reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,java.lang.String...)}
*@see org.apache.commons.lang3.builder.EqualsBuilder#reflectionEquals(java.lang.Object,java.lang.Object,java.lang.String...)
*<code>public static boolean org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object,java.lang.Object,java.lang.String...)
*reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.lang.String... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.lang.String... p2){
	return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,boolean)}
*@see org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(java.lang.Object,boolean)
*<code>public static int org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object,boolean)
*reflectionHashCode(java.lang.Object p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionHashCode(java.lang.Object p0,boolean p1){
	return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(p0,p1);
}
/**
*{@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,T,boolean,java.lang.Class<? super T>,java.lang.String...)}
*@see org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,T,boolean,java.lang.Class<? super T>,java.lang.String...)
*<code>public static <T> int org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int,int,T,boolean,java.lang.Class<? super T>,java.lang.String...)
*reflectionHashCode(int p0,int p1,T p2,boolean p3,java.lang.Class<? super T> p4,java.lang.String... p5)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> int reflectionHashCode(int p0,int p1,T p2,boolean p3,java.lang.Class<? super T> p4,java.lang.String... p5){
	return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4,p5);
}
/**
*{@link org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.builder.HashCodeBuilder#reflectionHashCode(int,int,java.lang.Object,boolean)
*<code>public static int org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int,int,java.lang.Object,boolean)
*reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3){
	return org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.builder.ToStringBuilder#reflectionToString(T,org.apache.commons.lang3.builder.ToStringStyle,boolean,java.lang.Class<? super T>)}
*@see org.apache.commons.lang3.builder.ToStringBuilder#reflectionToString(T,org.apache.commons.lang3.builder.ToStringStyle,boolean,java.lang.Class<? super T>)
*<code>public static <T> java.lang.String org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(T,org.apache.commons.lang3.builder.ToStringStyle,boolean,java.lang.Class<? super T>)
*reflectionToString(T p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2,java.lang.Class<? super T> p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> java.lang.String reflectionToString(T p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2,java.lang.Class<? super T> p3){
	return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.builder.ToStringBuilder#reflectionToString(java.lang.Object,org.apache.commons.lang3.builder.ToStringStyle,boolean)}
*@see org.apache.commons.lang3.builder.ToStringBuilder#reflectionToString(java.lang.Object,org.apache.commons.lang3.builder.ToStringStyle,boolean)
*<code>public static java.lang.String org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(java.lang.Object,org.apache.commons.lang3.builder.ToStringStyle,boolean)
*reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2){
	return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(p0,p1,p2);
}
/**
*{@link com.google.common.collect.Iterables#removeAll(java.lang.Iterable<?>,java.util.Collection<?>)}
*@see com.google.common.collect.Iterables#removeAll(java.lang.Iterable<?>,java.util.Collection<?>)
*<code>public static boolean com.google.common.collect.Iterables.removeAll(java.lang.Iterable<?>,java.util.Collection<?>)
*removeAll(java.lang.Iterable<?> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean removeAll(java.lang.Iterable<?> p0,java.util.Collection<?> p1){
	return com.google.common.collect.Iterables.removeAll(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#removeAll(java.util.Iterator<?>,java.util.Collection<?>)}
*@see com.google.common.collect.Iterators#removeAll(java.util.Iterator<?>,java.util.Collection<?>)
*<code>public static boolean com.google.common.collect.Iterators.removeAll(java.util.Iterator<?>,java.util.Collection<?>)
*removeAll(java.util.Iterator<?> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean removeAll(java.util.Iterator<?> p0,java.util.Collection<?> p1){
	return com.google.common.collect.Iterators.removeAll(p0,p1);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#removeAllOccurences(boolean[],boolean)}
*@see org.apache.commons.lang3.ArrayUtils#removeAllOccurences(boolean[],boolean)
*<code>public static boolean[] org.apache.commons.lang3.ArrayUtils.removeAllOccurences(boolean[],boolean)
*removeAllOccurences(boolean[] p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean[] removeAllOccurences(boolean[] p0,boolean p1){
	return org.apache.commons.lang3.ArrayUtils.removeAllOccurences(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.PropertyUtils#removeBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector)}
*@see org.apache.commons.beanutils.PropertyUtils#removeBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector)
*<code>public static boolean org.apache.commons.beanutils.PropertyUtils.removeBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector)
*removeBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean removeBeanIntrospector(org.apache.commons.beanutils.BeanIntrospector p0){
	return org.apache.commons.beanutils.PropertyUtils.removeBeanIntrospector(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#removeElement(boolean[],boolean)}
*@see org.apache.commons.lang3.ArrayUtils#removeElement(boolean[],boolean)
*<code>public static boolean[] org.apache.commons.lang3.ArrayUtils.removeElement(boolean[],boolean)
*removeElement(boolean[] p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean[] removeElement(boolean[] p0,boolean p1){
	return org.apache.commons.lang3.ArrayUtils.removeElement(p0,p1);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#removeFinalModifier(java.lang.reflect.Field,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#removeFinalModifier(java.lang.reflect.Field,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.removeFinalModifier(java.lang.reflect.Field,boolean)
*removeFinalModifier(java.lang.reflect.Field p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void removeFinalModifier(java.lang.reflect.Field p0,boolean p1){
	 org.apache.commons.lang3.reflect.FieldUtils.removeFinalModifier(p0,p1);
}
/**
*{@link com.google.common.collect.Iterables#removeIf(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.collect.Iterables#removeIf(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> boolean com.google.common.collect.Iterables.removeIf(java.lang.Iterable<T>,com.google.common.base.Predicate<? super T>)
*removeIf(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean removeIf(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterables.removeIf(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#removeIf(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)}
*@see com.google.common.collect.Iterators#removeIf(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*<code>public static <T> boolean com.google.common.collect.Iterators.removeIf(java.util.Iterator<T>,com.google.common.base.Predicate<? super T>)
*removeIf(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> boolean removeIf(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
	return com.google.common.collect.Iterators.removeIf(p0,p1);
}
/**
*{@link com.google.common.collect.Multisets#removeOccurrences(com.google.common.collect.Multiset<?>,com.google.common.collect.Multiset<?>)}
*@see com.google.common.collect.Multisets#removeOccurrences(com.google.common.collect.Multiset<?>,com.google.common.collect.Multiset<?>)
*<code>public static boolean com.google.common.collect.Multisets.removeOccurrences(com.google.common.collect.Multiset<?>,com.google.common.collect.Multiset<?>)
*removeOccurrences(com.google.common.collect.Multiset<?> p0,com.google.common.collect.Multiset<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean removeOccurrences(com.google.common.collect.Multiset<?> p0,com.google.common.collect.Multiset<?> p1){
	return com.google.common.collect.Multisets.removeOccurrences(p0,p1);
}
/**
*{@link com.google.common.collect.Multisets#removeOccurrences(com.google.common.collect.Multiset<?>,java.lang.Iterable<?>)}
*@see com.google.common.collect.Multisets#removeOccurrences(com.google.common.collect.Multiset<?>,java.lang.Iterable<?>)
*<code>public static boolean com.google.common.collect.Multisets.removeOccurrences(com.google.common.collect.Multiset<?>,java.lang.Iterable<?>)
*removeOccurrences(com.google.common.collect.Multiset<?> p0,java.lang.Iterable<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean removeOccurrences(com.google.common.collect.Multiset<?> p0,java.lang.Iterable<?> p1){
	return com.google.common.collect.Multisets.removeOccurrences(p0,p1);
}
/**
*{@link com.google.common.collect.Iterables#retainAll(java.lang.Iterable<?>,java.util.Collection<?>)}
*@see com.google.common.collect.Iterables#retainAll(java.lang.Iterable<?>,java.util.Collection<?>)
*<code>public static boolean com.google.common.collect.Iterables.retainAll(java.lang.Iterable<?>,java.util.Collection<?>)
*retainAll(java.lang.Iterable<?> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean retainAll(java.lang.Iterable<?> p0,java.util.Collection<?> p1){
	return com.google.common.collect.Iterables.retainAll(p0,p1);
}
/**
*{@link com.google.common.collect.Iterators#retainAll(java.util.Iterator<?>,java.util.Collection<?>)}
*@see com.google.common.collect.Iterators#retainAll(java.util.Iterator<?>,java.util.Collection<?>)
*<code>public static boolean com.google.common.collect.Iterators.retainAll(java.util.Iterator<?>,java.util.Collection<?>)
*retainAll(java.util.Iterator<?> p0,java.util.Collection<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean retainAll(java.util.Iterator<?> p0,java.util.Collection<?> p1){
	return com.google.common.collect.Iterators.retainAll(p0,p1);
}
/**
*{@link com.google.common.collect.Multisets#retainOccurrences(com.google.common.collect.Multiset<?>,com.google.common.collect.Multiset<?>)}
*@see com.google.common.collect.Multisets#retainOccurrences(com.google.common.collect.Multiset<?>,com.google.common.collect.Multiset<?>)
*<code>public static boolean com.google.common.collect.Multisets.retainOccurrences(com.google.common.collect.Multiset<?>,com.google.common.collect.Multiset<?>)
*retainOccurrences(com.google.common.collect.Multiset<?> p0,com.google.common.collect.Multiset<?> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean retainOccurrences(com.google.common.collect.Multiset<?> p0,com.google.common.collect.Multiset<?> p1){
	return com.google.common.collect.Multisets.retainOccurrences(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#set(boolean[][],long,boolean)}
*@see it.unimi.dsi.fastutil.BigArrays#set(boolean[][],long,boolean)
*<code>public static void it.unimi.dsi.fastutil.BigArrays.set(boolean[][],long,boolean)
*set(boolean[][] p0,long p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void set(boolean[][] p0,long p1,boolean p2){
	 it.unimi.dsi.fastutil.BigArrays.set(p0,p1,p2);
}
/**
*{@link java.lang.reflect.AccessibleObject#setAccessible(java.lang.reflect.AccessibleObject[],boolean)}
*@see java.lang.reflect.AccessibleObject#setAccessible(java.lang.reflect.AccessibleObject[],boolean)
*<code>public static void java.lang.reflect.AccessibleObject.setAccessible(java.lang.reflect.AccessibleObject[],boolean)
*setAccessible(java.lang.reflect.AccessibleObject[] p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setAccessible(java.lang.reflect.AccessibleObject[] p0,boolean p1){
	 java.lang.reflect.AccessibleObject.setAccessible(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.locale.LocaleBeanUtils#setApplyLocalized(boolean)}
*@see org.apache.commons.beanutils.locale.LocaleBeanUtils#setApplyLocalized(boolean)
*<code>public static void org.apache.commons.beanutils.locale.LocaleBeanUtils.setApplyLocalized(boolean)
*setApplyLocalized(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setApplyLocalized(boolean p0){
	 org.apache.commons.beanutils.locale.LocaleBeanUtils.setApplyLocalized(p0);
}
/**
*{@link org.apache.commons.beanutils.BeanUtils#setCacheFast(java.util.Map<?, ?>,boolean)}
*@see org.apache.commons.beanutils.BeanUtils#setCacheFast(java.util.Map<?, ?>,boolean)
*<code>public static void org.apache.commons.beanutils.BeanUtils.setCacheFast(java.util.Map<?, ?>,boolean)
*setCacheFast(java.util.Map<?, ?> p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setCacheFast(java.util.Map<?, ?> p0,boolean p1){
	 org.apache.commons.beanutils.BeanUtils.setCacheFast(p0,p1);
}
/**
*{@link org.apache.commons.beanutils.MethodUtils#setCacheMethods(boolean)}
*@see org.apache.commons.beanutils.MethodUtils#setCacheMethods(boolean)
*<code>public static synchronized void org.apache.commons.beanutils.MethodUtils.setCacheMethods(boolean)
*setCacheMethods(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static synchronized void setCacheMethods(boolean p0){
	 org.apache.commons.beanutils.MethodUtils.setCacheMethods(p0);
}
/**
*{@link org.apache.commons.beanutils.ConvertUtils#setDefaultBoolean(boolean)}
*@see org.apache.commons.beanutils.ConvertUtils#setDefaultBoolean(boolean)
*<code>public static void org.apache.commons.beanutils.ConvertUtils.setDefaultBoolean(boolean)
*setDefaultBoolean(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void setDefaultBoolean(boolean p0){
	 org.apache.commons.beanutils.ConvertUtils.setDefaultBoolean(p0);
}
/**
*{@link com.google.common.util.concurrent.MoreExecutors#shutdownAndAwaitTermination(java.util.concurrent.ExecutorService,long,java.util.concurrent.TimeUnit)}
*@see com.google.common.util.concurrent.MoreExecutors#shutdownAndAwaitTermination(java.util.concurrent.ExecutorService,long,java.util.concurrent.TimeUnit)
*<code>public static boolean com.google.common.util.concurrent.MoreExecutors.shutdownAndAwaitTermination(java.util.concurrent.ExecutorService,long,java.util.concurrent.TimeUnit)
*shutdownAndAwaitTermination(java.util.concurrent.ExecutorService p0,long p1,java.util.concurrent.TimeUnit p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean shutdownAndAwaitTermination(java.util.concurrent.ExecutorService p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.MoreExecutors.shutdownAndAwaitTermination(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanSets#singleton(java.lang.Boolean)}
*@see it.unimi.dsi.fastutil.booleans.BooleanSets#singleton(java.lang.Boolean)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanSet it.unimi.dsi.fastutil.booleans.BooleanSets.singleton(java.lang.Boolean)
*singleton(java.lang.Boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanSet singleton(java.lang.Boolean p0){
	return it.unimi.dsi.fastutil.booleans.BooleanSets.singleton(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions#singleton(java.lang.Byte,java.lang.Boolean)}
*@see it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions#singleton(java.lang.Byte,java.lang.Boolean)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions.singleton(java.lang.Byte,java.lang.Boolean)
*singleton(java.lang.Byte p0,java.lang.Boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction singleton(java.lang.Byte p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#singleton(java.lang.Byte,java.lang.Boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#singleton(java.lang.Byte,java.lang.Boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.singleton(java.lang.Byte,java.lang.Boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(java.lang.Byte p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(java.lang.Byte p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2BooleanFunctions#singleton(java.lang.Character,java.lang.Boolean)}
*@see it.unimi.dsi.fastutil.chars.Char2BooleanFunctions#singleton(java.lang.Character,java.lang.Boolean)
*<code>public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction it.unimi.dsi.fastutil.chars.Char2BooleanFunctions.singleton(java.lang.Character,java.lang.Boolean)
*singleton(java.lang.Character p0,java.lang.Boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction singleton(java.lang.Character p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.chars.Char2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps#singleton(java.lang.Character,java.lang.Boolean,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps#singleton(java.lang.Character,java.lang.Boolean,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(java.lang.Character,java.lang.Boolean,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(java.lang.Character p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(java.lang.Character p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions#singleton(java.lang.Double,java.lang.Boolean)}
*@see it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions#singleton(java.lang.Double,java.lang.Boolean)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions.singleton(java.lang.Double,java.lang.Boolean)
*singleton(java.lang.Double p0,java.lang.Boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction singleton(java.lang.Double p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#singleton(java.lang.Double,java.lang.Boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#singleton(java.lang.Double,java.lang.Boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.singleton(java.lang.Double,java.lang.Boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(java.lang.Double p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap singleton(java.lang.Double p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2BooleanFunctions#singleton(java.lang.Float,java.lang.Boolean)}
*@see it.unimi.dsi.fastutil.floats.Float2BooleanFunctions#singleton(java.lang.Float,java.lang.Boolean)
*<code>public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction it.unimi.dsi.fastutil.floats.Float2BooleanFunctions.singleton(java.lang.Float,java.lang.Boolean)
*singleton(java.lang.Float p0,java.lang.Boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction singleton(java.lang.Float p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.floats.Float2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#singleton(java.lang.Float,java.lang.Boolean,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#singleton(java.lang.Float,java.lang.Boolean,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.singleton(java.lang.Float,java.lang.Boolean,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(java.lang.Float p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap singleton(java.lang.Float p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2BooleanFunctions#singleton(java.lang.Integer,java.lang.Boolean)}
*@see it.unimi.dsi.fastutil.ints.Int2BooleanFunctions#singleton(java.lang.Integer,java.lang.Boolean)
*<code>public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction it.unimi.dsi.fastutil.ints.Int2BooleanFunctions.singleton(java.lang.Integer,java.lang.Boolean)
*singleton(java.lang.Integer p0,java.lang.Boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction singleton(java.lang.Integer p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.ints.Int2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps#singleton(java.lang.Integer,java.lang.Boolean,it.unimi.dsi.fastutil.ints.IntComparator)}
*@see it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps#singleton(java.lang.Integer,java.lang.Boolean,it.unimi.dsi.fastutil.ints.IntComparator)
*<code>public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.singleton(java.lang.Integer,java.lang.Boolean,it.unimi.dsi.fastutil.ints.IntComparator)
*singleton(java.lang.Integer p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(java.lang.Integer p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2BooleanFunctions#singleton(java.lang.Long,java.lang.Boolean)}
*@see it.unimi.dsi.fastutil.longs.Long2BooleanFunctions#singleton(java.lang.Long,java.lang.Boolean)
*<code>public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction it.unimi.dsi.fastutil.longs.Long2BooleanFunctions.singleton(java.lang.Long,java.lang.Boolean)
*singleton(java.lang.Long p0,java.lang.Boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction singleton(java.lang.Long p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.longs.Long2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#singleton(java.lang.Long,java.lang.Boolean,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#singleton(java.lang.Long,java.lang.Boolean,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.singleton(java.lang.Long,java.lang.Boolean,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(java.lang.Long p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(java.lang.Long p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2BooleanFunctions#singleton(K,java.lang.Boolean)}
*@see it.unimi.dsi.fastutil.objects.Object2BooleanFunctions#singleton(K,java.lang.Boolean)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.singleton(K,java.lang.Boolean)
*singleton(K p0,java.lang.Boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> singleton(K p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps#singleton(K,java.lang.Boolean,java.util.Comparator<? super K>)}
*@see it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps#singleton(K,java.lang.Boolean,java.util.Comparator<? super K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.singleton(K,java.lang.Boolean,java.util.Comparator<? super K>)
*singleton(K p0,java.lang.Boolean p1,java.util.Comparator<? super K> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> singleton(K p0,java.lang.Boolean p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions#singleton(java.lang.Short,java.lang.Boolean)}
*@see it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions#singleton(java.lang.Short,java.lang.Boolean)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions.singleton(java.lang.Short,java.lang.Boolean)
*singleton(java.lang.Short p0,java.lang.Boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction singleton(java.lang.Short p0,java.lang.Boolean p1){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#singleton(java.lang.Short,java.lang.Boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#singleton(java.lang.Short,java.lang.Boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.singleton(java.lang.Short,java.lang.Boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(java.lang.Short p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap singleton(java.lang.Short p0,java.lang.Boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanBigListIterators#singleton(boolean)}
*@see it.unimi.dsi.fastutil.booleans.BooleanBigListIterators#singleton(boolean)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanBigListIterator it.unimi.dsi.fastutil.booleans.BooleanBigListIterators.singleton(boolean)
*singleton(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanBigListIterator singleton(boolean p0){
	return it.unimi.dsi.fastutil.booleans.BooleanBigListIterators.singleton(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions#singleton(byte,boolean)}
*@see it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions#singleton(byte,boolean)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions.singleton(byte,boolean)
*singleton(byte p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction singleton(byte p0,boolean p1){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#singleton(byte,boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)}
*@see it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps#singleton(byte,boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)
*<code>public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.singleton(byte,boolean,it.unimi.dsi.fastutil.bytes.ByteComparator)
*singleton(byte p0,boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap singleton(byte p0,boolean p1,it.unimi.dsi.fastutil.bytes.ByteComparator p2){
	return it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2BooleanFunctions#singleton(char,boolean)}
*@see it.unimi.dsi.fastutil.chars.Char2BooleanFunctions#singleton(char,boolean)
*<code>public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction it.unimi.dsi.fastutil.chars.Char2BooleanFunctions.singleton(char,boolean)
*singleton(char p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction singleton(char p0,boolean p1){
	return it.unimi.dsi.fastutil.chars.Char2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps#singleton(char,boolean,it.unimi.dsi.fastutil.chars.CharComparator)}
*@see it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps#singleton(char,boolean,it.unimi.dsi.fastutil.chars.CharComparator)
*<code>public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(char,boolean,it.unimi.dsi.fastutil.chars.CharComparator)
*singleton(char p0,boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap singleton(char p0,boolean p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
	return it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions#singleton(double,boolean)}
*@see it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions#singleton(double,boolean)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions.singleton(double,boolean)
*singleton(double p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction singleton(double p0,boolean p1){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#singleton(double,boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)}
*@see it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps#singleton(double,boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*<code>public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.singleton(double,boolean,it.unimi.dsi.fastutil.doubles.DoubleComparator)
*singleton(double p0,boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap singleton(double p0,boolean p1,it.unimi.dsi.fastutil.doubles.DoubleComparator p2){
	return it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2BooleanFunctions#singleton(float,boolean)}
*@see it.unimi.dsi.fastutil.floats.Float2BooleanFunctions#singleton(float,boolean)
*<code>public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction it.unimi.dsi.fastutil.floats.Float2BooleanFunctions.singleton(float,boolean)
*singleton(float p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction singleton(float p0,boolean p1){
	return it.unimi.dsi.fastutil.floats.Float2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#singleton(float,boolean,it.unimi.dsi.fastutil.floats.FloatComparator)}
*@see it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps#singleton(float,boolean,it.unimi.dsi.fastutil.floats.FloatComparator)
*<code>public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.singleton(float,boolean,it.unimi.dsi.fastutil.floats.FloatComparator)
*singleton(float p0,boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap singleton(float p0,boolean p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
	return it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2BooleanFunctions#singleton(int,boolean)}
*@see it.unimi.dsi.fastutil.ints.Int2BooleanFunctions#singleton(int,boolean)
*<code>public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction it.unimi.dsi.fastutil.ints.Int2BooleanFunctions.singleton(int,boolean)
*singleton(int p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction singleton(int p0,boolean p1){
	return it.unimi.dsi.fastutil.ints.Int2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps#singleton(int,boolean,it.unimi.dsi.fastutil.ints.IntComparator)}
*@see it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps#singleton(int,boolean,it.unimi.dsi.fastutil.ints.IntComparator)
*<code>public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.singleton(int,boolean,it.unimi.dsi.fastutil.ints.IntComparator)
*singleton(int p0,boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap singleton(int p0,boolean p1,it.unimi.dsi.fastutil.ints.IntComparator p2){
	return it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2BooleanFunctions#singleton(long,boolean)}
*@see it.unimi.dsi.fastutil.longs.Long2BooleanFunctions#singleton(long,boolean)
*<code>public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction it.unimi.dsi.fastutil.longs.Long2BooleanFunctions.singleton(long,boolean)
*singleton(long p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction singleton(long p0,boolean p1){
	return it.unimi.dsi.fastutil.longs.Long2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#singleton(long,boolean,it.unimi.dsi.fastutil.longs.LongComparator)}
*@see it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps#singleton(long,boolean,it.unimi.dsi.fastutil.longs.LongComparator)
*<code>public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.singleton(long,boolean,it.unimi.dsi.fastutil.longs.LongComparator)
*singleton(long p0,boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap singleton(long p0,boolean p1,it.unimi.dsi.fastutil.longs.LongComparator p2){
	return it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2BooleanFunctions#singleton(K,boolean)}
*@see it.unimi.dsi.fastutil.objects.Object2BooleanFunctions#singleton(K,boolean)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.singleton(K,boolean)
*singleton(K p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> singleton(K p0,boolean p1){
	return it.unimi.dsi.fastutil.objects.Object2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps#singleton(K,boolean,java.util.Comparator<? super K>)}
*@see it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps#singleton(K,boolean,java.util.Comparator<? super K>)
*<code>public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.singleton(K,boolean,java.util.Comparator<? super K>)
*singleton(K p0,boolean p1,java.util.Comparator<? super K> p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> singleton(K p0,boolean p1,java.util.Comparator<? super K> p2){
	return it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions#singleton(short,boolean)}
*@see it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions#singleton(short,boolean)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions.singleton(short,boolean)
*singleton(short p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction singleton(short p0,boolean p1){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions.singleton(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#singleton(short,boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)}
*@see it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps#singleton(short,boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)
*<code>public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.singleton(short,boolean,it.unimi.dsi.fastutil.shorts.ShortComparator)
*singleton(short p0,boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap singleton(short p0,boolean p1,it.unimi.dsi.fastutil.shorts.ShortComparator p2){
	return it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps.singleton(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.filefilter.FileFilterUtils#sizeFileFilter(long,boolean)}
*@see org.apache.commons.io.filefilter.FileFilterUtils#sizeFileFilter(long,boolean)
*<code>public static org.apache.commons.io.filefilter.IOFileFilter org.apache.commons.io.filefilter.FileFilterUtils.sizeFileFilter(long,boolean)
*sizeFileFilter(long p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.io.filefilter.IOFileFilter sizeFileFilter(long p0,boolean p1){
	return org.apache.commons.io.filefilter.FileFilterUtils.sizeFileFilter(p0,p1);
}
/**
*{@link org.apache.commons.collections4.CollectionUtils#sizeIsEmpty(java.lang.Object)}
*@see org.apache.commons.collections4.CollectionUtils#sizeIsEmpty(java.lang.Object)
*<code>public static boolean org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(java.lang.Object)
*sizeIsEmpty(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean sizeIsEmpty(java.lang.Object p0){
	return org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(p0);
}
/**
*{@link org.apache.commons.lang3.StringUtils#startsWith(java.lang.CharSequence,java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#startsWith(java.lang.CharSequence,java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.startsWith(java.lang.CharSequence,java.lang.CharSequence)
*startsWith(java.lang.CharSequence p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean startsWith(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.startsWith(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#startsWithAny(java.lang.CharSequence,java.lang.CharSequence...)}
*@see org.apache.commons.lang3.StringUtils#startsWithAny(java.lang.CharSequence,java.lang.CharSequence...)
*<code>public static boolean org.apache.commons.lang3.StringUtils.startsWithAny(java.lang.CharSequence,java.lang.CharSequence...)
*startsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean startsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
	return org.apache.commons.lang3.StringUtils.startsWithAny(p0,p1);
}
/**
*{@link org.apache.commons.lang3.StringUtils#startsWithIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)}
*@see org.apache.commons.lang3.StringUtils#startsWithIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*<code>public static boolean org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(java.lang.CharSequence,java.lang.CharSequence)
*startsWithIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean startsWithIgnoreCase(java.lang.CharSequence p0,java.lang.CharSequence p1){
	return org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(p0,p1);
}
/**
*{@link org.apache.commons.exec.util.StringUtils#stringSubstitution(java.lang.String,java.util.Map<? super java.lang.String, ?>,boolean)}
*@see org.apache.commons.exec.util.StringUtils#stringSubstitution(java.lang.String,java.util.Map<? super java.lang.String, ?>,boolean)
*<code>public static java.lang.StringBuffer org.apache.commons.exec.util.StringUtils.stringSubstitution(java.lang.String,java.util.Map<? super java.lang.String, ?>,boolean)
*stringSubstitution(java.lang.String p0,java.util.Map<? super java.lang.String, ?> p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.StringBuffer stringSubstitution(java.lang.String p0,java.util.Map<? super java.lang.String, ?> p1,boolean p2){
	return org.apache.commons.exec.util.StringUtils.stringSubstitution(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#tTest(double[],double[],double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#tTest(double[],double[],double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.tTest(double[],double[],double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*tTest(double[] p0,double[] p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean tTest(double[] p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.tTest(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary,org.apache.commons.math3.stat.descriptive.StatisticalSummary,double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary,org.apache.commons.math3.stat.descriptive.StatisticalSummary,double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary,org.apache.commons.math3.stat.descriptive.StatisticalSummary,double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean tTest(org.apache.commons.math3.stat.descriptive.StatisticalSummary p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.tTest(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#tTest(double,double[],double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#tTest(double,double[],double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.tTest(double,double[],double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*tTest(double p0,double[] p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean tTest(double p0,double[] p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.tTest(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.stat.inference.TestUtils#tTest(double,org.apache.commons.math3.stat.descriptive.StatisticalSummary,double)}
*@see org.apache.commons.math3.stat.inference.TestUtils#tTest(double,org.apache.commons.math3.stat.descriptive.StatisticalSummary,double)
*<code>public static boolean org.apache.commons.math3.stat.inference.TestUtils.tTest(double,org.apache.commons.math3.stat.descriptive.StatisticalSummary,double) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException
*tTest(double p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1,double p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean tTest(double p0,org.apache.commons.math3.stat.descriptive.StatisticalSummary p1,double p2) throws org.apache.commons.math3.exception.NullArgumentException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.OutOfRangeException,org.apache.commons.math3.exception.MaxCountExceededException{
	return org.apache.commons.math3.stat.inference.TestUtils.tTest(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.Functions#test(org.apache.commons.lang3.Functions$FailablePredicate<O, T>,O)}
*@see org.apache.commons.lang3.Functions#test(org.apache.commons.lang3.Functions$FailablePredicate<O, T>,O)
*<code>public static <O,T> boolean org.apache.commons.lang3.Functions.test(org.apache.commons.lang3.Functions$FailablePredicate<O, T>,O)
*test(org.apache.commons.lang3.Functions$FailablePredicate<O, T> p0,O p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O,T extends java.lang.Throwable > boolean test(org.apache.commons.lang3.Functions.FailablePredicate<O, T> p0,O p1){
	return org.apache.commons.lang3.Functions.test(p0,p1);
}
/**
*{@link org.apache.commons.lang3.Functions#test(org.apache.commons.lang3.Functions$FailableBiPredicate<O1, O2, T>,O1,O2)}
*@see org.apache.commons.lang3.Functions#test(org.apache.commons.lang3.Functions$FailableBiPredicate<O1, O2, T>,O1,O2)
*<code>public static <O1,O2,T> boolean org.apache.commons.lang3.Functions.test(org.apache.commons.lang3.Functions$FailableBiPredicate<O1, O2, T>,O1,O2)
*test(org.apache.commons.lang3.Functions$FailableBiPredicate<O1, O2, T> p0,O1 p1,O2 p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <O1,O2,T extends java.lang.Throwable > boolean test(org.apache.commons.lang3.Functions.FailableBiPredicate<O1, O2, T> p0,O1 p1,O2 p2){
	return org.apache.commons.lang3.Functions.test(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBoolean(java.lang.Boolean)}
*@see org.apache.commons.lang3.BooleanUtils#toBoolean(java.lang.Boolean)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.Boolean)
*toBoolean(java.lang.Boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean toBoolean(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toBoolean(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBoolean(java.lang.Integer,java.lang.Integer,java.lang.Integer)}
*@see org.apache.commons.lang3.BooleanUtils#toBoolean(java.lang.Integer,java.lang.Integer,java.lang.Integer)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.Integer,java.lang.Integer,java.lang.Integer)
*toBoolean(java.lang.Integer p0,java.lang.Integer p1,java.lang.Integer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean toBoolean(java.lang.Integer p0,java.lang.Integer p1,java.lang.Integer p2){
	return org.apache.commons.lang3.BooleanUtils.toBoolean(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBoolean(java.lang.String)}
*@see org.apache.commons.lang3.BooleanUtils#toBoolean(java.lang.String)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.String)
*toBoolean(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean toBoolean(java.lang.String p0){
	return org.apache.commons.lang3.BooleanUtils.toBoolean(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBoolean(int)}
*@see org.apache.commons.lang3.BooleanUtils#toBoolean(int)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.toBoolean(int)
*toBoolean(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean toBoolean(int p0){
	return org.apache.commons.lang3.BooleanUtils.toBoolean(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBoolean(int,int,int)}
*@see org.apache.commons.lang3.BooleanUtils#toBoolean(int,int,int)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.toBoolean(int,int,int)
*toBoolean(int p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean toBoolean(int p0,int p1,int p2){
	return org.apache.commons.lang3.BooleanUtils.toBoolean(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBoolean(java.lang.String,java.lang.String,java.lang.String)}
*@see org.apache.commons.lang3.BooleanUtils#toBoolean(java.lang.String,java.lang.String,java.lang.String)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.String,java.lang.String,java.lang.String)
*toBoolean(java.lang.String p0,java.lang.String p1,java.lang.String p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean toBoolean(java.lang.String p0,java.lang.String p1,java.lang.String p2){
	return org.apache.commons.lang3.BooleanUtils.toBoolean(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBooleanDefaultIfNull(java.lang.Boolean,boolean)}
*@see org.apache.commons.lang3.BooleanUtils#toBooleanDefaultIfNull(java.lang.Boolean,boolean)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull(java.lang.Boolean,boolean)
*toBooleanDefaultIfNull(java.lang.Boolean p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean toBooleanDefaultIfNull(java.lang.Boolean p0,boolean p1){
	return org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull(p0,p1);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBooleanObject(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
*@see org.apache.commons.lang3.BooleanUtils#toBooleanObject(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)
*<code>public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)
*toBooleanObject(java.lang.Integer p0,java.lang.Integer p1,java.lang.Integer p2,java.lang.Integer p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean toBooleanObject(java.lang.Integer p0,java.lang.Integer p1,java.lang.Integer p2,java.lang.Integer p3){
	return org.apache.commons.lang3.BooleanUtils.toBooleanObject(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBooleanObject(java.lang.String)}
*@see org.apache.commons.lang3.BooleanUtils#toBooleanObject(java.lang.String)
*<code>public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.String)
*toBooleanObject(java.lang.String p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean toBooleanObject(java.lang.String p0){
	return org.apache.commons.lang3.BooleanUtils.toBooleanObject(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBooleanObject(java.lang.Integer)}
*@see org.apache.commons.lang3.BooleanUtils#toBooleanObject(java.lang.Integer)
*<code>public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.Integer)
*toBooleanObject(java.lang.Integer p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean toBooleanObject(java.lang.Integer p0){
	return org.apache.commons.lang3.BooleanUtils.toBooleanObject(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBooleanObject(int,int,int,int)}
*@see org.apache.commons.lang3.BooleanUtils#toBooleanObject(int,int,int,int)
*<code>public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.toBooleanObject(int,int,int,int)
*toBooleanObject(int p0,int p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean toBooleanObject(int p0,int p1,int p2,int p3){
	return org.apache.commons.lang3.BooleanUtils.toBooleanObject(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBooleanObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
*@see org.apache.commons.lang3.BooleanUtils#toBooleanObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
*<code>public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
*toBooleanObject(java.lang.String p0,java.lang.String p1,java.lang.String p2,java.lang.String p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean toBooleanObject(java.lang.String p0,java.lang.String p1,java.lang.String p2,java.lang.String p3){
	return org.apache.commons.lang3.BooleanUtils.toBooleanObject(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toBooleanObject(int)}
*@see org.apache.commons.lang3.BooleanUtils#toBooleanObject(int)
*<code>public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.toBooleanObject(int)
*toBooleanObject(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean toBooleanObject(int p0){
	return org.apache.commons.lang3.BooleanUtils.toBooleanObject(p0);
}
/**
*{@link org.apache.commons.text.CaseUtils#toCamelCase(java.lang.String,boolean,char...)}
*@see org.apache.commons.text.CaseUtils#toCamelCase(java.lang.String,boolean,char...)
*<code>public static java.lang.String org.apache.commons.text.CaseUtils.toCamelCase(java.lang.String,boolean,char...)
*toCamelCase(java.lang.String p0,boolean p1,char... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String toCamelCase(java.lang.String p0,boolean p1,char... p2){
	return org.apache.commons.text.CaseUtils.toCamelCase(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toInteger(java.lang.Boolean,int,int,int)}
*@see org.apache.commons.lang3.BooleanUtils#toInteger(java.lang.Boolean,int,int,int)
*<code>public static int org.apache.commons.lang3.BooleanUtils.toInteger(java.lang.Boolean,int,int,int)
*toInteger(java.lang.Boolean p0,int p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int toInteger(java.lang.Boolean p0,int p1,int p2,int p3){
	return org.apache.commons.lang3.BooleanUtils.toInteger(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toInteger(boolean,int,int)}
*@see org.apache.commons.lang3.BooleanUtils#toInteger(boolean,int,int)
*<code>public static int org.apache.commons.lang3.BooleanUtils.toInteger(boolean,int,int)
*toInteger(boolean p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int toInteger(boolean p0,int p1,int p2){
	return org.apache.commons.lang3.BooleanUtils.toInteger(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toInteger(boolean)}
*@see org.apache.commons.lang3.BooleanUtils#toInteger(boolean)
*<code>public static int org.apache.commons.lang3.BooleanUtils.toInteger(boolean)
*toInteger(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int toInteger(boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toInteger(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toIntegerObject(java.lang.Boolean)}
*@see org.apache.commons.lang3.BooleanUtils#toIntegerObject(java.lang.Boolean)
*<code>public static java.lang.Integer org.apache.commons.lang3.BooleanUtils.toIntegerObject(java.lang.Boolean)
*toIntegerObject(java.lang.Boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Integer toIntegerObject(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toIntegerObject(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toIntegerObject(java.lang.Boolean,java.lang.Integer,java.lang.Integer,java.lang.Integer)}
*@see org.apache.commons.lang3.BooleanUtils#toIntegerObject(java.lang.Boolean,java.lang.Integer,java.lang.Integer,java.lang.Integer)
*<code>public static java.lang.Integer org.apache.commons.lang3.BooleanUtils.toIntegerObject(java.lang.Boolean,java.lang.Integer,java.lang.Integer,java.lang.Integer)
*toIntegerObject(java.lang.Boolean p0,java.lang.Integer p1,java.lang.Integer p2,java.lang.Integer p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Integer toIntegerObject(java.lang.Boolean p0,java.lang.Integer p1,java.lang.Integer p2,java.lang.Integer p3){
	return org.apache.commons.lang3.BooleanUtils.toIntegerObject(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toIntegerObject(boolean,java.lang.Integer,java.lang.Integer)}
*@see org.apache.commons.lang3.BooleanUtils#toIntegerObject(boolean,java.lang.Integer,java.lang.Integer)
*<code>public static java.lang.Integer org.apache.commons.lang3.BooleanUtils.toIntegerObject(boolean,java.lang.Integer,java.lang.Integer)
*toIntegerObject(boolean p0,java.lang.Integer p1,java.lang.Integer p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Integer toIntegerObject(boolean p0,java.lang.Integer p1,java.lang.Integer p2){
	return org.apache.commons.lang3.BooleanUtils.toIntegerObject(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toIntegerObject(boolean)}
*@see org.apache.commons.lang3.BooleanUtils#toIntegerObject(boolean)
*<code>public static java.lang.Integer org.apache.commons.lang3.BooleanUtils.toIntegerObject(boolean)
*toIntegerObject(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Integer toIntegerObject(boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toIntegerObject(p0);
}
/**
*{@link org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Boolean[],boolean)}
*@see org.apache.commons.lang3.ArrayUtils#toPrimitive(java.lang.Boolean[],boolean)
*<code>public static boolean[] org.apache.commons.lang3.ArrayUtils.toPrimitive(java.lang.Boolean[],boolean)
*toPrimitive(java.lang.Boolean[] p0,boolean p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean[] toPrimitive(java.lang.Boolean[] p0,boolean p1){
	return org.apache.commons.lang3.ArrayUtils.toPrimitive(p0,p1);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toStringOnOff(java.lang.Boolean)}
*@see org.apache.commons.lang3.BooleanUtils#toStringOnOff(java.lang.Boolean)
*<code>public static java.lang.String org.apache.commons.lang3.BooleanUtils.toStringOnOff(java.lang.Boolean)
*toStringOnOff(java.lang.Boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String toStringOnOff(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toStringOnOff(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toStringOnOff(boolean)}
*@see org.apache.commons.lang3.BooleanUtils#toStringOnOff(boolean)
*<code>public static java.lang.String org.apache.commons.lang3.BooleanUtils.toStringOnOff(boolean)
*toStringOnOff(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String toStringOnOff(boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toStringOnOff(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toStringTrueFalse(java.lang.Boolean)}
*@see org.apache.commons.lang3.BooleanUtils#toStringTrueFalse(java.lang.Boolean)
*<code>public static java.lang.String org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(java.lang.Boolean)
*toStringTrueFalse(java.lang.Boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String toStringTrueFalse(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toStringTrueFalse(boolean)}
*@see org.apache.commons.lang3.BooleanUtils#toStringTrueFalse(boolean)
*<code>public static java.lang.String org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(boolean)
*toStringTrueFalse(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String toStringTrueFalse(boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toStringYesNo(java.lang.Boolean)}
*@see org.apache.commons.lang3.BooleanUtils#toStringYesNo(java.lang.Boolean)
*<code>public static java.lang.String org.apache.commons.lang3.BooleanUtils.toStringYesNo(java.lang.Boolean)
*toStringYesNo(java.lang.Boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String toStringYesNo(java.lang.Boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toStringYesNo(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#toStringYesNo(boolean)}
*@see org.apache.commons.lang3.BooleanUtils#toStringYesNo(boolean)
*<code>public static java.lang.String org.apache.commons.lang3.BooleanUtils.toStringYesNo(boolean)
*toStringYesNo(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String toStringYesNo(boolean p0){
	return org.apache.commons.lang3.BooleanUtils.toStringYesNo(p0);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#truncatedEquals(java.util.Date,java.util.Date,int)}
*@see org.apache.commons.lang3.time.DateUtils#truncatedEquals(java.util.Date,java.util.Date,int)
*<code>public static boolean org.apache.commons.lang3.time.DateUtils.truncatedEquals(java.util.Date,java.util.Date,int)
*truncatedEquals(java.util.Date p0,java.util.Date p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean truncatedEquals(java.util.Date p0,java.util.Date p1,int p2){
	return org.apache.commons.lang3.time.DateUtils.truncatedEquals(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.time.DateUtils#truncatedEquals(java.util.Calendar,java.util.Calendar,int)}
*@see org.apache.commons.lang3.time.DateUtils#truncatedEquals(java.util.Calendar,java.util.Calendar,int)
*<code>public static boolean org.apache.commons.lang3.time.DateUtils.truncatedEquals(java.util.Calendar,java.util.Calendar,int)
*truncatedEquals(java.util.Calendar p0,java.util.Calendar p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean truncatedEquals(java.util.Calendar p0,java.util.Calendar p1,int p2){
	return org.apache.commons.lang3.time.DateUtils.truncatedEquals(p0,p1,p2);
}
/**
*{@link com.google.common.util.concurrent.Uninterruptibles#tryAcquireUninterruptibly(java.util.concurrent.Semaphore,long,java.util.concurrent.TimeUnit)}
*@see com.google.common.util.concurrent.Uninterruptibles#tryAcquireUninterruptibly(java.util.concurrent.Semaphore,long,java.util.concurrent.TimeUnit)
*<code>public static boolean com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(java.util.concurrent.Semaphore,long,java.util.concurrent.TimeUnit)
*tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,long p1,java.util.concurrent.TimeUnit p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,long p1,java.util.concurrent.TimeUnit p2){
	return com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2);
}
/**
*{@link com.google.common.util.concurrent.Uninterruptibles#tryAcquireUninterruptibly(java.util.concurrent.Semaphore,int,long,java.util.concurrent.TimeUnit)}
*@see com.google.common.util.concurrent.Uninterruptibles#tryAcquireUninterruptibly(java.util.concurrent.Semaphore,int,long,java.util.concurrent.TimeUnit)
*<code>public static boolean com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(java.util.concurrent.Semaphore,int,long,java.util.concurrent.TimeUnit)
*tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,int p1,long p2,java.util.concurrent.TimeUnit p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore p0,int p1,long p2,java.util.concurrent.TimeUnit p3){
	return com.google.common.util.concurrent.Uninterruptibles.tryAcquireUninterruptibly(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.TypeUtils#typesSatisfyVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>)}
*@see org.apache.commons.lang3.reflect.TypeUtils#typesSatisfyVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>)
*<code>public static boolean org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>)
*typesSatisfyVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean typesSatisfyVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> p0){
	return org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(p0);
}
/**
*{@link org.apache.commons.lang3.Validate#validState(boolean,java.lang.String,java.lang.Object...)}
*@see org.apache.commons.lang3.Validate#validState(boolean,java.lang.String,java.lang.Object...)
*<code>public static void org.apache.commons.lang3.Validate.validState(boolean,java.lang.String,java.lang.Object...)
*validState(boolean p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void validState(boolean p0,java.lang.String p1,java.lang.Object... p2){
	 org.apache.commons.lang3.Validate.validState(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.Validate#validState(boolean)}
*@see org.apache.commons.lang3.Validate#validState(boolean)
*<code>public static void org.apache.commons.lang3.Validate.validState(boolean)
*validState(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void validState(boolean p0){
	 org.apache.commons.lang3.Validate.validState(p0);
}
/**
*{@link com.google.common.base.Verify#verify(boolean)}
*@see com.google.common.base.Verify#verify(boolean)
*<code>public static void com.google.common.base.Verify.verify(boolean)
*verify(boolean p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void verify(boolean p0){
	 com.google.common.base.Verify.verify(p0);
}
/**
*{@link com.google.common.base.Verify#verify(boolean,java.lang.String,java.lang.Object...)}
*@see com.google.common.base.Verify#verify(boolean,java.lang.String,java.lang.Object...)
*<code>public static void com.google.common.base.Verify.verify(boolean,java.lang.String,java.lang.Object...)
*verify(boolean p0,java.lang.String p1,java.lang.Object... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void verify(boolean p0,java.lang.String p1,java.lang.Object... p2){
	 com.google.common.base.Verify.verify(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm#verifyInterpolationArray(double[],double[],boolean)}
*@see org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm#verifyInterpolationArray(double[],double[],boolean)
*<code>public static boolean org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(double[],double[],boolean) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.NonMonotonicSequenceException
*verifyInterpolationArray(double[] p0,double[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean verifyInterpolationArray(double[] p0,double[] p1,boolean p2) throws org.apache.commons.math3.exception.DimensionMismatchException,org.apache.commons.math3.exception.NumberIsTooSmallException,org.apache.commons.math3.exception.NonMonotonicSequenceException{
	return org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#verifyValues(double[],double[],int,int,boolean)}
*@see org.apache.commons.math3.util.MathArrays#verifyValues(double[],double[],int,int,boolean)
*<code>public static boolean org.apache.commons.math3.util.MathArrays.verifyValues(double[],double[],int,int,boolean) throws org.apache.commons.math3.exception.MathIllegalArgumentException
*verifyValues(double[] p0,double[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean verifyValues(double[] p0,double[] p1,int p2,int p3,boolean p4) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
	return org.apache.commons.math3.util.MathArrays.verifyValues(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#verifyValues(double[],int,int)}
*@see org.apache.commons.math3.util.MathArrays#verifyValues(double[],int,int)
*<code>public static boolean org.apache.commons.math3.util.MathArrays.verifyValues(double[],int,int) throws org.apache.commons.math3.exception.MathIllegalArgumentException
*verifyValues(double[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean verifyValues(double[] p0,int p1,int p2) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
	return org.apache.commons.math3.util.MathArrays.verifyValues(p0,p1,p2);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#verifyValues(double[],int,int,boolean)}
*@see org.apache.commons.math3.util.MathArrays#verifyValues(double[],int,int,boolean)
*<code>public static boolean org.apache.commons.math3.util.MathArrays.verifyValues(double[],int,int,boolean) throws org.apache.commons.math3.exception.MathIllegalArgumentException
*verifyValues(double[] p0,int p1,int p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean verifyValues(double[] p0,int p1,int p2,boolean p3) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
	return org.apache.commons.math3.util.MathArrays.verifyValues(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.math3.util.MathArrays#verifyValues(double[],double[],int,int)}
*@see org.apache.commons.math3.util.MathArrays#verifyValues(double[],double[],int,int)
*<code>public static boolean org.apache.commons.math3.util.MathArrays.verifyValues(double[],double[],int,int) throws org.apache.commons.math3.exception.MathIllegalArgumentException
*verifyValues(double[] p0,double[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean verifyValues(double[] p0,double[] p1,int p2,int p3) throws org.apache.commons.math3.exception.MathIllegalArgumentException{
	return org.apache.commons.math3.util.MathArrays.verifyValues(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#waitFor(java.io.File,int)}
*@see org.codehaus.plexus.util.FileUtils#waitFor(java.io.File,int)
*<code>public static boolean org.codehaus.plexus.util.FileUtils.waitFor(java.io.File,int)
*waitFor(java.io.File p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean waitFor(java.io.File p0,int p1){
	return org.codehaus.plexus.util.FileUtils.waitFor(p0,p1);
}
/**
*{@link org.codehaus.plexus.util.FileUtils#waitFor(java.lang.String,int)}
*@see org.codehaus.plexus.util.FileUtils#waitFor(java.lang.String,int)
*<code>public static boolean org.codehaus.plexus.util.FileUtils.waitFor(java.lang.String,int)
*waitFor(java.lang.String p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean waitFor(java.lang.String p0,int p1){
	return org.codehaus.plexus.util.FileUtils.waitFor(p0,p1);
}
/**
*{@link org.apache.commons.collections4.functors.WhileClosure#whileClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>,boolean)}
*@see org.apache.commons.collections4.functors.WhileClosure#whileClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>,boolean)
*<code>public static <E> org.apache.commons.collections4.Closure<E> org.apache.commons.collections4.functors.WhileClosure.whileClosure(org.apache.commons.collections4.Predicate<? super E>,org.apache.commons.collections4.Closure<? super E>,boolean)
*whileClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> org.apache.commons.collections4.Closure<E> whileClosure(org.apache.commons.collections4.Predicate<? super E> p0,org.apache.commons.collections4.Closure<? super E> p1,boolean p2){
	return org.apache.commons.collections4.functors.WhileClosure.whileClosure(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FilenameUtils#wildcardMatch(java.lang.String,java.lang.String)}
*@see org.apache.commons.io.FilenameUtils#wildcardMatch(java.lang.String,java.lang.String)
*<code>public static boolean org.apache.commons.io.FilenameUtils.wildcardMatch(java.lang.String,java.lang.String)
*wildcardMatch(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean wildcardMatch(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.io.FilenameUtils.wildcardMatch(p0,p1);
}
/**
*{@link org.apache.commons.io.FilenameUtils#wildcardMatch(java.lang.String,java.lang.String,org.apache.commons.io.IOCase)}
*@see org.apache.commons.io.FilenameUtils#wildcardMatch(java.lang.String,java.lang.String,org.apache.commons.io.IOCase)
*<code>public static boolean org.apache.commons.io.FilenameUtils.wildcardMatch(java.lang.String,java.lang.String,org.apache.commons.io.IOCase)
*wildcardMatch(java.lang.String p0,java.lang.String p1,org.apache.commons.io.IOCase p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean wildcardMatch(java.lang.String p0,java.lang.String p1,org.apache.commons.io.IOCase p2){
	return org.apache.commons.io.FilenameUtils.wildcardMatch(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FilenameUtils#wildcardMatchOnSystem(java.lang.String,java.lang.String)}
*@see org.apache.commons.io.FilenameUtils#wildcardMatchOnSystem(java.lang.String,java.lang.String)
*<code>public static boolean org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem(java.lang.String,java.lang.String)
*wildcardMatchOnSystem(java.lang.String p0,java.lang.String p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean wildcardMatchOnSystem(java.lang.String p0,java.lang.String p1){
	return org.apache.commons.io.FilenameUtils.wildcardMatchOnSystem(p0,p1);
}
/**
*{@link org.apache.commons.lang3.text.WordUtils#wrap(java.lang.String,int,java.lang.String,boolean,java.lang.String)}
*@see org.apache.commons.lang3.text.WordUtils#wrap(java.lang.String,int,java.lang.String,boolean,java.lang.String)
*<code>public static java.lang.String org.apache.commons.lang3.text.WordUtils.wrap(java.lang.String,int,java.lang.String,boolean,java.lang.String)
*wrap(java.lang.String p0,int p1,java.lang.String p2,boolean p3,java.lang.String p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String wrap(java.lang.String p0,int p1,java.lang.String p2,boolean p3,java.lang.String p4){
	return org.apache.commons.lang3.text.WordUtils.wrap(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.lang3.text.WordUtils#wrap(java.lang.String,int,java.lang.String,boolean)}
*@see org.apache.commons.lang3.text.WordUtils#wrap(java.lang.String,int,java.lang.String,boolean)
*<code>public static java.lang.String org.apache.commons.lang3.text.WordUtils.wrap(java.lang.String,int,java.lang.String,boolean)
*wrap(java.lang.String p0,int p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.String wrap(java.lang.String p0,int p1,java.lang.String p2,boolean p3){
	return org.apache.commons.lang3.text.WordUtils.wrap(p0,p1,p2,p3);
}
/**
*{@link org.codehaus.plexus.util.xml.Xpp3DomWriter#write(org.codehaus.plexus.util.xml.XMLWriter,org.codehaus.plexus.util.xml.Xpp3Dom,boolean)}
*@see org.codehaus.plexus.util.xml.Xpp3DomWriter#write(org.codehaus.plexus.util.xml.XMLWriter,org.codehaus.plexus.util.xml.Xpp3Dom,boolean)
*<code>public static void org.codehaus.plexus.util.xml.Xpp3DomWriter.write(org.codehaus.plexus.util.xml.XMLWriter,org.codehaus.plexus.util.xml.Xpp3Dom,boolean)
*write(org.codehaus.plexus.util.xml.XMLWriter p0,org.codehaus.plexus.util.xml.Xpp3Dom p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(org.codehaus.plexus.util.xml.XMLWriter p0,org.codehaus.plexus.util.xml.Xpp3Dom p1,boolean p2){
	 org.codehaus.plexus.util.xml.Xpp3DomWriter.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,java.lang.String,boolean)}
*@see org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,java.lang.String,boolean)
*<code>public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.lang.String,boolean) throws java.io.IOException
*write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,boolean)}
*@see org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,boolean)
*<code>public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,boolean) throws java.io.IOException
*write(java.io.File p0,java.lang.CharSequence p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset,boolean)}
*@see org.apache.commons.io.FileUtils#write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset,boolean)
*<code>public static void org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset,boolean) throws java.io.IOException
*write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.write(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#writeByteArrayToFile(java.io.File,byte[],boolean)}
*@see org.apache.commons.io.FileUtils#writeByteArrayToFile(java.io.File,byte[],boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],boolean) throws java.io.IOException
*writeByteArrayToFile(java.io.File p0,byte[] p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeByteArrayToFile(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#writeByteArrayToFile(java.io.File,byte[],int,int,boolean)}
*@see org.apache.commons.io.FileUtils#writeByteArrayToFile(java.io.File,byte[],int,int,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],int,int,boolean) throws java.io.IOException
*writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3,boolean p4) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeByteArrayToFile(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeDeclaredField(java.lang.Object,java.lang.String,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeDeclaredField(java.lang.Object,java.lang.String,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(java.lang.Object,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeDeclaredField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeDeclaredField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeDeclaredStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeDeclaredStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field,java.lang.Object,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeField(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.Object,java.lang.String,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeField(java.lang.Object,java.lang.String,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.Object,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeField(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#writeLines(java.io.File,java.lang.String,java.util.Collection<?>,boolean)}
*@see org.apache.commons.io.FileUtils#writeLines(java.io.File,java.lang.String,java.util.Collection<?>,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<?>,boolean) throws java.io.IOException
*writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#writeLines(java.io.File,java.lang.String,java.util.Collection<?>,java.lang.String,boolean)}
*@see org.apache.commons.io.FileUtils#writeLines(java.io.File,java.lang.String,java.util.Collection<?>,java.lang.String,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<?>,java.lang.String,boolean) throws java.io.IOException
*writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3,boolean p4)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3,boolean p4) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3,p4);
}
/**
*{@link org.apache.commons.io.FileUtils#writeLines(java.io.File,java.util.Collection<?>,boolean)}
*@see org.apache.commons.io.FileUtils#writeLines(java.io.File,java.util.Collection<?>,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<?>,boolean) throws java.io.IOException
*writeLines(java.io.File p0,java.util.Collection<?> p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#writeLines(java.io.File,java.util.Collection<?>,java.lang.String,boolean)}
*@see org.apache.commons.io.FileUtils#writeLines(java.io.File,java.util.Collection<?>,java.lang.String,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<?>,java.lang.String,boolean) throws java.io.IOException
*writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeLines(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.Class<?>,java.lang.String,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.reflect.Field,java.lang.Object,boolean)}
*@see org.apache.commons.lang3.reflect.FieldUtils#writeStaticField(java.lang.reflect.Field,java.lang.Object,boolean)
*<code>public static void org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field,java.lang.Object,boolean) throws java.lang.IllegalAccessException
*writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
	 org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(p0,p1,p2);
}
/**
*{@link org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset,boolean)}
*@see org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset,boolean) throws java.io.IOException
*writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,java.lang.String,boolean)}
*@see org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,java.lang.String,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.lang.String,boolean) throws java.io.IOException
*writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2,p3);
}
/**
*{@link org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,boolean)}
*@see org.apache.commons.io.FileUtils#writeStringToFile(java.io.File,java.lang.String,boolean)
*<code>public static void org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,boolean) throws java.io.IOException
*writeStringToFile(java.io.File p0,java.lang.String p1,boolean p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static void writeStringToFile(java.io.File p0,java.lang.String p1,boolean p2) throws java.io.IOException{
	 org.apache.commons.io.FileUtils.writeStringToFile(p0,p1,p2);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#xor(java.lang.Boolean...)}
*@see org.apache.commons.lang3.BooleanUtils#xor(java.lang.Boolean...)
*<code>public static java.lang.Boolean org.apache.commons.lang3.BooleanUtils.xor(java.lang.Boolean...)
*xor(java.lang.Boolean... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Boolean xor(java.lang.Boolean... p0){
	return org.apache.commons.lang3.BooleanUtils.xor(p0);
}
/**
*{@link org.apache.commons.lang3.BooleanUtils#xor(boolean...)}
*@see org.apache.commons.lang3.BooleanUtils#xor(boolean...)
*<code>public static boolean org.apache.commons.lang3.BooleanUtils.xor(boolean...)
*xor(boolean... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static boolean xor(boolean... p0){
	return org.apache.commons.lang3.BooleanUtils.xor(p0);
}
}
