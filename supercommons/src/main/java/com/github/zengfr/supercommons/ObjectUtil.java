package com.zengfr.supercommons;
import com.google.common.base.Defaults;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import com.google.common.reflect.Reflection;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.Uninterruptibles;
import org.apache.commons.io.FileCleaner;
import org.apache.commons.io.TaggedIOException;
import org.apache.commons.collections.TransformerUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections.map.DefaultedMap;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.ComparatorUtils;
import org.apache.commons.collections.FactoryUtils;
import org.apache.commons.collections.set.MapBackedSet;
import org.apache.commons.collections.functors.PrototypeFactory;
import org.apache.commons.collections.functors.ConstantFactory;
import org.apache.commons.collections.functors.ConstantTransformer;
import org.apache.commons.collections.functors.EqualPredicate;
import org.apache.commons.collections.functors.IdentityPredicate;
import org.apache.commons.collections.PredicateUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.ComparatorUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.concurrent.ConcurrentUtils;
import org.apache.commons.lang3.event.EventUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.reflect.ConstructorUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.beanutils.locale.LocaleBeanUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.beanutils.locale.LocaleConvertUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.text.StrSubstitutor;
import it.unimi.dsi.fastutil.IndirectPriorityQueues;
import it.unimi.dsi.fastutil.PriorityQueues;
import it.unimi.dsi.fastutil.booleans.BooleanBigLists;
import it.unimi.dsi.fastutil.booleans.BooleanCollections;
import it.unimi.dsi.fastutil.booleans.BooleanLists;
import it.unimi.dsi.fastutil.booleans.BooleanSets;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanMaps;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ByteFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2ByteMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2CharFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2CharMaps;
import it.unimi.dsi.fastutil.bytes.Byte2CharSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleMaps;
import it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2FloatFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2FloatMaps;
import it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2IntFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2IntMaps;
import it.unimi.dsi.fastutil.bytes.Byte2IntSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2LongFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2LongMaps;
import it.unimi.dsi.fastutil.bytes.Byte2LongSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ShortFunctions;
import it.unimi.dsi.fastutil.bytes.Byte2ShortMaps;
import it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMaps;
import it.unimi.dsi.fastutil.bytes.ByteBigLists;
import it.unimi.dsi.fastutil.bytes.ByteCollections;
import it.unimi.dsi.fastutil.bytes.ByteLists;
import it.unimi.dsi.fastutil.bytes.BytePriorityQueues;
import it.unimi.dsi.fastutil.bytes.ByteSets;
import it.unimi.dsi.fastutil.bytes.ByteSortedSets;
import it.unimi.dsi.fastutil.chars.Char2BooleanFunctions;
import it.unimi.dsi.fastutil.chars.Char2BooleanMaps;
import it.unimi.dsi.fastutil.chars.Char2BooleanSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ByteFunctions;
import it.unimi.dsi.fastutil.chars.Char2ByteMaps;
import it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2CharFunctions;
import it.unimi.dsi.fastutil.chars.Char2CharMaps;
import it.unimi.dsi.fastutil.chars.Char2CharSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2DoubleFunctions;
import it.unimi.dsi.fastutil.chars.Char2DoubleMaps;
import it.unimi.dsi.fastutil.chars.Char2DoubleSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2FloatFunctions;
import it.unimi.dsi.fastutil.chars.Char2FloatMaps;
import it.unimi.dsi.fastutil.chars.Char2FloatSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2IntFunctions;
import it.unimi.dsi.fastutil.chars.Char2IntMaps;
import it.unimi.dsi.fastutil.chars.Char2IntSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2LongFunctions;
import it.unimi.dsi.fastutil.chars.Char2LongMaps;
import it.unimi.dsi.fastutil.chars.Char2LongSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ObjectFunctions;
import it.unimi.dsi.fastutil.chars.Char2ObjectMaps;
import it.unimi.dsi.fastutil.chars.Char2ObjectSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ReferenceFunctions;
import it.unimi.dsi.fastutil.chars.Char2ReferenceMaps;
import it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.chars.Char2ShortFunctions;
import it.unimi.dsi.fastutil.chars.Char2ShortMaps;
import it.unimi.dsi.fastutil.chars.Char2ShortSortedMaps;
import it.unimi.dsi.fastutil.chars.CharBigLists;
import it.unimi.dsi.fastutil.chars.CharCollections;
import it.unimi.dsi.fastutil.chars.CharLists;
import it.unimi.dsi.fastutil.chars.CharPriorityQueues;
import it.unimi.dsi.fastutil.chars.CharSets;
import it.unimi.dsi.fastutil.chars.CharSortedSets;
import it.unimi.dsi.fastutil.doubles.Double2BooleanFunctions;
import it.unimi.dsi.fastutil.doubles.Double2BooleanMaps;
import it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ByteFunctions;
import it.unimi.dsi.fastutil.doubles.Double2ByteMaps;
import it.unimi.dsi.fastutil.doubles.Double2ByteSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2CharFunctions;
import it.unimi.dsi.fastutil.doubles.Double2CharMaps;
import it.unimi.dsi.fastutil.doubles.Double2CharSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2DoubleFunctions;
import it.unimi.dsi.fastutil.doubles.Double2DoubleMaps;
import it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2FloatFunctions;
import it.unimi.dsi.fastutil.doubles.Double2FloatMaps;
import it.unimi.dsi.fastutil.doubles.Double2FloatSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2IntFunctions;
import it.unimi.dsi.fastutil.doubles.Double2IntMaps;
import it.unimi.dsi.fastutil.doubles.Double2IntSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2LongFunctions;
import it.unimi.dsi.fastutil.doubles.Double2LongMaps;
import it.unimi.dsi.fastutil.doubles.Double2LongSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ObjectFunctions;
import it.unimi.dsi.fastutil.doubles.Double2ObjectMaps;
import it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceFunctions;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceMaps;
import it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.doubles.Double2ShortFunctions;
import it.unimi.dsi.fastutil.doubles.Double2ShortMaps;
import it.unimi.dsi.fastutil.doubles.Double2ShortSortedMaps;
import it.unimi.dsi.fastutil.doubles.DoubleBigLists;
import it.unimi.dsi.fastutil.doubles.DoubleCollections;
import it.unimi.dsi.fastutil.doubles.DoubleLists;
import it.unimi.dsi.fastutil.doubles.DoublePriorityQueues;
import it.unimi.dsi.fastutil.doubles.DoubleSets;
import it.unimi.dsi.fastutil.doubles.DoubleSortedSets;
import it.unimi.dsi.fastutil.floats.Float2BooleanFunctions;
import it.unimi.dsi.fastutil.floats.Float2BooleanMaps;
import it.unimi.dsi.fastutil.floats.Float2BooleanSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ByteFunctions;
import it.unimi.dsi.fastutil.floats.Float2ByteMaps;
import it.unimi.dsi.fastutil.floats.Float2ByteSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2CharFunctions;
import it.unimi.dsi.fastutil.floats.Float2CharMaps;
import it.unimi.dsi.fastutil.floats.Float2CharSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2DoubleFunctions;
import it.unimi.dsi.fastutil.floats.Float2DoubleMaps;
import it.unimi.dsi.fastutil.floats.Float2DoubleSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2FloatFunctions;
import it.unimi.dsi.fastutil.floats.Float2FloatMaps;
import it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2IntFunctions;
import it.unimi.dsi.fastutil.floats.Float2IntMaps;
import it.unimi.dsi.fastutil.floats.Float2IntSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2LongFunctions;
import it.unimi.dsi.fastutil.floats.Float2LongMaps;
import it.unimi.dsi.fastutil.floats.Float2LongSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ObjectFunctions;
import it.unimi.dsi.fastutil.floats.Float2ObjectMaps;
import it.unimi.dsi.fastutil.floats.Float2ObjectSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ReferenceFunctions;
import it.unimi.dsi.fastutil.floats.Float2ReferenceMaps;
import it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.floats.Float2ShortFunctions;
import it.unimi.dsi.fastutil.floats.Float2ShortMaps;
import it.unimi.dsi.fastutil.floats.Float2ShortSortedMaps;
import it.unimi.dsi.fastutil.floats.FloatBigLists;
import it.unimi.dsi.fastutil.floats.FloatCollections;
import it.unimi.dsi.fastutil.floats.FloatLists;
import it.unimi.dsi.fastutil.floats.FloatPriorityQueues;
import it.unimi.dsi.fastutil.floats.FloatSets;
import it.unimi.dsi.fastutil.floats.FloatSortedSets;
import it.unimi.dsi.fastutil.ints.Int2BooleanFunctions;
import it.unimi.dsi.fastutil.ints.Int2BooleanMaps;
import it.unimi.dsi.fastutil.ints.Int2BooleanSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ByteFunctions;
import it.unimi.dsi.fastutil.ints.Int2ByteMaps;
import it.unimi.dsi.fastutil.ints.Int2ByteSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2CharFunctions;
import it.unimi.dsi.fastutil.ints.Int2CharMaps;
import it.unimi.dsi.fastutil.ints.Int2CharSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2DoubleFunctions;
import it.unimi.dsi.fastutil.ints.Int2DoubleMaps;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2FloatFunctions;
import it.unimi.dsi.fastutil.ints.Int2FloatMaps;
import it.unimi.dsi.fastutil.ints.Int2FloatSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2IntFunctions;
import it.unimi.dsi.fastutil.ints.Int2IntMaps;
import it.unimi.dsi.fastutil.ints.Int2IntSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2LongFunctions;
import it.unimi.dsi.fastutil.ints.Int2LongMaps;
import it.unimi.dsi.fastutil.ints.Int2LongSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectFunctions;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ReferenceFunctions;
import it.unimi.dsi.fastutil.ints.Int2ReferenceMaps;
import it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.ints.Int2ShortFunctions;
import it.unimi.dsi.fastutil.ints.Int2ShortMaps;
import it.unimi.dsi.fastutil.ints.Int2ShortSortedMaps;
import it.unimi.dsi.fastutil.ints.IntBigLists;
import it.unimi.dsi.fastutil.ints.IntCollections;
import it.unimi.dsi.fastutil.ints.IntLists;
import it.unimi.dsi.fastutil.ints.IntPriorityQueues;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.ints.IntSortedSets;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.longs.Long2BooleanFunctions;
import it.unimi.dsi.fastutil.longs.Long2BooleanMaps;
import it.unimi.dsi.fastutil.longs.Long2BooleanSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ByteFunctions;
import it.unimi.dsi.fastutil.longs.Long2ByteMaps;
import it.unimi.dsi.fastutil.longs.Long2ByteSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2CharFunctions;
import it.unimi.dsi.fastutil.longs.Long2CharMaps;
import it.unimi.dsi.fastutil.longs.Long2CharSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2DoubleFunctions;
import it.unimi.dsi.fastutil.longs.Long2DoubleMaps;
import it.unimi.dsi.fastutil.longs.Long2DoubleSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2FloatFunctions;
import it.unimi.dsi.fastutil.longs.Long2FloatMaps;
import it.unimi.dsi.fastutil.longs.Long2FloatSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2IntFunctions;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2LongFunctions;
import it.unimi.dsi.fastutil.longs.Long2LongMaps;
import it.unimi.dsi.fastutil.longs.Long2LongSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunctions;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ReferenceFunctions;
import it.unimi.dsi.fastutil.longs.Long2ReferenceMaps;
import it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.longs.Long2ShortFunctions;
import it.unimi.dsi.fastutil.longs.Long2ShortMaps;
import it.unimi.dsi.fastutil.longs.Long2ShortSortedMaps;
import it.unimi.dsi.fastutil.longs.LongBigLists;
import it.unimi.dsi.fastutil.longs.LongCollections;
import it.unimi.dsi.fastutil.longs.LongLists;
import it.unimi.dsi.fastutil.longs.LongPriorityQueues;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.longs.LongSortedSets;
import it.unimi.dsi.fastutil.objects.Object2BooleanFunctions;
import it.unimi.dsi.fastutil.objects.Object2BooleanMaps;
import it.unimi.dsi.fastutil.objects.Object2BooleanSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ByteFunctions;
import it.unimi.dsi.fastutil.objects.Object2ByteMaps;
import it.unimi.dsi.fastutil.objects.Object2ByteSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2CharFunctions;
import it.unimi.dsi.fastutil.objects.Object2CharMaps;
import it.unimi.dsi.fastutil.objects.Object2CharSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2DoubleFunctions;
import it.unimi.dsi.fastutil.objects.Object2DoubleMaps;
import it.unimi.dsi.fastutil.objects.Object2DoubleSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatFunctions;
import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2IntFunctions;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2LongFunctions;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import it.unimi.dsi.fastutil.objects.Object2LongSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectFunctions;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ReferenceFunctions;
import it.unimi.dsi.fastutil.objects.Object2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.objects.Object2ShortFunctions;
import it.unimi.dsi.fastutil.objects.Object2ShortMaps;
import it.unimi.dsi.fastutil.objects.Object2ShortSortedMaps;
import it.unimi.dsi.fastutil.objects.ObjectBigArrays;
import it.unimi.dsi.fastutil.objects.ObjectBigLists;
import it.unimi.dsi.fastutil.objects.ObjectCollections;
import it.unimi.dsi.fastutil.objects.ObjectLists;
import it.unimi.dsi.fastutil.objects.ObjectSets;
import it.unimi.dsi.fastutil.objects.ObjectSortedSets;
import it.unimi.dsi.fastutil.objects.Reference2BooleanFunctions;
import it.unimi.dsi.fastutil.objects.Reference2BooleanMaps;
import it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ByteFunctions;
import it.unimi.dsi.fastutil.objects.Reference2ByteMaps;
import it.unimi.dsi.fastutil.objects.Reference2ByteSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2CharFunctions;
import it.unimi.dsi.fastutil.objects.Reference2CharMaps;
import it.unimi.dsi.fastutil.objects.Reference2CharSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2DoubleFunctions;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMaps;
import it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatFunctions;
import it.unimi.dsi.fastutil.objects.Reference2FloatMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntFunctions;
import it.unimi.dsi.fastutil.objects.Reference2IntMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2LongFunctions;
import it.unimi.dsi.fastutil.objects.Reference2LongMaps;
import it.unimi.dsi.fastutil.objects.Reference2LongSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectFunctions;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceFunctions;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMaps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.objects.Reference2ShortFunctions;
import it.unimi.dsi.fastutil.objects.Reference2ShortMaps;
import it.unimi.dsi.fastutil.objects.Reference2ShortSortedMaps;
import it.unimi.dsi.fastutil.objects.ReferenceBigLists;
import it.unimi.dsi.fastutil.objects.ReferenceCollections;
import it.unimi.dsi.fastutil.objects.ReferenceLists;
import it.unimi.dsi.fastutil.objects.ReferenceSets;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
import it.unimi.dsi.fastutil.shorts.Short2BooleanFunctions;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMaps;
import it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ByteFunctions;
import it.unimi.dsi.fastutil.shorts.Short2ByteMaps;
import it.unimi.dsi.fastutil.shorts.Short2ByteSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2CharFunctions;
import it.unimi.dsi.fastutil.shorts.Short2CharMaps;
import it.unimi.dsi.fastutil.shorts.Short2CharSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2DoubleFunctions;
import it.unimi.dsi.fastutil.shorts.Short2DoubleMaps;
import it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2FloatFunctions;
import it.unimi.dsi.fastutil.shorts.Short2FloatMaps;
import it.unimi.dsi.fastutil.shorts.Short2FloatSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2IntFunctions;
import it.unimi.dsi.fastutil.shorts.Short2IntMaps;
import it.unimi.dsi.fastutil.shorts.Short2IntSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2LongFunctions;
import it.unimi.dsi.fastutil.shorts.Short2LongMaps;
import it.unimi.dsi.fastutil.shorts.Short2LongSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ObjectFunctions;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMaps;
import it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceFunctions;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceMaps;
import it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMaps;
import it.unimi.dsi.fastutil.shorts.Short2ShortFunctions;
import it.unimi.dsi.fastutil.shorts.Short2ShortMaps;
import it.unimi.dsi.fastutil.shorts.Short2ShortSortedMaps;
import it.unimi.dsi.fastutil.shorts.ShortBigLists;
import it.unimi.dsi.fastutil.shorts.ShortCollections;
import it.unimi.dsi.fastutil.shorts.ShortLists;
import it.unimi.dsi.fastutil.shorts.ShortPriorityQueues;
import it.unimi.dsi.fastutil.shorts.ShortSets;
import it.unimi.dsi.fastutil.shorts.ShortSortedSets;
import com.facebook.util.reflection.RobustProxy;
import com.facebook.util.serialization.SerDeUtils;
import com.facebook.util.TimeUtil;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.reflect.ConstructorUtils;
import org.apache.commons.lang.reflect.FieldUtils;
import org.apache.commons.lang.reflect.MethodUtils;
import org.apache.commons.lang.SerializationUtils;
import org.apache.commons.lang.text.StrSubstitutor;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang.Validate;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ObjectUtil{ 
public static <T> T defaultValue(java.lang.Class<T> p0){
return Defaults.defaultValue(p0);
}
public static <T> T firstNonNull(T p0,T p1){
return MoreObjects.firstNonNull(p0,p1);
}
public static ToStringHelper toStringHelper(java.lang.Object p0){
return MoreObjects.toStringHelper(p0);
}
public static <T> T checkNotNull(T p0,java.lang.String p1,java.lang.Object... p2){
return Preconditions.checkNotNull(p0,p1,p2);
}
public static <T> T checkNotNull(T p0,java.lang.Object p1){
return Preconditions.checkNotNull(p0,p1);
}
public static <T> T checkNotNull(T p0){
return Preconditions.checkNotNull(p0);
}
public static void checkArgument(boolean p0,java.lang.Object p1){
 Preconditions.checkArgument(p0,p1);
}
public static void checkState(boolean p0,java.lang.Object p1){
 Preconditions.checkState(p0,p1);
}
public static <T> T verifyNotNull(T p0,java.lang.String p1,java.lang.Object... p2){
return Verify.verifyNotNull(p0,p1,p2);
}
public static <T> T verifyNotNull(T p0){
return Verify.verifyNotNull(p0);
}
public static boolean contains(java.lang.Iterable<?> p0,java.lang.Object p1){
return Iterables.contains(p0,p1);
}
public static <T> T getFirst(java.lang.Iterable<? extends T> p0,T p1){
return Iterables.getFirst(p0,p1);
}
public static <T> T find(java.lang.Iterable<? extends T> p0,com.google.common.base.Predicate<? super T> p1,T p2){
return Iterables.find(p0,p1,p2);
}
public static <T> T find(java.lang.Iterable<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterables.find(p0,p1);
}
public static int frequency(java.lang.Iterable<?> p0,java.lang.Object p1){
return Iterables.frequency(p0,p1);
}
public static <T> T getLast(java.lang.Iterable<T> p0){
return Iterables.getLast(p0);
}
public static <T> T getLast(java.lang.Iterable<? extends T> p0,T p1){
return Iterables.getLast(p0,p1);
}
public static <T> T getOnlyElement(java.lang.Iterable<T> p0){
return Iterables.getOnlyElement(p0);
}
public static <T> T getOnlyElement(java.lang.Iterable<? extends T> p0,T p1){
return Iterables.getOnlyElement(p0,p1);
}
public static boolean contains(java.util.Iterator<?> p0,java.lang.Object p1){
return Iterators.contains(p0,p1);
}
public static <T> T find(java.util.Iterator<? extends T> p0,com.google.common.base.Predicate<? super T> p1,T p2){
return Iterators.find(p0,p1,p2);
}
public static <T> T find(java.util.Iterator<T> p0,com.google.common.base.Predicate<? super T> p1){
return Iterators.find(p0,p1);
}
public static int frequency(java.util.Iterator<?> p0,java.lang.Object p1){
return Iterators.frequency(p0,p1);
}
public static <T> T getLast(java.util.Iterator<T> p0){
return Iterators.getLast(p0);
}
public static <T> T getLast(java.util.Iterator<? extends T> p0,T p1){
return Iterators.getLast(p0,p1);
}
public static <T> T getNext(java.util.Iterator<? extends T> p0,T p1){
return Iterators.getNext(p0,p1);
}
public static <T> T getOnlyElement(java.util.Iterator<? extends T> p0,T p1){
return Iterators.getOnlyElement(p0,p1);
}
public static <T> T getOnlyElement(java.util.Iterator<T> p0){
return Iterators.getOnlyElement(p0);
}
public static <T> T readBytes(java.io.InputStream p0,com.google.common.io.ByteProcessor<T> p1) throws java.io.IOException{
return ByteStreams.readBytes(p0,p1);
}
public static <T> T readLines(java.lang.Readable p0,com.google.common.io.LineProcessor<T> p1) throws java.io.IOException{
return CharStreams.readLines(p0,p1);
}
public static <T> T readBytes(java.io.File p0,com.google.common.io.ByteProcessor<T> p1) throws java.io.IOException{
return Files.readBytes(p0,p1);
}
public static <T> T readLines(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2) throws java.io.IOException{
return Files.readLines(p0,p1,p2);
}
public static <T> T readLines(java.net.URL p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2) throws java.io.IOException{
return Resources.readLines(p0,p1,p2);
}
public static <T> T newProxy(java.lang.Class<T> p0,java.lang.reflect.InvocationHandler p1){
return Reflection.newProxy(p0,p1);
}
public static <V> V getUnchecked(java.util.concurrent.Future<V> p0){
return Futures.getUnchecked(p0);
}
public static <V,X extends java.lang.Exception > V getChecked(java.util.concurrent.Future<V> p0,java.lang.Class<X> p1,long p2,java.util.concurrent.TimeUnit p3) throws X{
return Futures.getChecked(p0,p1,p2,p3);
}
public static <V,X extends java.lang.Exception > V getChecked(java.util.concurrent.Future<V> p0,java.lang.Class<X> p1) throws X{
return Futures.getChecked(p0,p1);
}
public static <V> V getUninterruptibly(java.util.concurrent.Future<V> p0,long p1,java.util.concurrent.TimeUnit p2) throws java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException{
return Uninterruptibles.getUninterruptibly(p0,p1,p2);
}
public static <V> V getUninterruptibly(java.util.concurrent.Future<V> p0) throws java.util.concurrent.ExecutionException{
return Uninterruptibles.getUninterruptibly(p0);
}
public static <E> E takeUninterruptibly(java.util.concurrent.BlockingQueue<E> p0){
return Uninterruptibles.takeUninterruptibly(p0);
}
public static void track(java.lang.String p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2){
 FileCleaner.track(p0,p1,p2);
}
public static void track(java.io.File p0,java.lang.Object p1){
 FileCleaner.track(p0,p1);
}
public static void track(java.io.File p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2){
 FileCleaner.track(p0,p1,p2);
}
public static void track(java.lang.String p0,java.lang.Object p1){
 FileCleaner.track(p0,p1);
}
public static void throwCauseIfTaggedWith(java.lang.Throwable p0,java.lang.Object p1) throws java.io.IOException{
 TaggedIOException.throwCauseIfTaggedWith(p0,p1);
}
public static boolean isTaggedWith(java.lang.Throwable p0,java.lang.Object p1){
return TaggedIOException.isTaggedWith(p0,p1);
}
public static org.apache.commons.collections.Transformer constantTransformer(java.lang.Object p0){
return TransformerUtils.constantTransformer(p0);
}
public static java.lang.Object index(java.lang.Object p0,java.lang.Object p1){
return CollectionUtils.index(p0,p1);
}
public static java.lang.Object index(java.lang.Object p0,int p1){
return CollectionUtils.index(p0,p1);
}
public static int size(java.lang.Object p0){
return CollectionUtils.size(p0);
}
public static java.lang.Object find(java.util.Collection p0,org.apache.commons.collections.Predicate p1){
return CollectionUtils.find(p0,p1);
}
public static int cardinality(java.lang.Object p0,java.util.Collection p1){
return CollectionUtils.cardinality(p0,p1);
}
public static boolean addIgnoreNull(java.util.Collection p0,java.lang.Object p1){
return CollectionUtils.addIgnoreNull(p0,p1);
}
public static boolean sizeIsEmpty(java.lang.Object p0){
return CollectionUtils.sizeIsEmpty(p0);
}
public static java.lang.Number getNumber(java.util.Map p0,java.lang.Object p1){
return MapUtils.getNumber(p0,p1);
}
public static java.lang.Number getNumber(java.util.Map p0,java.lang.Object p1,java.lang.Number p2){
return MapUtils.getNumber(p0,p1,p2);
}
public static java.lang.Object getObject(java.util.Map p0,java.lang.Object p1,java.lang.Object p2){
return MapUtils.getObject(p0,p1,p2);
}
public static java.lang.Object getObject(java.util.Map p0,java.lang.Object p1){
return MapUtils.getObject(p0,p1);
}
public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1){
return MapUtils.getBoolean(p0,p1);
}
public static java.lang.Boolean getBoolean(java.util.Map p0,java.lang.Object p1,java.lang.Boolean p2){
return MapUtils.getBoolean(p0,p1,p2);
}
public static java.lang.Byte getByte(java.util.Map p0,java.lang.Object p1,java.lang.Byte p2){
return MapUtils.getByte(p0,p1,p2);
}
public static java.lang.Byte getByte(java.util.Map p0,java.lang.Object p1){
return MapUtils.getByte(p0,p1);
}
public static java.lang.Short getShort(java.util.Map p0,java.lang.Object p1){
return MapUtils.getShort(p0,p1);
}
public static java.lang.Short getShort(java.util.Map p0,java.lang.Object p1,java.lang.Short p2){
return MapUtils.getShort(p0,p1,p2);
}
public static java.lang.Long getLong(java.util.Map p0,java.lang.Object p1){
return MapUtils.getLong(p0,p1);
}
public static java.lang.Long getLong(java.util.Map p0,java.lang.Object p1,java.lang.Long p2){
return MapUtils.getLong(p0,p1,p2);
}
public static java.lang.Float getFloat(java.util.Map p0,java.lang.Object p1){
return MapUtils.getFloat(p0,p1);
}
public static java.lang.Float getFloat(java.util.Map p0,java.lang.Object p1,java.lang.Float p2){
return MapUtils.getFloat(p0,p1,p2);
}
public static java.lang.Double getDouble(java.util.Map p0,java.lang.Object p1,java.lang.Double p2){
return MapUtils.getDouble(p0,p1,p2);
}
public static java.lang.Double getDouble(java.util.Map p0,java.lang.Object p1){
return MapUtils.getDouble(p0,p1);
}
public static java.lang.Integer getInteger(java.util.Map p0,java.lang.Object p1){
return MapUtils.getInteger(p0,p1);
}
public static java.lang.Integer getInteger(java.util.Map p0,java.lang.Object p1,java.lang.Integer p2){
return MapUtils.getInteger(p0,p1,p2);
}
public static java.util.Map getMap(java.util.Map p0,java.lang.Object p1){
return MapUtils.getMap(p0,p1);
}
public static java.util.Map getMap(java.util.Map p0,java.lang.Object p1,java.util.Map p2){
return MapUtils.getMap(p0,p1,p2);
}
public static java.lang.String getString(java.util.Map p0,java.lang.Object p1,java.lang.String p2){
return MapUtils.getString(p0,p1,p2);
}
public static java.lang.String getString(java.util.Map p0,java.lang.Object p1){
return MapUtils.getString(p0,p1);
}
public static double getDoubleValue(java.util.Map p0,java.lang.Object p1,double p2){
return MapUtils.getDoubleValue(p0,p1,p2);
}
public static double getDoubleValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getDoubleValue(p0,p1);
}
public static float getFloatValue(java.util.Map p0,java.lang.Object p1,float p2){
return MapUtils.getFloatValue(p0,p1,p2);
}
public static float getFloatValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getFloatValue(p0,p1);
}
public static short getShortValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getShortValue(p0,p1);
}
public static short getShortValue(java.util.Map p0,java.lang.Object p1,short p2){
return MapUtils.getShortValue(p0,p1,p2);
}
public static void verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2){
 MapUtils.verbosePrint(p0,p1,p2);
}
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getBooleanValue(p0,p1);
}
public static boolean getBooleanValue(java.util.Map p0,java.lang.Object p1,boolean p2){
return MapUtils.getBooleanValue(p0,p1,p2);
}
public static byte getByteValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getByteValue(p0,p1);
}
public static byte getByteValue(java.util.Map p0,java.lang.Object p1,byte p2){
return MapUtils.getByteValue(p0,p1,p2);
}
public static long getLongValue(java.util.Map p0,java.lang.Object p1,long p2){
return MapUtils.getLongValue(p0,p1,p2);
}
public static long getLongValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getLongValue(p0,p1);
}
public static int getIntValue(java.util.Map p0,java.lang.Object p1,int p2){
return MapUtils.getIntValue(p0,p1,p2);
}
public static int getIntValue(java.util.Map p0,java.lang.Object p1){
return MapUtils.getIntValue(p0,p1);
}
public static void debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map p2){
 MapUtils.debugPrint(p0,p1,p2);
}
public static void safeAddToMap(java.util.Map p0,java.lang.Object p1,java.lang.Object p2) throws java.lang.NullPointerException{
 MapUtils.safeAddToMap(p0,p1,p2);
}
public static java.util.Map decorate(java.util.Map p0,java.lang.Object p1){
return DefaultedMap.decorate(p0,p1);
}
public static java.util.Iterator getIterator(java.lang.Object p0){
return IteratorUtils.getIterator(p0);
}
public static org.apache.commons.collections.ResettableIterator singletonIterator(java.lang.Object p0){
return IteratorUtils.singletonIterator(p0);
}
public static java.util.Iterator objectGraphIterator(java.lang.Object p0,org.apache.commons.collections.Transformer p1){
return IteratorUtils.objectGraphIterator(p0,p1);
}
public static java.util.ListIterator singletonListIterator(java.lang.Object p0){
return IteratorUtils.singletonListIterator(p0);
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object p0,int p1){
return IteratorUtils.arrayListIterator(p0,p1);
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object p0,int p1,int p2){
return IteratorUtils.arrayListIterator(p0,p1,p2);
}
public static org.apache.commons.collections.ResettableListIterator arrayListIterator(java.lang.Object p0){
return IteratorUtils.arrayListIterator(p0);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object p0){
return IteratorUtils.arrayIterator(p0);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object p0,int p1){
return IteratorUtils.arrayIterator(p0,p1);
}
public static org.apache.commons.collections.ResettableIterator arrayIterator(java.lang.Object p0,int p1,int p2){
return IteratorUtils.arrayIterator(p0,p1,p2);
}
public static java.lang.Object min(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2){
return ComparatorUtils.min(p0,p1,p2);
}
public static java.lang.Object max(java.lang.Object p0,java.lang.Object p1,java.util.Comparator p2){
return ComparatorUtils.max(p0,p1,p2);
}
public static org.apache.commons.collections.Factory constantFactory(java.lang.Object p0){
return FactoryUtils.constantFactory(p0);
}
public static org.apache.commons.collections.Factory prototypeFactory(java.lang.Object p0){
return FactoryUtils.prototypeFactory(p0);
}
public static org.apache.commons.collections.Factory getInstance(java.lang.Object p0){
return PrototypeFactory.getInstance(p0);
}
public static org.apache.commons.collections.Predicate identityPredicate(java.lang.Object p0){
return PredicateUtils.identityPredicate(p0);
}
public static org.apache.commons.collections.Predicate equalPredicate(java.lang.Object p0){
return PredicateUtils.equalPredicate(p0);
}
public static <T> T find(java.lang.Iterable<T> p0,org.apache.commons.collections4.Predicate<? super T> p1){
return CollectionUtils.find(p0,p1);
}
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > T forAllButLastDo(java.lang.Iterable<T> p0,C p1){
return CollectionUtils.forAllButLastDo(p0,p1);
}
public static <T,C extends org.apache.commons.collections4.Closure<? super T> > T forAllButLastDo(java.util.Iterator<T> p0,C p1){
return CollectionUtils.forAllButLastDo(p0,p1);
}
public static <E> E extractSingleton(java.util.Collection<E> p0){
return CollectionUtils.extractSingleton(p0);
}
public static <K,V> V getObject(java.util.Map<? super K, V> p0,K p1){
return MapUtils.getObject(p0,p1);
}
public static <K,V> V getObject(java.util.Map<K, V> p0,K p1,V p2){
return MapUtils.getObject(p0,p1,p2);
}
public static void verbosePrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map<?, ?> p2){
 MapUtils.verbosePrint(p0,p1,p2);
}
public static void debugPrint(java.io.PrintStream p0,java.lang.Object p1,java.util.Map<?, ?> p2){
 MapUtils.debugPrint(p0,p1,p2);
}
public static <K> void safeAddToMap(java.util.Map<? super K, java.lang.Object> p0,K p1,java.lang.Object p2) throws java.lang.NullPointerException{
 MapUtils.safeAddToMap(p0,p1,p2);
}
public static <E> boolean contains(java.util.Iterator<E> p0,java.lang.Object p1){
return IteratorUtils.contains(p0,p1);
}
public static <E> E find(java.util.Iterator<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return IteratorUtils.find(p0,p1);
}
public static <E> E forEachButLast(java.util.Iterator<E> p0,org.apache.commons.collections4.Closure<? super E> p1){
return IteratorUtils.forEachButLast(p0,p1);
}
public static <E> E min(E p0,E p1,java.util.Comparator<E> p2){
return ComparatorUtils.min(p0,p1,p2);
}
public static <E> E max(E p0,E p1,java.util.Comparator<E> p2){
return ComparatorUtils.max(p0,p1,p2);
}
public static <E> boolean contains(java.lang.Iterable<E> p0,java.lang.Object p1){
return IterableUtils.contains(p0,p1);
}
public static <E> E find(java.lang.Iterable<E> p0,org.apache.commons.collections4.Predicate<? super E> p1){
return IterableUtils.find(p0,p1);
}
public static <E> E forEachButLast(java.lang.Iterable<E> p0,org.apache.commons.collections4.Closure<? super E> p1){
return IterableUtils.forEachButLast(p0,p1);
}
public static int getLength(java.lang.Object p0){
return ArrayUtils.getLength(p0);
}
public static int indexOf(java.lang.Object[] p0,java.lang.Object p1){
return ArrayUtils.indexOf(p0,p1);
}
public static int indexOf(java.lang.Object[] p0,java.lang.Object p1,int p2){
return ArrayUtils.indexOf(p0,p1,p2);
}
public static boolean contains(java.lang.Object[] p0,java.lang.Object p1){
return ArrayUtils.contains(p0,p1);
}
public static int lastIndexOf(java.lang.Object[] p0,java.lang.Object p1,int p2){
return ArrayUtils.lastIndexOf(p0,p1,p2);
}
public static int lastIndexOf(java.lang.Object[] p0,java.lang.Object p1){
return ArrayUtils.lastIndexOf(p0,p1);
}
public static <T> T[] removeElement(T[] p0,java.lang.Object p1){
return ArrayUtils.removeElement(p0,p1);
}
public static boolean isSameType(java.lang.Object p0,java.lang.Object p1){
return ArrayUtils.isSameType(p0,p1);
}
public static boolean isEquals(java.lang.Object p0,java.lang.Object p1){
return ArrayUtils.isEquals(p0,p1);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4){
return CompareToBuilder.reflectionCompare(p0,p1,p2,p3,p4);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2){
return CompareToBuilder.reflectionCompare(p0,p1,p2);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.util.Collection<java.lang.String> p2){
return CompareToBuilder.reflectionCompare(p0,p1,p2);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.lang.String... p2){
return CompareToBuilder.reflectionCompare(p0,p1,p2);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1){
return CompareToBuilder.reflectionCompare(p0,p1);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.util.Collection<java.lang.String> p2){
return EqualsBuilder.reflectionEquals(p0,p1,p2);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class<?> p3,java.lang.String... p4){
return EqualsBuilder.reflectionEquals(p0,p1,p2,p3,p4);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.lang.String... p2){
return EqualsBuilder.reflectionEquals(p0,p1,p2);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2){
return EqualsBuilder.reflectionEquals(p0,p1,p2);
}
public static int reflectionHashCode(java.lang.Object p0,java.util.Collection<java.lang.String> p1){
return HashCodeBuilder.reflectionHashCode(p0,p1);
}
public static int reflectionHashCode(java.lang.Object p0,java.lang.String... p1){
return HashCodeBuilder.reflectionHashCode(p0,p1);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3);
}
public static int reflectionHashCode(java.lang.Object p0,boolean p1){
return HashCodeBuilder.reflectionHashCode(p0,p1);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2);
}
public static java.lang.String toStringExclude(java.lang.Object p0,java.util.Collection<java.lang.String> p1){
return ReflectionToStringBuilder.toStringExclude(p0,p1);
}
public static java.lang.String toStringExclude(java.lang.Object p0,java.lang.String... p1){
return ReflectionToStringBuilder.toStringExclude(p0,p1);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1){
return ToStringBuilder.reflectionToString(p0,p1);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang3.builder.ToStringStyle p1,boolean p2){
return ToStringBuilder.reflectionToString(p0,p1,p2);
}
public static java.lang.String reflectionToString(java.lang.Object p0){
return ToStringBuilder.reflectionToString(p0);
}
public static java.lang.String getSimpleName(java.lang.Object p0,java.lang.String p1){
return ClassUtils.getSimpleName(p0,p1);
}
public static java.lang.String getShortClassName(java.lang.Object p0,java.lang.String p1){
return ClassUtils.getShortClassName(p0,p1);
}
public static java.lang.String getPackageName(java.lang.Object p0,java.lang.String p1){
return ClassUtils.getPackageName(p0,p1);
}
public static java.lang.String getPackageCanonicalName(java.lang.Object p0,java.lang.String p1){
return ClassUtils.getPackageCanonicalName(p0,p1);
}
public static java.lang.String getShortCanonicalName(java.lang.Object p0,java.lang.String p1){
return ClassUtils.getShortCanonicalName(p0,p1);
}
public static <K,V> V putIfAbsent(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,V p2){
return ConcurrentUtils.putIfAbsent(p0,p1,p2);
}
public static <T> T initialize(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> p0) throws org.apache.commons.lang3.concurrent.ConcurrentException{
return ConcurrentUtils.initialize(p0);
}
public static <K,V> V createIfAbsent(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> p2) throws org.apache.commons.lang3.concurrent.ConcurrentException{
return ConcurrentUtils.createIfAbsent(p0,p1,p2);
}
public static <K,V> V createIfAbsentUnchecked(java.util.concurrent.ConcurrentMap<K, V> p0,K p1,org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> p2){
return ConcurrentUtils.createIfAbsentUnchecked(p0,p1,p2);
}
public static <T> T initializeUnchecked(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> p0){
return ConcurrentUtils.initializeUnchecked(p0);
}
public static <L> void addEventListener(java.lang.Object p0,java.lang.Class<L> p1,L p2){
 EventUtils.addEventListener(p0,p1,p2);
}
public static <L> void bindEventsToMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,java.lang.Class<L> p3,java.lang.String... p4){
 EventUtils.bindEventsToMethod(p0,p1,p2,p3,p4);
}
public static <T> T clone(T p0){
return ObjectUtils.clone(p0);
}
public static <T> T firstNonNull(T... p0){
return ObjectUtils.firstNonNull(p0);
}
public static <T> T mode(T... p0){
return ObjectUtils.mode(p0);
}
public static <T> T defaultIfNull(T p0,T p1){
return ObjectUtils.defaultIfNull(p0,p1);
}
public static void identityToString(java.lang.StringBuilder p0,java.lang.Object p1){
 ObjectUtils.identityToString(p0,p1);
}
public static java.lang.String identityToString(java.lang.Object p0){
return ObjectUtils.identityToString(p0);
}
public static void identityToString(java.lang.StringBuffer p0,java.lang.Object p1){
 ObjectUtils.identityToString(p0,p1);
}
public static void identityToString(org.apache.commons.lang3.text.StrBuilder p0,java.lang.Object p1){
 ObjectUtils.identityToString(p0,p1);
}
public static void identityToString(java.lang.Appendable p0,java.lang.Object p1) throws java.io.IOException{
 ObjectUtils.identityToString(p0,p1);
}
public static boolean notEqual(java.lang.Object p0,java.lang.Object p1){
return ObjectUtils.notEqual(p0,p1);
}
public static <T> T median(java.util.Comparator<T> p0,T... p1){
return ObjectUtils.median(p0,p1);
}
public static <T> T cloneIfPossible(T p0){
return ObjectUtils.cloneIfPossible(p0);
}
public static <T> T CONST(T p0){
return ObjectUtils.CONST(p0);
}
public static <T> T invokeConstructor(java.lang.Class<T> p0,java.lang.Object[] p1,java.lang.Class<?>[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeConstructor(p0,p1,p2);
}
public static <T> T invokeConstructor(java.lang.Class<T> p0,java.lang.Object... p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeConstructor(p0,p1);
}
public static <T> T invokeExactConstructor(java.lang.Class<T> p0,java.lang.Object[] p1,java.lang.Class<?>[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeExactConstructor(p0,p1,p2);
}
public static <T> T invokeExactConstructor(java.lang.Class<T> p0,java.lang.Object... p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeExactConstructor(p0,p1);
}
public static java.lang.Object readStaticField(java.lang.Class<?> p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1);
}
public static java.lang.Object readStaticField(java.lang.reflect.Field p0) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0);
}
public static java.lang.Object readStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1,p2);
}
public static java.lang.Object readStaticField(java.lang.reflect.Field p0,boolean p1) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1);
}
public static java.lang.Object readField(java.lang.reflect.Field p0,java.lang.Object p1) throws java.lang.IllegalAccessException{
return FieldUtils.readField(p0,p1);
}
public static java.lang.Object readField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readField(p0,p1,p2);
}
public static java.lang.Object readField(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readField(p0,p1);
}
public static java.lang.Object readField(java.lang.Object p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readField(p0,p1,p2);
}
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2);
}
public static void writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2);
}
public static void writeField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2,p3);
}
public static void writeField(java.lang.reflect.Field p0,java.lang.Object p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeField(p0,p1,p2,p3);
}
public static void writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2,p3);
}
public static void writeStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1,boolean p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.reflect.Field p0,java.lang.Object p1) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1);
}
public static java.lang.Object readDeclaredField(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredField(p0,p1);
}
public static java.lang.Object readDeclaredField(java.lang.Object p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredField(p0,p1,p2);
}
public static java.lang.Object readDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredStaticField(p0,p1);
}
public static java.lang.Object readDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredStaticField(p0,p1,p2);
}
public static void writeDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2,p3);
}
public static void writeDeclaredStaticField(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2);
}
public static void writeDeclaredField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredField(p0,p1,p2);
}
public static void writeDeclaredField(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredField(p0,p1,p2,p3);
}
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1,p2);
}
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object... p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class<?>[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2,p3);
}
public static boolean isInstance(java.lang.Object p0,java.lang.reflect.Type p1){
return TypeUtils.isInstance(p0,p1);
}
public static <T> T deserialize(java.io.InputStream p0){
return SerializationUtils.deserialize(p0);
}
public static <T> T deserialize(byte[] p0){
return SerializationUtils.deserialize(p0);
}
public static <V> java.lang.String replace(java.lang.Object p0,java.util.Map<java.lang.String, V> p1){
return StrSubstitutor.replace(p0,p1);
}
public static <V> java.lang.String replace(java.lang.Object p0,java.util.Map<java.lang.String, V> p1,java.lang.String p2,java.lang.String p3){
return StrSubstitutor.replace(p0,p1,p2,p3);
}
public static java.lang.String replace(java.lang.Object p0,java.util.Properties p1){
return StrSubstitutor.replace(p0,p1);
}
public static java.lang.String replaceSystemProperties(java.lang.Object p0){
return StrSubstitutor.replaceSystemProperties(p0);
}
public static java.util.Iterator<?> iterator(java.lang.Object p0,int p1){
return DateUtils.iterator(p0,p1);
}
public static java.util.Date truncate(java.lang.Object p0,int p1){
return DateUtils.truncate(p0,p1);
}
public static java.util.Date round(java.lang.Object p0,int p1){
return DateUtils.round(p0,p1);
}
public static java.util.Date ceiling(java.lang.Object p0,int p1){
return DateUtils.ceiling(p0,p1);
}
public static <T> T notNull(T p0){
return Validate.notNull(p0);
}
public static <T> T notNull(T p0,java.lang.String p1,java.lang.Object... p2){
return Validate.notNull(p0,p1,p2);
}
public static void isInstanceOf(java.lang.Class<?> p0,java.lang.Object p1,java.lang.String p2,java.lang.Object... p3){
 Validate.isInstanceOf(p0,p1,p2,p3);
}
public static void isInstanceOf(java.lang.Class<?> p0,java.lang.Object p1){
 Validate.isInstanceOf(p0,p1);
}
public static void deserializeRealVector(java.lang.Object p0,java.lang.String p1,java.io.ObjectInputStream p2) throws java.lang.ClassNotFoundException,java.io.IOException{
 MatrixUtils.deserializeRealVector(p0,p1,p2);
}
public static void deserializeRealMatrix(java.lang.Object p0,java.lang.String p1,java.io.ObjectInputStream p2) throws java.lang.ClassNotFoundException,java.io.IOException{
 MatrixUtils.deserializeRealMatrix(p0,p1,p2);
}
public static void checkNotNull(java.lang.Object p0) throws org.apache.commons.math3.exception.NullArgumentException{
 MathUtils.checkNotNull(p0);
}
public static void checkNotNull(java.lang.Object p0,org.apache.commons.math3.exception.util.Localizable p1,java.lang.Object... p2) throws org.apache.commons.math3.exception.NullArgumentException{
 MathUtils.checkNotNull(p0,p1,p2);
}
public static void setProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2,java.lang.String p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 LocaleBeanUtils.setProperty(p0,p1,p2,p3);
}
public static void setProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 LocaleBeanUtils.setProperty(p0,p1,p2);
}
public static java.lang.String getProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getProperty(p0,p1);
}
public static java.lang.String getProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getProperty(p0,p1,p2);
}
public static java.lang.String getNestedProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getNestedProperty(p0,p1);
}
public static java.lang.String getNestedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getNestedProperty(p0,p1,p2);
}
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2,java.lang.String p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getIndexedProperty(p0,p1,p2,p3);
}
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getIndexedProperty(p0,p1,p2);
}
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getIndexedProperty(p0,p1,p2);
}
public static java.lang.String getIndexedProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getIndexedProperty(p0,p1);
}
public static java.lang.String getMappedPropertyLocale(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getMappedPropertyLocale(p0,p1,p2);
}
public static java.lang.String getSimpleProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getSimpleProperty(p0,p1);
}
public static java.lang.String getSimpleProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getSimpleProperty(p0,p1,p2);
}
public static java.lang.String getMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2,java.lang.String p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getMappedProperty(p0,p1,p2,p3);
}
public static java.lang.String getMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getMappedProperty(p0,p1,p2);
}
public static java.lang.String getMappedProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return LocaleBeanUtils.getMappedProperty(p0,p1);
}
public static java.lang.String[] getArrayProperty(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return BeanUtils.getArrayProperty(p0,p1);
}
public static java.lang.Object cloneBean(java.lang.Object p0) throws java.lang.IllegalAccessException,java.lang.InstantiationException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return BeanUtils.cloneBean(p0);
}
public static java.util.Map<java.lang.String, java.lang.String> describe(java.lang.Object p0) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return BeanUtils.describe(p0);
}
public static void populate(java.lang.Object p0,java.util.Map<java.lang.String, ?> p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 BeanUtils.populate(p0,p1);
}
public static void copyProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 BeanUtils.copyProperty(p0,p1,p2);
}
public static void copyProperties(java.lang.Object p0,java.lang.Object p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
 BeanUtils.copyProperties(p0,p1);
}
public static <T> T invokeConstructor(java.lang.Class<T> p0,java.lang.Object[] p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeConstructor(p0,p1);
}
public static <T> T invokeConstructor(java.lang.Class<T> p0,java.lang.Object p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeConstructor(p0,p1);
}
public static <T> T invokeExactConstructor(java.lang.Class<T> p0,java.lang.Object[] p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeExactConstructor(p0,p1);
}
public static <T> T invokeExactConstructor(java.lang.Class<T> p0,java.lang.Object p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeExactConstructor(p0,p1);
}
public static java.lang.Class<?> getPropertyType(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return PropertyUtils.getPropertyType(p0,p1);
}
public static java.beans.PropertyDescriptor[] getPropertyDescriptors(java.lang.Object p0){
return PropertyUtils.getPropertyDescriptors(p0);
}
public static boolean isReadable(java.lang.Object p0,java.lang.String p1){
return PropertyUtils.isReadable(p0,p1);
}
public static boolean isWriteable(java.lang.Object p0,java.lang.String p1){
return PropertyUtils.isWriteable(p0,p1);
}
public static void setSimpleProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setSimpleProperty(p0,p1,p2);
}
public static java.beans.PropertyDescriptor getPropertyDescriptor(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return PropertyUtils.getPropertyDescriptor(p0,p1);
}
public static org.apache.commons.collections.FastHashMap getMappedPropertyDescriptors(java.lang.Object p0){
return PropertyUtils.getMappedPropertyDescriptors(p0);
}
public static void setNestedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setNestedProperty(p0,p1,p2);
}
public static void setIndexedProperty(java.lang.Object p0,java.lang.String p1,int p2,java.lang.Object p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setIndexedProperty(p0,p1,p2,p3);
}
public static void setIndexedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setIndexedProperty(p0,p1,p2);
}
public static void setMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.String p2,java.lang.Object p3) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setMappedProperty(p0,p1,p2,p3);
}
public static void setMappedProperty(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
 PropertyUtils.setMappedProperty(p0,p1,p2);
}
public static java.lang.Class<?> getPropertyEditorClass(java.lang.Object p0,java.lang.String p1) throws java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.NoSuchMethodException{
return PropertyUtils.getPropertyEditorClass(p0,p1);
}
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1,p2);
}
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1,p2);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
public static java.lang.Object convert(java.lang.String[] p0,java.lang.Class<?> p1,java.lang.String p2){
return LocaleConvertUtils.convert(p0,p1,p2);
}
public static java.lang.Object convert(java.lang.String p0,java.lang.Class<?> p1,java.lang.String p2){
return LocaleConvertUtils.convert(p0,p1,p2);
}
public static java.lang.Object convert(java.lang.String p0,java.lang.Class<?> p1,java.util.Locale p2,java.lang.String p3){
return LocaleConvertUtils.convert(p0,p1,p2,p3);
}
public static java.lang.Object convert(java.lang.String[] p0,java.lang.Class<?> p1,java.util.Locale p2,java.lang.String p3){
return LocaleConvertUtils.convert(p0,p1,p2,p3);
}
public static java.lang.Object convert(java.lang.String[] p0,java.lang.Class<?> p1){
return LocaleConvertUtils.convert(p0,p1);
}
public static java.lang.String convert(java.lang.Object p0){
return LocaleConvertUtils.convert(p0);
}
public static java.lang.String convert(java.lang.Object p0,java.lang.String p1){
return LocaleConvertUtils.convert(p0,p1);
}
public static java.lang.String convert(java.lang.Object p0,java.util.Locale p1,java.lang.String p2){
return LocaleConvertUtils.convert(p0,p1,p2);
}
public static java.lang.Object convert(java.lang.String p0,java.lang.Class<?> p1){
return LocaleConvertUtils.convert(p0,p1);
}
public static java.lang.Object convert(java.lang.Object p0,java.lang.Class<?> p1){
return ConvertUtils.convert(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.IndirectPriorityQueue<K> synchronize(it.unimi.dsi.fastutil.IndirectPriorityQueue<K> p0,java.lang.Object p1){
return IndirectPriorityQueues.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.PriorityQueue<K> synchronize(it.unimi.dsi.fastutil.PriorityQueue<K> p0,java.lang.Object p1){
return PriorityQueues.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigList singleton(java.lang.Object p0){
return BooleanBigLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanBigList synchronize(it.unimi.dsi.fastutil.booleans.BooleanBigList p0,java.lang.Object p1){
return BooleanBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanCollection synchronize(it.unimi.dsi.fastutil.booleans.BooleanCollection p0,java.lang.Object p1){
return BooleanCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList synchronize(it.unimi.dsi.fastutil.booleans.BooleanList p0,java.lang.Object p1){
return BooleanLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanSet synchronize(it.unimi.dsi.fastutil.booleans.BooleanSet p0,java.lang.Object p1){
return BooleanSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanFunction p0,java.lang.Object p1){
return Byte2BooleanFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanMap p0,java.lang.Object p1){
return Byte2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2BooleanSortedMap p0,java.lang.Object p1){
return Byte2BooleanSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteFunction p0,java.lang.Object p1){
return Byte2ByteFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteMap p0,java.lang.Object p1){
return Byte2ByteMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2ByteSortedMap p0,java.lang.Object p1){
return Byte2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharFunction p0,java.lang.Object p1){
return Byte2CharFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharMap p0,java.lang.Object p1){
return Byte2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharSortedMap p0,java.lang.Object p1){
return Byte2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleFunction p0,java.lang.Object p1){
return Byte2DoubleFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleMap p0,java.lang.Object p1){
return Byte2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2DoubleSortedMap p0,java.lang.Object p1){
return Byte2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatFunction p0,java.lang.Object p1){
return Byte2FloatFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatMap p0,java.lang.Object p1){
return Byte2FloatMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2FloatSortedMap p0,java.lang.Object p1){
return Byte2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntFunction p0,java.lang.Object p1){
return Byte2IntFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntMap p0,java.lang.Object p1){
return Byte2IntMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2IntSortedMap p0,java.lang.Object p1){
return Byte2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongFunction p0,java.lang.Object p1){
return Byte2LongFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongMap p0,java.lang.Object p1){
return Byte2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2LongSortedMap p0,java.lang.Object p1){
return Byte2LongSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectFunction<V> p0,java.lang.Object p1){
return Byte2ObjectFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectMap<V> p0,java.lang.Object p1){
return Byte2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ObjectSortedMap<V> p0,java.lang.Object p1){
return Byte2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceFunction<V> p0,java.lang.Object p1){
return Byte2ReferenceFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceMap<V> p0,java.lang.Object p1){
return Byte2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.bytes.Byte2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Byte2ReferenceSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortFunction p0,java.lang.Object p1){
return Byte2ShortFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortMap p0,java.lang.Object p1){
return Byte2ShortMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap synchronize(it.unimi.dsi.fastutil.bytes.Byte2ShortSortedMap p0,java.lang.Object p1){
return Byte2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigList synchronize(it.unimi.dsi.fastutil.bytes.ByteBigList p0,java.lang.Object p1){
return ByteBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteCollection synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection p0,java.lang.Object p1){
return ByteCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteList synchronize(it.unimi.dsi.fastutil.bytes.ByteList p0,java.lang.Object p1){
return ByteLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.BytePriorityQueue synchronize(it.unimi.dsi.fastutil.bytes.BytePriorityQueue p0,java.lang.Object p1){
return BytePriorityQueues.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteSet synchronize(it.unimi.dsi.fastutil.bytes.ByteSet p0,java.lang.Object p1){
return ByteSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.bytes.ByteComparator p1){
return ByteSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteSortedSet synchronize(it.unimi.dsi.fastutil.bytes.ByteSortedSet p0,java.lang.Object p1){
return ByteSortedSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanFunction synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanFunction p0,java.lang.Object p1){
return Char2BooleanFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanMap synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanMap p0,java.lang.Object p1){
return Char2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2BooleanSortedMap p0,java.lang.Object p1){
return Char2BooleanSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction synchronize(it.unimi.dsi.fastutil.chars.Char2ByteFunction p0,java.lang.Object p1){
return Char2ByteFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteMap synchronize(it.unimi.dsi.fastutil.chars.Char2ByteMap p0,java.lang.Object p1){
return Char2ByteMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2ByteSortedMap p0,java.lang.Object p1){
return Char2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2CharFunction synchronize(it.unimi.dsi.fastutil.chars.Char2CharFunction p0,java.lang.Object p1){
return Char2CharFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2CharMap synchronize(it.unimi.dsi.fastutil.chars.Char2CharMap p0,java.lang.Object p1){
return Char2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2CharSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2CharSortedMap p0,java.lang.Object p1){
return Char2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleFunction synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleFunction p0,java.lang.Object p1){
return Char2DoubleFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleMap synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleMap p0,java.lang.Object p1){
return Char2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2DoubleSortedMap p0,java.lang.Object p1){
return Char2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatFunction synchronize(it.unimi.dsi.fastutil.chars.Char2FloatFunction p0,java.lang.Object p1){
return Char2FloatFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatMap synchronize(it.unimi.dsi.fastutil.chars.Char2FloatMap p0,java.lang.Object p1){
return Char2FloatMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2FloatSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2FloatSortedMap p0,java.lang.Object p1){
return Char2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntFunction synchronize(it.unimi.dsi.fastutil.chars.Char2IntFunction p0,java.lang.Object p1){
return Char2IntFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntMap synchronize(it.unimi.dsi.fastutil.chars.Char2IntMap p0,java.lang.Object p1){
return Char2IntMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2IntSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2IntSortedMap p0,java.lang.Object p1){
return Char2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongFunction synchronize(it.unimi.dsi.fastutil.chars.Char2LongFunction p0,java.lang.Object p1){
return Char2LongFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongMap synchronize(it.unimi.dsi.fastutil.chars.Char2LongMap p0,java.lang.Object p1){
return Char2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2LongSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2LongSortedMap p0,java.lang.Object p1){
return Char2LongSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectFunction<V> p0,java.lang.Object p1){
return Char2ObjectFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectMap<V> p0,java.lang.Object p1){
return Char2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ObjectSortedMap<V> p0,java.lang.Object p1){
return Char2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceFunction<V> p0,java.lang.Object p1){
return Char2ReferenceFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceMap<V> p0,java.lang.Object p1){
return Char2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.chars.Char2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Char2ReferenceSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortFunction synchronize(it.unimi.dsi.fastutil.chars.Char2ShortFunction p0,java.lang.Object p1){
return Char2ShortFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortMap synchronize(it.unimi.dsi.fastutil.chars.Char2ShortMap p0,java.lang.Object p1){
return Char2ShortMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ShortSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2ShortSortedMap p0,java.lang.Object p1){
return Char2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharBigList synchronize(it.unimi.dsi.fastutil.chars.CharBigList p0,java.lang.Object p1){
return CharBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharCollection synchronize(it.unimi.dsi.fastutil.chars.CharCollection p0,java.lang.Object p1){
return CharCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharList synchronize(it.unimi.dsi.fastutil.chars.CharList p0,java.lang.Object p1){
return CharLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharPriorityQueue synchronize(it.unimi.dsi.fastutil.chars.CharPriorityQueue p0,java.lang.Object p1){
return CharPriorityQueues.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharSet synchronize(it.unimi.dsi.fastutil.chars.CharSet p0,java.lang.Object p1){
return CharSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.chars.CharComparator p1){
return CharSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharSortedSet synchronize(it.unimi.dsi.fastutil.chars.CharSortedSet p0,java.lang.Object p1){
return CharSortedSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanFunction p0,java.lang.Object p1){
return Double2BooleanFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanMap synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanMap p0,java.lang.Object p1){
return Double2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2BooleanSortedMap p0,java.lang.Object p1){
return Double2BooleanSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteFunction p0,java.lang.Object p1){
return Double2ByteFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteMap synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteMap p0,java.lang.Object p1){
return Double2ByteMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2ByteSortedMap p0,java.lang.Object p1){
return Double2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2CharFunction p0,java.lang.Object p1){
return Double2CharFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharMap synchronize(it.unimi.dsi.fastutil.doubles.Double2CharMap p0,java.lang.Object p1){
return Double2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2CharSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2CharSortedMap p0,java.lang.Object p1){
return Double2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleFunction p0,java.lang.Object p1){
return Double2DoubleFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleMap synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleMap p0,java.lang.Object p1){
return Double2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2DoubleSortedMap p0,java.lang.Object p1){
return Double2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatFunction p0,java.lang.Object p1){
return Double2FloatFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatMap synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatMap p0,java.lang.Object p1){
return Double2FloatMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2FloatSortedMap p0,java.lang.Object p1){
return Double2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2IntFunction p0,java.lang.Object p1){
return Double2IntFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntMap synchronize(it.unimi.dsi.fastutil.doubles.Double2IntMap p0,java.lang.Object p1){
return Double2IntMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2IntSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2IntSortedMap p0,java.lang.Object p1){
return Double2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2LongFunction p0,java.lang.Object p1){
return Double2LongFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongMap synchronize(it.unimi.dsi.fastutil.doubles.Double2LongMap p0,java.lang.Object p1){
return Double2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2LongSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2LongSortedMap p0,java.lang.Object p1){
return Double2LongSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectFunction<V> p0,java.lang.Object p1){
return Double2ObjectFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectMap<V> p0,java.lang.Object p1){
return Double2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ObjectSortedMap<V> p0,java.lang.Object p1){
return Double2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceFunction<V> p0,java.lang.Object p1){
return Double2ReferenceFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceMap<V> p0,java.lang.Object p1){
return Double2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.doubles.Double2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Double2ReferenceSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortFunction synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortFunction p0,java.lang.Object p1){
return Double2ShortFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortMap synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortMap p0,java.lang.Object p1){
return Double2ShortMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap synchronize(it.unimi.dsi.fastutil.doubles.Double2ShortSortedMap p0,java.lang.Object p1){
return Double2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigList synchronize(it.unimi.dsi.fastutil.doubles.DoubleBigList p0,java.lang.Object p1){
return DoubleBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleCollection synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection p0,java.lang.Object p1){
return DoubleCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList synchronize(it.unimi.dsi.fastutil.doubles.DoubleList p0,java.lang.Object p1){
return DoubleLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoublePriorityQueue synchronize(it.unimi.dsi.fastutil.doubles.DoublePriorityQueue p0,java.lang.Object p1){
return DoublePriorityQueues.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSet synchronize(it.unimi.dsi.fastutil.doubles.DoubleSet p0,java.lang.Object p1){
return DoubleSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.doubles.DoubleComparator p1){
return DoubleSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleSortedSet synchronize(it.unimi.dsi.fastutil.doubles.DoubleSortedSet p0,java.lang.Object p1){
return DoubleSortedSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanFunction synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanFunction p0,java.lang.Object p1){
return Float2BooleanFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanMap synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanMap p0,java.lang.Object p1){
return Float2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2BooleanSortedMap p0,java.lang.Object p1){
return Float2BooleanSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteFunction synchronize(it.unimi.dsi.fastutil.floats.Float2ByteFunction p0,java.lang.Object p1){
return Float2ByteFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteMap synchronize(it.unimi.dsi.fastutil.floats.Float2ByteMap p0,java.lang.Object p1){
return Float2ByteMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ByteSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2ByteSortedMap p0,java.lang.Object p1){
return Float2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharFunction synchronize(it.unimi.dsi.fastutil.floats.Float2CharFunction p0,java.lang.Object p1){
return Float2CharFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharMap synchronize(it.unimi.dsi.fastutil.floats.Float2CharMap p0,java.lang.Object p1){
return Float2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2CharSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2CharSortedMap p0,java.lang.Object p1){
return Float2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleFunction synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleFunction p0,java.lang.Object p1){
return Float2DoubleFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleMap synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleMap p0,java.lang.Object p1){
return Float2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2DoubleSortedMap p0,java.lang.Object p1){
return Float2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatFunction synchronize(it.unimi.dsi.fastutil.floats.Float2FloatFunction p0,java.lang.Object p1){
return Float2FloatFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatMap synchronize(it.unimi.dsi.fastutil.floats.Float2FloatMap p0,java.lang.Object p1){
return Float2FloatMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2FloatSortedMap p0,java.lang.Object p1){
return Float2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2IntFunction synchronize(it.unimi.dsi.fastutil.floats.Float2IntFunction p0,java.lang.Object p1){
return Float2IntFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2IntMap synchronize(it.unimi.dsi.fastutil.floats.Float2IntMap p0,java.lang.Object p1){
return Float2IntMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2IntSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2IntSortedMap p0,java.lang.Object p1){
return Float2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongFunction synchronize(it.unimi.dsi.fastutil.floats.Float2LongFunction p0,java.lang.Object p1){
return Float2LongFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongMap synchronize(it.unimi.dsi.fastutil.floats.Float2LongMap p0,java.lang.Object p1){
return Float2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2LongSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2LongSortedMap p0,java.lang.Object p1){
return Float2LongSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectFunction<V> p0,java.lang.Object p1){
return Float2ObjectFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectMap<V> p0,java.lang.Object p1){
return Float2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ObjectSortedMap<V> p0,java.lang.Object p1){
return Float2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceFunction<V> p0,java.lang.Object p1){
return Float2ReferenceFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceMap<V> p0,java.lang.Object p1){
return Float2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.floats.Float2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Float2ReferenceSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortFunction synchronize(it.unimi.dsi.fastutil.floats.Float2ShortFunction p0,java.lang.Object p1){
return Float2ShortFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortMap synchronize(it.unimi.dsi.fastutil.floats.Float2ShortMap p0,java.lang.Object p1){
return Float2ShortMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2ShortSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2ShortSortedMap p0,java.lang.Object p1){
return Float2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatBigList synchronize(it.unimi.dsi.fastutil.floats.FloatBigList p0,java.lang.Object p1){
return FloatBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatCollection synchronize(it.unimi.dsi.fastutil.floats.FloatCollection p0,java.lang.Object p1){
return FloatCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatList synchronize(it.unimi.dsi.fastutil.floats.FloatList p0,java.lang.Object p1){
return FloatLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatPriorityQueue synchronize(it.unimi.dsi.fastutil.floats.FloatPriorityQueue p0,java.lang.Object p1){
return FloatPriorityQueues.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatSet synchronize(it.unimi.dsi.fastutil.floats.FloatSet p0,java.lang.Object p1){
return FloatSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.floats.FloatComparator p1){
return FloatSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatSortedSet synchronize(it.unimi.dsi.fastutil.floats.FloatSortedSet p0,java.lang.Object p1){
return FloatSortedSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanFunction synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanFunction p0,java.lang.Object p1){
return Int2BooleanFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanMap synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanMap p0,java.lang.Object p1){
return Int2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2BooleanSortedMap p0,java.lang.Object p1){
return Int2BooleanSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteFunction synchronize(it.unimi.dsi.fastutil.ints.Int2ByteFunction p0,java.lang.Object p1){
return Int2ByteFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteMap synchronize(it.unimi.dsi.fastutil.ints.Int2ByteMap p0,java.lang.Object p1){
return Int2ByteMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ByteSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2ByteSortedMap p0,java.lang.Object p1){
return Int2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharFunction synchronize(it.unimi.dsi.fastutil.ints.Int2CharFunction p0,java.lang.Object p1){
return Int2CharFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharMap synchronize(it.unimi.dsi.fastutil.ints.Int2CharMap p0,java.lang.Object p1){
return Int2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2CharSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2CharSortedMap p0,java.lang.Object p1){
return Int2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleFunction synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleFunction p0,java.lang.Object p1){
return Int2DoubleFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleMap synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleMap p0,java.lang.Object p1){
return Int2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap p0,java.lang.Object p1){
return Int2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatFunction synchronize(it.unimi.dsi.fastutil.ints.Int2FloatFunction p0,java.lang.Object p1){
return Int2FloatFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatMap synchronize(it.unimi.dsi.fastutil.ints.Int2FloatMap p0,java.lang.Object p1){
return Int2FloatMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2FloatSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2FloatSortedMap p0,java.lang.Object p1){
return Int2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2IntFunction synchronize(it.unimi.dsi.fastutil.ints.Int2IntFunction p0,java.lang.Object p1){
return Int2IntFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2IntMap synchronize(it.unimi.dsi.fastutil.ints.Int2IntMap p0,java.lang.Object p1){
return Int2IntMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2IntSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2IntSortedMap p0,java.lang.Object p1){
return Int2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongFunction synchronize(it.unimi.dsi.fastutil.ints.Int2LongFunction p0,java.lang.Object p1){
return Int2LongFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongMap synchronize(it.unimi.dsi.fastutil.ints.Int2LongMap p0,java.lang.Object p1){
return Int2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2LongSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2LongSortedMap p0,java.lang.Object p1){
return Int2LongSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectFunction<V> p0,java.lang.Object p1){
return Int2ObjectFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectMap<V> p0,java.lang.Object p1){
return Int2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap<V> p0,java.lang.Object p1){
return Int2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceFunction<V> p0,java.lang.Object p1){
return Int2ReferenceFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceMap<V> p0,java.lang.Object p1){
return Int2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.ints.Int2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Int2ReferenceSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortFunction synchronize(it.unimi.dsi.fastutil.ints.Int2ShortFunction p0,java.lang.Object p1){
return Int2ShortFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortMap synchronize(it.unimi.dsi.fastutil.ints.Int2ShortMap p0,java.lang.Object p1){
return Int2ShortMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.Int2ShortSortedMap synchronize(it.unimi.dsi.fastutil.ints.Int2ShortSortedMap p0,java.lang.Object p1){
return Int2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntBigList synchronize(it.unimi.dsi.fastutil.ints.IntBigList p0,java.lang.Object p1){
return IntBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntCollection synchronize(it.unimi.dsi.fastutil.ints.IntCollection p0,java.lang.Object p1){
return IntCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntList synchronize(it.unimi.dsi.fastutil.ints.IntList p0,java.lang.Object p1){
return IntLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntPriorityQueue synchronize(it.unimi.dsi.fastutil.ints.IntPriorityQueue p0,java.lang.Object p1){
return IntPriorityQueues.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntSet synchronize(it.unimi.dsi.fastutil.ints.IntSet p0,java.lang.Object p1){
return IntSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.ints.IntComparator p1){
return IntSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntSortedSet synchronize(it.unimi.dsi.fastutil.ints.IntSortedSet p0,java.lang.Object p1){
return IntSortedSets.synchronize(p0,p1);
}
public static java.lang.Object loadObject(java.lang.CharSequence p0) throws java.io.IOException,java.lang.ClassNotFoundException{
return BinIO.loadObject(p0);
}
public static java.lang.Object loadObject(java.io.File p0) throws java.io.IOException,java.lang.ClassNotFoundException{
return BinIO.loadObject(p0);
}
public static java.lang.Object loadObject(java.io.InputStream p0) throws java.io.IOException,java.lang.ClassNotFoundException{
return BinIO.loadObject(p0);
}
public static void storeObject(java.lang.Object p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeObject(p0,p1);
}
public static void storeObject(java.lang.Object p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeObject(p0,p1);
}
public static void storeObject(java.lang.Object p0,java.io.OutputStream p1) throws java.io.IOException{
 BinIO.storeObject(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanFunction synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanFunction p0,java.lang.Object p1){
return Long2BooleanFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanMap synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanMap p0,java.lang.Object p1){
return Long2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2BooleanSortedMap p0,java.lang.Object p1){
return Long2BooleanSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteFunction synchronize(it.unimi.dsi.fastutil.longs.Long2ByteFunction p0,java.lang.Object p1){
return Long2ByteFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteMap synchronize(it.unimi.dsi.fastutil.longs.Long2ByteMap p0,java.lang.Object p1){
return Long2ByteMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ByteSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2ByteSortedMap p0,java.lang.Object p1){
return Long2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharFunction synchronize(it.unimi.dsi.fastutil.longs.Long2CharFunction p0,java.lang.Object p1){
return Long2CharFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharMap synchronize(it.unimi.dsi.fastutil.longs.Long2CharMap p0,java.lang.Object p1){
return Long2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2CharSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2CharSortedMap p0,java.lang.Object p1){
return Long2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleFunction synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleFunction p0,java.lang.Object p1){
return Long2DoubleFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleMap synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleMap p0,java.lang.Object p1){
return Long2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2DoubleSortedMap p0,java.lang.Object p1){
return Long2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatFunction synchronize(it.unimi.dsi.fastutil.longs.Long2FloatFunction p0,java.lang.Object p1){
return Long2FloatFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatMap synchronize(it.unimi.dsi.fastutil.longs.Long2FloatMap p0,java.lang.Object p1){
return Long2FloatMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2FloatSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2FloatSortedMap p0,java.lang.Object p1){
return Long2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntFunction synchronize(it.unimi.dsi.fastutil.longs.Long2IntFunction p0,java.lang.Object p1){
return Long2IntFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntMap synchronize(it.unimi.dsi.fastutil.longs.Long2IntMap p0,java.lang.Object p1){
return Long2IntMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2IntSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2IntSortedMap p0,java.lang.Object p1){
return Long2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2LongFunction synchronize(it.unimi.dsi.fastutil.longs.Long2LongFunction p0,java.lang.Object p1){
return Long2LongFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2LongMap synchronize(it.unimi.dsi.fastutil.longs.Long2LongMap p0,java.lang.Object p1){
return Long2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2LongSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2LongSortedMap p0,java.lang.Object p1){
return Long2LongSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectFunction<V> p0,java.lang.Object p1){
return Long2ObjectFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectMap<V> p0,java.lang.Object p1){
return Long2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ObjectSortedMap<V> p0,java.lang.Object p1){
return Long2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceFunction<V> p0,java.lang.Object p1){
return Long2ReferenceFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceMap<V> p0,java.lang.Object p1){
return Long2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.longs.Long2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Long2ReferenceSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortFunction synchronize(it.unimi.dsi.fastutil.longs.Long2ShortFunction p0,java.lang.Object p1){
return Long2ShortFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortMap synchronize(it.unimi.dsi.fastutil.longs.Long2ShortMap p0,java.lang.Object p1){
return Long2ShortMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.Long2ShortSortedMap synchronize(it.unimi.dsi.fastutil.longs.Long2ShortSortedMap p0,java.lang.Object p1){
return Long2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongBigList synchronize(it.unimi.dsi.fastutil.longs.LongBigList p0,java.lang.Object p1){
return LongBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongCollection synchronize(it.unimi.dsi.fastutil.longs.LongCollection p0,java.lang.Object p1){
return LongCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongList synchronize(it.unimi.dsi.fastutil.longs.LongList p0,java.lang.Object p1){
return LongLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongPriorityQueue synchronize(it.unimi.dsi.fastutil.longs.LongPriorityQueue p0,java.lang.Object p1){
return LongPriorityQueues.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongSet synchronize(it.unimi.dsi.fastutil.longs.LongSet p0,java.lang.Object p1){
return LongSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.longs.LongComparator p1){
return LongSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongSortedSet synchronize(it.unimi.dsi.fastutil.longs.LongSortedSet p0,java.lang.Object p1){
return LongSortedSets.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanFunction<K> p0,java.lang.Object p1){
return Object2BooleanFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanMap<K> p0,java.lang.Object p1){
return Object2BooleanMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2BooleanSortedMap<K> p0,java.lang.Object p1){
return Object2BooleanSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ByteFunction<K> p0,java.lang.Object p1){
return Object2ByteFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ByteMap<K> p0,java.lang.Object p1){
return Object2ByteMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ByteSortedMap<K> p0,java.lang.Object p1){
return Object2ByteSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2CharFunction<K> p0,java.lang.Object p1){
return Object2CharFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2CharMap<K> p0,java.lang.Object p1){
return Object2CharMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2CharSortedMap<K> p0,java.lang.Object p1){
return Object2CharSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleFunction<K> p0,java.lang.Object p1){
return Object2DoubleFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleMap<K> p0,java.lang.Object p1){
return Object2DoubleMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2DoubleSortedMap<K> p0,java.lang.Object p1){
return Object2DoubleSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2FloatFunction<K> p0,java.lang.Object p1){
return Object2FloatFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2FloatMap<K> p0,java.lang.Object p1){
return Object2FloatMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2FloatSortedMap<K> p0,java.lang.Object p1){
return Object2FloatSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntFunction<K> p0,java.lang.Object p1){
return Object2IntFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntMap<K> p0,java.lang.Object p1){
return Object2IntMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2IntSortedMap<K> p0,java.lang.Object p1){
return Object2IntSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2LongFunction<K> p0,java.lang.Object p1){
return Object2LongFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2LongMap<K> p0,java.lang.Object p1){
return Object2LongMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2LongSortedMap<K> p0,java.lang.Object p1){
return Object2LongSortedMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectFunction<K, V> p0,java.lang.Object p1){
return Object2ObjectFunctions.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V> p0,java.lang.Object p1){
return Object2ObjectMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ObjectSortedMap<K, V> p0,java.lang.Object p1){
return Object2ObjectSortedMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceFunction<K, V> p0,java.lang.Object p1){
return Object2ReferenceFunctions.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceMap<K, V> p0,java.lang.Object p1){
return Object2ReferenceMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Object2ReferenceSortedMap<K, V> p0,java.lang.Object p1){
return Object2ReferenceSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ShortFunction<K> p0,java.lang.Object p1){
return Object2ShortFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ShortMap<K> p0,java.lang.Object p1){
return Object2ShortMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Object2ShortSortedMap<K> p0,java.lang.Object p1){
return Object2ShortSortedMaps.synchronize(p0,p1);
}
public static <K> long binarySearch(K[][] p0,java.lang.Object p1){
return ObjectBigArrays.binarySearch(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectBigList<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectBigList<K> p0,java.lang.Object p1){
return ObjectBigLists.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectCollection<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectCollection<K> p0,java.lang.Object p1){
return ObjectCollections.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectList<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectList<K> p0,java.lang.Object p1){
return ObjectLists.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectSet<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectSet<K> p0,java.lang.Object p1){
return ObjectSets.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> synchronize(it.unimi.dsi.fastutil.objects.ObjectSortedSet<K> p0,java.lang.Object p1){
return ObjectSortedSets.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanFunction<K> p0,java.lang.Object p1){
return Reference2BooleanFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanMap<K> p0,java.lang.Object p1){
return Reference2BooleanMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2BooleanSortedMap<K> p0,java.lang.Object p1){
return Reference2BooleanSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteFunction<K> p0,java.lang.Object p1){
return Reference2ByteFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteMap<K> p0,java.lang.Object p1){
return Reference2ByteMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ByteSortedMap<K> p0,java.lang.Object p1){
return Reference2ByteSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2CharFunction<K> p0,java.lang.Object p1){
return Reference2CharFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2CharMap<K> p0,java.lang.Object p1){
return Reference2CharMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2CharSortedMap<K> p0,java.lang.Object p1){
return Reference2CharSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleFunction<K> p0,java.lang.Object p1){
return Reference2DoubleFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleMap<K> p0,java.lang.Object p1){
return Reference2DoubleMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2DoubleSortedMap<K> p0,java.lang.Object p1){
return Reference2DoubleSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> p0,java.lang.Object p1){
return Reference2FloatFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatMap<K> p0,java.lang.Object p1){
return Reference2FloatMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatSortedMap<K> p0,java.lang.Object p1){
return Reference2FloatSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2IntFunction<K> p0,java.lang.Object p1){
return Reference2IntFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2IntMap<K> p0,java.lang.Object p1){
return Reference2IntMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2IntSortedMap<K> p0,java.lang.Object p1){
return Reference2IntSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2LongFunction<K> p0,java.lang.Object p1){
return Reference2LongFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2LongMap<K> p0,java.lang.Object p1){
return Reference2LongMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2LongSortedMap<K> p0,java.lang.Object p1){
return Reference2LongSortedMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectFunction<K, V> p0,java.lang.Object p1){
return Reference2ObjectFunctions.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectMap<K, V> p0,java.lang.Object p1){
return Reference2ObjectMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ObjectSortedMap<K, V> p0,java.lang.Object p1){
return Reference2ObjectSortedMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceFunction<K, V> p0,java.lang.Object p1){
return Reference2ReferenceFunctions.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceMap<K, V> p0,java.lang.Object p1){
return Reference2ReferenceMaps.synchronize(p0,p1);
}
public static <K,V> it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMap<K, V> synchronize(it.unimi.dsi.fastutil.objects.Reference2ReferenceSortedMap<K, V> p0,java.lang.Object p1){
return Reference2ReferenceSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortFunction<K> p0,java.lang.Object p1){
return Reference2ShortFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortMap<K> p0,java.lang.Object p1){
return Reference2ShortMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2ShortSortedMap<K> p0,java.lang.Object p1){
return Reference2ShortSortedMaps.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceBigList<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceBigList<K> p0,java.lang.Object p1){
return ReferenceBigLists.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceCollection<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceCollection<K> p0,java.lang.Object p1){
return ReferenceCollections.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceList<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceList<K> p0,java.lang.Object p1){
return ReferenceLists.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSet<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceSet<K> p0,java.lang.Object p1){
return ReferenceSets.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> synchronize(it.unimi.dsi.fastutil.objects.ReferenceSortedSet<K> p0,java.lang.Object p1){
return ReferenceSortedSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanFunction p0,java.lang.Object p1){
return Short2BooleanFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanMap synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanMap p0,java.lang.Object p1){
return Short2BooleanMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2BooleanSortedMap p0,java.lang.Object p1){
return Short2BooleanSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteFunction p0,java.lang.Object p1){
return Short2ByteFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteMap p0,java.lang.Object p1){
return Short2ByteMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ByteSortedMap p0,java.lang.Object p1){
return Short2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2CharFunction p0,java.lang.Object p1){
return Short2CharFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharMap synchronize(it.unimi.dsi.fastutil.shorts.Short2CharMap p0,java.lang.Object p1){
return Short2CharMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2CharSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2CharSortedMap p0,java.lang.Object p1){
return Short2CharSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleFunction p0,java.lang.Object p1){
return Short2DoubleFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleMap synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleMap p0,java.lang.Object p1){
return Short2DoubleMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2DoubleSortedMap p0,java.lang.Object p1){
return Short2DoubleSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatFunction p0,java.lang.Object p1){
return Short2FloatFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatMap synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatMap p0,java.lang.Object p1){
return Short2FloatMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2FloatSortedMap p0,java.lang.Object p1){
return Short2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2IntFunction p0,java.lang.Object p1){
return Short2IntFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntMap synchronize(it.unimi.dsi.fastutil.shorts.Short2IntMap p0,java.lang.Object p1){
return Short2IntMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2IntSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2IntSortedMap p0,java.lang.Object p1){
return Short2IntSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2LongFunction p0,java.lang.Object p1){
return Short2LongFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongMap synchronize(it.unimi.dsi.fastutil.shorts.Short2LongMap p0,java.lang.Object p1){
return Short2LongMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2LongSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2LongSortedMap p0,java.lang.Object p1){
return Short2LongSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectFunction<V> p0,java.lang.Object p1){
return Short2ObjectFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectMap<V> p0,java.lang.Object p1){
return Short2ObjectMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap<V> p0,java.lang.Object p1){
return Short2ObjectSortedMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceFunction<V> p0,java.lang.Object p1){
return Short2ReferenceFunctions.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceMap<V> p0,java.lang.Object p1){
return Short2ReferenceMaps.synchronize(p0,p1);
}
public static <V> it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> synchronize(it.unimi.dsi.fastutil.shorts.Short2ReferenceSortedMap<V> p0,java.lang.Object p1){
return Short2ReferenceSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortFunction synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortFunction p0,java.lang.Object p1){
return Short2ShortFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortMap p0,java.lang.Object p1){
return Short2ShortMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap synchronize(it.unimi.dsi.fastutil.shorts.Short2ShortSortedMap p0,java.lang.Object p1){
return Short2ShortSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigList synchronize(it.unimi.dsi.fastutil.shorts.ShortBigList p0,java.lang.Object p1){
return ShortBigLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortCollection synchronize(it.unimi.dsi.fastutil.shorts.ShortCollection p0,java.lang.Object p1){
return ShortCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortList synchronize(it.unimi.dsi.fastutil.shorts.ShortList p0,java.lang.Object p1){
return ShortLists.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortPriorityQueue synchronize(it.unimi.dsi.fastutil.shorts.ShortPriorityQueue p0,java.lang.Object p1){
return ShortPriorityQueues.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortSet synchronize(it.unimi.dsi.fastutil.shorts.ShortSet p0,java.lang.Object p1){
return ShortSets.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet singleton(java.lang.Object p0,it.unimi.dsi.fastutil.shorts.ShortComparator p1){
return ShortSortedSets.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortSortedSet synchronize(it.unimi.dsi.fastutil.shorts.ShortSortedSet p0,java.lang.Object p1){
return ShortSortedSets.synchronize(p0,p1);
}
public static <T> T wrap(java.lang.Class<T> p0,T p1){
return RobustProxy.wrap(p0,p1);
}
public static <T> T deserializeFromBytes(byte[] p0,com.facebook.util.serialization.Deserializer<T> p1) throws com.facebook.util.serialization.SerDeException{
return SerDeUtils.deserializeFromBytes(p0,p1);
}
public static <T> T deserializeFromByteBuffer(java.nio.ByteBuffer p0,com.facebook.util.serialization.Deserializer<T> p1) throws com.facebook.util.serialization.SerDeException{
return SerDeUtils.deserializeFromByteBuffer(p0,p1);
}
public static <V,E extends java.lang.Throwable > V logElapsedTime(java.lang.String p0,com.facebook.util.ExtCallable<V, E> p1) throws E{
return TimeUtil.logElapsedTime(p0,p1);
}
public static java.lang.Object[] add(java.lang.Object[] p0,int p1,java.lang.Object p2){
return ArrayUtils.add(p0,p1,p2);
}
public static java.lang.Object[] add(java.lang.Object[] p0,java.lang.Object p1){
return ArrayUtils.add(p0,p1);
}
public static java.lang.Object[] removeElement(java.lang.Object[] p0,java.lang.Object p1){
return ArrayUtils.removeElement(p0,p1);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3){
return CompareToBuilder.reflectionCompare(p0,p1,p2,p3);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.lang.String[] p2){
return CompareToBuilder.reflectionCompare(p0,p1,p2);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,java.util.Collection p2){
return CompareToBuilder.reflectionCompare(p0,p1,p2);
}
public static int reflectionCompare(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3,java.lang.String[] p4){
return CompareToBuilder.reflectionCompare(p0,p1,p2,p3,p4);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3){
return EqualsBuilder.reflectionEquals(p0,p1,p2,p3);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1){
return EqualsBuilder.reflectionEquals(p0,p1);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.util.Collection p2){
return EqualsBuilder.reflectionEquals(p0,p1,p2);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,boolean p2,java.lang.Class p3,java.lang.String[] p4){
return EqualsBuilder.reflectionEquals(p0,p1,p2,p3,p4);
}
public static boolean reflectionEquals(java.lang.Object p0,java.lang.Object p1,java.lang.String[] p2){
return EqualsBuilder.reflectionEquals(p0,p1,p2);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3,java.lang.Class p4){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4);
}
public static int reflectionHashCode(java.lang.Object p0,java.util.Collection p1){
return HashCodeBuilder.reflectionHashCode(p0,p1);
}
public static int reflectionHashCode(java.lang.Object p0,java.lang.String[] p1){
return HashCodeBuilder.reflectionHashCode(p0,p1);
}
public static int reflectionHashCode(int p0,int p1,java.lang.Object p2,boolean p3,java.lang.Class p4,java.lang.String[] p5){
return HashCodeBuilder.reflectionHashCode(p0,p1,p2,p3,p4,p5);
}
public static int reflectionHashCode(java.lang.Object p0){
return HashCodeBuilder.reflectionHashCode(p0);
}
public static java.lang.String toStringExclude(java.lang.Object p0,java.lang.String[] p1){
return ReflectionToStringBuilder.toStringExclude(p0,p1);
}
public static java.lang.String toStringExclude(java.lang.Object p0,java.lang.String p1){
return ReflectionToStringBuilder.toStringExclude(p0,p1);
}
public static java.lang.String toStringExclude(java.lang.Object p0,java.util.Collection p1){
return ReflectionToStringBuilder.toStringExclude(p0,p1);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1,boolean p2){
return ToStringBuilder.reflectionToString(p0,p1,p2);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1,boolean p2,java.lang.Class p3){
return ToStringBuilder.reflectionToString(p0,p1,p2,p3);
}
public static java.lang.String reflectionToString(java.lang.Object p0,org.apache.commons.lang.builder.ToStringStyle p1){
return ToStringBuilder.reflectionToString(p0,p1);
}
public static java.lang.Object clone(java.lang.Object p0){
return ObjectUtils.clone(p0);
}
public static java.lang.Object min(java.lang.Comparable p0,java.lang.Comparable p1){
return ObjectUtils.min(p0,p1);
}
public static java.lang.Object max(java.lang.Comparable p0,java.lang.Comparable p1){
return ObjectUtils.max(p0,p1);
}
public static java.lang.Object defaultIfNull(java.lang.Object p0,java.lang.Object p1){
return ObjectUtils.defaultIfNull(p0,p1);
}
public static java.lang.Object cloneIfPossible(java.lang.Object p0){
return ObjectUtils.cloneIfPossible(p0);
}
public static java.lang.StringBuffer appendIdentityToString(java.lang.StringBuffer p0,java.lang.Object p1){
return ObjectUtils.appendIdentityToString(p0,p1);
}
public static java.lang.Object invokeConstructor(java.lang.Class p0,java.lang.Object[] p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeConstructor(p0,p1);
}
public static java.lang.Object invokeConstructor(java.lang.Class p0,java.lang.Object p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeConstructor(p0,p1);
}
public static java.lang.Object invokeConstructor(java.lang.Class p0,java.lang.Object[] p1,java.lang.Class[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeConstructor(p0,p1,p2);
}
public static java.lang.Object invokeExactConstructor(java.lang.Class p0,java.lang.Object p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeExactConstructor(p0,p1);
}
public static java.lang.Object invokeExactConstructor(java.lang.Class p0,java.lang.Object[] p1) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeExactConstructor(p0,p1);
}
public static java.lang.Object invokeExactConstructor(java.lang.Class p0,java.lang.Object[] p1,java.lang.Class[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException,java.lang.InstantiationException{
return ConstructorUtils.invokeExactConstructor(p0,p1,p2);
}
public static java.lang.Object readStaticField(java.lang.Class p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1);
}
public static java.lang.Object readStaticField(java.lang.Class p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2);
}
public static void writeStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeStaticField(p0,p1,p2,p3);
}
public static java.lang.Object readDeclaredStaticField(java.lang.Class p0,java.lang.String p1,boolean p2) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredStaticField(p0,p1,p2);
}
public static java.lang.Object readDeclaredStaticField(java.lang.Class p0,java.lang.String p1) throws java.lang.IllegalAccessException{
return FieldUtils.readDeclaredStaticField(p0,p1);
}
public static void writeDeclaredStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2,boolean p3) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2,p3);
}
public static void writeDeclaredStaticField(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.IllegalAccessException{
 FieldUtils.writeDeclaredStaticField(p0,p1,p2);
}
public static java.lang.Object invokeMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeExactMethod(java.lang.Object p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2,java.lang.Class[] p3) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2,p3);
}
public static java.lang.Object invokeExactStaticMethod(java.lang.Class p0,java.lang.String p1,java.lang.Object[] p2) throws java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
return MethodUtils.invokeExactStaticMethod(p0,p1,p2);
}
public static java.lang.Object clone(java.io.Serializable p0){
return SerializationUtils.clone(p0);
}
public static java.lang.String replace(java.lang.Object p0,java.util.Map p1){
return StrSubstitutor.replace(p0,p1);
}
public static java.lang.String replace(java.lang.Object p0,java.util.Map p1,java.lang.String p2,java.lang.String p3){
return StrSubstitutor.replace(p0,p1,p2,p3);
}
public static void notNull(java.lang.Object p0,java.lang.String p1){
 Validate.notNull(p0,p1);
}
public static void notNull(java.lang.Object p0){
 Validate.notNull(p0);
}
public static void isTrue(boolean p0,java.lang.String p1,java.lang.Object p2){
 Validate.isTrue(p0,p1,p2);
}
}
