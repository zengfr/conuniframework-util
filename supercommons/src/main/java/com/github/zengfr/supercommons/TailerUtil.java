package com.zengfr.supercommons;
import org.apache.commons.io.input.Tailer;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TailerUtil{ 
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2){
return Tailer.create(p0,p1,p2);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1){
return Tailer.create(p0,p1);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4){
return Tailer.create(p0,p1,p2,p3,p4);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4,int p5){
return Tailer.create(p0,p1,p2,p3,p4,p5);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,java.nio.charset.Charset p1,org.apache.commons.io.input.TailerListener p2,long p3,boolean p4,boolean p5,int p6){
return Tailer.create(p0,p1,p2,p3,p4,p5,p6);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,int p4){
return Tailer.create(p0,p1,p2,p3,p4);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3){
return Tailer.create(p0,p1,p2,p3);
}
}
