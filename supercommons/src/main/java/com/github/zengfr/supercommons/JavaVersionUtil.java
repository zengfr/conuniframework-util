package com.zengfr.supercommons;
import org.apache.commons.lang3.JavaVersion;
import org.apache.commons.lang3.SystemUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class JavaVersionUtil{ 
public static org.apache.commons.lang3.JavaVersion valueOf(java.lang.String p0){
return JavaVersion.valueOf(p0);
}
public static boolean isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion p0){
return SystemUtils.isJavaVersionAtLeast(p0);
}
}
