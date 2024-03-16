package Hashing;

import java.util.LinkedList;

public class HashMapClass <K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private int size;
    private int capacity;
    private LinkedList<Entry<K, V>>[] buckets;

    public HashMapClass() {
        this(DEFAULT_CAPACITY);
    }

    public HashMapClass(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
        size++;
        if ((double) size / capacity > LOAD_FACTOR) {
            resize();
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    private void resize() {
        capacity *= 2;
        LinkedList<Entry<K, V>>[] newBuckets = new LinkedList[capacity];
        for (LinkedList<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> entry : bucket) {
                int index = Math.abs(entry.getKey().hashCode() % capacity);
                if (newBuckets[index] == null) {
                    newBuckets[index] = new LinkedList<>();
                }
                newBuckets[index].add(entry);
            }
        }
        buckets = newBuckets;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
