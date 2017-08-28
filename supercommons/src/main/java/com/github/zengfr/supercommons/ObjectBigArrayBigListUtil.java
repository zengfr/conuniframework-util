package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectBigArrayBigListUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList<K> wrap(K[][] p0){
return ObjectBigArrayBigList.wrap(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigArrayBigList<K> wrap(K[][] p0,long p1){
return ObjectBigArrayBigList.wrap(p0,p1);
}
}
