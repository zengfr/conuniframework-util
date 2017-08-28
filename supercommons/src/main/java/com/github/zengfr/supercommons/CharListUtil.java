package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.CharListList;
import org.apache.commons.collections.primitives.adapters.ListCharList;
import org.apache.commons.collections.primitives.decorators.UnmodifiableCharList;
import org.apache.commons.collections.primitives.CharCollections;
import it.unimi.dsi.fastutil.chars.CharBigLists;
import it.unimi.dsi.fastutil.chars.CharIterators;
import it.unimi.dsi.fastutil.chars.CharLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharListUtil{ 
public static java.util.List wrap(org.apache.commons.collections.primitives.CharList p0){
return CharListList.wrap(p0);
}
public static org.apache.commons.collections.primitives.CharList wrap(java.util.List p0){
return ListCharList.wrap(p0);
}
public static org.apache.commons.collections.primitives.CharList getEmptyCharList(){
return CharCollections.getEmptyCharList();
}
public static org.apache.commons.collections.primitives.CharList unmodifiableCharList(org.apache.commons.collections.primitives.CharList p0) throws java.lang.NullPointerException{
return CharCollections.unmodifiableCharList(p0);
}
public static org.apache.commons.collections.primitives.CharList singletonCharList(char p0){
return CharCollections.singletonCharList(p0);
}
public static it.unimi.dsi.fastutil.chars.CharBigList asBigList(it.unimi.dsi.fastutil.chars.CharList p0){
return CharBigLists.asBigList(p0);
}
public static it.unimi.dsi.fastutil.chars.CharList pour(it.unimi.dsi.fastutil.chars.CharIterator p0){
return CharIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.chars.CharList pour(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1){
return CharIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharList shuffle(it.unimi.dsi.fastutil.chars.CharList p0,java.util.Random p1){
return CharLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharList singleton(char p0){
return CharLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.chars.CharList singleton(java.lang.Object p0){
return CharLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.chars.CharList unmodifiable(it.unimi.dsi.fastutil.chars.CharList p0){
return CharLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.CharList synchronize(it.unimi.dsi.fastutil.chars.CharList p0){
return CharLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.chars.CharList synchronize(it.unimi.dsi.fastutil.chars.CharList p0,java.lang.Object p1){
return CharLists.synchronize(p0,p1);
}
}
