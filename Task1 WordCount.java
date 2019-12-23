
import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class WordCount {
 
public static void main(String[] args) throws Exception{
Configuration conf = new Configuration();
Job job = Job.getInstance(conf,"word count");
job.setJarByClass(WordCount.class);

job.setMapperClass(Mapper.class);

job.setCombinerClass(Reducer.class);

job.setReducerClass(Reducer.class);

job.setOutputKeyClass(Text.class);

job.setOutputValueClass(IntWritable.class);

Path in = new Path(args[0]);

Path out = new Path(args[1]);

FileInputFormat.setInputPaths(job, in);

FileOutputFormat.setOutputPath(job, out);

System.exit(job.waitForCompletion(true)?0:1);

   }}
