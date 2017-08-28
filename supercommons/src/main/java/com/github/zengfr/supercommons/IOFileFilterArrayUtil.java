package com.github.zengfr.supercommons;
import org.apache.commons.io.filefilter.FileFilterUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IOFileFilterArrayUtil{ 
public static org.apache.commons.io.filefilter.IOFileFilter and(org.apache.commons.io.filefilter.IOFileFilter... p0){
return FileFilterUtils.and(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter or(org.apache.commons.io.filefilter.IOFileFilter... p0){
return FileFilterUtils.or(p0);
}
public static java.util.List<org.apache.commons.io.filefilter.IOFileFilter> toList(org.apache.commons.io.filefilter.IOFileFilter... p0){
return FileFilterUtils.toList(p0);
}
}
