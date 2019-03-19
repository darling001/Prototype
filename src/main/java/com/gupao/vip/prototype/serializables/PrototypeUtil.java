package com.gupao.vip.prototype.serializables;



import java.io.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA
 *
 * @author : ShenJiaQing
 * @date : 2018/7/6
 * Time: 16:34
 * Description:
 */
public class PrototypeUtil {

    public static <T> T deepClone(Object obj){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            T k = (T)ois.readObject();
            return k;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
