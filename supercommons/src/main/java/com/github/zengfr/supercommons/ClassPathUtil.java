package com.github.zengfr.supercommons;
import com.google.common.reflect.ClassPath;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ClassPathUtil{ 
public static com.google.common.reflect.ClassPath from(java.lang.ClassLoader p0) throws java.io.IOException{
return ClassPath.from(p0);
}
}
