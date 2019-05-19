package com.follower.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lin on 19-5-19.
 */
public class LruCache_0146 {

    static class LRUCache {

        class LruCacheWithoutResize extends LinkedHashMap {

            private int cacheCapacity;

            LruCacheWithoutResize(int cache) {
                super(cache, 1, true);
                this.cacheCapacity = cache;
            }

            @Override
            public boolean removeEldestEntry(Map.Entry entry) {
                return size() > cacheCapacity;
            }
        }

        private Map cache;

        public LRUCache(int capacity) {
            cache = new LruCacheWithoutResize(capacity);
        }

        public int get(int key) {
            if (!cache.containsKey(key)) {
                return -1;
            }
            return (Integer) cache.get(key);
        }

        public void put(int key, int value) {
            cache.put(key, value);
        }

    }


}
