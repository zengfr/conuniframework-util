package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.CharListIteratorListIterator;
import org.apache.commons.collections.primitives.adapters.ListIteratorCharListIterator;
import org.apache.commons.collections.primitives.decorators.UnmodifiableCharListIterator;
import org.apache.commons.collections.primitives.CharCollections;
import it.unimi.dsi.fastutil.chars.CharBigListIterators;
import it.unimi.dsi.fastutil.chars.CharIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharListIteratorUtil{ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.CharListIterator p0){
return CharListIteratorListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.CharListIterator wrap(java.util.ListIterator p0){
return ListIteratorCharListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.CharListIterator singletonCharListIterator(char p0){
return CharCollections.singletonCharListIterator(p0);
}
public static org.apache.commons.collections.primitives.CharListIterator getEmptyCharListIterator(){
return CharCollections.getEmptyCharListIterator();
}
public static org.apache.commons.collections.primitives.CharListIterator unmodifiableCharListIterator(org.apache.commons.collections.primitives.CharListIterator p0){
return CharCollections.unmodifiableCharListIterator(p0);
}
public static it.unimi.dsi.fastutil.chars.CharBigListIterator asBigListIterator(it.unimi.dsi.fastutil.chars.CharListIterator p0){
return CharBigListIterators.asBigListIterator(p0);
}
public static it.unimi.dsi.fastutil.chars.CharListIterator wrap(char[] p0,int p1,int p2){
return CharIterators.wrap(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.CharListIterator wrap(char[] p0){
return CharIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.chars.CharListIterator singleton(char p0){
return CharIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.chars.CharListIterator unmodifiable(it.unimi.dsi.fastutil.chars.CharListIterator p0){
return CharIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.CharListIterator fromTo(char p0,char p1){
return CharIterators.fromTo(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharListIterator asCharIterator(java.util.ListIterator p0){
return CharIterators.asCharIterator(p0);
}
}
