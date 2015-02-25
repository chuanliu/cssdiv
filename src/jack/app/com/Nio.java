/**
 *******************************************************************************
 * 
 * <br>(c) Copyright 2012 ���찲�˹ɷ����޹�˾ 
 *
 * <br>�� ��  ����Nio.java
 * <br>ϵͳ���ƣ�CssDiv
 * <br>ģ�����ƣ�(����ĳɸ�ģ������)
 * <br>�� ��  �ˣ� ����
 * <br>�������ڣ�2015��2��4�� ����1:59:27
 * <br>�� �� �ˣ�(�޸��˸��ļ����������޸��˵�����)
 * <br>�޸����ڣ�(�������޸ĸ��ļ�ʱ������)
 * <br>��     ���� V1.0.0
 *******************************************************************************  
 */
package jack.app.com;

/** Nio��Ҫ˵����
 * <br>@author ����
 */
import java.io.File;  
import java.io.FileOutputStream;  
import java.io.IOException;  
public class Nio {  
    public static void main(String[] args) {  
        File file = new File("/home/admin/a.txt");  
//      File file = new File("c://a.txt");  
        FileOutputStream  out = null;  
        try {  
            out = new FileOutputStream(file);  
            file.delete();  
            while(true){  
                try {  
                    Thread.sleep(1000);  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if(out!=null) {  
                    out.close();  
                }  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
      
} 
