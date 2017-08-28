package com.github.zengfr.supercommons;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.math3.random.RandomGeneratorFactory;
import org.apache.commons.math3.random.RandomAdaptor;
import it.unimi.dsi.fastutil.booleans.BooleanArrays;
import it.unimi.dsi.fastutil.booleans.BooleanBigArrays;
import it.unimi.dsi.fastutil.booleans.BooleanBigLists;
import it.unimi.dsi.fastutil.booleans.BooleanLists;
import it.unimi.dsi.fastutil.bytes.ByteArrays;
import it.unimi.dsi.fastutil.bytes.ByteBigArrays;
import it.unimi.dsi.fastutil.bytes.ByteBigLists;
import it.unimi.dsi.fastutil.bytes.ByteLists;
import it.unimi.dsi.fastutil.chars.CharArrays;
import it.unimi.dsi.fastutil.chars.CharBigArrays;
import it.unimi.dsi.fastutil.chars.CharBigLists;
import it.unimi.dsi.fastutil.chars.CharLists;
import it.unimi.dsi.fastutil.doubles.DoubleArrays;
import it.unimi.dsi.fastutil.doubles.DoubleBigArrays;
import it.unimi.dsi.fastutil.doubles.DoubleBigLists;
import it.unimi.dsi.fastutil.doubles.DoubleLists;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatBigArrays;
import it.unimi.dsi.fastutil.floats.FloatBigLists;
import it.unimi.dsi.fastutil.floats.FloatLists;
import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.ints.IntBigArrays;
import it.unimi.dsi.fastutil.ints.IntBigLists;
import it.unimi.dsi.fastutil.ints.IntLists;
import it.unimi.dsi.fastutil.longs.LongArrays;
import it.unimi.dsi.fastutil.longs.LongBigArrays;
import it.unimi.dsi.fastutil.longs.LongBigLists;
import it.unimi.dsi.fastutil.longs.LongLists;
import it.unimi.dsi.fastutil.objects.ObjectArrays;
import it.unimi.dsi.fastutil.objects.ObjectBigArrays;
import it.unimi.dsi.fastutil.objects.ObjectBigLists;
import it.unimi.dsi.fastutil.objects.ObjectLists;
import it.unimi.dsi.fastutil.objects.ReferenceBigLists;
import it.unimi.dsi.fastutil.objects.ReferenceLists;
import it.unimi.dsi.fastutil.shorts.ShortArrays;
import it.unimi.dsi.fastutil.shorts.ShortBigArrays;
import it.unimi.dsi.fastutil.shorts.ShortBigLists;
import it.unimi.dsi.fastutil.shorts.ShortLists;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang.RandomStringUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RandomUtil{ 
public static java.lang.String random(int p0,int p1,int p2,boolean p3,boolean p4,char[] p5,java.util.Random p6){
return RandomStringUtils.random(p0,p1,p2,p3,p4,p5,p6);
}
public static org.apache.commons.math3.random.RandomGenerator createRandomGenerator(java.util.Random p0){
return RandomGeneratorFactory.createRandomGenerator(p0);
}
public static java.util.Random createAdaptor(org.apache.commons.math3.random.RandomGenerator p0){
return RandomAdaptor.createAdaptor(p0);
}
public static boolean[] shuffle(boolean[] p0,int p1,int p2,java.util.Random p3){
return BooleanArrays.shuffle(p0,p1,p2,p3);
}
public static boolean[] shuffle(boolean[] p0,java.util.Random p1){
return BooleanArrays.shuffle(p0,p1);
}
public static boolean[][] shuffle(boolean[][] p0,long p1,long p2,java.util.Random p3){
return BooleanBigArrays.shuffle(p0,p1,p2,p3);
}
public static boolean[][] shuffle(boolean[][] p0,java.util.Random p1){
return BooleanBigArrays.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigList shuffle(it.unimi.dsi.fastutil.booleans.BooleanBigList p0,java.util.Random p1){
return BooleanBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList shuffle(it.unimi.dsi.fastutil.booleans.BooleanList p0,java.util.Random p1){
return BooleanLists.shuffle(p0,p1);
}
public static byte[] shuffle(byte[] p0,int p1,int p2,java.util.Random p3){
return ByteArrays.shuffle(p0,p1,p2,p3);
}
public static byte[] shuffle(byte[] p0,java.util.Random p1){
return ByteArrays.shuffle(p0,p1);
}
public static byte[][] shuffle(byte[][] p0,java.util.Random p1){
return ByteBigArrays.shuffle(p0,p1);
}
public static byte[][] shuffle(byte[][] p0,long p1,long p2,java.util.Random p3){
return ByteBigArrays.shuffle(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigList shuffle(it.unimi.dsi.fastutil.bytes.ByteBigList p0,java.util.Random p1){
return ByteBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteList shuffle(it.unimi.dsi.fastutil.bytes.ByteList p0,java.util.Random p1){
return ByteLists.shuffle(p0,p1);
}
public static char[] shuffle(char[] p0,int p1,int p2,java.util.Random p3){
return CharArrays.shuffle(p0,p1,p2,p3);
}
public static char[] shuffle(char[] p0,java.util.Random p1){
return CharArrays.shuffle(p0,p1);
}
public static char[][] shuffle(char[][] p0,java.util.Random p1){
return CharBigArrays.shuffle(p0,p1);
}
public static char[][] shuffle(char[][] p0,long p1,long p2,java.util.Random p3){
return CharBigArrays.shuffle(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.chars.CharBigList shuffle(it.unimi.dsi.fastutil.chars.CharBigList p0,java.util.Random p1){
return CharBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharList shuffle(it.unimi.dsi.fastutil.chars.CharList p0,java.util.Random p1){
return CharLists.shuffle(p0,p1);
}
public static double[] shuffle(double[] p0,java.util.Random p1){
return DoubleArrays.shuffle(p0,p1);
}
public static double[] shuffle(double[] p0,int p1,int p2,java.util.Random p3){
return DoubleArrays.shuffle(p0,p1,p2,p3);
}
public static double[][] shuffle(double[][] p0,long p1,long p2,java.util.Random p3){
return DoubleBigArrays.shuffle(p0,p1,p2,p3);
}
public static double[][] shuffle(double[][] p0,java.util.Random p1){
return DoubleBigArrays.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigList shuffle(it.unimi.dsi.fastutil.doubles.DoubleBigList p0,java.util.Random p1){
return DoubleBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList shuffle(it.unimi.dsi.fastutil.doubles.DoubleList p0,java.util.Random p1){
return DoubleLists.shuffle(p0,p1);
}
public static float[] shuffle(float[] p0,java.util.Random p1){
return FloatArrays.shuffle(p0,p1);
}
public static float[] shuffle(float[] p0,int p1,int p2,java.util.Random p3){
return FloatArrays.shuffle(p0,p1,p2,p3);
}
public static float[][] shuffle(float[][] p0,java.util.Random p1){
return FloatBigArrays.shuffle(p0,p1);
}
public static float[][] shuffle(float[][] p0,long p1,long p2,java.util.Random p3){
return FloatBigArrays.shuffle(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.floats.FloatBigList shuffle(it.unimi.dsi.fastutil.floats.FloatBigList p0,java.util.Random p1){
return FloatBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatList shuffle(it.unimi.dsi.fastutil.floats.FloatList p0,java.util.Random p1){
return FloatLists.shuffle(p0,p1);
}
public static int[] shuffle(int[] p0,int p1,int p2,java.util.Random p3){
return IntArrays.shuffle(p0,p1,p2,p3);
}
public static int[] shuffle(int[] p0,java.util.Random p1){
return IntArrays.shuffle(p0,p1);
}
public static int[][] shuffle(int[][] p0,java.util.Random p1){
return IntBigArrays.shuffle(p0,p1);
}
public static int[][] shuffle(int[][] p0,long p1,long p2,java.util.Random p3){
return IntBigArrays.shuffle(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.ints.IntBigList shuffle(it.unimi.dsi.fastutil.ints.IntBigList p0,java.util.Random p1){
return IntBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntList shuffle(it.unimi.dsi.fastutil.ints.IntList p0,java.util.Random p1){
return IntLists.shuffle(p0,p1);
}
public static long[] shuffle(long[] p0,int p1,int p2,java.util.Random p3){
return LongArrays.shuffle(p0,p1,p2,p3);
}
public static long[] shuffle(long[] p0,java.util.Random p1){
return LongArrays.shuffle(p0,p1);
}
public static long[][] shuffle(long[][] p0,java.util.Random p1){
return LongBigArrays.shuffle(p0,p1);
}
public static long[][] shuffle(long[][] p0,long p1,long p2,java.util.Random p3){
return LongBigArrays.shuffle(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.longs.LongBigList shuffle(it.unimi.dsi.fastutil.longs.LongBigList p0,java.util.Random p1){
return LongBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongList shuffle(it.unimi.dsi.fastutil.longs.LongList p0,java.util.Random p1){
return LongLists.shuffle(p0,p1);
}
public static <K> K[] shuffle(K[] p0,int p1,int p2,java.util.Random p3){
return ObjectArrays.shuffle(p0,p1,p2,p3);
}
public static <K> K[] shuffle(K[] p0,java.util.Random p1){
return ObjectArrays.shuffle(p0,p1);
}
public static <K> K[][] shuffle(K[][] p0,long p1,long p2,java.util.Random p3){
return ObjectBigArrays.shuffle(p0,p1,p2,p3);
}
public static <K> K[][] shuffle(K[][] p0,java.util.Random p1){
return ObjectBigArrays.shuffle(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> shuffle(it.unimi.dsi.fastutil.objects.ObjectBigList<K> p0,java.util.Random p1){
return ObjectBigLists.shuffle(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> shuffle(it.unimi.dsi.fastutil.objects.ObjectList<K> p0,java.util.Random p1){
return ObjectLists.shuffle(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> shuffle(it.unimi.dsi.fastutil.objects.ReferenceBigList<K> p0,java.util.Random p1){
return ReferenceBigLists.shuffle(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> shuffle(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0,java.util.Random p1){
return ReferenceLists.shuffle(p0,p1);
}
public static short[] shuffle(short[] p0,int p1,int p2,java.util.Random p3){
return ShortArrays.shuffle(p0,p1,p2,p3);
}
public static short[] shuffle(short[] p0,java.util.Random p1){
return ShortArrays.shuffle(p0,p1);
}
public static short[][] shuffle(short[][] p0,java.util.Random p1){
return ShortBigArrays.shuffle(p0,p1);
}
public static short[][] shuffle(short[][] p0,long p1,long p2,java.util.Random p3){
return ShortBigArrays.shuffle(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigList shuffle(it.unimi.dsi.fastutil.shorts.ShortBigList p0,java.util.Random p1){
return ShortBigLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortList shuffle(it.unimi.dsi.fastutil.shorts.ShortList p0,java.util.Random p1){
return ShortLists.shuffle(p0,p1);
}
public static int nextInt(java.util.Random p0,int p1){
return RandomUtils.nextInt(p0,p1);
}
public static int nextInt(java.util.Random p0){
return RandomUtils.nextInt(p0);
}
public static double nextDouble(java.util.Random p0){
return RandomUtils.nextDouble(p0);
}
public static boolean nextBoolean(java.util.Random p0){
return RandomUtils.nextBoolean(p0);
}
public static float nextFloat(java.util.Random p0){
return RandomUtils.nextFloat(p0);
}
public static long nextLong(java.util.Random p0){
return RandomUtils.nextLong(p0);
}
}
