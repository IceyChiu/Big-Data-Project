hadoop jar /home/uic/hadoop-3.2.1/share/hadoop/tools/lib/hadoop-*streaming*.jar \
-file /home/uic/Big-Data-Project/task2/mapper.py -mapper /home/uic/Big-Data-Project/task2/mapper.py \
-file /home/uic/Big-Data-Project/task2/reducer.py -reducer /home/uic/Big-Data-Project/task2/reducer.py \
-input /data/project/* -output /output/project/task2

