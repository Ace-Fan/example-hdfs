package cn.itcast.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;


public class TestHDFSClient {
    public static void main(String[] args) throws  Exception{
        Configuration conf = new Configuration();


        System.setProperty("HADOOP_USER_NAME","root");


        FileSystem fs = FileSystem.get(new URI("hdfs://localhost:9000"),conf,"root");

        //fs.create(new Path("/helloByJAVA"));

        //fs.copyToLocalFile(new Path("/helloByJAVA"),new Path("E://"));

        //Path src = new Path("");
        //Path dst = new Path("/");
        //fs.copyFromLocalFile(src,dst);

        fs.close();
    }
}
