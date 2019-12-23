
import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class Reduce extends
          Reducer<Text,
                  IntWritable,
                  Text,
                  IntWritable> {

public void reduce(Text key,
                   Iterator<IntWritable> values,
                   OutputCollector<Text,IntWritable>
                   output,
                   Reporter reporter) throws IOException {

int count = 0;

while(values.hasNext()) {
count += values.next().get();
        }

output.collect(key, new IntWritable(count));
    }
}
