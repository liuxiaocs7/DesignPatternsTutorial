package com.liuxiaocs.pattern.bridge;

/**
 * MAC操作系统(扩展抽象化角色)
 */
public class Mac extends OperatingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
