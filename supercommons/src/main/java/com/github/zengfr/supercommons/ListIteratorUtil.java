package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ListIteratorUtil{ 
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanListIterator it.unimi.dsi.fastutil.booleans.BooleanIterators.asBooleanIterator(java.util.ListIterator)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanListIterator asBooleanIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.asBooleanIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(java.util.ListIterator)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator asByteIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.chars.CharListIterator it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(java.util.ListIterator)
*/ 
public static it.unimi.dsi.fastutil.chars.CharListIterator asCharIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleListIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(java.util.ListIterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator asDoubleIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(java.util.ListIterator)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator asFloatIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(java.util.ListIterator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator asIntIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongListIterator it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(java.util.ListIterator)
*/ 
public static it.unimi.dsi.fastutil.longs.LongListIterator asLongIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortListIterator it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(java.util.ListIterator)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortListIterator asShortIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.iterators.UnmodifiableListIterator.decorate(java.util.ListIterator)
*/ 
public static java.util.ListIterator decorate(java.util.ListIterator p0){
	return org.apache.commons.collections.iterators.UnmodifiableListIterator.decorate(p0);
}
/**
*public static <E> java.util.ListIterator<E> org.apache.commons.collections4.iterators.EmptyListIterator.emptyListIterator()
*/ 
public static <E> java.util.ListIterator<E> emptyListIterator(){
	return org.apache.commons.collections4.iterators.EmptyListIterator.emptyListIterator();
}
/**
*public static <E> java.util.ListIterator<E> org.apache.commons.collections4.IteratorUtils.filteredListIterator(java.util.ListIterator<? extends E>,org.apache.commons.collections4.Predicate<? super E>)
*/ 
public static <E> java.util.ListIterator<E> filteredListIterator(java.util.ListIterator<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
	return org.apache.commons.collections4.IteratorUtils.filteredListIterator(p0,p1);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.filteredListIterator(java.util.ListIterator,org.apache.commons.collections.Predicate)
*/ 
public static java.util.ListIterator filteredListIterator(java.util.ListIterator p0,org.apache.commons.collections.Predicate p1){
	return org.apache.commons.collections.IteratorUtils.filteredListIterator(p0,p1);
}
/**
*public static <E> java.util.ListIterator<E> org.apache.commons.collections4.IteratorUtils.singletonListIterator(E)
*/ 
public static <E> java.util.ListIterator<E> singletonListIterator(E p0){
	return org.apache.commons.collections4.IteratorUtils.singletonListIterator(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.singletonListIterator(java.lang.Object)
*/ 
public static java.util.ListIterator singletonListIterator(java.lang.Object p0){
	return org.apache.commons.collections.IteratorUtils.singletonListIterator(p0);
}
/**
*public static <E> java.util.ListIterator<E> org.apache.commons.collections4.IteratorUtils.toListIterator(java.util.Iterator<? extends E>)
*/ 
public static <E> java.util.ListIterator<E> toListIterator(java.util.Iterator<? extends E> p0){
	return org.apache.commons.collections4.IteratorUtils.toListIterator(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.toListIterator(java.util.Iterator)
*/ 
public static java.util.ListIterator toListIterator(java.util.Iterator p0){
	return org.apache.commons.collections.IteratorUtils.toListIterator(p0);
}
/**
*public static <E> java.util.ListIterator<E> org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(java.util.ListIterator<? extends E>)
*/ 
public static <E> java.util.ListIterator<E> umodifiableListIterator(java.util.ListIterator<? extends E> p0){
	return org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(p0);
}
/**
*public static <E> java.util.ListIterator<E> org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(java.util.ListIterator<E>)
*/ 
public static <E> java.util.ListIterator<E> unmodifiableListIterator(java.util.ListIterator<E> p0){
	return org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.IteratorUtils.unmodifiableListIterator(java.util.ListIterator)
*/ 
public static java.util.ListIterator unmodifiableListIterator(java.util.ListIterator p0){
	return org.apache.commons.collections.IteratorUtils.unmodifiableListIterator(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator.wrap(org.apache.commons.collections.primitives.ByteListIterator)
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.ByteListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator.wrap(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.CharListIteratorListIterator.wrap(org.apache.commons.collections.primitives.CharListIterator)
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.CharListIterator p0){
	return org.apache.commons.collections.primitives.adapters.CharListIteratorListIterator.wrap(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.DoubleListIteratorListIterator.wrap(org.apache.commons.collections.primitives.DoubleListIterator)
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.DoubleListIterator p0){
	return org.apache.commons.collections.primitives.adapters.DoubleListIteratorListIterator.wrap(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator.wrap(org.apache.commons.collections.primitives.FloatListIterator)
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.FloatListIterator p0){
	return org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator.wrap(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator.wrap(org.apache.commons.collections.primitives.IntListIterator)
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.IntListIterator p0){
	return org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator.wrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.ByteListIterator org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator.wrap(java.util.ListIterator)
*/ 
public static org.apache.commons.collections.primitives.ByteListIterator wrap(java.util.ListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator.wrap(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.LongListIteratorListIterator.wrap(org.apache.commons.collections.primitives.LongListIterator)
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.LongListIterator p0){
	return org.apache.commons.collections.primitives.adapters.LongListIteratorListIterator.wrap(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.ShortListIteratorListIterator.wrap(org.apache.commons.collections.primitives.ShortListIterator)
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.ShortListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ShortListIteratorListIterator.wrap(p0);
}
}
