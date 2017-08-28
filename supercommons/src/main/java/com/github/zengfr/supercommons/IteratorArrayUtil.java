package com.zengfr.supercommons;
import org.apache.commons.collections.IteratorUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IteratorArrayUtil{ 
public static java.util.Iterator collatedIterator(java.util.Comparator p0,java.util.Iterator[] p1){
return IteratorUtils.collatedIterator(p0,p1);
}
public static java.util.Iterator chainedIterator(java.util.Iterator[] p0){
return IteratorUtils.chainedIterator(p0);
}
}
