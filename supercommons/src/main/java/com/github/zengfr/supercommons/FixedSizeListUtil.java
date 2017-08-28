package com.zengfr.supercommons;
import org.apache.commons.collections4.list.FixedSizeList;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FixedSizeListUtil{ 
public static <E> org.apache.commons.collections4.list.FixedSizeList<E> fixedSizeList(java.util.List<E> p0){
return FixedSizeList.fixedSizeList(p0);
}
}
