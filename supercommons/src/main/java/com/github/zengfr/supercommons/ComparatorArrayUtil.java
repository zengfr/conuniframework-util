package com.github.zengfr.supercommons;
import org.apache.commons.collections.ComparatorUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ComparatorArrayUtil{ 
public static java.util.Comparator chainedComparator(java.util.Comparator[] p0){
return ComparatorUtils.chainedComparator(p0);
}
}
