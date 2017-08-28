package com.github.zengfr.supercommons;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.iterators.UnmodifiableListIterator;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.iterators.UnmodifiableListIterator;
import org.apache.commons.collections4.iterators.EmptyListIterator;
import org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator;
import org.apache.commons.collections.primitives.adapters.CharListIteratorListIterator;
import org.apache.commons.collections.primitives.adapters.DoubleListIteratorListIterator;
import org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator;
import org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator;
import org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator;
import org.apache.commons.collections.primitives.adapters.ListIteratorCharListIterator;
import org.apache.commons.collections.primitives.adapters.ListIteratorDoubleListIterator;
import org.apache.commons.collections.primitives.adapters.ListIteratorFloatListIterator;
import org.apache.commons.collections.primitives.adapters.ListIteratorIntListIterator;
import org.apache.commons.collections.primitives.adapters.ListIteratorLongListIterator;
import org.apache.commons.collections.primitives.adapters.ListIteratorShortListIterator;
import org.apache.commons.collections.primitives.adapters.LongListIteratorListIterator;
import org.apache.commons.collections.primitives.adapters.ShortListIteratorListIterator;
import it.unimi.dsi.fastutil.booleans.BooleanIterators;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
import it.unimi.dsi.fastutil.chars.CharIterators;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
import it.unimi.dsi.fastutil.floats.FloatIterators;
import it.unimi.dsi.fastutil.ints.IntIterators;
import it.unimi.dsi.fastutil.longs.LongIterators;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ListIteratorUtil{ 
public static java.util.ListIterator filteredListIterator(java.util.ListIterator p0,org.apache.commons.collections.Predicate p1){
return IteratorUtils.filteredListIterator(p0,p1);
}
public static java.util.ListIterator singletonListIterator(java.lang.Object p0){
return IteratorUtils.singletonListIterator(p0);
}
public static java.util.ListIterator unmodifiableListIterator(java.util.ListIterator p0){
return IteratorUtils.unmodifiableListIterator(p0);
}
public static java.util.ListIterator toListIterator(java.util.Iterator p0){
return IteratorUtils.toListIterator(p0);
}
public static java.util.ListIterator decorate(java.util.ListIterator p0){
return UnmodifiableListIterator.decorate(p0);
}
public static <E> java.util.ListIterator<E> filteredListIterator(java.util.ListIterator<? extends E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return IteratorUtils.filteredListIterator(p0,p1);
}
public static <E> java.util.ListIterator<E> singletonListIterator(E p0){
return IteratorUtils.singletonListIterator(p0);
}
public static <E> java.util.ListIterator<E> unmodifiableListIterator(java.util.ListIterator<E> p0){
return IteratorUtils.unmodifiableListIterator(p0);
}
public static <E> java.util.ListIterator<E> toListIterator(java.util.Iterator<? extends E> p0){
return IteratorUtils.toListIterator(p0);
}
public static <E> java.util.ListIterator<E> umodifiableListIterator(java.util.ListIterator<? extends E> p0){
return UnmodifiableListIterator.umodifiableListIterator(p0);
}
public static <E> java.util.ListIterator<E> emptyListIterator(){
return EmptyListIterator.emptyListIterator();
}
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.ByteListIterator p0){
return ByteListIteratorListIterator.wrap(p0);
}
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.CharListIterator p0){
return CharListIteratorListIterator.wrap(p0);
}
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.DoubleListIterator p0){
return DoubleListIteratorListIterator.wrap(p0);
}
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.FloatListIterator p0){
return FloatListIteratorListIterator.wrap(p0);
}
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.IntListIterator p0){
return IntListIteratorListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.ByteListIterator wrap(java.util.ListIterator p0){
return ListIteratorByteListIterator.wrap(p0);
}
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.LongListIterator p0){
return LongListIteratorListIterator.wrap(p0);
}
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.ShortListIterator p0){
return ShortListIteratorListIterator.wrap(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanListIterator asBooleanIterator(java.util.ListIterator p0){
return BooleanIterators.asBooleanIterator(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteListIterator asByteIterator(java.util.ListIterator p0){
return ByteIterators.asByteIterator(p0);
}
public static it.unimi.dsi.fastutil.chars.CharListIterator asCharIterator(java.util.ListIterator p0){
return CharIterators.asCharIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator asDoubleIterator(java.util.ListIterator p0){
return DoubleIterators.asDoubleIterator(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatListIterator asFloatIterator(java.util.ListIterator p0){
return FloatIterators.asFloatIterator(p0);
}
public static it.unimi.dsi.fastutil.ints.IntListIterator asIntIterator(java.util.ListIterator p0){
return IntIterators.asIntIterator(p0);
}
public static it.unimi.dsi.fastutil.longs.LongListIterator asLongIterator(java.util.ListIterator p0){
return LongIterators.asLongIterator(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortListIterator asShortIterator(java.util.ListIterator p0){
return ShortIterators.asShortIterator(p0);
}
}
