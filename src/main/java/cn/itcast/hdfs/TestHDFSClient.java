package cn.itcast.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.FileInputStream;
import java.net.URI;


public class TestHDFSClient {
    public static void main(String[] args) throws  Exception{
        Configuration conf = new Configuration();


        System.setProperty("HADOOP_USER_NAME","root");


        FileSystem fs = FileSystem.get(new URI("hdfs://localhost:9000"),conf,"root");
        //创建目录
        //fs.create(new Path("/helloByJAVA"));
        //fs.mkdirs(new Path(""));
        //fs.delete(new Path(""),true);
        fs.rename(new Path(""),new Path(""));
        //下载
        //fs.copyToLocalFile(new Path("/helloByJAVA"),new Path("E://"));
        //上传
        //Path src = new Path("");
        //Path dst = new Path("/");
        //fs.copyFromLocalFile(src,dst);
        //列出文件
        ///使用stream的形式操作
        FSDataOutputStream outputStream = fs.create(new Path(""),true);
        FileInputStream inputStream = new FileInputStream("");
        //OUtils.copyBytes(inputStream,outputStream);
        fs.close();
    }
}
