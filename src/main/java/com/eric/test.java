package com.eric;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class test {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Configuration conf=new Configuration();
        FileSystem fs=FileSystem.get(new URI("hdfs://39.99.134.14:9000"),conf,"hadoop");
        fs.mkdirs(new Path("/java"));
        System.out.println(fs);
    }
}
