package press.io;

import java.io.InputStream;
import java.io.Writer;

import press.PluginConfig;

public abstract class CompressedFile {
    private String filePath;

    protected CompressedFile(String filePath) {
        this.filePath = filePath;
    }

    protected String getFilePath() {
        return filePath;
    }

    public static CompressedFile create(String filePath) {
        if (PluginConfig.isInMemoryStorage()) {
            return new InMemoryCompressedFile(filePath);
        }

        return new OnDiskCompressedFile(filePath);
    }

    public static int clearCache(String compressedDir, String extension) {
        if (PluginConfig.isInMemoryStorage()) {
            return InMemoryCompressedFile.clearMemoryCache(extension);
        }

        return OnDiskCompressedFile.clearFileCache(compressedDir, extension);
    }
    
    public abstract InputStream inputStream();

    public abstract String name();

    public abstract boolean exists();

    public abstract Writer startWrite();

    public abstract void close();

    public abstract long length();
}
