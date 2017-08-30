package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IteratorArrayUtil{ 
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.collatedIterator(java.util.Comparator,java.util.Iterator[])
*/ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Iterator[] p1){
	return org.apache.commons.collections.IteratorUtils.collatedIterator(p0,p1);
}
/**
*public static java.util.Iterator org.apache.commons.collections.IteratorUtils.chainedIterator(java.util.Iterator[])
*/ 
public static java.util.Iterator chainedIterator(java.util.Iterator[] p0){
	return org.apache.commons.collections.IteratorUtils.chainedIterator(p0);
}
}
