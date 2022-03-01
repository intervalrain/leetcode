package com.rainhu.Generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** Implementation of HashMap */
public class HashMap<K,V>{
    
    // default value for member variables

    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // must be power of 2
    static final int MAXIMUM_CAPACITY = 1 << 30;        // must be power of 2 and <= 1 << 30
    static final float DEFAULT_LOAD_FACTOR = 0.75f;     // size > 0.75 * capacity, reconstruct. 
    static final int TREEIFY_THRESHOLD = 8;             // bin count for construct Red Black Tree 
    static final int UNTREEIFY_THRESHOLD = 6;           // bin count for a resize operation to destruct Red Black Tree 
    static final int MIN_TREEIFY_CAPACITY = 64;         // smallest table capacity for bins may be treeified

    // inner class: Node

    static class Node<K,V>{
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        Node(int hash, K key, V value, Node<K,V> next){
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey()         { return key; }
        public final V getValue()       { return value; }
        public final String toString()  { return key + "=" + value; }

        public final int hashCode(){
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final V setValue(V newVal){
            V oldVal = value;
            value = newVal;
            return oldVal;
        }

        public final boolean equals(Object o){
            if (o == this)
                return true;
            if (o instanceof Map.Entry){
                Map.Entry<?,?> e = (Map.Entry<?,?>)o;
                if (Objects.equals(key, e.getKey()) &&
                    Objects.equals(value, e.getValue()))
                    return true;
            }
            return false;
        }
    }

    /* ---------------- Static utilities -------------- */

    /**
     * Computes key.hashCode() and spreads (XORs) higher bits of hash
     * to lower.  Because the table uses power-of-two masking, sets of
     * hashes that vary only in bits above the current mask will
     * always collide. (Among known examples are sets of Float keys
     * holding consecutive whole numbers in small tables.)  So we
     * apply a transform that spreads the impact of higher bits
     * downward. There is a tradeoff between speed, utility, and
     * quality of bit-spreading. Because many common sets of hashes
     * are already reasonably distributed (so don't benefit from
     * spreading), and because we use trees to handle large sets of
     * collisions in bins, we just XOR some shifted bits in the
     * cheapest possible way to reduce systematic lossage, as well as
     * to incorporate impact of the highest bits that would otherwise
     * never be used in index calculations because of table bounds.
     */
    
    static final int hash(Object key){
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    /**
     * Return x's class if it is of the form of class C implements Comparable<C>
     */
    static Class<?> comparableClassFor(Object x){
        if (x instanceof Comparable){
            Class<?> c;
            Type[] ts, as;
            ParameterizedType p;
            if ((c = x.getClass()) == String.class)
                return c;
            if ((ts = c.getGenericInterfaces()) != null){
                for (Type t : ts){
                    if ((t instanceof ParameterizedType) &&
                        ((p = (ParameterizedType) t).getRawType() == Comparable.class) &&
                        (as = p.getActualTypeArguments()) != null &&
                        as.length == 1 && as[0] == c)
                        return c;
                }
            }
        }
        return null;
    }
    /**
     * Returns k.compareTo(x) if x matches kc (k's screened comparable class), else 0.
     */
    @SuppressWarnings({"rawtypes","unchecked"})  // for cast to comparable
    static int compareComparables(Class<?> kc, Object k, Object x){
        return (x == null || x.getClass() != kc ? 0 : ((Comparable)k).compareTo(x));
    }

    /**
     * Returns a power of two size for the given target capacity.
     */
    static final int tableSizeFor(int cap) {
        int n = -1 >>> Integer.numberOfLeadingZeros(cap - 1);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    // Fields
    transient Node<K,V>[] table;
    transient Set<Map.Entry<K,V>> entrySet;
    transient int size;
    transient int modCount;

    final float loadFactor;

    // Constructor

    public HashMap(int initialCapacity, float loadFactor){
        if (initialCapacity < 0){
            throw new IllegalArgumentException("Illegal initial capacity: " + initialCapacity);
        }
        if (initialCapacity > MAXIMUM_CAPACITY)
            initialCapacity = MAXIMUM_CAPACITY;
        if (loadFactor <= 0 || Float.isNaN(loadFactor))
            throw new IllegalArgumentException("Illegal load factor: " + loadFactor);
        this.loadFactor = loadFactor;
    }

    

    
    

}
