package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ReferenceBigArrayBigList;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReferenceBigArrayBigListUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigArrayBigList<K> wrap(K[][] p0,long p1){
return ReferenceBigArrayBigList.wrap(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigArrayBigList<K> wrap(K[][] p0){
return ReferenceBigArrayBigList.wrap(p0);
}
}
