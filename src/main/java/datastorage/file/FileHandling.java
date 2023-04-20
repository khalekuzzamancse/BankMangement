package datastorage.file;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class FileHandling<T extends Serializable> implements Serializable {

    private static <T extends Serializable> void writeToFile(String tableName, List<T> list) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(tableName))) {
            outputStream.writeObject(list);
            System.out.println("File Handing: Successfully added to:" + tableName);
        } catch (IOException e) {
            System.out.println("File Handing: Failed added to:" + tableName);
            e.printStackTrace();
        }
    }

    public static <T extends Serializable> List<T> read(String tableName) {
        List<T> list = new ArrayList<>();
        File file = new File(tableName);
        if (file.exists() && file.length() > 0) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                list = (List<T>) inputStream.readObject();
                System.out.println("File Handing: Successfully read  from:" + tableName);
            } catch (Exception e) {
                System.out.println("File Handing: Failed read  from:" + tableName);
                e.printStackTrace();
            }
        }
        return list;
    }

    public static <T extends Serializable> void write(String tableName, T lease) {
        //this first read the list
        //then add the new object to the list
        //if then out the list into the file(table)
        List<T> list = read(tableName);
        list.add(lease);
        try {
            writeToFile(tableName, list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class FileUtils {
        public static <T, F> T getObjectByField(String fieldName, F fieldValue, List<T> objects) {
            if (objects == null || objects.isEmpty()) {
                return null;
            }
            try {
                Field field = getField(fieldName, objects.get(0).getClass());
                field.setAccessible(true);
                return objects.stream()
                        .filter(o -> {
                            try {
                                return fieldValue.equals(field.get(o));
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException("Failed to access field", e);
                            }
                        })
                        .findFirst()
                        .orElse(null);
            } catch (NoSuchFieldException e) {
                throw new IllegalArgumentException("Field not found: " + fieldName, e);
            }
        }

        private static Field getField(String fieldName, Class<?> cls) throws NoSuchFieldException {
            try {
                return cls.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                Class<?> superClass = cls.getSuperclass();
                if (superClass == null) {
                    throw e;
                }
                return getField(fieldName, superClass);
            }
        }
    }
}
