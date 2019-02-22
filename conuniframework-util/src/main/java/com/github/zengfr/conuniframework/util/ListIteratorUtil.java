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
public final class ListIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.booleans.BooleanIterators#asBooleanIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.booleans.BooleanIterators#asBooleanIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanListIterator it.unimi.dsi.fastutil.booleans.BooleanIterators.asBooleanIterator(java.util.ListIterator)
*asBooleanIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanListIterator asBooleanIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.asBooleanIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#asByteIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#asByteIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(java.util.ListIterator)
*asByteIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator asByteIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#asCharIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#asCharIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.chars.CharListIterator it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(java.util.ListIterator)
*asCharIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharListIterator asCharIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#asDoubleIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#asDoubleIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleListIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(java.util.ListIterator)
*asDoubleIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator asDoubleIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#asFloatIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#asFloatIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(java.util.ListIterator)
*asFloatIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator asFloatIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#asIntIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#asIntIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(java.util.ListIterator)
*asIntIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator asIntIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#asLongIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#asLongIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.longs.LongListIterator it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(java.util.ListIterator)
*asLongIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongListIterator asLongIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#asShortIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#asShortIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortListIterator it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(java.util.ListIterator)
*asShortIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortListIterator asShortIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(p0);
}
/**
*{@link org.apache.commons.collections.iterators.UnmodifiableListIterator#decorate(java.util.ListIterator)}
*@see org.apache.commons.collections.iterators.UnmodifiableListIterator#decorate(java.util.ListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.iterators.UnmodifiableListIterator.decorate(java.util.ListIterator)
*decorate(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator decorate(java.util.ListIterator p0){
	return org.apache.commons.collections.iterators.UnmodifiableListIterator.decorate(p0);
}
/**
*{@link org.apache.commons.collections4.iterators.EmptyListIterator#emptyListIterator()}
*@see org.apache.commons.collections4.iterators.EmptyListIterator#emptyListIterator()
*<code>public static <E> java.util.ListIterator<E> org.apache.commons.collections4.iterators.EmptyListIterator.emptyListIterator()
*emptyListIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.ListIterator<E> emptyListIterator(){
	return org.apache.commons.collections4.iterators.EmptyListIterator.emptyListIterator();
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#filteredListIterator(java.util.ListIterator<? extends E>,org.apache.commons.collections4.Predicate<? super E>)}
*@see org.apache.commons.collections4.IteratorUtils#filteredListIterator(java.util.ListIterator<? extends E>,org.apache.commons.collections4.Predicate<? super E>)
*<code>public static <E> java.util.ListIterator<E> org.apache.commons.collections4.IteratorUtils.filteredListIterator(java.util.ListIterator<? extends E>,org.apache.commons.collections4.Predicate<? super E>)
*filteredListIterator(java.util.ListIterator<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.ListIterator<E> filteredListIterator(java.util.ListIterator<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IteratorUtils.filteredListIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#filteredListIterator(java.util.ListIterator,org.apache.commons.collections.Predicate)}
*@see org.apache.commons.collections.IteratorUtils#filteredListIterator(java.util.ListIterator,org.apache.commons.collections.Predicate)
*<code>public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.filteredListIterator(java.util.ListIterator,org.apache.commons.collections.Predicate)
*filteredListIterator(java.util.ListIterator p0,org.apache.commons.collections.Predicate p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator filteredListIterator(java.util.ListIterator p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.IteratorUtils.filteredListIterator(p0,p1);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#singletonListIterator(E)}
*@see org.apache.commons.collections4.IteratorUtils#singletonListIterator(E)
*<code>public static <E> java.util.ListIterator<E> org.apache.commons.collections4.IteratorUtils.singletonListIterator(E)
*singletonListIterator(E p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.ListIterator<E> singletonListIterator(E p0){
	return org.apache.commons.collections4.IteratorUtils.singletonListIterator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#singletonListIterator(java.lang.Object)}
*@see org.apache.commons.collections.IteratorUtils#singletonListIterator(java.lang.Object)
*<code>public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.singletonListIterator(java.lang.Object)
*singletonListIterator(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator singletonListIterator(java.lang.Object p0){
	return org.apache.commons.collections.IteratorUtils.singletonListIterator(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#toListIterator(java.util.Iterator<? extends E>)}
*@see org.apache.commons.collections4.IteratorUtils#toListIterator(java.util.Iterator<? extends E>)
*<code>public static <E> java.util.ListIterator<E> org.apache.commons.collections4.IteratorUtils.toListIterator(java.util.Iterator<? extends E>)
*toListIterator(java.util.Iterator<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.ListIterator<E> toListIterator(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.IteratorUtils.toListIterator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#toListIterator(java.util.Iterator)}
*@see org.apache.commons.collections.IteratorUtils#toListIterator(java.util.Iterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.toListIterator(java.util.Iterator)
*toListIterator(java.util.Iterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator toListIterator(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.toListIterator(p0);
}
/**
*{@link org.apache.commons.collections4.iterators.UnmodifiableListIterator#umodifiableListIterator(java.util.ListIterator<? extends E>)}
*@see org.apache.commons.collections4.iterators.UnmodifiableListIterator#umodifiableListIterator(java.util.ListIterator<? extends E>)
*<code>public static <E> java.util.ListIterator<E> org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(java.util.ListIterator<? extends E>)
*umodifiableListIterator(java.util.ListIterator<? extends E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.ListIterator<E> umodifiableListIterator(java.util.ListIterator<? extends E> p0){
	return org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(p0);
}
/**
*{@link org.apache.commons.collections4.IteratorUtils#unmodifiableListIterator(java.util.ListIterator<E>)}
*@see org.apache.commons.collections4.IteratorUtils#unmodifiableListIterator(java.util.ListIterator<E>)
*<code>public static <E> java.util.ListIterator<E> org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(java.util.ListIterator<E>)
*unmodifiableListIterator(java.util.ListIterator<E> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <E> java.util.ListIterator<E> unmodifiableListIterator(java.util.ListIterator<E> p0){
	return org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(p0);
}
/**
*{@link org.apache.commons.collections.IteratorUtils#unmodifiableListIterator(java.util.ListIterator)}
*@see org.apache.commons.collections.IteratorUtils#unmodifiableListIterator(java.util.ListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.unmodifiableListIterator(java.util.ListIterator)
*unmodifiableListIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator unmodifiableListIterator(java.util.ListIterator p0){
	return org.apache.commons.collections.IteratorUtils.unmodifiableListIterator(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator#wrap(org.apache.commons.collections.primitives.ByteListIterator)}
*@see org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator#wrap(org.apache.commons.collections.primitives.ByteListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator.wrap(org.apache.commons.collections.primitives.ByteListIterator)
*wrap(org.apache.commons.collections.primitives.ByteListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.ByteListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CharListIteratorListIterator#wrap(org.apache.commons.collections.primitives.CharListIterator)}
*@see org.apache.commons.collections.primitives.adapters.CharListIteratorListIterator#wrap(org.apache.commons.collections.primitives.CharListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.CharListIteratorListIterator.wrap(org.apache.commons.collections.primitives.CharListIterator)
*wrap(org.apache.commons.collections.primitives.CharListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.CharListIterator p0){
	return org.apache.commons.collections.primitives.adapters.CharListIteratorListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.DoubleListIteratorListIterator#wrap(org.apache.commons.collections.primitives.DoubleListIterator)}
*@see org.apache.commons.collections.primitives.adapters.DoubleListIteratorListIterator#wrap(org.apache.commons.collections.primitives.DoubleListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.DoubleListIteratorListIterator.wrap(org.apache.commons.collections.primitives.DoubleListIterator)
*wrap(org.apache.commons.collections.primitives.DoubleListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.DoubleListIterator p0){
	return org.apache.commons.collections.primitives.adapters.DoubleListIteratorListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator#wrap(org.apache.commons.collections.primitives.FloatListIterator)}
*@see org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator#wrap(org.apache.commons.collections.primitives.FloatListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator.wrap(org.apache.commons.collections.primitives.FloatListIterator)
*wrap(org.apache.commons.collections.primitives.FloatListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.FloatListIterator p0){
	return org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator#wrap(org.apache.commons.collections.primitives.IntListIterator)}
*@see org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator#wrap(org.apache.commons.collections.primitives.IntListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator.wrap(org.apache.commons.collections.primitives.IntListIterator)
*wrap(org.apache.commons.collections.primitives.IntListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.IntListIterator p0){
	return org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator#wrap(java.util.ListIterator)}
*@see org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator#wrap(java.util.ListIterator)
*<code>public static org.apache.commons.collections.primitives.ByteListIterator org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator.wrap(java.util.ListIterator)
*wrap(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteListIterator wrap(java.util.ListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.LongListIteratorListIterator#wrap(org.apache.commons.collections.primitives.LongListIterator)}
*@see org.apache.commons.collections.primitives.adapters.LongListIteratorListIterator#wrap(org.apache.commons.collections.primitives.LongListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.LongListIteratorListIterator.wrap(org.apache.commons.collections.primitives.LongListIterator)
*wrap(org.apache.commons.collections.primitives.LongListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.LongListIterator p0){
	return org.apache.commons.collections.primitives.adapters.LongListIteratorListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ShortListIteratorListIterator#wrap(org.apache.commons.collections.primitives.ShortListIterator)}
*@see org.apache.commons.collections.primitives.adapters.ShortListIteratorListIterator#wrap(org.apache.commons.collections.primitives.ShortListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.ShortListIteratorListIterator.wrap(org.apache.commons.collections.primitives.ShortListIterator)
*wrap(org.apache.commons.collections.primitives.ShortListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.ShortListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ShortListIteratorListIterator.wrap(p0);
}
}
