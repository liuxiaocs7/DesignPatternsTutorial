package com.liuxiaocs.pattern.bridge;

/**
 * AVI视频文件(具体实现化角色)
 */
public class AviFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("AVI视频文件" + fileName);
    }
}
