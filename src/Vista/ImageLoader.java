package Vista;

import javax.swing.ImageIcon;
import java.io.File;
import java.net.URL;

/**
 * Utility class for safely loading images from resources or filesystem
 */
public class ImageLoader {
    
    /**
     * Load an image icon from the classpath, or from a filesystem path as fallback
     * @param resourcePath The resource path (e.g., "/Imagenes/clave.png")
     * @param fallbackPath The fallback filesystem path
     * @return ImageIcon or null if not found
     */
    public static ImageIcon loadImage(String resourcePath, String fallbackPath) {
        // Try loading from classpath first
        URL url = ImageLoader.class.getResource(resourcePath);
        if (url != null) {
            return new ImageIcon(url);
        }
        
        // Try fallback filesystem path
        if (fallbackPath != null) {
            File file = new File(fallbackPath);
            if (file.exists()) {
                return new ImageIcon(fallbackPath);
            }
        }
        
        return null;
    }
    
    /**
     * Load an image icon from the classpath, or from a filesystem path as fallback
     * Tries multiple fallback paths and also attempts standard project structure paths
     */
    public static ImageIcon loadImage(String resourcePath, String... fallbackPaths) {
        // Try loading from classpath first
        URL url = ImageLoader.class.getResource(resourcePath);
        if (url != null) {
            return new ImageIcon(url);
        }
        
        // Try provided fallback filesystem paths
        for (String fallbackPath : fallbackPaths) {
            if (fallbackPath != null) {
                File file = new File(fallbackPath);
                if (file.exists()) {
                    return new ImageIcon(file.getAbsolutePath());
                }
            }
        }
        
        // Try common project structure paths
        String[] commonPaths = {
            "src/Imagenes" + resourcePath.substring("/Imagenes".length()),
            "build/classes/Imagenes" + resourcePath.substring("/Imagenes".length()),
            "Imagenes" + resourcePath.substring("/Imagenes".length())
        };
        
        for (String path : commonPaths) {
            File file = new File(path);
            if (file.exists()) {
                return new ImageIcon(file.getAbsolutePath());
            }
        }
        
        return null;
    }
}
