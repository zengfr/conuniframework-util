package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.ReferenceLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReferenceListUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> emptyList(){
return ReferenceLists.emptyList();
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> shuffle(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0,java.util.Random p1){
return ReferenceLists.shuffle(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> singleton(K p0){
return ReferenceLists.singleton(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> unmodifiable(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0){
return ReferenceLists.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0){
return ReferenceLists.synchronize(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0,java.lang.Object p1){
return ReferenceLists.synchronize(p0,p1);
}
}
