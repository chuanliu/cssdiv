/**
 *******************************************************************************
 * 
 * <br>(c) Copyright 2012 重庆安运股份有限公司 
 *
 * <br>文 件  名：Nio.java
 * <br>系统名称：CssDiv
 * <br>模块名称：(请更改成该模块名称)
 * <br>创 建  人： 刘川
 * <br>创建日期：2015年2月4日 下午1:59:27
 * <br>修 改 人：(修改了该文件，请填上修改人的名字)
 * <br>修改日期：(请填上修改该文件时的日期)
 * <br>版     本： V1.0.0
 *******************************************************************************  
 */
package jack.app.com;

/** Nio概要说明：
 * <br>@author 刘川
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
