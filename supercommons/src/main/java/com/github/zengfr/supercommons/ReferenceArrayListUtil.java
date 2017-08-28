package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReferenceArrayListUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceArrayList<K> wrap(K[] p0){
return ReferenceArrayList.wrap(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceArrayList<K> wrap(K[] p0,int p1){
return ReferenceArrayList.wrap(p0,p1);
}
}
