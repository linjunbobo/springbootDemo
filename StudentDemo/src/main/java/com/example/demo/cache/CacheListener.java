package com.example.demo.cache;

public class CacheListener {

	private CacheManagerImpl cacheManagerImpl;
    public CacheListener(CacheManagerImpl cacheManagerImpl) {
        this.cacheManagerImpl = cacheManagerImpl;
    }
 
    public void startListen() {
        new Thread(){
            public void run() {
                for(String key : cacheManagerImpl.getAllKeys()) {
                    if (cacheManagerImpl.isTimeOut(key)) {
                     cacheManagerImpl.clearByKey(key);
                    }
                } 
            }  
        }.start();
 
    }
}
