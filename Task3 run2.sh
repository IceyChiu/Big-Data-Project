hadoop jar /home/uic/hadoop-3.2.1/share/hadoop/tools/lib/hadoop-*streaming*.jar \
-file /home/uic/Big-Data-Project/task3/mapper2.py -mapper /home/uic/Big-Data-Project/task3/mapper2.py \
-file /home/uic/Big-Data-Project/task3/reducer2.py -reducer /home/uic/Big-Data-Project/task3/reducer2.py \
-input /output/project/task3/1/part-00000 -output /output/project/task3/2

